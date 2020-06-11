package arrayhomework;

public class Array {
 
	public static void main(String[] args) {
		
		Integer[] data = { 100, 200, 300, 400, null};
		/*"Integer" este Wrapper class , care foloseste tipul de date "int" ca obiect.
		 * "Integer" este mai flexibil in stocare si poate folosi nu doar numere intregi dar si alte valori cum ar fi "null" care este echivalent cu 0.
		  */
		
		for(int a=0;a<3;a++) {
			
		for(int i=0;i <data.length;i++) {
		data = methodA(data);
		System.out.println(data[i]);
		}	
		
		for(int i=0;i <data.length;i++) {
		data = methodB(data);
		System.out.println(data[i]);
		}
		
		}
		
		}
                     
		
	

	
	public static Integer[] methodA(Integer[] array){
		int i = array.length;          // "i" este egal cu lungimea array.
        for( ; i > 0 ;  ){            // indexul unde va avea loc operatia.
        array[--i] = array[i];       // valoare care se afla in arry[i] se va stegre si va fi inlocuita cu array[i].
        }
        array[i] = null;           // valoare care a fost stersa este (inlocuita) cu null.
        return array;
	}
	public static Integer[] methodB(Integer[] array) {
		int a = array.length;
		for( ; a > 0 ; ) {
		array[--a] = array[a];	
		}
	    array[a] = 100;
		return array;
	}
	
	
}
