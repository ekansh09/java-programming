class MyThread5 extends Thread{
	public void run(){
		for(int i=1;i<=5;i++)
		{
			try{ Thread.sleep(1000);} catch(Exception e){};
			System.out.println("..."+i);
		}			
	}
}
class Daemon{
	public static void main(String [] args)
	{
		MyThread5 t1 = new MyThread5();
		t1.setDaemon(true);
		t1.start();
		try{ Thread.sleep(3000);} catch(Exception e){};
		System.exit();
	}
}
	