package Session5Assignment2;
//Rectangle class inherited from Figure parent class implements methods to calculate area and perimeter.

public class Rectangle extends Figure{
	double dim2;//Rectangle requires two sides. This the size of the second side(length or breadth). 

	public Rectangle(double dim1, double dim2) {
		super(dim1);// calls parent class constructor to populate the dimension1/side1
		this.dim2 = dim2;//  to populate the dimension2/side2
	}

	// implementing area function to calculate the area of rectangle
	@Override
	void findArea() {
		double area ;
		area = this.dim1 * this.dim2;//area is  for rectangle
		System.out.println("The area of rectangle with sides " +this.dim1 + " and " + this.dim2 +" is " +area);	
	}
	// implementing perimeter function to calculate the perimeter of rectangle
	@Override
	void findPerimeter() {
		double perim;
		perim = this.dim1 + this.dim2;//perimeter length +breadth of rectangle
		System.out.println("The perimeter of rectangle with sides " +this.dim1 + " and " + this.dim2 +" is " +perim);
		
	}
	

}
