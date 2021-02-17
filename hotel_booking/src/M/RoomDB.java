package M;

public class RoomDB {
	public int id;
	public String type;
	public int capacity;
	public int price;
	
	public RoomDB() {}
	
	public RoomDB(int xid, String xtype,int xcapacity, int xprice)
	{
		id = xid;
		type = xtype;
		capacity = xcapacity;
		price = xprice;
	}
	

}
