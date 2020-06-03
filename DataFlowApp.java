package methodsandclass;
//Main class
public class DataFlowApp {

	public static void main(String[] args) {
		 DataTransformer obj = new  DataTransformer();
		 DataTransformer.integerToByte(-128);

	}
}
//secondary class
class DataTransformer {
     static byte integerToByte( int value ) {
	    byte r = (byte)value;
	    if(value >= -128 && value <= 127) {
	        System.out.println(r);
	    } else {
	    	System.err.println("Wrong!!");
	    }
	    return r;
		}
}
