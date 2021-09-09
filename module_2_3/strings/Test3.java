package strings;

//insert method

public class Test3 {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("HelloWorld");
		s.insert(5, 77);
		System.out.println(s);
		char[] name= {'p','r','i','y','a','l'};
		s.insert(5, name);
		System.out.println(s);
		s.insert(0, 77.20f);
		System.out.println(s);

	}

}
