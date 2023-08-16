class Circle extends Shape{
	
	//private instance variables
	private double radius;
	
	//non - arg constructor
	Circle(){
		radius=1.0;
	}	
	//radius  initialize with given value
	Circle(double radius){
		this.radius=radius;
	}
	//radius , color, filled in constructor
	Circle(String color, boolean filled, double radius){
		super(color,filled);
		this.radius=radius;
	}
	
	//getters and setters for radius
	public void setradius(double radius){
		this.radius=radius;
	}
	public double getradius(){
		return this.radius;
	}
	
	//get area method
	public double getarea(){
		return Math.PI*radius*radius;
	}
	
	//get peremeter method
	public double  getperemeter(){
		return 2*Math.PI*radius;
	}
	
	//to String method
	public String toString(){
		return "A circle with radius "+getradius()+" which is a subclass os "+super.toString();
	}
	
	
	
	
}