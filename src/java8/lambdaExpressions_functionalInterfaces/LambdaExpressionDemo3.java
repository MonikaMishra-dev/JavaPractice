package java8.lambdaExpressions_functionalInterfaces;
interface A{
    public void m1();
}

public class LambdaExpressionDemo3 {
    int x = 10;
        public void m2(){
            int y = 20;
            A a = ()->{
                x=888;
//                y=999;
                System.out.println(x+" "+y);
            };
            a.m1();
        }
        public static void main(String[] args){
            LambdaExpressionDemo3 demo = new LambdaExpressionDemo3();
            demo.m2();
        }
}
/*
catch:

1. we can access instance as well as local variable from
inside a lambda expression.
2. all the local variables inside a lambda expression are conidered as final
and hence its value cannot be changed inside the lambda.

*/
