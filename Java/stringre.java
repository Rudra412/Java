import java.util.Scanner;


public class stringre{

    public static void main(String [ ] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        int n = s1.length();
        char[] charArray = s1.charArray();
        
        for(int i=n-1;i>=0;i--)
        {
            System.out.println(" "+charArray[i]);
        }
}
}