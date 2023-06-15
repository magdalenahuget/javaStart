package com.company.bigIntegerAndDecimal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersAddition {
    public static void main(String[] args) {

        final String fileName = "src/main/java/com/company/bigIntegerandDecimal/big_numbers.txt";
        try (
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
        ) {
            int first = Integer.parseInt(br.readLine());
            int second = Integer.parseInt(br.readLine());
            int third = Integer.parseInt(br.readLine());
            int sum1 = first + second + third;
            System.out.println(sum1);
            BigInteger fourth = new BigInteger(br.readLine());
            BigInteger fifth = new BigInteger(br.readLine());
            BigInteger sum2 = fourth.add(fifth);
            System.out.println(sum2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.err.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Reading file error");
        }
    }
}
