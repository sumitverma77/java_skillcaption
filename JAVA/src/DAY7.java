import java.util.Scanner;

public class DAY7 {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("ENter Five intigers : ");
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
        int a;
        a=ss.nextInt();
        arr[i]=a;
        }
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(arr[i]>maxi)
            {
                maxi=arr[i];
            }
            if(arr[i]<mini)
            {
                mini=arr[i];
            }
        }
        System.out.println("sum is"+ sum);
        System.out.println("maximum element is "+maxi);
        System.out.println("minimum element is "+mini);
        System.out.println("average is" + (double)(sum/arr.length));
    }
}
