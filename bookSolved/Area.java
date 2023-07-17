package bookSolved;

public class Area {
    public double computeArea(double base, double height) {
        return base * height;
    }

    public double computeArea(double diagonal1, double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public double computeArea(double side1, double side2, double height) {
        return 0.5 * (side1 + side2) * height;
    }

    public static void main(String[] args) {
        Area areaCalculator = new Area();

        // Compute the area of a parallelogram
        double parallelogramArea = areaCalculator.computeArea(5, 10);
        System.out.println("Parallelogram area: " + parallelogramArea);

        // Compute the area of a rhombus
        double rhombusArea = areaCalculator.computeArea(8, 12);
        System.out.println("Rhombus area: " + rhombusArea);

        // Compute the area of a trapezium
        double trapeziumArea = areaCalculator.computeArea(6, 8, 4);
        System.out.println("Trapezium area: " + trapeziumArea);
    }
}
