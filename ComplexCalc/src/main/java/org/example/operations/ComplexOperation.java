package org.example.operations;

import org.example.models.Complex;

@FunctionalInterface
public interface ComplexOperation {
    Complex solve(Complex left, Complex right);
}
