import java.util.*;
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        int i,j,temp;
        int []x= new int[5];
        for(i=0;i<5;i++){
            int sum=0;
            for(j=0;j<5;j++){
                sum=sum+arr[j];
            }
            x[i]=sum-arr[i];
        }
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.print(x[4]+" "+x[0]);
    }

   

    public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = scanner.nextInt();
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
