package Session5Assignment2;
// parent class for different geometrical figures with at least one dimension , area and perimeter as common methods.
public abstract class Figure {
	
	double dim1;//one dimension of the any figure.
	
	public Figure(double dim1) {
		super();
		this.dim1 = dim1;// to populate the data member dimension
	}
	abstract void findArea();//common method to be implemented by any figures like circle, rectangle and triangle.
	abstract void findPerimeter();//one more common method to be implemented by different figures like circle, rectangle and triangle.
	

}
