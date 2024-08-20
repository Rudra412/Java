public class Reversestack{
    
    public static void main(String [ ] args)  {
        Stack <Integer> s = new Stack<Integer>();

    Stack<Integer> stack = new Stack<>();{

    for (int i=10; i>=0; i--) 
    { 
        stack.push(i);
    }

    }
}
}
void stackpush()
{
   Stack <Integer> tempstack = new Stack <Integer>();
   int size = stack.size();
   while (!stack.empty())  
   {  
       tempstack.push(stack.pop());  
   }
}
public static void printStack(Stack st){

    System.out.println("Elements in the stack are: ");
}