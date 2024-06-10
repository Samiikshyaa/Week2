package Abstraction.task6;

public class Area extends Shape {

    @Override
    int RectangleArea(int length, int breadth) {
        return (length*breadth);
    }

    @Override
    int SquareArea(int side) {
        return (side*side);
    }

    @Override
    double CircleArea(int radius) {
        return ((double)(22/7.0)*radius*radius);
    }
}
