package FileHandling.serialization;

import java.io.*;
public class SerializationDemo1 {
    public static  void main(String[] args) throws Exception{
        File f = new File("resources","xyz.txt");
        Dog d1 = new Dog();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog)ois.readObject();

//        System.out.println(d2.i+"..."+d2.j+"..."+d2.password+"..."+d2.k+"..."+d2.l);


    }
}
