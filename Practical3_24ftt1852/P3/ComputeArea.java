package P3;

public class ComputeArea {

    public static void main(String[] args) {

        double base = 4.0;
        double height = 6.0;
        double radius = 8.0;
       

        double areaSquare = base * base;
        double areaTriangle =  (base * height) / 2;
        double areaCircle = Math.PI * radius * radius;

        System.out.printf("Area of the square: " + areaSquare + "\nArea of the triangle: " + areaTriangle + "\nArea of the circle: %.2f", areaCircle);   


    }
    
}
