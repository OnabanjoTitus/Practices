public class Withdrawal{
private String accountName;
private double accountBalance;


public Withdrawal(String accountName, double accountBalance){
this.accountName=accountName;

if (accountBalance>0.0)
this.accountBalance = accountBalance;


}



public String getName(){
return accountName;
}
public double getBalance(){
return accountBalance;
}

public void setBalance(double withdrawAmount){
if (withdrawAmount>accountBalance)
System.out.println("Insufficient action failed");
System.out.println();
if (withdrawAmount<=accountBalance)
System.out.println("Succesfull!!!!!");
System.out.println();
if (withdrawAmount<=accountBalance)
accountBalance=accountBalance-withdrawAmount; 

}


}