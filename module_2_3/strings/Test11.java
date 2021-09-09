package strings;


//Java code to illustrate
//methods of StringBuilder

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      StringBuilder str=new StringBuilder("AAABBBCCC");
      System.out.println("String: "+str);
      str.reverse();
      System.out.println("Reverse string: "+str);
      str.appendCodePoint(44);
      System.out.println("Modified StringBuilder: "+str);
      System.out.println("Capacity of StringBuilder: "+str.capacity());
      
	}

}

