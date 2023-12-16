package xyz.makise.git;

public class ClassA {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.methodA();
    }

    public void methodA() {
        System.out.println("this is the first version");
    }

    public void methodB() {
        System.out.println("this is the third version");
    }

    public void methodC() {
        System.out.println("this is the second version");
    }

    public void methodCFromOther() {
        System.out.println("this is the second version");
    }
}
