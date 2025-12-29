package garbage_collection;

public class FinalizationCase2 {
    public static void main(String[] args){
        FinalizationCase2 f = new FinalizationCase2();
        f.finalize();
        System.out.println(f.hashCode());
        f.finalize();
        System.out.println(f.hashCode());
        f = null;
        System.gc();

    }
    public void finalize(){
        System.out.println("FinalizationCase2 finalize() method called");
    }
}
