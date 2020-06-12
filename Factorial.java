package methodsandclass;

public class Factorial {

	public static void main(String[] args) {
	
		print();

	}
	
    

static void print() {
	//Data type , which we use for factorial.
	int numb1 = 5;    
	int numb2 = 6;
	int numb3 = 7;
	//Print the result of loops:
	System.out.println("Factorial of number " + numb1 + " is : "  + ForFactorial(numb1));
	System.out.println("Factorial of number " + numb2 + " is : " + DoWhileFactorial(numb2));
	System.out.println("Factorial of number " + numb3 + " is : " + WhileFactorial(numb3));
	//Print the result of recursion:
	System.out.println("Factorial of number " + numb1 + " is : " + RecursionFactorial(numb1));
	System.out.println("Factorial of number " + numb2 + " is : " + RecursionFactorial(numb2));
	System.out.println("Factorial of number " + numb3 + " is : " + RecursionFactorial(numb3));
}
	//Using 3 types of loop , for factorial .
public static long ForFactorial( int numb)  {
	long fact = 1; 
	for(int a = 1; a <= numb ; a++){    
	      fact *= a; //operation to calculate factorial
	}
    return fact;
}

public static long DoWhileFactorial( int numb) {
	long fact = 1;
    int i = 1;
    do {
    	fact *= i; //operation to calculate factorial.
        i++;
       }
    while (i <= numb);
    return fact;
}

public static long WhileFactorial( int numb) {
	long fact = 1;
    int i = 1;
    while( i <= numb) {
        fact *= i; //operation to calculate factorial.
        i++;
         }
	return fact;
}
   //Using recursion for factorial.
public static long RecursionFactorial( int numb) {
	if (numb <= 1) {
        return numb;
    }
    return numb * RecursionFactorial(numb - 1);	//operation to calculate factorial.
}

}
