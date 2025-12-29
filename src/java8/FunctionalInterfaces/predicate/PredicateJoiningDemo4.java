package java8.FunctionalInterfaces.predicate;

import java.util.function.Predicate;

public class PredicateJoiningDemo4 {
    public static void m1(Predicate<Integer> p, int[] x){
        for(int x1 :x){
            if (p.test(x1))
                System.out.println(x1);
        }
    }
    public static void main(String[] args) {
       int[] x = {1,2,3,4,5,6,7,8,9,10};
       Predicate<Integer> p1 = i->i>10;
       Predicate<Integer> p2 = i->i%2==0;
        System.out.println("The nos. greater than 10 are");
        m1(p1,x);
        System.out.println("The nos. that are even are");
        m1(p2,x);
        System.out.println("The nos. not greater than 10 are");
        m1(p1.negate(),x);
        System.out.println("The nos. greater than 10 and even are");
        m1(p1.and(p2),x);
        System.out.println("The nos. greater than 10 or even are");
        m1(p1.or(p2),x);
    }
}
