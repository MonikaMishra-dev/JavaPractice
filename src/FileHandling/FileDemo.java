package FileHandling;

import java.io.*;
public class FileDemo {
    public static void main(String[] args) throws IOException {

        /*   list(), isFile(), isDirectory() methods example...
         */

        int count = 0;
    File f = new File("resources");
    String[] fileList = f.list();
    for(String file: fileList){
        File f1 = new File(f,file);
        if(f1.isFile()) {
//            if(f1.isDirectory()) {
            System.out.println(file);
            count++;
        }
    }
    System.out.println("The no. of files are "+count);
//        System.out.println("The no. of Directory are "+count);

/*   delete() method example...
 */

        File f2 = new File(f,"durga.txt");
        boolean isFileDeleted = f2.delete();
        System.out.println("File deleted "+isFileDeleted);

/* length() method example
 */
        File f3 = new File(f,"abc.txt");
        long l = f3.length();
        System.out.println("The total number of characters are "+l);

    }

}
