package operators;

public class EqualityOperatorDemo {
    public static void main(String[] args) {
        System.out.println('a'==97);
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1==s2);

        Thread t = new Thread();
        Object o = new Object();
        System.out.println(o==t);
        System.out.println(o==s1);
//        System.out.println(t==s1);

        System.out.println(s1.equals(s2));

        System.out.println(s1==null);
        String s3 = null;
        System.out.println(s3==null);
        System.out.println(null==null);

    }
}
