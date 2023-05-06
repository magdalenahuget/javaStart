package com.company.methodsAndConstructors.methods;

public class Methods {
    public static void main(String[] args) {

        //Calculator
        double x = 15;
        double y = 5.5;

        Calculator calculator = new Calculator();
        double add = calculator.add(x, y);
        System.out.println("------Calculator---------");
        System.out.println(x + "+" + y + "="+ add);
        System.out.println("A = " + x + ", B = " + y);
        System.out.println("A+B = " + calculator.add(x, y));
        System.out.println("A-B = " + calculator.subtract(x, y));
        System.out.println("A*B = " + calculator.multiply(x, y));
        System.out.println("A/B = " + calculator.divide(x, y));

        //LengthUnitConverter

        LengthUnitsConverter lengthUnitsChange = new LengthUnitsConverter();
        double m = 2.5;
        double cm = 2.6;
        double mm = 2.7;
        double mToCm = lengthUnitsChange.changeFromMetersToCentimeters(m);
        double mToMm = lengthUnitsChange.changeFromMetersToMilimeters(m);
        double mmToM = lengthUnitsChange.changeFromMilimetersToMeters(mm);
        double cmToM = lengthUnitsChange.changeFromCentimetersToMeters(cm);
        System.out.println("-------UnitConverter--------");
        System.out.println(m + "m to " + mToCm + "cm i " + mToMm + "mm");

        //TimeUnitConverter

        TimeUnitsConverter timeUnitsConverter = new TimeUnitsConverter();
        int hours = 14;
        int minutes = timeUnitsConverter.hoursToMinutes(hours);
        int seconds = timeUnitsConverter.minutesToSeconds(minutes);
        int millis = timeUnitsConverter.secondsToMiliseconds(seconds);
        System.out.println("-------TimeUnitsConverter--------");
        System.out.println(hours + " hours to " + millis + " miliseconds");
    }
}