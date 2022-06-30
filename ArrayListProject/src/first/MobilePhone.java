package first;

import java.util.ArrayList;
	

public class MobilePhone {
	
	public ArrayList<Contacts> mylist;
	
	
	public MobilePhone() {
		mylist = new ArrayList<>();
	}


	public void options() {
		System.out.println(
				  "press 1 to add new contact\n"
				+ "press 2 to update existing contact\n"
				+ "press 3 to remove contact\n"
				+ "press 4 to search contact\n"
				+ "press 5 to print again");
	}
	

	private boolean isExist(String name) {
		if(findContact(name)!=null){
			return true;
		}
		return false;
	}
	
	public Contacts findContact(String name) {
		for(int i = 0; i<mylist.size(); i++) {
			if(mylist.get(i).getName().equals(name)) {
				return mylist.get(i);
			}
		}
		return null;
	}
	
	public boolean addContact(Contacts myContact) {
		if(!isExist(myContact.getName())) {
			mylist.add(myContact);
			return true;
		}
		return false;
	}
	
	public boolean updateContact(Contacts myContact, int place) {
		if(!isExist(myContact.getName())) {
			mylist.set(place, myContact);
			return true;
		}
		return false;
	}
	
	public boolean replaceContact(Contacts newContact, Contacts oldContact) {
		if(isExist(oldContact.getName())) {
			mylist.set(mylist.indexOf(oldContact), newContact) ;
			return true;
		}
		return false;
	}
	
	public boolean removeContact(Contacts myContact) {
		if(isExist(myContact.getName())) {
			mylist.remove(mylist.indexOf(myContact));
			return true;
		}
		return false;
		
	}
}
