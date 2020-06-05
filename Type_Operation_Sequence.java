package methodinclass2;

public class Type_Operation_Sequence {

	public static void main(String[] args) {
		//1)
				int a = 10;
				int b = 100;
				int c = 1000;
				          // a++ + b++ + c;
				int result = a+++b+++c;   
				//In acest caz a fost folosit post-incement , a++ si b++ , apoi a fost facuta operatia de adunare intre a+b+c , si dupa ce a fost indeplinita operatia de adunare a fost incementat a si b.
                           ///             a=11    b=101      c=1000    /   10+100+1000 
				System.out.println( "( " + a + "," + b + "," + c + " ) -> " + result);
				
				
		//2)
				int x = 10;
				//In acest caz a fost folosit operatia de pre-incement , si vedem treptat mai jos cum se indeplineste operatia de adunare .
				            //  /11 + 12 + 13
				int result2 = ++x + ++x + ++x;
                                    // x final = 13    /  x=36
				System.out.println( "( " + x + " ) -> " + result2 );
		

	    //3)
				
				int d = 10;
				//In acest caz este folosit operatia de post-incement:exemple--> d=10postincement(++)+d=11postincement(++)+d=12;
						   //10 + 11 + 12
				int result3 = d+++d+++d;
                                  //d=12 final value
				System.out.println( "( " + d + " ) -> " + result3 );
				
		//4)
				int q = 10;
				int w = 100;
				int e = 1000;
                //In acest caz este folosit operatia de pre-incement:
				            // 11 + 101 + 1001;
				int result4 = ++q + ++w + ++e;

				System.out.println( "( " + q + "," + w + "," + e + " ) -> " + result4 );
	
	}

}
