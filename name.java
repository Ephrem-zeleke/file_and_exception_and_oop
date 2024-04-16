package file_and_exception;

import java.io.*;

public class name {
    public static void main(String[] args) throws IOException {
        // first let's create a variable that contain some data

        String name = "Ephrem";
        int classCode = 2545;
        String favoriteColor = "Blue";

        // let's create a file writer and buffered writer

        FileWriter writer = new FileWriter("name.txt");
        BufferedWriter bufWriter = new BufferedWriter(writer);

        // now we can add the text to the file

        bufWriter.write("My name is " + name + "\n");
        bufWriter.write("The class code is " + classCode + "\n");
        bufWriter.write("My favorite color is " + favoriteColor + "\n");

        // now we close the buffer writer

        bufWriter.close();

        // now we can create a reader and read the file

        FileReader reader = new FileReader("name.txt");
        BufferedReader bufReader = new BufferedReader(reader);

        // we can use the while loop to read the file line by line until the line ends

        String line = bufReader.readLine();

        while ( line != null){
            System.out.println(line);
            line = bufReader.readLine();

        }
        bufReader.close();

    }
}
