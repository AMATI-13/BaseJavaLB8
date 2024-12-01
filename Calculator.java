package LB7;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<AbstractShape> shapes;

    public Calculator() {
        shapes = new ArrayList<>();
    }

    public void addShape(AbstractShape shape) {
        shapes.add(shape);
    }

    public void showAllShapes() {
        System.out.println("Все зарегистрированные фигуры:");
        for (AbstractShape shape : shapes) {
            System.out.println(shape);
        }
    }
}
