package FileHandling.serialization;

import java.io.*;

class Test implements Externalizable {
    String name;
    int id;
    double salary;

    public Test() {
        System.out.println("public No-Arg Constructor");
    }

    Test(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(id);
    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        id = in.readInt();
    }
}

public class ExternalizationDemo {
    public static void main(String[] args) throws Exception {
        Test t = new Test("durga", 101, 20000.0);
        System.out.println(t.name + "..." + t.id + "..." + t.salary);
        File f = new File("resources", "abc.txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(t);

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Test t2 = (Test) ois.readObject();

        System.out.println(t2.name + "..." + t2.id + "..." + t2.salary);
    }
}
