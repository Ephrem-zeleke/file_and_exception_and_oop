package file_and_exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        boolean lineToLong = false;
        String fileName = "hello.txt";
        int maxLineLength = 100;
        // create a file reader that read one of your file from the directory

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){

            String line = reader.readLine();

            while(line != null){
                if ( line.length() > maxLineLength){
                    System.out.println("The line is too long");
                    System.out.println(line);
                    lineToLong = true;
                }
                line = reader.readLine();
            }
            if(lineToLong){
                System.out.println("There were line that were to long");
            }else {
                System.out.println("There were no line that were to long");
            }
        }catch (IOException e){
            System.out.println("Error reading the file " + fileName + " because " + e);
        }
    }
}
