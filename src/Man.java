public class Man {
    int age;
    String name;

    public Man(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
