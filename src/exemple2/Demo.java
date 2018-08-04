package exemple2;

public class Demo implements Inf2 {

    public Demo() {
    }

    public void method2() {
    	System.out.println("method2");
    }

    public void method1() {
        System.out.println("method1");
    }
    
    public static void main(String args[]) {
    	Inf2 objVar = new Demo();
    	objVar.method1();
    	objVar.method2();
    }

}