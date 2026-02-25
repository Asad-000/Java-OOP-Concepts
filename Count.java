class CountObject {

    static int count = 0;

    public CountObject() {
        count++;
    }
    public  static void display() {
        System.out.println(count + " Objects are created");
    }
}

public class Count {
    public static void main(String[] args) {

        CountObject c1 = new CountObject();
        CountObject c2 = new CountObject();
        CountObject c3 = new CountObject();
        CountObject c4 = new CountObject();
        CountObject c5 = new CountObject();

        CountObject.display();

    }
}