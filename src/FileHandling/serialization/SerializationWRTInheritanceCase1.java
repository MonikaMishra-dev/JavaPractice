package FileHandling.serialization;

import java.io.*;
import java.io.Serializable;

class Animal implements Serializable{
    int i = 10;
}
class Rabbit extends Animal{
    int j = 20;
}

public class SerializationWRTInheritanceCase1 {
    public static void main(String[] args) throws Exception{
        File f = new File("resources","xyz.txt");
        Rabbit r1 = new Rabbit();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(r1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Rabbit r2 = (Rabbit)ois.readObject();
        System.out.println(r2.i+".."+r2.j);

    }
}
