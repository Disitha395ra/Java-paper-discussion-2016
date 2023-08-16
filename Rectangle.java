class Rectangle extends Shape{
	
	//private instance variables
	private double width;
	private double length;
	
	//non - arg constructor
	Rectangle(){
		this.width=1.0;
		this.length=1.0;
	}
	
	//constructor with initialize given width and length value
	Rectangle(double width, double length){
		this.width=width;
		this.length=length;
	}
	
	//constructor with initialize width,length,color and filled
	Rectangle(String color, boolean filled, double width, double length){
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	
	//getters for width and  length
	public double getwidth(){
		return this.width;
	}
	public  double  getlength(){
		return this.length;
	}
	
	//setters for width and length
	public void setwidth(double width){
		this.width=width;
	}
	public  void setlength(double length){
		this.length=length;
	}
	
	//get area method
	public double  getarea(){
		return width*length;
	}
	
	//get peremeter method
	public  double getperemeter(){
		return 2*width+2*length;
	}
	
	public String toString(){
		return "A Rectangle width "+getwidth()+" and length "+getlength()+" Which is subclass of "+super.toString();
	}
}