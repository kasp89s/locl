package com.company;

import org.json.JSONException;
import org.json.JSONObject;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Timer;
import java.util.TimerTask;

import jaco.mp3.player.MP3Player;
import java.io.File;

public class Main {
    public static Timer timer;
    public static TimerTask timerTask;

    public static int TimeLeft;
    public static String CurrentCode;
    public static String CurrentLogin;

    public static Gui lock;
    public static GamePanel gamePanel;

    public static String ApiDomain = "http://wars.local";

    public static String CodeLoginEndpoint = "/api/auth-by-code";

    public static String UseTimeEndpoint = "/api/use-time";

    public static String RegisterEndpoint = "/api/create";

    public static String LoginEndpoint = "/api/auth-by-login";

    public static void main(String[] args) {
        lock = new Gui();
        gamePanel = new GamePanel();

//        gamePanel.setVisible(true);
        lock.setVisible(true);
    }

    public static void showGamePanel() {
        setGameTimer();
        lock.setVisible(false);
        gamePanel.setVisible(true);
    }

    public static void showLockPanel() {
        TimeLeft = 0;
        CurrentCode = "";
        clearTimer();

        lock.setVisible(true);
        gamePanel.setVisible(false);
    }

    public static void processCodeAuthResponse(JSONObject response) {
        int timeLeft = (int) response.get("timeLeft");

        if (timeLeft > 0) {
            TimeLeft = timeLeft;
            CurrentCode = response.get("code").toString();

            gamePanel.setTimeLeft(String.valueOf(TimeLeft));

            decrementTime();
            showGamePanel();
        }
    }

    public static void processLoginAuthResponse(JSONObject response) {
        int timeLeft = (int) response.get("time");

        if (timeLeft > 0) {
            TimeLeft = timeLeft;
            CurrentLogin = response.get("login").toString();

            gamePanel.setTimeLeft(String.valueOf(TimeLeft));

            decrementTime();
            showGamePanel();
        }
    }

    public static void applyReceipt(JSONObject response)
    {
        int timeLeft = (int) response.get("timeLeft");

        if (timeLeft == 10 || timeLeft == 5 || timeLeft == 1) {
            playSound(String.valueOf(timeLeft));
        }

        if (timeLeft <= 0) {
            showLockPanel();
        }

        gamePanel.setTimeLeft(String.valueOf(timeLeft));
    }

    public static void setGameTimer()
    {
        timer = new Timer();
        timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Executed...");

                decrementTime();
            };
        };
        timer.schedule(timerTask,1000*60,1000*60);
    }

    public static void clearTimer()
    {
        timerTask.cancel();
        timer.cancel(); //In order to gracefully terminate the timer thread
    }

    protected static void decrementTime()
    {
        TimeLeft--;

        String jsonString = new JSONObject()
                .put("code", CurrentCode)
                .put("login", CurrentLogin)
                .put("time", TimeLeft)
                .toString();

        try {
            String r = httpPostRequest(UseTimeEndpoint, jsonString);
            try {
                JSONObject out = new JSONObject(r);

                applyReceipt(out);
            } catch (JSONException e) {
                System.out.println(e.getMessage());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    protected static void playSound(String timeLeft)
    {
        new MP3Player(Main.class.getResource("/resources/" + timeLeft + "min.mp3")).play();
    }

    public static String httpPostRequest(String url, String json) throws IOException, InterruptedException
    {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(ApiDomain + url))
                .POST(HttpRequest.BodyPublishers.ofString(json))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}