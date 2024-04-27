package Tutorial;

class Students {
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Main {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    static int myMethod(int x, int y) {
        return x + y;
    }

    // Create a checkAge() method with an integer variable called age
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String a[]) {
        Students student1 = new Students("John", 23);
        Students student2 = new Students("Jane", 22);
        // ... rest of the students

        // myMethod("Jenny", 8);

        int z = myMethod(5, 3);
        Main myobj = new Main();

        myobj.myPublicMethod();
        System.out.println(z);

        checkAge(20);

        System.out.println(student1.name + " is " + student1.age + " years old.");
        System.out.println(student2.name + " is " + student2.age + " years old.");

        // ... rest of the print statements
    }
}