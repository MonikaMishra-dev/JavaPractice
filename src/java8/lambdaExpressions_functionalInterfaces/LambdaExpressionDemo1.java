package java8.lambdaExpressions_functionalInterfaces;

public class LambdaExpressionDemo1 {
    public static void main(String[] args) {
        /* without lambda
         */
//        Intref i = new Demo();

//        i.m();

//        i.add(10,20);
//        i.add(24,89);

//        System.out.println(i.getLength("Without lambda"));

//        System.out.println(i.getSquare(2));

        /* with lambda
         */
//        Intref i = () -> System.out.println("Hello world");
//        i.m();

//        Intref i = (a,b) -> System.out.println("sum = "+(a+b));
//        i.add(10,20);
//        i.add(30,40);

//        Intref i = s -> s.length();
//        System.out.println(i.getLength("with lambda"));

        Intref i = num -> num * num;
        System.out.println(i.getSquare(8));
    }
}

class Demo implements Intref {
    //    public void m(){
//        System.out.println("Hello World");
//    }

//    public void add(int a,int b){
//        System.out.println("Sum ="+(a+b));
//    }

//    public int getLength(String s){
//        return s.length();
//    }

    public int getSquare(int num) {
        return num * num;
    }
}
