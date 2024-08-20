public class even_odd
{
    static int check(int a)
    {
        int x;
        if (a%2==0)
    
        {
            x=0;
        }
    else
        {
            x=1;
        }
        return x;
}

public static void main(String [] args)
{
    int x;
    x=check(x=5);
    if(x==0);
    {
        System.out.println("Given number is even");
    }

    {
        System.out.println("Given number is odd"); 
    }
}
}
