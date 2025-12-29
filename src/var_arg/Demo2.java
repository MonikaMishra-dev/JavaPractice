package var_arg;

/**
 * A Var-arg methods can have both var arg as well a normal arguments as parameters.
 * The only condition is that the var-arg parameter should be the last one else we
 * will get CE.
 */
public class Demo2 {
    public static void annualSalary(String str,double... x){
        double total = 0.0;
        for(double x1 : x){
            total = total + x1;
        }
        System.out.println("The annual salary for "+str+" is "+total);
    }
    public static void main(String[] args) {
        double[] d = new double[]{1,2,3,4,5,6,7,8,9,10,11,12};
        annualSalary("Monika",d);
    }
}
