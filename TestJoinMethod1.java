class TestJoinMethod1 extends Thread{  
	public void run(){  
		System.out.println(getName()+" started"); 			
		for(int i=1;i<=5;i++){  
			try{  
				Thread.sleep(4000);  
			}catch(Exception e){System.out.println(e);}  
			System.out.println(getName()+" "+Thread.currentThread().getPriority());  
		} 
		System.out.println(getName()+" finished"); 
	 }  
	public static void main(String args[]){  
		TestJoinMethod1 t1=new TestJoinMethod1();  
		TestJoinMethod1 t2=new TestJoinMethod1(){
			public void run(){ 
				System.out.println(getName()+" started"); 			
				for(int i=1;i<=5;i++){  
					try{  
						Thread.sleep(4000);  
					}catch(Exception e){System.out.println(e);}  
					System.out.println(getName()+" "+Thread.currentThread().getPriority());  
				} 
				System.out.println(getName()+" finished"); 
			 }  
		};  
		TestJoinMethod1 t3=new TestJoinMethod1(){
			public void run(){ 
				System.out.println(getName()+" started"); 			
				for(int i=1;i<=5;i++){  
					try{  
						Thread.sleep(4000);  
					}catch(Exception e){System.out.println(e);}  
					System.out.println(getName()+" "+Thread.currentThread().getPriority());  
				} 
				System.out.println(getName()+" finished"); 
			}  
		};  
		t1.setName("T1");
		t1.setPriority(Thread.MIN_PRIORITY);  
		t2.setName("T2");
		t3.setName("T3");
		t3.setPriority(Thread.MAX_PRIORITY);  
		t1.start();  
		t2.start(); 
		/*try{  
			t1.join();  
		}catch(Exception e){System.out.println(e);}  
		 */
		t3.start();  
	 }  
}  