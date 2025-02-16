package FileHandling;
import java.io.*;
import or
public class Buffer {
    public static void main(string[] args) {
        string path = "c:/users/bajis/onedrive/desktop/baji.txt";

        try(bufferedreader reader = new bufferedreader(new filereader(path))) {
            string line;

            while((line = reader.readline()) != null){
                system.out.println(line);
            }
        } catch (ioexception e){
            e.printstacktrace();
        }
    }
}
