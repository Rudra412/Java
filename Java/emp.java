public class emp
{
    int id;
    String name;
    long salary;
    public void display()
    {
        System.out.println("id="+id);
        System.out.println("name="+name);
        System.out.println("salary="+salary);
    }

    public static void main(String args[])
    {
        emp e1=new emp();
        e1.id=101;
        e1.name="xyz";
        e1.salary=30000;
        e1.display();
    }
}