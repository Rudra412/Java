public class SumOverLoader
{
    public int sum(int a, int b){
        return a+b;
    }

    public int sum(int a, int b, int c){
        return a+b+c;
    }

    public int sum(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    public int sum(int a, int b, int c, int d, int e) {
        return a+b+c+d+e;
    }

    public static void main(String [] args) {
        SumOverLoader overloader = new SumOverLoader();

        System.out.println("Sum of 2 and 3: " + overloader.sum(2, 3));

        System.out.println("Sum of 2, 3, and 4: " + overloader.sum(2, 3, 4)); 
        
        System.out.println("Sum of 2, 3, 4, and 5: " + overloader.sum(2, 3, 4, 5));
                               
        System.out.println("Sum of 2, 3, 4, and 5 (custom method): " + overloader.sum(2, 3, 4, 5,6));


}
}