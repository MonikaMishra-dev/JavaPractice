package garbage_collection;

public class FinalizationCase3 {
    static FinalizationCase3 f;
    public static void main(String[] args) throws InterruptedException{
        f = new FinalizationCase3();
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println(f.hashCode());
        f = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println("End of main");
    }
    public void finalize(){
        System.out.println("FinalizationCase3 finalize() method called");
        f = this;
    }
}
