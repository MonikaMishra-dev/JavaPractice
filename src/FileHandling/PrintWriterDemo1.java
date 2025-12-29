package FileHandling;

import java.io.*;
public class PrintWriterDemo1 {
    public static void main(String[] args) throws IOException{
        File f = new File("resources","abc.txt");
        PrintWriter pw = new PrintWriter(f);
        pw.print("Hello, ");
        pw.println("I am Monika. I have 4.5 years of experience as a Java Developer");
        pw.println("I am currently open to work");
        pw.flush();
        pw.close();
    }
}
