class Employee{
String Name;
int Yearofjoining;
String Address;
int Salary;
public void printDetails()
{
System.out.println("\n\tName:"+Name);
System.out.println("\n\tYearofjoining:"+Yearofjoining);
System.out.println("\n\tAddress:"+Address);
System.out.println("\n\tSalary:"+Salary);
}
}
class MainEmployee{
public static void main (String[] args){
Employee e=new Employee();
e.Name="Robert";
e.Yearofjoining =1994;
e.Address="64C-WallsStreet";
e.Salary=50000;
System.out.println("Employee details:");
e.printDetails();
}
}