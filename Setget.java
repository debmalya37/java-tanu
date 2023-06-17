class Practice {
    String name;
    int age;

    // constructor
    Practice(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("name: " + name + " " + age);

    }
}

class Person {
    private String name;
    private int age;

    // Getter method for the name field
    public String getName() {
        return name;
    }

    // Setter method for the name field
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the age field
    public int getAge() {
        return age;
    }

    // Setter method for the age field
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age value. Age must be non-negative.");
        }
    }
}
// changed name from abcd to Setget
public class Setget {
    public static void main(String[] args) {
        Practice prac1 = new Practice("deb", 17);

        prac1.show();

        Person tanu = new Person();
        tanu.setName("Tanushree");
        tanu.setAge(16);

        System.out.println("name: " + tanu.getName() + " age: " + tanu.getAge());
    }
}