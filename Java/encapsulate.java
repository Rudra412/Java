public class encapsulate{

    public static void main(String []args)
    {
        employee e1=new employee();
        e1.setEid(101);
        e1.setEname("Hridhanshu");
        System.out.println("Employee id : "+e1.getEid());
        System.out.println("Employee name :"+e1.getName());
    }

    }

class employee
{
    private int eid;
    private String ename;

    void setEid(int id)
    {
        eid=id;
    }
    int getEid()
    {
        return eid;
    }
    void  setEname(String name)
    {
        ename=name;
    }
    String getEname()
    {
        return ename;
    }
}