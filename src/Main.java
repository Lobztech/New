class Student {
    String name;
    int roll_no;
}

class Main {
    public static void main(String[] args) {
        // create an object of Student class
        Student john = new Student();

        // set the values of name and roll_no variables
        john.name = "John";
        john.roll_no = 2;

        // print the values of name and roll_no variables
        System.out.println("Name: " + john.name);
        System.out.println("Roll No: " + john.roll_no);
    }
}
