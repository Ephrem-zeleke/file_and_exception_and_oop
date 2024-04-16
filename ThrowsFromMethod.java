package file_and_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {
        String fileName = "Numbers.txt";
        try {
            List<String> data = readFromFile(fileName);
            System.out.println(data);
        }catch (IOException e){
            System.out.println("could not read from file " + fileName);
        }
    }
    private static List<String> readFromFile(String fileName) throws IOException {
        // in this case, we can make the readFromFile to deal with the IO exception and write try and catch in the main method
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

        List<String> lines = new ArrayList<>();
        String line = bufferedReader.readLine();

        while (line != null){
            lines.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return lines;

    }
}
