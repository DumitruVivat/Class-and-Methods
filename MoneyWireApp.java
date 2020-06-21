package methodsandclass;

// main class
public class MoneyWireApp {
    public static void main(String[] args) {
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(3918);
    	Bank.transferFromJuridicToPhysical(435);
    	Bank.transferFromJuridicToPhysical(435);
    	      	
      }
}
// secondary class
class Bank {
  //data
  static int money = 0;

  static class PhysicalPersonClient {
	  //data
      static int money = 100;
  }
  static class JuridicPersonClient {
	  //data
      static int money = 1000000;
  }

  static void transferFromJuridicToPhysical(int amount){
	  //Operation to tranfer money and restriction.
	  if(amount >= 100 && amount <= 5000) {
		  JuridicPersonClient.money -= amount;
		  //Bank operation.
	      if(amount >= 500) {
		  money += amount / 100 * 1;
		  } else if(amount < 500) {
		  amount -= 10;
		  money += 10;
		  }
	      PhysicalPersonClient.money += amount;
	      //Print result and restriction.
	      if(JuridicPersonClient.money >= 100) {
	    	  PrintResult();
	  	  } else {
	  		  
	  		  System.out.println("Sorry, you don't have enough money on your account.!!");
	  	  }
	      } else if(amount < 100) {
	    	  
		     System.out.println("The amount is too small, the limit is 100 $ \n");
	      } else if(amount > 5000) {
	    	  
		     System.out.println("The amount is too high, the limit is 5000 $ \n");
	      }
	  
	  
  }
  static void PrintResult() {
	  System.out.println("########################");
		  System.out.println("Physical person : " + PhysicalPersonClient.money);
	      System.out.println("Juridic person  : " + JuridicPersonClient.money);
	      System.out.println("Bank account    : " + money);
	      System.out.println("########################");  
  }

}