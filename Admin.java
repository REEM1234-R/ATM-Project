package ATMpro;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    public static void main(String[] args){

        Admin [] Admins = new Admin [2];
         ArrayList ad = new ArrayList();
          ad.add("REEM");
          ad.add("112233");
          ad.add("ZINAB");
          ad.add("12345");

        User [] USER= new User [3];
          ArrayList Us= new ArrayList();
           Us.add("AMAL");
           Us.add("1102093");
           Us.add("SARA");
           Us.add("6758399");
           Us.add("NOUF");
           Us.add("347282");
           // - - - - - - - - - - - - - - -
               User f=new User (2000);
     Scanner input = new Scanner(System.in);

      System.out.println(" Welcom To Bank Riyad Bank ");
          System.out.println(" If you have an account , please Enter ( 1 ) ");
            System.out.println(" If you don't have an account , please Enter ( 0 ) ");
           int Selection = input.nextInt();
            if(Selection== 1)
           {
           System.out.println( " Please Enter your PASSWORD  :   ");
               int password = input.nextInt();
           System.out.println(" ** Welcome To Riyad Bank ** " );
           }
            else if(Selection==0){
           System.out.println(" New Account ,,, ");

           System.out.println( "Please Enter Your EMAIL :");
               String email = input.next();

           System.out.println( "Please Enter Your  PHONENUMBER :");
               int phone_unm = input.nextInt();

           System.out.println( " Please Enter The USERNAME  :   ");
               String Username = input.next();

           System.out.println(" ACCOUNT SUCCEFULLU CREATED ,, THANK YOU .");

           System.out.println("  Welcome To Riyad Bank "+"** " +Username+ " **");
          }

        System.out.println("Please Choice The Options");
        System.out.println("Current Balance <1> ");
        System.out.println("Withdraw <2>");
        System.out.println("Deposit <3>");
        System.out.println("Transfer <4>");
        System.out.println("Add a new account <5>");
        System.out.println("Transactions History <6>");
        System.out.println("Exit <7>");
        System.out.println("**********************");

        boolean flag= true;
        while (flag){
           System.out.println(" Enter The Operation Code You Want To Perform ");
            int fun = input.nextInt();
            switch (fun){
                case 1:
                    System.out.println(" Your Current Balance : "+f.CurrentBalance);
                    System.out.println("---------------------");
                    break;
                case 2:
                    System.out.println(" Enter Withdraw Amount : ");
                       double amount = input.nextDouble();
                       if (amount<=f.CurrentBalance){
                    System.out.println(" Your Balance Now =  "+f.Withdraw(amount));
                    System.out.println(" The Amount Has Been Withdrawn Successfully");
                    }
                     else {
                    System.out.println(" Please Entea an amount less thanor equal to  current balance ");
                       }
                    System.out.println("---------------------");
                    break;
                case 3:
                    System.out.println(" Enter The Deposite Amount : ");
                      amount = input.nextDouble();
                    System.out.println(" Your Current Balance : "+f.Deposit(amount));
                    System.out.println("---------------------");
                    break;
                case 4:
                    System.out.println(" Enter The Transfer Amount : ");
                    amount = input.nextDouble();
                    if (amount <= f.CurrentBalance){     System.out.println(" The Amount Has Been Transfer Successfully");
                     System.out.println(" Your Balance Now = "+f.Transfer(amount));

                    }
                    else
                      System.out.println(" The operation was not executed , Please enter an amount in the current balance  ");

                     System.out.println("---------------------");
                     break;
                case 5:
                   System.out.println(" Do You Want To Add A New Aaccount?");
                   System.out.println(" Yes Enter 1 , No Enter 2 ");
                      int us = input.nextInt();
                    if (us==1){
                    System.out.println(" Please Enter The New USERNME :");
                      String nameaccount =input.next();
                    System.out.println(" Please Enter The New ACCOUNTNUMBER : ");
                      int accountnumber = input.nextInt();

                    System.out.println(" Beneficiary Has Been Added Successfully");
                    System.out.println("---------------------");
                    }
                     break;
                case 6 :
                    System.out.println(f.History);
                    System.out.println("=======================");
                    System.out.println(" <<  Thanks For Using Riyad Bank  >>   ");
                     break;
                case 7 :
                   System.out.println(" Thanks For Using Riyad Bank ,,, Good bye ");
                   flag = false;

    }

}
    }

    }
