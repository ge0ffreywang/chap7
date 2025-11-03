import java.util.Arrays;
public class ch7
{
    public static void main(String[] args)
    {
        int[] nums={2,3,6,33,44,1};
        int[] num={2,3,5,7};
        System.out.println(indexOfMax(nums));
        boolean[] sieve = sieve(100);
        for(int i = 0; i < sieve.length; i++){
           System.out.print(i + " " + sieve[i] + " ");
        }
        System.out.println("\n"+areFactors(1,nums));
        System.out.println(arePrimeFactors(210,num));
        int[] letter=LetterHist("habdghaovb");
         for(int i = 0; i < letter.length; i++){
           System.out.print( letter[i] + " ");
        }
        System.out.println("\n"+compare("abc d","d cba"));
    }    

    public static int indexOfMax( int[] b)
    {
        int n=0;
        for(int i=1;i<b.length;i++)
        {
            if(b[i]>n) n=i;
        }

        return n;
    }

    public static boolean [] sieve(int n)
    {
        int[] num=new int[n];
        for (int i=0;i<num.length;i++)
        {
            num[i]=i;
        }
        boolean[] ans=new boolean [n];
        for (int i=0;i<ans.length;i++)
        {
            ans[i]=true;
        }
        ans[0]=false;
        ans[1]=false;
        for(int i=0;i<num.length;i++)
        {
            if(ans[i]==true) 
            {
                int b=i*2;
                while(b<n)
                {
                    ans[b]=false;
                    b=b+i;
                }
            }
        }
        return ans;
    }
    
    public static boolean areFactors(int n,int [] b)
    {
        for(int i=0;i<b.length;i++)
        {
            if(n%b[i]!=0) return false;        
        }
        return true;
    }
    
    public static boolean arePrimeFactors(int n,int[]b)
    {
        int ans=1;
        for(int i=0;i<b.length;i++)
        {
            for(int a=2;a<b[i];a++)
            {
                if (b[i]%a==0) return false;
            } 
            ans=ans*b[i];
        }
        
        
        return ans==n;
    }
    
    public static int[] LetterHist(String s)
    {
        s=s.toLowerCase();
        int[]ans=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if (!s.substring(i,i+1).equals(" "))ans[(int) s.charAt(i)-'a']++;
        }
        return ans;
    }
    
    public static boolean compare(String a,String b)
    {
    return Arrays.equals(LetterHist(a),LetterHist(b));
    }
}