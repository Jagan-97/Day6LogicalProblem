public class FibonnaciSeries {
    public static void main(String args[])
    {
        int n=10,t1=0,t2=1,sum=0;
        System.out.print(t1+" "+t2+" ");
        for(int i=1;i<=n;i++)
        {
            sum=t1+t2;
            t1=t2;
            t2=sum;
            System.out.print(sum+" ");
        }
    }
}
