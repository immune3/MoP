import java.util.Stack;

public class StackDemo {


   public static void main(String args[]) {
      Stack st = new Stack();
      System.out.println("stack: " + st);
      st.push(new Integer(1));
      st.push(new Integer(3));
      st.push(new Integer(2));
      st.push(new Integer(4));
      
      System.out.println("stack: " + st);
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());
      System.out.println(st.pop());

   }
}