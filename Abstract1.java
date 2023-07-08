abstract class Human {
    public abstract void humanHabit();

    public void sleep() {
        System.out.println("sleeping");

    }
}

class Ape extends Human {
    public void humanHabit() {
        System.out.println("eat and sleep");

    }
}

class Abstract1 {
    public static void main(String[] args) {
        Ape Generation = new Ape();
        Generation.humanHabit();
    }
}
