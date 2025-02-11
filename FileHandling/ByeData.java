package FileHandling;
import java.io.*;
public class ByeData {
    public static void main(String[] args) {
        try {
            FileInputStream ip = new FileInputStream("C:/Users/bajis/OneDrive/Desktop/Resume.pdf");
            FileOutputStream op = new FileOutputStream("C:/Users/bajis/OneDrive/Desktop/NewResume.pdf");

            int byteData;

            while((byteData = ip.read()) != -1){
                op.write(byteData);
            }
            ip.close();
            op.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
