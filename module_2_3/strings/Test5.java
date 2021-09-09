package strings;

//delete and deleteCharAt

public class Test5 {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("HelloWorld");
		s.delete(0,5);
		System.out.println(s);
		s.deleteCharAt(3);
		System.out.println(s);

	}

}
