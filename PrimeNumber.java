public class PrimeNumber {
    public static void main(String args[]){
        int a;
        for(int i=2;i<=100;i++)
        {
            a=1;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    a=0;
                }
            }
            if(a==1)
            {
                System.out.println("given number is : "+i+" prime Number");
            }
            else
            {
                System.out.println("given number is :"+i+" Not prime number");
            }
        }
    }
}
