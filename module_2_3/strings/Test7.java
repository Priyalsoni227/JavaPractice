package strings;


//ensureCapacity

public class Test7 {
   public static void main(String[] args) {
	   StringBuffer s1=new StringBuffer();
	   System.out.println("For s1: ");
	   System.out.println(s1.capacity());
	   s1.ensureCapacity(18);
	   System.out.println(s1.capacity());
	   
	   StringBuffer s2=new StringBuffer("Hello World");
	   System.out.println("For s2: ");
	   System.out.println(s2.capacity());
	   s2.ensureCapacity(28);
	   System.out.println(s2.capacity());
   }
}
