import java.util.*;
class Table5{  
synchronized void printTable(int n){//method not synchronized  
   for(int i=1;i<=10;i++){  
		System.out.println(n*i);  
		try{  
			Thread.sleep(400);  
     }catch(Exception e){System.out.println(e);}  
   }  
  
 }  
}  

  
class MyThread7 extends Thread{  
	Table5 t;
	int n;
	MyThread7(Table5 t,int n){  
		this.t=t;  
		this.n=n;
	}  
	public void run(){  
		t.printTable(n);  
	}  
}
class MyThread2 extends Thread{  
	Table5 t;  
	int n;
	MyThread2(Table5 t,int n){  
		this.t=t;  
		this.n=n;
	}  
	public void run(){  
		t.printTable(n);  
	}  
}  
class Thread5{
	public static void main(String [] args){
		Scanner s=new Scanner(System.in);
		System.out.println("no. For first loop");
		int n=s.nextInt();
		System.out.println("no. For second loop");
		int m=s.nextInt();
		Table5 t1= new Table5();
		MyThread7 m1=new MyThread7(t1,n);
		MyThread2 m2=new MyThread2(t1,m);
		m1.start();
		m2.start();
	}
}