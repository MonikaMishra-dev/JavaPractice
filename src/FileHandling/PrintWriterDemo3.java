package FileHandling;

import java.io.*;

public class PrintWriterDemo3 {
    public static void main(String[] args) throws IOException{
        File f1 = new File("resources","duplicateEntriesFile.txt");
        File f2 = new File("resources","output.txt");

        BufferedReader br1 = new BufferedReader(new FileReader(f1));

        PrintWriter pw = new PrintWriter(f2);

        String line = br1.readLine();
        while(line != null){
            boolean available = false;
            BufferedReader br2 = new BufferedReader(new FileReader(f2));
            String target = br2.readLine();
            while(target != null){
                if(line.equals(target)){
                    available = true;
                    br2.close();
                    break;
                }
                target = br2.readLine();
            }
            if(available == false){
                pw.println(line);
                pw.flush();
            }
            line = br1.readLine();
        }
        br1.close();
    }
}
