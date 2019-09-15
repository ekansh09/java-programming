/*import java.util.*;
import java.math.*;
class P12{
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n;
        n=s.nextInt();
        int a[]=new int [n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
		long sum=0;
        for(int t:a){
            sum+=t;
        }
        System.out.println(sum);

    }
}*/
import java.util.*;
class Pattern9{
    public static long aVeryBigSum(int a[]){
         
        long sum=0;
        for(int t:a){
            sum+=t;
        }
        return sum;

    }
    public static void main(String[] args){
       
       Scanner s= new Scanner(System.in);
        int n;
        n=s.nextInt();
        int [][]a=new int [n][n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        long su=aVeryBigSum(a);
        System.out.println(su);
    }
}



