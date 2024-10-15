class PowerOfNumbers
{
    static long powerM1(int N,int R)
    {
        long count = 0;
        long pow = 1;
        int mod = 1000000007;
        
        while(count!=R)
        {
            pow = pow * N;
            pow = pow % mod;
            count++;
        }

        return pow;
    }

    static long powerM2(int N,int R)
    {
        long pow = 0;
        int mod = 1000000007;

        if(R==0)
        {
            return 1;
        }
        
        if(R%2==0)
        {
            pow = powerM2(N,R/2) % mod;
            pow = (pow * pow) % mod;
        }
        else
        {
            pow = N % mod;
            pow = (pow * (powerM2(N,R-1) % mod))%mod;
        }

        return pow % mod;
    }

    public static void main(String args[])       
    {   
        int N=12,R=21;

        System.out.println(powerM1(N,R));

        System.out.print(powerM2(N,R));
    }

}