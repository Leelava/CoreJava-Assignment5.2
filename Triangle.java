package Session5Assignment2;
//Triangle class inherited from Figure parent class implements methods to calculate area and perimeter.
public class Triangle extends Figure {
	
 double dim2,dim3, height;//the side 2 and side 3 of the triangle and the height 


//Constructor to create triangle with three sides and the height
public Triangle(double dim1, double dim2, double dim3, double height) {
	super(dim1);// side1 to be populated by super class constructor.
	this.dim2 = dim2;//populating side2
	this.dim3 = dim3;//populating side3
	this.height = height;// populating the height.
}

//implementing area function to calculate the area of triangle
@Override
void findArea() {
	double area;
	area = (this.dim1 * this.height)/2.0;// calculating area of triangle
	System.out.println("The area of a triangle with base  " + this.dim1 + " and height " + this.height + " is " +area); 
}

//implementing perimeter function to calculate the perimeter of rectangle
@Override
void findPerimeter() {
	double perim;
	perim = this.dim1 +this.dim2 + this.dim3;//calculating the perimeter of triangle
	System.out.println("The perimeter of a triangle with sides " +this.dim1+ " , " + this.dim2 + " , " + this.dim3 + " is " +perim);
	
}
 
}
