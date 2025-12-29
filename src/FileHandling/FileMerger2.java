package FileHandling;

import java.io.*;
public class FileMerger2 {
    public static void main(String[] args) throws IOException
    {
        File f1 = new File("resources", "file1.txt");
        File f2 = new File("resources", "file2.txt");
        File f3 = new File("resources", "finalMergedFile.txt");
        FileReader fr1 = new FileReader(f1);
        FileReader fr2 = new FileReader(f2);
        BufferedReader br1 = new BufferedReader(fr1);
        BufferedReader br2 = new BufferedReader(fr2);
        PrintWriter pw = new PrintWriter(f3);

        String s1 = br1.readLine();
        String s2 = br2.readLine();
        while (s1 != null || s2 != null) {
            if(s1 != null) {
                pw.println(s1);
                s1 = br1.readLine();
            }
            if(s2 != null) {
                pw.println(s2);
                s2 = br2.readLine();
            }
        }

        pw.flush();
        br1.close();
        br2.close();
        pw.close();
    }
}
