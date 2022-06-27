package ru.gb.vagranovich.homework_2_6;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    private static Socket socket;
    private static DataInputStream in;
    private static DataOutputStream out;
    private static Scanner scanner;

    public static void main(String[] args) {
        start();
        System.out.println("Клиент отключен от сервера");

    }

    private static void start() {
        try {
            openConnection();
            String message;
            scanner = new Scanner(System.in);

            while (true) {
                message = scanner.nextLine();
                sendMessage(message);
                if (message.equalsIgnoreCase("/end")) {
                    closeConnection();
                    break;
                }
                
            }
        } catch (IOException | InterruptedException | IllegalStateException e) {
            // e.printStackTrace();
        }

    }

    private static void sendMessage(String message) {

        try {
            out.writeUTF(message);
        } catch (IOException e) {
            //e.printStackTrace();
        }

    }

    private static void openConnection() throws IOException, InterruptedException {
        socket = new Socket("127.0.0.1", 8189);
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    while (true) {
                        String message = in.readUTF();
                        System.out.println("Пришло сообщение от сервера " + message);
                        if (message.equalsIgnoreCase("/end")) {
                            closeConnection();
                            break;
                        }
                    }

                } catch (Exception e) {
                    //e.printStackTrace();
                }
            }
        });

        thread.start();

    }

    private static void closeConnection() {
        try {
            in.close();
            out.close();
            socket.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
