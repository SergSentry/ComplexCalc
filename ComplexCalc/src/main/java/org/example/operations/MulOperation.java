package org.example.operations;

import org.example.models.Complex;
import org.example.factories.ComplexNumberFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MulOperation implements ComplexOperation {
    private static final Logger logger = LoggerFactory.getLogger(MulOperation.class);
    @Override
    public Complex solve(Complex left, Complex right) {
        logger.debug(String.format("%s * %s", left, right));
        double real = left.getReal() * right.getReal() - left.getImag() * right.getImag();
        double imag = left.getReal() * right.getImag() + left.getImag() * right.getReal();
        return ComplexNumberFactory.createNumber(real, imag);
    }
}
