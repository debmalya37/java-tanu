public class prac2 {
    public static void main(String[] args) {

        Code ob = new Code("spr", 150);
        ob.show();

    }
}

class Code {
    String address;
    int pincode;

    Code(String ad, int pin) {

        this.address = ad;
        this.pincode = pin;
    }

    public void show() {
        System.out.println("address = " + address + " pincode = " + pincode);
    }
}
