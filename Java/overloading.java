public class overloading {
    int a,b;
    public overloading(){
        System.out.println("default");
    }
    public overloading(int x,int y){
        a =x;
        b =y; 
    }
    public void display(){
        System.out.println("x="+a);
        System.out.println("y="+b);
    }
    
    public static void main(String args [])
    {
        overloading c1=new overloading();
        overloading c2=new overloading();
    }
    }   
