

public class java2 {
    public static void display(int[] arr,int n)
    {
        int sum=0;
    for(int i=0;i<n;i++)
    {
       sum=sum+arr[i];
    }
     System.out.println(sum);
}
        public static void main(String[] args)
        {
            int arr[]={1,2,3,-2,5};
            int sum=0;
        display(arr,arr.length);
         
    }
}
