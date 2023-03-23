package firstpackage;
class demoThread1 extends Thread{
	public int total=0;
	public void calculate() {
		for(int i=1;i<=5050;i++) {
			this.total+=i;
		}
	}
	public void run() {
		synchronized (this) {
			System.out.println("Child execute");
			this.calculate();
			System.out.println("done");
			this.notifyAll();
		}
		for(int i=0;i<=20;i++) {
			System.out.println("after notify1234");
		}

	}
}
public class test2 {

	public static void main(String[] args)throws Exception {
		demoThread1 ob=new demoThread1();
		ob.start();
		synchronized (ob) {
			System.out.println("Main got chance1");
			ob.wait();
			System.out.println("Main got chance2");
			System.out.println(ob.total);
		}
		

	}

}
