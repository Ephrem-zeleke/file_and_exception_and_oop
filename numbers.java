package file_and_exception;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class numbers {
    public static void main(String[] args) throws IOException {

        // let's create a number variable. an integer number
        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        // now let's create a file called number and write the data and see what will be printed

        FileWriter number = new FileWriter("Numbers.txt");
        BufferedWriter numberWriter = new BufferedWriter(number);

        // now let's add the variables that stores the int value and close the file and see what will be printed
        numberWriter.write(data1);
        numberWriter.write(data2);
        numberWriter.write(data3);
        numberWriter.newLine();

        // close the buffered writer
        numberWriter.close();
        // the file write the word CAT by changing the int value to binary code
        // the file write strings and int values
        // let's try writing a double value and write the int value as a number. not changing to binary

        FileWriter numbers = new FileWriter("Numbers.txt", true);
        BufferedWriter numberWriter2 = new BufferedWriter(numbers);

        // add the number as it is

        numberWriter2.write(data1 + "\n");
        numberWriter2.write(data2 + "\n");
        numberWriter2.write(data3 + "\n");

        numberWriter2.close();


    }
}
