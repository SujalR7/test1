public class java1{
    public static void main(String[] args)
    {
        int i,j,space=2*3-1,k;
        for(i=1;i<=3;i++)
        {
            space/=2;
            for(k=0;k<space;k++)
            System.out.print(" ");
            for(j=1;j<=2*i-1;j++)
            {
               if(j==i)
               System.out.print(j);
               else
               System.out.print("*");
            }
            for(k=space;k>0;k--)
            System.out.print(" ");
            System.out.println();
        }
    }
}