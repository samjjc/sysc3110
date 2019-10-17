import java.util.ArrayList;
import java.util.List;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo b) {
		if (b != null) {
			this.buddyInfo.add(b);
		}
	}
	
	public void removeBuddy(int index) {
		if (index >=0 && index < this.buddyInfo.size()) {
			this.buddyInfo.remove(index);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test");
		BuddyInfo b = new BuddyInfo("T");
		AddressBook book = new AddressBook();
		book.addBuddy(b);

	}

	public AddressBook(List<BuddyInfo> buddyInfo) {
		super();
		this.buddyInfo = buddyInfo;
	}
}
