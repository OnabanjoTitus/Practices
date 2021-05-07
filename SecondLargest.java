import java.util.Scanner;
public class SecondLargest{
public static void main(String[] args) {
		
int largest=0;
int secondLargest=0;
int counter=1;
Scanner input = new Scanner(System.in);

		while(counter<=10)
		{
			System.out.printf("Enter the number:");
			int number=input.nextInt();
		if(number>largest)
			{secondLargest=largest;
			largest=number;	}
			
		if(number<largest && number>secondLargest){
			secondLargest=number;

		}

counter++;
		}

System.out.printf("the largest is %d%n and the second largest is %d%n", largest,secondLargest);



	}	
}
