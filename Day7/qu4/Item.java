//package ItemPack;

public class Item {
	public String itemid;
	public String name;
	public int cost;
	
	
	Item(String itemid, String name, int cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}
	
	public void disp()
	{
		System.out.println("ID is: "+itemid);
		System.out.println("Name is: "+name);
		System.out.println("Cost is: "+cost);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item it1 = new Item("001","Notebook",80);
		it1.disp();
		Item it2=new Item("002", "Pencil", 30);
		it2.disp();
		Item it3 = new Item("003", "Eraser", 20);
		it3.disp();				
	}

}
