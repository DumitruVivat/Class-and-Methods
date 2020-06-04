package methodinclasses;

//Main class
public class DataFlowApp {
    
	public static void main(String[] args) {
		DataTransformer.integerToByte(120);
	   /// DataTransformer.byteToInteger(140);
	    DataTransformer.doubleToInteger(120.4);
	    DataTransformer.integerToDouble(140);
	    //DataTransformer.shortToInteger(1400);
	    DataTransformer.integerToShort(140);
	    DataTransformer.doubleToShort(1.5);
	    
	}
}
//secondary class
class DataTransformer {
	
   static byte integerToByte( int value ) {
	   byte r = (byte)value;
	   if(value >= -128 && value <= 127) {
	       System.out.println( "Integer to Byte: " + r);
	   } else {
	   System.err.println("\"WARNING! the value \""+ value +"\" overflows \"byte\" range. DATA will was lost!\".");
	   }
	   return r;
		}
   static int byteToInteger( byte value) { //<<<<<<<<< ??????????
	    int r = (int)value;
	    return r;    
		}
  
   static int doubleToInteger( double value) {
	   int r = (int)value;
	   System.out.println( "Double to Integer: " + r);
	   return r;
   }
   
   static double integerToDouble( int value) {
	   double r = (double)value;
	   System.out.println( "Integer to Double: " + r);
	   return r;
   }
   
   static int shortToInteger( short value) {
	   int r = (int)value;
	   System.out.println("Short to Integer: " + r);
	   return r;
   }
   
   static short doubleToShort( double value ) {
	   short r =(short)value;
	   System.out.println( "Double to Short: " + r);
	   return r;
   }
   
   static short integerToShort( int value ) {
	   short r =(short)value;
	   if(value >= -32_768 && value <= 32_767) {
	       System.out.println( "Integer to Short: " + r);
	   } else {
	   System.err.println("\"WARNING! the value \""+ value +"\" overflows \"byte\" range. DATA will was lost!\".");
	   }
	   return r;
   }
  
   
}