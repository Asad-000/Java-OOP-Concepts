class Student {
    int[] marks;

    // Constructor
    public Student(int size) {  // Initialize array
        marks = new int[size];

        for (int i = 0; i < size; i++) {
            marks[i] = (i+1) * 10;
        }
    }

    public void display() {
        for (int m : marks) {
            System.out.println("Marks: " + m);
        }
    }
}

public class Array {
    public static void main(String[] args) {
        Student s = new Student(5);

        s.display();
    }
}