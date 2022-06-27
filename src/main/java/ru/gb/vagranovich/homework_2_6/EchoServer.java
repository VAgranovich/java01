package ru.gb.vagranovich.homework_2_6;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket = null;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static Scanner scanner;
    static boolean status = true;

    public static void main(String[] args) {

        try {
            serverSocket = new ServerSocket(8189);
            System.out.println("Ждем подключения клиента...");

            final Socket socket = serverSocket.accept();
            System.out.println("Клиент подключился");

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    String message;
                    try {
                        scanner = new Scanner(System.in);
                        while (status) {
                            message = scanner.nextLine();
                            sendMessage(message);
                            if (message.equalsIgnoreCase("/end")) {
                                status = false;
                                scanner.close();
                            }
                        }

                    } catch (Exception e) {
                        // e.printStackTrace();
                    }

                }
            });
            thread.start();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while (status) {
                final String message_srv = in.readUTF();
                System.out.println("Сообщение от клиента: " + message_srv);

                if (message_srv.equalsIgnoreCase("/end")) {
                    status = false;
                } else {
                    out.writeUTF(message_srv);
                }

            }

            //closeConnection();
        } catch (IOException e) {
            //e.printStackTrace();
        }

        try {
            closeConnection();
        } catch (Exception e) {
            // e.printStackTrace();
        }

        System.out.println("Сервер отключен");

    }

    private static void sendMessage(String message) {
        try {
            out.writeUTF(message);
        } catch (IOException e) {
            //  e.printStackTrace();
        }

    }

    private static void closeConnection() {
        try {

            in.close();
            out.close();
            serverSocket.close();
            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
