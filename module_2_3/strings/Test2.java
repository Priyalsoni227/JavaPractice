package strings;

//append method

public class Test2 {
    public static void main(String[] args) {
    	StringBuffer s = new StringBuffer("Hello");
    	s.append(" World");
    	System.out.println(s);
    	s.append(1);
    	System.out.println(s);
    }
}
