package main_method_demo;

public class MainMethodHidingDemo {
    public static void main(String[] args) {
        System.out.println("Parent Main Method");
    }
}
class ChildMainMethodHidingDemo extends MainMethodHidingDemo{
    public static void main(String[] args) {
        System.out.println("Child Main Method");
    }
}
