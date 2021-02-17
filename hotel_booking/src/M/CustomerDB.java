package M;

public class CustomerDB {
	public int id;
	public String name;
	public String surname;
	public String address;
	public String phone;
	public String password;

	public CustomerDB() {
	}

	public CustomerDB(int xid, String xname, String xsurname, String xaddress, String xphone, String xpassword) {
		id =xid;
		name = xname;
		surname =xsurname;
		address = xaddress;
		phone = xphone;
		password = xpassword;

	}

}
