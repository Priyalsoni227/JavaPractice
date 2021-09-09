package final_keyword;


//Java program to demonstrate 
//reference final variable
public class TestMain2 {
  public static void main(String[] args) {
	  final StringBuilder sb=new StringBuilder("Hello ");
	  System.out.println(sb);
	  sb.append("World");
	  System.out.println(sb);
  }
}
