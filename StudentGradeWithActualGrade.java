/*
1. Enter the student grade
2. If Student grade is equal to or greater than 90 and less than or equal to 100 print student grade is A
3. If Student grade is equal to or greater than 65 and less than 90 print student grade is B
4. If Student grade is equal to or greater than 60 and less than 65 print student grade is C
5. If Student grade is equal to or greater than 50 and less than 60 print student grade is D
6. If Student grade is equal to or greater than 50 print student grade is F

*/
import java.util.Scanner;
public class StudentGradeWithActualGrade{
public static void main (String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter the student grade:");
double grade =scanner.nextDouble();

if(grade>100)
{System.out.println("Enter a valid grade of 100 and below");}
	else{
		if (grade>=90)
			{System.out.println("Student grade is A");}
	else{
		if (grade>=65)
			{System.out.println("Student grade is B");}
	else{
		if (grade>=60)
		{System.out.println("Student grade is C");}
	else{
		if (grade>=50)
		{System.out.println("Student grade is D");}

	else{System.out.println("Student grade is F");}


}
}				
}
}

}
}