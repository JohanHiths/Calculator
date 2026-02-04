package org.example.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class SimpleServer {

    static void main(){

        int port = 3000;

        try(ServerSocket serverSocket = new ServerSocket(port, 5,
                InetAddress.ofLiteral("127.0.0.1"))){
            System.out.println("" + serverSocket.getLocalPort() + " is the port");

            while(true) {
                Socket socket = serverSocket.accept();
                Thread.ofVirtual().start(() -> {
                    try {
                        handleClient(socket);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                });

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void handleClient(Socket socket ) throws IOException {
        try (Socket client = socket) {
            System.out.println("Client connected: " + socket.getRemoteSocketAddress());
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            InputStream input = socket.getInputStream();
            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            IO.readln();

            writer.println("Hello client!");
            socket.close();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        }
    }

