package Switchcase;
public class Switchcase{
public static void main (String[] args){
int choice;
System.out.println("pick one : 1.Hi/t 2.Hey/t 3.Hello/t");
Scanner s = new Scanner(System.in);
choice= s.nextInt();
switch(choice)
{
      case1 : System.out.println("You said Hi");
            break;
      case2 : System.out.println("You said Hey");
            break;
      case3 : System.out.println("You said you Hey");
            break;
      Default : System.out.println("Invalid Choice" );
            break;
}
}
}