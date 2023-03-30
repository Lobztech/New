class Triangle {
    double side1;
    double side2;
    double side3;

    // constructor with three parameters
    public Triangle(double s1, double s2, double s3) {
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    // method to calculate the area of the triangle
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        return area;
    }

    // method to calculate the perimeter of the triangle
    public double getPerimeter() {
        double perimeter = side1 + side2 + side3;
        return perimeter;
    }
}

class Main {
    public static void main(String[] args) {
        // create an object of Triangle class with sides 3, 4, and 5 units
        Triangle triangle = new Triangle(3, 4, 5);

        // calculate and print the area and perimeter of a rectangle
        System.out.println("Area of the triangle is: " + triangle.getArea());
        System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter());
    }
}
