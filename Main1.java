import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class Main1 {
    public static void createFile(String way) {
        File file = new File(way);
        try {

            if (file.createNewFile()) {
                System.out.println("File created  " + file);
            } else {
                System.out.println("File was created " + file);
            }
        } catch (IOException e){
            e.getMessage();
        }


    }
    public static void writer1(String fileName)  {

        try {

            FileWriter writer = new FileWriter(fileName);
            Scanner scanner = new Scanner(System.in);
            System.out.println("write a text ");
            writer.write(scanner.next());
            scanner.close();
            writer.close();
        } catch (IOException d){
            d.getMessage();
        }







    }

    public static void main(String[] args) {
        createFile("example.txt");
        writer1("example.txt");


    }


}


