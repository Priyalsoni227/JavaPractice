package practicals;

public class Array2 {

	public static void main(String[] args) {
		int[] arr= {0,1,2,2,1,0,0,2,0,1,1,0};
		int cnt0=0,cnt1=0,cnt2=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0)
				cnt0++;
			if(arr[i]==1)
				cnt1++;
			if(arr[i]==2)
				cnt2++;
			
		}
		
		int i=0;
		while(cnt0>0) {
			arr[i]=0;
			i++;
			cnt0--;
		}
		
		while(cnt1>0) {
			arr[i]=1;
			i++;
			cnt1--;
		}
		
		while(cnt2>0) {
			arr[i]=2;
			i++;
			cnt2--;
		}
		
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}

}
