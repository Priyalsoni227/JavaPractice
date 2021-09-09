package practicals;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str=" fly me   to  the   moon ";
        String[] arr=str.split("\\s{1,}");
//        for(String s:arr) {
//        	System.out.println(s);
//        }
        
        int len=arr.length;
        System.out.println(arr[len-1].length());
	}

}
