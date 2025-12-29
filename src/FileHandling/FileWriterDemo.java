package FileHandling;

import java.io.*;
public class FileWriterDemo {
    public static void main(String[] args) throws IOException{

        /*.. for overriding the
        contents of the file
         */
        File f = new File("resources","durga.txt");
//        FileWriter fw = new FileWriter("file_writer_demo.txt");
        FileWriter fw = new FileWriter(f);
        fw.write(100);
        fw.write("urga\nSoftwareSolutions");
        fw.write('\n');
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.write('\n');
        fw.flush();
        fw.close();


        /* for appending the
         content to the file
         */
//        FileWriter fw = new FileWriter("file_writer_demo.txt");
        FileWriter fw1= new FileWriter(f,true);
        fw1.write(100);
        fw1.write("urga\nSoftwareSolutions");
        fw1.write('\n');
        char[] ch1 = {'a','b','c'};
        fw1.write(ch1);
        fw1.write('\n');
        fw1.write(ch1);
        fw1.write('\n');
        fw1.flush();
        fw1.close();
    }
}
