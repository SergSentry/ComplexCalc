package org.example.readers;

import org.example.factories.OperationFactory;
import org.example.operations.ComplexOperation;

import java.util.Scanner;

public class OperationReader {
    private final Scanner scanner;

    public OperationReader(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getOperationCode() {
        while (!this.scanner.hasNext()) {
            this.scanner.next();
        }

        return scanner.next();
    }

    public ComplexOperation getOperation() {
        System.out.println("Input complex number.");
        System.out.print("Input operation code: ");

        return OperationFactory.getOperation(getOperationCode());
    }
}
