package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class AltTabStopper implements Runnable
{
    private boolean working = true;
    private boolean blocked = true;
    private JFrame frame;

    public AltTabStopper(JFrame frame)
    {
        this.frame = frame;
    }

    public void stop()
    {
        blocked = false;
    }
    public void resume()
    {
        blocked = true;
    }

    public static AltTabStopper create(JFrame frame)
    {
        AltTabStopper stopper = new AltTabStopper(frame);
        new Thread(stopper, "Alt-Tab Stopper").start();
        return stopper;
    }

    public void run()
    {
        try
        {
            Robot robot = new Robot();
            while (working)
            {
                if (blocked) {
                    robot.keyRelease(KeyEvent.VK_ALT);
                    robot.keyRelease(KeyEvent.VK_TAB);
//                frame.requestFocus();
                    if(!frame.isFocused()) {
                        frame.requestFocus();
                    }
                    try { Thread.sleep(10); } catch(Exception e) {}
                } else {
                    try { Thread.sleep(500); } catch(Exception e) {}
                }
            }
        } catch (Exception e) { e.printStackTrace(); System.exit(-1); }
    }
}