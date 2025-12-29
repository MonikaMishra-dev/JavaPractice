package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
    public static  void main(String[] args) throws IOException{
        File f = new File("resources","durga.txt");
        FileReader fr = new FileReader(f);
//        int ch = fr.read();
//        while(ch != -1){
//            System.out.print((char)ch);
//            ch = fr.read();
//        }

        char[] ch = new char[(int)f.length()];
        fr.read(ch);
        for(char ch1 : ch){
            System.out.print(ch1);
        }
        fr.close();
    }
}
