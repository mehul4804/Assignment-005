package myPack;

import java.util.EmptyStackException;
import java.util.*;

public class StackInterface 
{
	
	static void push(StackInterface st, int a)
	{
	      st.push(new Integer(a));
	      System.out.println("push(" + a + ")");
	      System.out.println("stack: " + st);
	   }

	   private void push(Integer integer) 
	   {
		
	}

	static void pop(StackInterface st) 
	   {
	      System.out.print("pop -> ");
	      int a = (int) st.pop();
	      System.out.println(a);
	      System.out.println("stack: " + st);

}
	   private int pop() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String args[]) {
		      StackInterface st = new StackInterface();
		      System.out.println("stack: " + st);
		      push(st, 42);
		      push(st, 66);
		      push(st, 99);
		      pop(st);
		      pop(st);
		      pop(st);
		      try {
		         pop(st);
		      }catch (EmptyStackException e) {
		         System.out.println("empty stack");
		      }
		   }
}
