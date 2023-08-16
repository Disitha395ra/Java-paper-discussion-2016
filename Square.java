class Square extends Rectangle{
	
	//No instance variables

	//call the super class attributes
	Square(){
		super();
	}
	
	Square(double side){
		super(side,side);
	}
	
	Square(String color, boolean filled,double side){
		super(color, filled, side,side);
	}
	
	//get side
	public double getside(){
		return getwidth();
	}
	
	//set side
	public void setside(double side){
		setwidth(side);
		setlength(side);
	}
	
	
	
}