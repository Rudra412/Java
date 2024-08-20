public class average{
    public static void main(String [] args) {

        average avg = new average();

        avg.calculateAndPrintAverage(10,20,30);

    }
    public void calculateAndPrintAverage(int num1, int num2, int num3)
    {
        double average = (num1 + num2 + num3) / 3.0;


        System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
    }
}