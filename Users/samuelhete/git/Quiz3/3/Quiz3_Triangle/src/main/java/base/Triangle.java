package base;

public abstract class Triangle extends GeometricObject {
	private double sideA;
	private double sideB; 
	private double sideC;
	Triangle() {
		sideA = 1.0; //not sure if 1.0 or 0.0 is appropriate
		sideB = 1.0;
		sideC = 1.0;
	}
	/**
	 * @return the sideA
	 */
	public double getSideA() {
		return sideA;
	}
	/**
	 * @param sideA the sideA to set
	 */
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	/**
	 * @return the sideB
	 */
	public double getSideB() {
		return sideB;
	}
	/**
	 * @param sideB the sideB to set
	 */
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	/**
	 * @return the sideC
	 */
	public double getSideC() {
		return sideC;
	}
	/**
	 * @param sideC the sideC to set
	 */
	public void setSideC(double sideC) {
		this.sideC = sideC;
	}
	/**
	 * @param sideA
	 * @param sideB
	 * @param sideC
	 * sets sides of triangle to that of specific instance
	 */
	Triangle(double sideA, double sideB, double sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}
	/** 
	 * Calculates Perimeter of triangle by summing sides
	 */
	public double getPerimeter() {
		return this.sideA + this.sideB + this.sideC;
	}
	/**
	 *  Calculates Area by dividing perimeter by 2 then squares the multiples of the sides subtracted from the base by .5 
	 */
	public double getArea() {
		double base = this.getPerimeter() / 2.0;
		double area = Math.pow(base * (base - this.sideA)*(base - this.sideB)*(base - this.sideC), 0.5);
		return area;
	}
	/** 
	 * Prints statement that describes sides, perimeter, and length of triangle 
	 */
	public String toString(){
		System.out.print("This lengths of sides A, B , and C of the triangle are " + this.sideA + ", " + this.sideB + ", and " + this.sideC + " respectiely. The perimeter is " + this.getPerimeter() + ", and the Area is " + this.getArea() + ".");
		return null;
	}
}