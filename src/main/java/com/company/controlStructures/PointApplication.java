package com.company.controlStructures;

public class PointApplication {

    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        PointController pc = new PointController();

        final int addX = 0;
        final int addY = 1;
        final int minusX = 2;
        final int minusY = 3;

        System.out.println("Punkt: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addX(p1);
        System.out.println("Punkt addX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.addY(p1);
        System.out.println("Punkt addY: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusX(p1);
        System.out.println("Punkt minusX: (" + p1.getX() + ";" + p1.getY() + ")");
        pc.minusY(p1);
        System.out.println("Punkt minusY: (" + p1.getX() + ";" + p1.getY() + ")");

        // switch - short version
        int option = addX;
        switch (option) {
            case addX -> pc.addX(p1);
            case addY -> pc.addY(p1);
            case minusX -> pc.minusX(p1);
            case minusY -> pc.minusY(p1);
            default -> System.out.println("Wrong value provided.");
        }

        //switch - long version
//        switch (option) {
//            case addX:
//                pc.addX(p1);
//                break;
//            case addY:
//                pc.addY(p1);
//                break;
//            case minusX:
//                pc.minusX(p1);
//                break;
//            case minusY:
//                pc.minusY(p1);
//                break;
//            default:
//                System.out.println("Wrong value provided.");
//        }
        System.out.println("Point after change: (" + p1.getX() + ";" + p1.getY() + ")");
    }
}
