class Triangle {
    double side1, side2, side3;

    // constructor with no parameters
    public Triangle() {
        side1 = 3;
        side2 = 4;
        side3 = 5;
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
        // create an object of Triangle class
        Triangle triangle = new Triangle();

        // calculate and print the area and perimeter of the triangle
        System.out.println("Area of the triangle is: " + triangle.getArea());
        System.out.println("Perimeter of the triangle is: " + triangle.getPerimeter());
    }
}
