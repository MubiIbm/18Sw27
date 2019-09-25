abstract class Shap
{
	private String color;
	private boolean filled;
	final double pi=3.14;
	Shap()
	{
		color="red";
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
	public abstract String toString();
	abstract double getArea();
	abstract double getPerimeter();
}
class Circle extends Shap
{
	private double radius;
	Circle()
	{
		radius=1.0;
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	Circle(double radius,String color,boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return (pi*radius*radius);
	}
	public double getPerimeter()
	{
		//C=2πr
		return (2*pi*radius);
	}
	public String toString()
	{
		return "Circle[Radius = "+radius+", Area = "+this.getArea()+",Perimeter = "+this.getPerimeter()+"]";
	}
}
class Rect extends Shap
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
		return "Rectangle[Length = "+length+",width = "+width+",Area = "+this.getArea()+",Perimeter = "+this.getPerimeter()+"]";
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
		super.setWidth(side);

	}
	public void setLength(double side)
	{
		super.setLength(side)
		;
	}
	public String toString()
	{
		return super.toString()+",Square[Side = "+side+" ]";
	}
}
class Useofabs
{
	public static void main(String[] args) 
	{
		Circle ci=new Circle(4.5,"red",true);
		Rect re=new Rect(3.4,4.5,"green",false);
		Square sq=new Square(6.0,"white",true);
		ci.getArea();
		ci.getPerimeter();
		System.out.println(ci);
		System.out.println();

		re.getArea();

		re.getPerimeter();

		System.out.println(re);
		System.out.println();
		sq.setWidth(5.2);

		sq.setLength(3.1);
		System.out.println(sq);
	}
}