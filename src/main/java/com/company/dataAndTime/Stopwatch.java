package com.company.dataAndTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Objects;
import java.util.Scanner;

public class Stopwatch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Stopwatch has started.");
        System.out.println("-----------------------");

        System.out.println("Press enter to start the stopwatch.");
        scanner.nextLine();
        LocalTime started = LocalTime.now();

        System.out.println("Press enter to stop the stopwatch.");
        scanner.nextLine();
        LocalTime stopped = LocalTime.now();

        Duration duration = Duration.between(started, stopped);
        long seconds = duration.getSeconds();
        long HH = seconds / 3600;
        long MM = (seconds % 3600) / 60;
        long SS = seconds % 60;
        long ss = seconds % 1000;
        String timeInHHMMSSss = String.format("%02d:%02d:%02d:%02d", HH, MM, SS, ss);
        System.out.println("Time measured is: " + timeInHHMMSSss);
    }
}
