final class A {
    public static void method() {
        System.out.println("static  called");
    }

    public void methodb() {
        System.out.println("instance  called");
    }
}

/**
 * Test the new java 8 syntax of method reference
 * 
 * @author Liangfei
 *
 */
public class MethodReference {

    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        
        // lamda syntax, for static method reference
        Thread tt = new Thread(A::method);

        // for instance method reference
        Thread tt2 = new Thread(a::methodb);
        tt.start();
        tt.join();

        tt2.start();
        tt2.join();
    }
}
