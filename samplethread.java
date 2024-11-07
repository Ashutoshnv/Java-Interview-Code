class A implements Runnable{
	public void run(){
		System.out.println("Thread A Started");
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}
	}
}

class samplethread{
	public static void main(String[] args) {
		A a=new A();
		Thread t=new Thread(a);
		t.start();
	}
}