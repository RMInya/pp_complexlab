package functional;

import java.io.BufferedReader;
import java.io.IOException;

public class fileReader {
    public static void fileRead(BufferedReader reader) throws IOException{
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
