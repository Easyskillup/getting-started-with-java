package demo.fileio;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Java File IO: java.io, java.nio
 */
public class FileIODemo {
    public static void main(String[] args) throws IOException {
//        FileWriter writer = new FileWriter("hello.txt", true);
//        PrintWriter printWriter = new PrintWriter(writer);
//        printWriter.println("Print writer....");
////        writer.write("Another line.\n");
//        writer.flush();
//        printWriter.close();
//        writer.close();
//
//        FileReader reader = new FileReader("hello.txt");
////        int c;
////        while ((c = reader.read()) != -1) {
////            System.out.print((char)c);
////        }
//
//        BufferedReader bufferedReader = new BufferedReader(reader);
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        reader.close();
//        bufferedReader.close();

        Files.readAllLines(Path.of("hello.txt")).forEach(line -> System.out.println(line));

    }
}
