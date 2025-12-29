package FileHandling;

import java.io.IOException;

import java.io.*;
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("resources","xyz.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }
}
