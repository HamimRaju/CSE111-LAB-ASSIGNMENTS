package task_07;

public class CellPhone {
    String model = "Unknown";
    int Contact_stored = 0;

    String[] all_contacts = new String[3];

    public void storeContact(String contact) {
        if (Contact_stored < all_contacts.length) {
            all_contacts[Contact_stored] = contact;
            Contact_stored++;
            System.out.println("Contact Stored");
        } 
        else {
            System.out.println("Memory full. New contact can't be stored.");
        }
    }

    public void printDetails() {
        System.out.println("Phone model " + model);
        System.out.println("Contacts Stored: " + Contact_stored);
        if (Contact_stored > 0) {
            System.out.println("Stored Contacts:");
            for (int i = 0; i < Contact_stored; i++) {
                System.out.println(all_contacts[i]);
            }
        }
    }
}