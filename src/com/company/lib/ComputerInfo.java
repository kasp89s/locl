package com.company.lib;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*********************************************************************************
 * <Получить физический адрес сетевой карты -
 * 1. Доступно как под Windows, так и под Linux;
 * 2. Получить информацию о компьютере через ipconifg, ifconfig;
 * 3. Используйте сопоставление с образцом, чтобы найти MAC-адрес, который не имеет ничего общего с языком операционной системы>
 *
 * // * Описание: <взять имя компьютера - взять из переменной окружения>
 * абстрактное лимитное наследование / создание экземпляра
 */
/********************************************************************************/

public abstract class ComputerInfo {

    private static String macAddressStr = null;
    private static String computerName = System.getenv().get("COMPUTERNAME");

    private static final String[] windowsCommand = { "ipconfig", "/all" };
    private static final String[] linuxCommand = { "/sbin/ifconfig", "-a" };
    private static final Pattern macPattern = Pattern.compile(".*((:?[0-9a-f]{2}[-:]){5}[0-9a-f]{2}).*",
            Pattern.CASE_INSENSITIVE);

    /**
     * Получите несколько адресов сетевой карты
     *
     * @return
     * @throws IOException
     */
    private final static List<String> getMacAddressList() throws IOException {
        final ArrayList<String> macAddressList = new ArrayList<String>();
        final String os = System.getProperty("os.name");
        final String command[];

        if (os.startsWith("Windows")) {
            command = windowsCommand;
        } else if (os.startsWith("Linux")) {
            command = linuxCommand;
        } else {
            throw new IOException("Unknow operating system:" + os);
        }
        // Выполнение заказа
        final Process process = Runtime.getRuntime().exec(command);

        BufferedReader bufReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        for (String line = null; (line = bufReader.readLine()) != null;) {
            Matcher matcher = macPattern.matcher(line);
            if (matcher.matches()) {
                macAddressList.add(matcher.group(1));
                // macAddressList.add(matcher.group(1).replaceAll("[-:]",
                // "")); // Убираем "-" в MAC
            }
        }

        process.destroy();
        bufReader.close();
        return macAddressList;
    }

    /**
     * Получить адрес сетевой карты (получить один из нескольких сетевых карт)
     *
     * @return
     */
    public static String getMacAddress() {
        if (macAddressStr == null || macAddressStr.equals("")) {
            StringBuffer sb = new StringBuffer (); // Используется для хранения нескольких адресов сетевых карт, в настоящее время берется только значение, отличное от туннеля 0000000000E0
            try {
                List<String> macList = getMacAddressList();
                for (Iterator<String> iter = macList.iterator(); iter.hasNext();) {
                    String amac = iter.next();
                    if (!amac.equals("0000000000E0")) {
                        sb.append(amac);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            macAddressStr = sb.toString();

        }

        return macAddressStr;
    }

    /**
     * Получить имя компьютера
     *
     * @return
     */
    public static String getComputerName() {
        if (computerName == null || computerName.equals("")) {
            computerName = System.getenv().get("COMPUTERNAME");
        }
        return computerName;
    }

    /**
     * Получить IP-адрес клиента
     *
     * @return
     */
    public static String getIpAddrAndName() throws IOException {
        return InetAddress.getLocalHost().toString();
    }

    /**
     * Получить IP-адрес клиента
     *
     * @return
     */
    public static String getIpAddr() throws IOException {
        return InetAddress.getLocalHost().getHostAddress().toString();
    }

    /**
     * Получите уникальный идентификатор компьютера
     *
     * @return
     */
    public static String getComputerID() {
        String id = getMacAddress();
        if (id == null || id.equals("")) {
            try {
                id = getIpAddrAndName();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return computerName;
    }

    /**
     * Ограничить создание экземпляров
     */
    private ComputerInfo() {

    }

    public static void main(String[] args) throws IOException {
        System.out.println(ComputerInfo.getMacAddress());
        System.out.println(ComputerInfo.getComputerName());
        System.out.println(ComputerInfo.getIpAddr());
        System.out.println(ComputerInfo.getIpAddrAndName());
    }
}
