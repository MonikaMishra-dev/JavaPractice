package FileHandling;

import java.io.IOException;

import java.io.*;
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("resources","xyz.txt");
        FileWriter fw = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(100);
        bw.write("urga Solutions");
        bw.newLine();
        char[] ch = {'a','b','c','d'};
        bw.write(ch);
        bw.newLine();
        bw.write("Hydrebad");
        bw.newLine();
        bw.close();

    }
}
