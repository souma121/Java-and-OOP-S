class Bank extends Thread{
	static int bal=5000;
	static int withdraw;

	Bank(int withdraw){
		this.withdraw=withdraw;
	}

	public static synchronized void Withdraw(){
		String name=Thread.currentThread().getName();
		if(bal>=withdraw){
			System.out.println("withdraw succesful.."+ name);
			bal=bal-withdraw;
		}
		else{
			System.out.println("Sorry not enough Balance...");
		}
	}
	public void run()
	{
		Withdraw();
	}
}



public class Static_Synch{
	public static void main(String[] args) {
		Bank obj1=new Bank(5000);
		Bank obj2=new Bank(5000);

		Thread t1=new Thread(obj1);
		Thread t2=new Thread(obj1);
		t1.setName("Souma");
		t2.setName("Shruti");
		t1.start(); t2.start();
		Thread t3=new Thread(obj2);
		Thread t4=new Thread(obj2);
		t3.setName("Balaram");
		t4.setName("Debjit");
		t3.start(); t4.start();
	}
}