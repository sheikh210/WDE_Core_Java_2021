package readerUtilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFiles {

    static String systemPath = System.getProperty("user.dir");
    static String relativePath = "/src/readerUtilities/Test.txt";
    static String path = systemPath + relativePath;

    static FileReader fileReader;
    static BufferedReader bufferedReader;

    public static void main(String[] args) {
        ReadTextFiles.readFile();
    }

    static void readFile() {

        String data = "";

        try {
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while ((data = bufferedReader.readLine()) != null) {
                System.out.println(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
