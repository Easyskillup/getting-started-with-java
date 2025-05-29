package demo.inheritance.vmi;

public class ChildA extends Parent{
    @Override
    public void test() {
        System.out.println("ChildA test() method");
    }
    public static void method() {
        System.out.println("ChildA Static method");
    }
}
