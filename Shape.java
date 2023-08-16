class Shape{
	
	//Private attributes
	private String color;
	private boolean filled;
	
	//non - arg constructor
	Shape(){
		this.color="green";
		this.filled=true;
	}
	
	Shape(String color, boolean filled){
		this.color=color;
		this.filled=filled;
	}
	
	//public getters and setters
	public void setcolor(String color){
		this.color=color;
	}
	public void setfilled(boolean filled){
		this.filled=filled;
	}
	public String getcolor(){
		return this.color;
	}
	public boolean getfilled(){
		return this.filled;
	}
	
	//toString method
	public String toString(){
		return "A  shape with color "+getcolor()+" and "+getfilled()+" filled";
	}
	
}