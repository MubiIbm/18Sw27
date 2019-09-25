class Shap
{
	private String color;
	private boolean filled;
	final double pi=3.14;
	Shap()
	{
		color=" Red ";
		filled=true;
	}
	Shap(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setFill(boolean filled)
	{
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public boolean isFill()
	{
		return filled;
	}
	public String toString()
	{
		return "Shape[Color = "+color+",Filled = "+filled+"]";
	}
}
class Circ extends Shap
{
	private double radius;
	Circ()
	{
		radius=1.0;
	}
	Circ(double radius)
	{
		this.radius=radius;
	}
	Circ(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public void setRad(double radius)
	{
		this.radius=radius;
	}
	public double getRad()
	{
		return radius;
	}
	public double getArea()
	{
		return (pi*radius*radius);
	}
	public double getPeri()
	{
		//C=2πr
		return (2*pi*radius);
	}
	public String toString()
	{
		return super.toString()+",Circle[radius = "+radius+",Area = "+this.getArea()+",Perimeter = "+this.getPeri()+"]";
	}
}
class Rect  extends Shap
{
	private double width;
	private double length;
	Rect()
	{
		width=1.0;
		length=1.0;
	}
	Rect(double width,double length)
	{
		this.width=width;
		this.length=length;
	}
	Rect(double width,double length, String color, boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getLength()
	{
		return length;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getWidth()
	{
		return width;
	}
	public double getArea()
	{
		return (length*width);
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	
	public String toString()
	{
		return super.toString()+", Rectangle[length = "+length+",width = "+width+",Area = "+this.getArea()+",Perimeter = "+this.getPerimeter()+"]";
	}

}
class Square extends Rect
{
	private double side;
	Square()
	{
		side=1.0;
	}

	Square(double side)
	{


		this.side=side;
	}
	Square(double side,String color,boolean filled)
	{

		super(1.0,1.0,color,filled);
		
		this.side=side;
	}
	public void setSide(double side)
	{

		this.side=side;
	}
	public double getSide()
	{
		return side;
	}

	public void setWidth(double side)
	{
		this.setWidth(side);
	}
	public void setLength(double side)
	{
		this.setLength(side);
	}

	public String toString()
	{
		return super.toString()+",Square[Side = "+side+" ] ";
	}
}
class ShapofCS
{
	public static void main(String[] args) 
	{
		Circ c=new Circ(3.9," Red ",true);

		Rect r=new Rect(1.23,3.32,"green",false);
		Square s=new Square(6.0,"white",true);
		c.getArea();
		c.getPeri();

		System.out.println(c);
		System.out.println();
		r.getArea();
		r.getPerimeter();

		System.out.println(r);
		

		System.out.println("\n"+s);
	}
}