class Ullu {
    int y;

    public Ullu(int x) {
        y = x;
    }

    void display() {
        System.out.println(" num = " + y);
    }
}

public class Pen {
    public static void main(String[] args) {
        Ullu puk = new Ullu(10);
        puk.display();
    }
}

// output: num=10
