package Session5Assignment2;

// Circle class inherited from Figure parent class implements methods to calculate area and perimeter.
public class Circle extends Figure {
	

	public Circle(double dim1) {
		super(dim1);// calls parent class constructor to populate the dimension1.
	
	}
   // implementing area function to calculate the area of circle.
	@Override
	void findArea() {
		double areaofCircle;
		areaofCircle = (double)(3.14 *this.dim1 *this.dim1);//area is  for square.
	System.out.println("The area of circle with Radius " +this.dim1 + " is " +areaofCircle);	
	}

	//implementing findPerimeter to calculate the perimeter of a circle
	@Override
	void findPerimeter() {
		double perim ;
		perim = (double)(2.0*3.14*this.dim1);//perimeter is 2 pi radius.
		System.out.println("The perimeter of circle with Radius " +this.dim1 + " is " +perim);//print the Radius and perimeter 
	}
	

}
