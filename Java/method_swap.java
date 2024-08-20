public class method_swap
{ 

    static void swap(int a, int b)
    {
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("after swap x="+a);
        System.out.println("after swap y="+b);
    }

    public static void main(String [] args)
    {
        int x=10,y=20;
        System.out.println("before swap x="+x);
        System.out.println("before swap y="+y);
        swap(x,y);
    }
}