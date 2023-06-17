
// // // default constructor
// // class program {
// //     int age;
// //     String name;

// //     void show() {
// //         System.out.println("age & name: " + age + " " + name);
// //     }
// // }

// // class abc {
// //     public static void main(String[] args) {
// //         program ref = new program();
// //         ref.show();
// //     }
// // }

// // parameterized constructor
// class number {
//     int x, y;

//     number(int r, int t) {
//         x = t;
//         y = r;
//     }

//     void abcd() {
//         System.out.println("the value of x and y are " + x + " & " + y);

//     }
// }

// class xyz {
//     public static void main(String[] args) {
//         number ob = new number(67, 89);
//         ob.abcd();

//     }

// // }

// public class Tanushree {
//     public static void main(String[] args) {

//         int number = 5;
//         int d = calculateFactorial(number);

//         System.out.println("the factorial is: " + d);
//     }

//     public static int calculateFactorial(int a) {
//         if (a == 0) {
//             return 1;

//         } else {
//             return a * calculateFactorial(a - 1);
//         }
//     }
// }

class Oops {
    public void poly() {
        System.out.println("hello ");
    }

    public void poly(String name) {
        System.out.println("hello " + name);
    }

    public void poly(String name, int age) {
        System.out.println(name + age);
    }
}

class text {
    public void makeCircle() {
        System.out.println("displaying circle: ");
    }
}

class circle extends text {
    public int makeCircle(int r) {
        (3.14) * r * r;
        return 
        
    }
}

class triangle extends text {
    System.out.println("dfbadf")
}

public class Tanushree {
    public static void main(String[] args) {
        Oops a1 = new Oops();
        a1.poly(); // hello

        Oops a2 = new Oops();
        a2.poly("tanu"); // hello tanu

        Oops a3 = new Oops();
        a3.poly("tanu", 12);

        Oops a4 = new Oops();
        a4.password = "abcd";

    }
}

// public
// private
// protected
// default
