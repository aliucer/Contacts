package first;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		MobilePhone myMobilePhone = new MobilePhone();
		myMobilePhone.options();
		boolean exit = false;
		while(!exit) {
			System.out.println("press button");
			int a=scanner.nextInt();
			switch (a) {
			
			case 1:
				System.out.println("new contact name");
				scanner.nextLine();
				String name = scanner.next();
				System.out.println("new number");
				String telefon = scanner.next();
				scanner.nextLine();
				myMobilePhone.addContact(new Contacts(name, telefon));
				break;
			case 2:
				System.out.println("old contact name");
				String oldname = scanner.next();
				System.out.println("new contact name");
				String newname = scanner.next();
				System.out.println("new contact phone");
				String newphone = scanner.next();
				myMobilePhone.replaceContact(new Contacts(newname,newphone),myMobilePhone.findContact(oldname));
				break;
			case 3:

				System.out.println("delete name");
				scanner.nextLine();
				String removename = scanner.nextLine();
				myMobilePhone.removeContact(myMobilePhone.findContact(removename));
				break;
				
			case 4:
				System.out.println("name to find number");
				scanner.nextLine();
				String findname = scanner.nextLine();
				Contacts foundcontact = myMobilePhone.findContact(findname);
				System.out.println("name is " + foundcontact.getName() + " number is " + foundcontact.getPhoneNumber()); 
				break;
			case 5:
				myMobilePhone.options();
				break;
			case 6:
				int size = myMobilePhone.mylist.size();
				for(int i = 0; i<size; i++) {
					System.out.println(i + "- name: " + myMobilePhone.mylist.get(i).getName() + " number: " + myMobilePhone.mylist.get(i).getPhoneNumber());
				}
				break;
			default:
				exit = true;
				break;
			}
		}
		scanner.close();
	}
}
