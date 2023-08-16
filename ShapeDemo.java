import java.util.*;
class ShapeDemo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
	Shape s = new Shape();
	
	Circle c1 = new Circle();
	Circle c2 = new Circle();
	
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	
	Square q = new Square();

	System.out.println("--Fill Shape details--");
	System.out.print("color :");
	String s1=input.nextLine();
	System.out.print("filled (y/n) :");
	boolean s2=input.nextBoolean();
	
	s.setcolor(s1);
	s.setfilled(s2);
	
	System.out.println("--Your enterd shape details are--");
	System.out.println("=================================");
	System.out.println("color is : "+s.getcolor());
	System.out.println("filled is : "+s.getfilled());
	System.out.println("\n");
	
	System.out.println("--Fill Circle 1 details--");
	System.out.print("color :");
	String s3=input.nextLine();
	System.out.print("Radius :");
	double s4=input.nextDouble();
	System.out.print("filled (y/n)");
	boolean s5=input.nextBoolean();
	
	c1.setcolor(s3);
	c1.setradius(s4);
	c1.setfilled(s5);
	
	System.out.println("--Your enterd circle 1 details are--");
	System.out.println("=================================");
	System.out.println("color is : "+c1.getcolor());
	System.out.println("Radius is : "+c1.getradius());
	System.out.println("filled is : "+c1.getfilled());
	System.out.println("\n");
	
	System.out.println("--Fill Circle 2 details--");
	System.out.print("color :");
	String s6=input.nextLine();
	System.out.print("Radius :");
	double s7=input.nextDouble();
	System.out.print("filled (y/n)");
	boolean s8=input.nextBoolean();
	
	c2.setcolor(s6);
	c2.setradius(s7);
	c2.setfilled(s8);
	
	System.out.println("--Your enterd circle 2 details are--");
	System.out.println("=================================");
	System.out.println("color is : "+c2.getcolor());
	System.out.println("Radius is : "+c2.getradius());
	System.out.println("filled is : "+c2.getfilled());
	System.out.println("\n");
	
	System.out.println("--Fill Rectangle 1 details--");
	System.out.print("color :");
	String s9=input.nextLine();
	System.out.print("width :");
	double s10=input.nextDouble();
	System.out.print("length :");
	double s11=input.nextDouble();
	System.out.print("filled (y/n)");
	boolean s12=input.nextBoolean();
	
	r1.setcolor(s9);
	r1.setwidth(s10);
	r1.setlength(s11);
	r1.setfilled(s12);
	
	System.out.println("--Your enterd Rectangle 1 details are--");
	System.out.println("=================================");
	System.out.println("color is : "+r1.getcolor());
	System.out.println("width is : "+r1.getwidth());
	System.out.println("length is : "+r1.getlength());
	System.out.println("filled is : "+r1.getfilled());
	System.out.println("\n");
	
	System.out.println("--Fill Rectangle 2 details--");
	System.out.print("color :");
	String s13=input.nextLine();
	System.out.print("width :");
	double s14=input.nextDouble();
	System.out.print("length :");
	double s15=input.nextDouble();
	System.out.print("filled (y/n)");
	boolean s16=input.nextBoolean();
	
	r2.setcolor(s13);
	r2.setwidth(s14);
	r2.setlength(s15);
	r2.setfilled(s16);
	
	System.out.println("--Your enterd Rectangle 2 details are--");
	System.out.println("=================================");
	System.out.println("color is : "+r2.getcolor());
	System.out.println("width is : "+r2.getwidth());
	System.out.println("length is : "+r2.getlength());
	System.out.println("filled is : "+r2.getfilled());
	System.out.println("\n");
	
	System.out.println("--Fill square  details--");
	System.out.print("color :");
	String s17=input.nextLine();
	System.out.print("length :");
	double s18=input.nextDouble();
	System.out.print("filled (y/n)");
	boolean s19=input.nextBoolean();
	
	q.setcolor(s17);
	q.setside(s18);
	q.setfilled(s19);
	
	System.out.println("--Your enterd Rectangle 2 details are--");
	System.out.println("=================================");
	System.out.println("color is : "+q.getcolor());
	System.out.println("length is : "+q.getside());
	System.out.println("filled is : "+q.getfilled());
	System.out.println("\n");
	
	
		
		
		
	}
}