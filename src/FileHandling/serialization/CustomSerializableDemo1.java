package FileHandling.serialization;

import java.io.*;

public class CustomSerializableDemo1 {
    public static void main(String[] args) throws Exception{
        File f = new File("resources","abc.txt");
        Account a1 = new Account();
        System.out.println(a1.uname+"..."+a1.pwd+"..."+a1.pin);
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Account a2 = (Account)ois.readObject();

        System.out.println(a2.uname+"..."+a2.pwd+"..."+a2.pin);
    }
}
