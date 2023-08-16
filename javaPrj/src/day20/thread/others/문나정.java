package day20.thread.others;

public class 문나정 {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		a.start();
		b.start();
		c.start();
	}

}

class A extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("A "+i+"만큼 전진");
			if(i==200) {
				System.out.println("A 도착");
			}
		}
    }
}
class B extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("B "+i+"만큼 전진");
			if(i==200) {
				System.out.println("B 도착");
			}
		}
	}
}
class C extends Thread{
	@Override
	public void run() {
		for( int i= 20; i<= 200; i=i+20) {
			System.out.println("C "+i+"만큼 전진");
			if(i==200) {
				System.out.println("C 도착");
			}
		}
	}
}