package var_arg;

/**
 * When there is var-arg method and General method as a case of overloaded methods then
 * the General method will always get the priority over the Var-arg method.
 */
public class Demo3 {
    public static void m1(int... x){
        System.out.println("Var arg method");
    }
    public static void m1(int x){
        System.out.println("General Method");
    }
    public static void main(String[] args) {
        m1(1,2,3);
        m1(4);
    }
}
