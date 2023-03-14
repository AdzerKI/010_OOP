import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<Contact> contactList; // Список телефонных номеров

    public PhoneBook() {
        this.contactList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return contactList.toString();
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void addContact(Contact contact){
        contactList.add(contact);
    }
}
