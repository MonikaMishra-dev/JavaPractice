package garbage_collection;

public class FinalizationCase1 {
    public static void main(String[] args){
        String s = new String("Durga");
        s= null;
        FinalizationCase1 f = new FinalizationCase1();
        f = null;
        System.gc();
    }
    public void finalize(){
        System.out.println("FinalizationCase1 finalize() method called");
    }
}
