public class Parent {
    private String name;
    private boolean sex;
    private int age;

    public Parent(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        String sexStr = (sex) ? "Мужчика": "Женщина";
        return "Имя= " + name + ", пол = " + sexStr + ", Возраст = " + age;
    }
}
