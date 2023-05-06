package com.company.methodsAndConstructors.methods;

public class LengthUnitsConverter {

    public double changeFromMetersToCentimeters(double m){

        return m * 100;
    }

    public double changeFromMetersToMilimeters( double m){

        return m * 1000;
    }

    public double changeFromCentimetersToMeters( double cm){

        return cm / 100;
    }

    public double changeFromMilimetersToMeters( double mm){

        return mm / 1000;
    }
}
