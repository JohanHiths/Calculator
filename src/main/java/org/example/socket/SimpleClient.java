package org.example.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

    static void main(){
        int port = 3000;
        String serverIp = "127.0.0.1";

        try(Socket socket = new Socket(serverIp, port)){

        } catch (UnknownHostException e){
            throw new RuntimeException(e);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
