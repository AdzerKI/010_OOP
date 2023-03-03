public class Person {
    // AI
    private int id;
    // ФИО
    private String surname;
    private String name;
    private String middleName;

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", position=" + position +
                '}';
    }

    public int getId() {
        return id;
    }

    // Должность
    private Position position;

    public Person(int id, String surname, String name, String middleName, Position position) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.position = position;
    }
}
