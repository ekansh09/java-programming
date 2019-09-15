class A{
private A(){}//private constructor
A(int t){
System.out.println("Hello java");}
}
public class Simple{
public static void main(String args[]){
int t = 0;
//A obj=new A();//Compile Time Error
A obj=new A(t);
}
}