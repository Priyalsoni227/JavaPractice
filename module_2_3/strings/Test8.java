package strings;

//appendCodePoint

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        StringBuffer s = new StringBuffer("Hello World");
        System.out.println(s);
        s.appendCodePoint(67);
        System.out.println(s);
        s.appendCodePoint(64);
        System.out.println(s);
        
	}

}
