public class Shape
{
	private int width,height;
	
	public Shape(int width, int height){
		this.width=width;
		this.height=height;
	}
	public Shape(){ }
	
//get width
	public int getWidth()
	{
		return width;
	}
//set width
	public void setWidth(int width)
	{
		this.width=width;	
	}
//get Height
	public int getHeight()
	{
		return height;	
	}
//set Height
	public void setHeight(int height)
	{
		this.height=height;
	}
	
	public static void main(String[] args)
	{
		Shape s1 = new Shape(5,4);
		int ShapeWidth = s1.getWidth();
		int ShapeHeight = s1.getHeight();
		
		System.out.println("Width :"+ShapeWidth);
		System.out.println("Height :"+ShapeHeight);
	}
}