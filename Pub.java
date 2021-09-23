import java.util.*;
public class Pub {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a;
		a=s.nextInt();
		int year,days;
		int cn=60*24*365;
		year=a/cn;
		System.out.print(year+" years ");
		a=a-(year*cn);
		int cm=60*24;
		days=a/cm;
		System.out.print("and "+days+" days.");
	}
}