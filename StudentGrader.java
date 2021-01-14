import java.util.Scanner;
public class StudentGrader{
public static void main(String[]args){

Scanner titus = new Scanner(System.in);

System.out.print("Please enter grade here:");
System.out.println();
int number=titus.nextInt();
if(number>=60)
System.out.println("PASSED");
else
System.out.println("FAILED");





}
}