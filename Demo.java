import java.util.Scanner;
class Demo{
public static void main(String[]  args){
Scanner s = new Scanner(System.in);
System.out.println("Enter a value:");
int num = s.nextIn();
boolean isPrime = true;
for(int i = 1;i<num;i++){
if(num%i==0){
isPrime = false;
break;
}
}
if(isPrime)
{
System.out.println(num+"is a Prime number");
}
else
{
System.out.println(num+"is not a Prime number");

}
