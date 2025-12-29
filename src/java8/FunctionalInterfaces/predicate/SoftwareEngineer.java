package java8.FunctionalInterfaces.predicate;

public class SoftwareEngineer {
    String name;
    int age;
    boolean hasGirlFriend;

    public SoftwareEngineer(String name, int age, boolean hasGirlFriend) {
        this.name = name;
        this.age = age;
        this.hasGirlFriend = hasGirlFriend;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasGirlFriend=" + hasGirlFriend +
                '}';
    }
}
