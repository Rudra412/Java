public class hierarchical
{
    public static void main(String args[])
    {
        addition a1=new addition();
        multiple m1=new multiple();
        a1.getdata();
        a1.sum();
        m1.mul();
    }
}
class calculate
{
    int a,b;
    void getdata()
    {
        a=6;
        b=3;
    }
}

class addition extends calculate
{
    void sum()
    {
        
    }
}