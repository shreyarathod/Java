import java.util.*;
class Westside
{
  int clothes = 10;
  int accesories = 10;
  double costOfItems = 5000;

}

abstract class Payment
{
  double Amount = 25000;
  abstract void paymentDetails ();
}

class CashPayment extends Payment
{

  @Override void paymentDetails ()
  {
    System.out.println ("Your payment will be in Cash.");

  }


}

class CreditCardPayment extends Payment
{
  String nameOnCard = " ";
  String expirationDate = " ";
  String creditCardNumber = "0";
    CreditCardPayment (String name, String date, String cardnumber)
  {
    this.nameOnCard = name;
    this.expirationDate = date;
    this.creditCardNumber = cardnumber;
  }

   @Override void paymentDetails ()
  {
    System.out.println ("Your payment will be through credit card.");
    System.out.println ("Credit Card details===>");
    System.out.println ("Name on Card:" + nameOnCard);
    System.out.println ("Expiration date of the Card:" + expirationDate);
    System.out.println ("Credit Card Number:" + creditCardNumber);
  }
}

class Person
{
  Scanner sc = new Scanner (System.in);
  String personName = " ";
  String P_phone_no = "0";
  int billAmount = 0;
  void getDetails ()
  {
    System.out.print ("Enter your Name:");
    personName = sc.nextLine ();
    System.out.print ("Enter your phone number :");
    P_phone_no = sc.nextLine ();


  }
}

public class Store
{

  public static void main (String[]args)
  {
    Person people[] = new Person[5];
    CashPayment c1[]= new CashPayment [5];
    CreditCardPayment c2[] = new CreditCardPayment [5];
    Scanner sc = new Scanner (System.in);
    for (int i = 0; i < 5; i++)
    {
	people[i] = new Person ();
	people[i].getDetails ();
	System.out.print ("Do you want to buy clothes?(Y/N)");
	char x = sc.next ().charAt (0);
	  sc.nextLine ();
	if (x == 'Y')
	  {
	    System.out.
	      print ("Enter the number of clothes you would like to buy:");
	    int p = sc.nextInt ();
	    for (int j = 0; j < p; j++)
	      {
		people[i].billAmount = people[i].billAmount + 5000;
	      }
	  }

	System.out.print ("Do you want to buy accessories?(Y/N)");
	char y = sc.next ().charAt (0);
	sc.nextLine ();		//buffer
	if (y == 'Y')
	  {
	    System.out.
	      print ("Enter the number of accessoriesyou would like to buy:");
	    int q = sc.nextInt ();
	    for (int j = 0; j < q; j++)
	      {
		people[i].billAmount = people[i].billAmount + 5000;
	      }
	  }



	System.out.
	  print ("Enter 1 to pay with Cash & 2 to pay with Credit Card.");
	int z = sc.nextInt ();
	if (z == 1)
	  {
	    c1[i] = new CashPayment ();
	    c1[i].paymentDetails ();
	    System.out.println ("Total Bill Amount:" + people[i].billAmount);
	    c1[i].Amount = c1[i].Amount - people[i].billAmount;
	    System.out.
	      print ("The amount left with you after the transaction is:" +
		     c1[i].Amount);
	  }
	else
	  {
	    System.out.print ("Enter your credit card details.");
	    System.out.print ("Card Holder Name :");
	    sc.next ();
	    String name = sc.nextLine ();

	    System.out.println ();
	    System.out.print ("Expiration Date:");
	    String date = sc.nextLine ();
	    System.out.println ();
	    System.out.print ("Card Number:");
	    String cardnumber = sc.nextLine ();
	    System.out.println ();
	    c2[i]= new CreditCardPayment (name, date, cardnumber);
	    c2[i].paymentDetails ();
	    System.out.println ("Total Bill Amount:" + people[i].billAmount);
	    c2[i].Amount = c2[i].Amount - people[i].billAmount;
	    System.out.
	      print ("The amount left with you after the transaction is:" +
		     c2[i].Amount);

	  }

      }


  }
}
