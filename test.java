package firstpackage;
class demoThread extends Thread{
	public int total=0;
	public void calculate() {
		for(int i=1;i<=5050;i++) {
			this.total+=i;
		}
	}
	public void run() {
		System.out.println("Child execute");
		this.calculate();
		System.out.println("done");
	}
}
public class test{

	public static void main(String[] args) throws Exception{
		demoThread ob=new demoThread();
		ob.start();
		Thread.sleep(2);
		System.out.println(ob.total);

	}

}
