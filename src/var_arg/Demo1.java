package var_arg;

/**
 * Demo for Var-arg method
 */
public class Demo1 {
    public static void total(int... x){
        int total = 0;
        for(int x1 :x){
            total = total + x1;
        }
        System.out.println("Total = "+total);;
    }
    public static void main(String[] args) {
        total(1);
        total(2,8,9);
        total();
    }
}
