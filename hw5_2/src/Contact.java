import java.util.List;

public class Contact {
    private final int id; // AI
    private String lastName; // Фамилия
    private String firstName; // Имя
    private String middleName; // Отчество
    private List<String> phoneNumberList; // Список телефонных номеров

    public Contact(int id, String lastName, String firstName, String middleName, List<String> phoneNumberList) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.phoneNumberList = phoneNumberList;
    }

    @Override
    public String toString() {
        return "id = " + id + "," + lastName + " " + firstName + " " + middleName + ", Телефоны:" + phoneNumberList + "\n";
    }
}
