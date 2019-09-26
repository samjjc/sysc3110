import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo buddyInfo) {
		this.buddyInfo.add(buddyInfo);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		BuddyInfo b = new BuddyInfo("T");
		AddressBook book = new AddressBook();
		book.addBuddy(b);

	}
}
