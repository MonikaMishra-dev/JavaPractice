package FileHandling.serialization;

import java.io.*;

public class SerializationDemo3 {
    public static void main(String[] args) throws Exception{
        File f = new File("resources","xyz.txt");
        Lotus l1 = new Lotus();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(l1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Lotus l2 = (Lotus)ois.readObject();

        System.out.println(l2.r.l.msg);
    }
}
