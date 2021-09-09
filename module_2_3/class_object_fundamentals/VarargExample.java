package class_object_fundamentals;

//Working of varargs

public class VarargExample {
	
	public int sumNumber(int... args) {
		System.out.println("Argument length: "+args.length);
		int sum=0;
		for(int a:args) {
			sum+=a;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        VarargExample obj= new VarargExample();
        
        int sum2=obj.sumNumber(2,4);
        System.out.println("sum2: "+sum2);
        
        int sum3=obj.sumNumber(2,4,6);
        System.out.println("sum2: "+sum3);
        
        int sum4=obj.sumNumber(2,4,6,8);
        System.out.println("sum2: "+sum4);
        
	}

}
