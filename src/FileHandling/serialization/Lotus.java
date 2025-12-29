package FileHandling.serialization;

import java.io.Serializable;

public class Lotus implements Serializable {
    Rose r = new Rose();
}
class Rose implements Serializable{
   Lily l = new Lily();
}
class Lily implements Serializable{
    String msg = "Hi, I am Lily";
}
