package FileHandling;

import java.io.*;
import java.net.Socket;

public class ImageOverInternet {
    public static void main(String[] args) {
        String path = "C:/Users/bajis/OneDrive/Desktop/img.jpg";
        String serverAddress = "example.com";
        int port = 12345;

        try (FileInputStream input = new FileInputStream(path);
             Socket socket = new Socket(serverAddress, port);
             OutputStream output = socket.getOutputStream()) {

            byte[] buffer = new byte[4096];

            int bytesRead;

            while ((bytesRead = input.read()) != -1){
                output.write(buffer, 0, bytesRead);
            }
            System.out.println("Image Sent Successful..");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
