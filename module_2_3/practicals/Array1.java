package practicals;
import java.util.Scanner;

public class Array1 {
	
	public static int getDuplicate(int[] arr,int n) {
		int sum=0;
		int nsum=(n-1)*n/2;
		for(int i:arr) {
			sum+=i;
		}
		
		return sum-nsum;
	}

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		n=s.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter elements: 	");
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		
		
		System.out.println("Dupplicate element is: "+getDuplicate(arr,n));
		
		

	}

}
