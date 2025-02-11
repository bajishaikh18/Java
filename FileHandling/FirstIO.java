package FileHandling;

import java.io.*;

class FirstIO {
    public static void main(String[] args) {
        try {
            FileInputStream ip = new FileInputStream("C:/Users/bajis/OneDrive/Desktop/Resume.pdf");
            FileOutputStream op = new FileOutputStream("C:/Users/bajis/OneDrive/Desktop/WTFResume.pdf");

            int byteData;

            while ((byteData = ip.read()) != -1){
                op.write(byteData);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}