package enumerations;


//enum in switch case

enum Day{
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class Enumeration1 {
	
	Day day;
	
	public Enumeration1(Day day) {
		this.day=day;
	}
	
	public void dayIsLike() {
		switch(day) {
		case MONDAY:
			System.out.println("Mondays are bad");
			break;
		case FRIDAY:
			System.out.println("Fridays are better");
			break;
		case SATURDAY:
		case SUNDAY:
			System.out.println("Weekends are best");
			break;
		default:
			System.out.println("Midweek days are so-so.");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str="MONDAY";
    Enumeration1 obj=new Enumeration1(Day.valueOf(str));
    obj.dayIsLike();
	}

}

