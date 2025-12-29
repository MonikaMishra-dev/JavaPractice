package FileHandling.serialization;

import java.io.*;
import java.io.Serializable;

class Reptiles{
    int i =10;
    Reptiles(){
        System.out.println("Animal Class Default Constructor");
    }
}
class Snake extends Reptiles implements Serializable{
    int j = 20;
    Snake(){
        super();
        System.out.println("Snake Class Default Constructor");
    }
}

public class SerializationWRTInheritanceCase2 {
    public static void main(String[] args) throws Exception{
        Snake s1 = new Snake();
        s1.i = 90;
        s1.j = 100;
        System.out.println(s1.i+"..."+s1.j);
        File f = new File("resources","abc.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(s1);

        System.out.println("Deserialization Started");
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Snake s2 = (Snake)ois.readObject();
        System.out.println(s2.i+"..."+s2.j);
    }
}
