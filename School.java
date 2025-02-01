package projecttt;

public class School {
	String name;
	int fee;
	String address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "School [name=LPHS" + name + ", fee=150000" + fee + ", address=Sainikpuri" + address + "]";
	}
	public School(String name2, int fee2, String address2) {
		// TODO Auto-generated constructor stub
	}

}
