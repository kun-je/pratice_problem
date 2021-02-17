package M;

public class BookingDB {
	public int id;
	public int customer_id;
	public int room_id;
	public String start_date;
	public String end_date;

	public BookingDB() {
	}

	public BookingDB(int xid, int xcustomer_id, int xroom_id, String xstart_date, String xend_date) {
		id = xid;
		customer_id = xcustomer_id;
		room_id = xroom_id;
		start_date = xstart_date;
		end_date = xend_date;

	}

}
