package demo.inheritance.vmi;

public class VmiMain {

    public static void main(String[] args) {
        Parent p;
        p = new ChildA();
        p.test();   // ChildA
        p.method(); //

        p = new ChildB();
        p.test();   // Parent
        p.method(); //

    }
}
