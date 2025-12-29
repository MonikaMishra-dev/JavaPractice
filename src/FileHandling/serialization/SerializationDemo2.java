package FileHandling.serialization;

import java.io.*;

public class SerializationDemo2 {
    public static void main(String[] args) throws Exception {
        File f = new File("resources","xyz.txt");
        Dog d1 = new Dog();
        Cat c1 = new Cat();
        Rat r1 = new Rat();
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        oos.writeObject(r1);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
//        Dog d2 = (Dog)ois.readObject();
//        Cat c2 = (Cat)ois.readObject();
//        Rat r2 = (Rat)ois.readObject();

        Object o = ois.readObject();
        try {
            while (o != null) {
                if (o instanceof Dog) {
                    Dog d2 = (Dog) o;
                    System.out.println("Dog: " + d2.i + ".." + d2.j);
                } else if (o instanceof Cat) {
                    Cat c2 = (Cat) o;
                    System.out.println("Cat: " + c2.i + ".." + c2.j);

                } else if (o instanceof Rat) {
                    Rat r2 = (Rat) o;
                    System.out.println("Rat: " + r2.i + ".." + r2.j);
                }
                o = ois.readObject();
            }

        }catch(EOFException e){
            System.out.println("we reached end of file");
        }


    }
}
