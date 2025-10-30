public class ch67extrapractice
{
    
    public static void main (String[] args)
    {
        System.out.println(sum35(1000));
        System.out.println(Fibonacci(4000000));
        System.out.println(squareDif(100));
        System.out.println(q4(1000));
    }
    
    public static int sum35(int x)
    {

        int sum=0;
    
            for(int i=3;i<x ;i=i+3)
            {
                if(i%5!=0)sum+=i;        
            }
            for(int i=5;i<x ;i=i+5)
            {
                if(i%3!=0)sum+=i;        
            }
            for(int i=15;i<x ;i=i+15)
            {
                sum+=i;        
            }
        return sum;
    }   
    
    public static int Fibonacci(int x)
    {
    int x1=1;
    int x2=2;
    int current=0;
    int ans=2;
    while((x1+x2)<x)
    {
        current=x1+x2;
        x1=x2;
        x2=current;
        if(current%2==0) ans +=current;
    }
    return ans;
    }
    
    public static int squareDif(int x)
    {
        int z=0;
        int y=0;
        for(int i=1;i<=x;i++)
        {
            z=z+i*i;
        }
        for(int i=1;i<=x;i++)
        {
            y=y+i;
        }
        y=y*y;
        return y-z;
    }
    
    public static int q4(int n){
        int ans=0;
        for(int a=1;a<n-2;a++)
        {
            for(int b=a+1;b<n;b++)
            {
                int c=n-a-b; 
                if(c*c==a*a+b*b) ans=a*b*c;
            }    
        }  
        return ans;
    }
}