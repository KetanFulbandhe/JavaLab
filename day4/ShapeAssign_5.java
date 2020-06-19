abstract class Shape
{
	public abstract void Draw();
}
class Tringle extends Shape
{
	
	public void Draw()
	{
	     System.out.println("Inside Tringle draw()");
	}
}
class Polygon extends Shape
{
	
	public void Draw()
	{
	     System.out.println("Inside Polygon draw()");
	}
}
class Circle extends Shape
{
	
	public void Draw()
	{
	     System.out.println("Inside Circle draw()");
	}
}
public class ShapeAssign_5
{
	public static void main(String args[])
	{	
		Shape arr[]=new Shape[3];
		arr[0]=new Tringle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].Draw();
		}
	}
}