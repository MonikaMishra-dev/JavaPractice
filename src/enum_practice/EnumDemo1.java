package enum_practice;

enum Beer{
    KF,KO,RC,FO
}
public class EnumDemo1 {
    public static void main(String[] args){
        Beer b = Beer.RC;
        System.out.println(b);
    }
}
