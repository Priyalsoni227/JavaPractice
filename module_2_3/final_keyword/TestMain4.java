package final_keyword;

public class TestMain4 {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	
	for(final int i: arr) {
		System.out.println(i);
	}
}
}
