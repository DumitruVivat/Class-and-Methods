package methodsandclass;

public class Draw {

	public static void main(String[] args) {
		HorizontalLine.drawLine();
        VerticalLine.drawLine(3);
        Rectangle.drawRect(4,4);
	}

}
//Super class
class Shape {
    static void drawHash() {
        System.out.print("#");
    }
    static void drawSpace() {
        System.out.print(" ");
    }
    static void newLine() {
        System.out.print("\n");
    }
}
//Inheritance
class HorizontalLine extends Shape {
    static void drawLine() {
        for(int i=0; i<7; i++){
        	drawHash(); 
        }
        newLine();
        newLine();
    }
}
//Inheritance
class VerticalLine extends Shape {
	static void drawLine(int length) {
		for(int i=0; i<length; i++){
        	drawHash();
        	newLine();
        }
	}
}
//Inheritance
class Rectangle extends Shape {
	static void drawRect(int width,int height) {
		for(int i=0; i<height; i++){
			newLine();
			drawHash();
			for(int a=0; a<width; a++){
				drawHash();	
			}
		}
		
	}
}
