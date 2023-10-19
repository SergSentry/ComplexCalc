package org.example;

import org.example.factories.OperationFactory;
import org.example.operations.*;
import org.example.readers.ComplexReader;
import org.example.readers.OperationReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        OperationFactory.operationAdd("+", new AddOperation());
        OperationFactory.operationAdd("-", new SubOperation());
        OperationFactory.operationAdd("/", new DivOperation());
        OperationFactory.operationAdd("*", new MulOperation());

        ComplexReader reader = new ComplexReader(scanner);
        var c1 = reader.getNumber();
        var c2 = reader.getNumber();

        OperationReader operationReader = new OperationReader(scanner);
        try {
            ComplexOperation operation = operationReader.getOperation();

            var c3 = operation.solve(c1, c2);

            System.out.printf("Result: %s", c3);
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}