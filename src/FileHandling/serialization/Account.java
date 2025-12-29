package FileHandling.serialization;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Account implements Serializable {
    String uname = "durga";
    transient String pwd = "anushka";
    transient int pin = 1234;

     private void writeObject(ObjectOutputStream oos) throws Exception{
        oos.defaultWriteObject();
        String epwd = "123" + pwd;
        oos.writeObject(epwd);
        int epin = 1234+4444;
        oos.writeInt(epin);
    }

     private void readObject(ObjectInputStream ois) throws Exception{
        ois.defaultReadObject();
        String epwd = (String)ois.readObject();
        pwd = epwd.substring(3);
        int epin = ois.readInt();
        pin = epin - 4444;
    }
}
