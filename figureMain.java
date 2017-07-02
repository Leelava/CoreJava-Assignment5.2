package Session5Assignment2;

public class figureMain {

	public static void main(String[] args) {
		// creating circle object and finding area ,perimeter.
		Circle crl = new Circle(5.0);//Creating circle object with radius.
		crl.findArea();//calling method to calculate the  Area of circle 
		crl.findPerimeter();//calling method to calculate the Perimeter of circle 
		
		//creating rectangle object and finding area ,perimeter.
		Rectangle rect = new Rectangle(5.0,4.0);//Creating rectangle object with length and breadth 
		rect.findArea();//calling method to calculate the  Area of rectangle 
		rect.findPerimeter();//calling method to calculate the Perimeter of rectangle
		
		
		//creating triangle object and finding area ,perimeter.
		
		Triangle tria = new Triangle(5.0,5.0,3.0,5.2);//Creating triangle object with 
		tria.findArea();//calling method to calculate the  Area of a triangle
		tria.findPerimeter();//calling method to calculate the Perimeter of triangle

	}

}
