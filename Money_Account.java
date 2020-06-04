package methodinclass2;

public class Money_Account {

	public static void main(String[] args) {
       Money_Get.Operation();
	}

}
class Money_Get {
	//Accumulator
	static int money_accumulator = 0;
	
	static int expenses = 45;
	
	//Data-Operation and Print on the window
	static void Operation() {
		int money_1 = 100;
		int money_2 = 200;
		int money_3 = 300;
	   // Operation of accumulation on the variable(money_accumulation)
	   money_accumulator += money_1 + money_2 + money_3;
	   money_accumulator -= expenses;
	   
	   System.out.println(" " + money_accumulator + "MDL:\n " + money_1 + "MDL\n+" + money_2 + "MDL\n+" + money_3 + "MDL");
	   for(int a=0; a<=6; a++) {
		   System.out.print("-");
	   }
	   System.out.println("\n- " + expenses + "MDL");
	}
}
