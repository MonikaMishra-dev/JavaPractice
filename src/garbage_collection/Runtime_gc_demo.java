package garbage_collection;

public class Runtime_gc_demo {
    public static void main(String[] args) {
    Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        for(int i=1;i<10000;i++);
        {
            Runtime_gc_demo demo = new Runtime_gc_demo();
            demo = null;
        }
        System.out.println(r.freeMemory());
        r.gc();
        System.out.println(r.freeMemory());
    }
}
