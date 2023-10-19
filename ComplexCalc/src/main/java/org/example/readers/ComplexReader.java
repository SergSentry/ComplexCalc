package org.example.readers;

import org.example.factories.OperationFactory;
import org.example.models.Complex;
import org.example.factories.ComplexNumberFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ComplexReader {
    private final Scanner scanner;

    public ComplexReader(Scanner scanner) {
        this.scanner = scanner;
    }

    private double getDouble() {
        while (!this.scanner.hasNextDouble()) {
            this.scanner.next();
        }

        return this.scanner.nextDouble();
    }

    public Complex getNumber() {
        System.out.println("Input complex number.");
        System.out.print("Input real part: ");
        double real = getDouble();
        System.out.print("Input image part: ");
        double imag = getDouble();

        return ComplexNumberFactory.createNumber(real, imag);
    }
}
