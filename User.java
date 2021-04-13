package ATMpro;
public class User {

public double CurrentBalance ;
private double Deposi;
private double Withdraw;
private double  Transfer;
String History = "The TransactionsHistory a ccount is : ";


public User (double CurrentBalance){
this.CurrentBalance=CurrentBalance;
}
public double CurrentBalance(){
return CurrentBalance;
}

public double Deposit(double D){
  History = History+"\n The deposit was made in an amount : "+D;
  CurrentBalance+=D;
return CurrentBalance;
}

public double Withdraw(double D){
  History = History+"\n Withdrawn at an amount  :"+D;
  CurrentBalance-=D;
return CurrentBalance;
}

public double Transfer(double D){
   History = History+"\n Transferred in an amount : "+D;
  CurrentBalance-=D;
  return CurrentBalance;
}

}
