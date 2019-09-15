class Mythread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(getName()+" paani daalo");
			try{
				Thread.sleep(1000);}catch(Exception e){};
		}
	}
}
class Mythread2 extends Thread{
	public void run(){
		for (int i=0;i<10;i++){
			System.out.println(getName()+" jhadu lagao");
			try{
				Thread.sleep(1000);}catch(Exception e){};
		}
	}
}
class MultiThread{
	public static void main(String [] args)
	{
		Mythread t1=new Mythread();
		t1.setName("Ramukaka");
		Mythread2 t2=new Mythread2();
		t2.setName("Shantabai");
		t1.start();
		t2.start();
	}
}
		
		



		
		