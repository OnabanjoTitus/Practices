import java.util.Scanner;
public class UpDown{
	
public static void main (String[]args){
	int minNumber;
	int maxNumber;
	int temp;
	int count=1;

	Scanner input = new Scanner(System.in);
	System.out.print("Enter number 1:");
	minNumber=input.nextInt();
	maxNumber=minNumber;
while(count<=9){
	System.out.printf("Enter number %d:",count+1);
	 temp=input.nextInt();
	if(temp>maxNumber)
	{maxNumber=temp;}
	if(temp<minNumber)
		{minNumber=temp;}
	

	
count++;
}

System.out.printf("The largest number is %d%nAnd the smallest number is %d%n", maxNumber,minNumber);

}



}