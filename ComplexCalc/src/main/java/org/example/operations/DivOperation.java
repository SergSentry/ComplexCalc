package org.example.operations;

import org.example.models.Complex;
import org.example.factories.ComplexNumberFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DivOperation implements ComplexOperation {
    private static final Logger logger = LoggerFactory.getLogger(DivOperation.class);
    @Override
    public Complex solve(Complex left, Complex right) {
        if (right.getReal() == 0 && right.getImag() == 0) {
            logger.error(String.format("%s / %s", left, right));
            throw new ArithmeticException("Zero division");
        }

        logger.debug(String.format("%s / %s", left, right));
        double realSqr = right.getReal() * right.getReal();
        double imagSqr = right.getImag() * right.getImag();
        double sum = realSqr + imagSqr;

        double real = (left.getReal() * right.getReal() + left.getImag() * right.getImag()) / (sum);
        double imag = (left.getImag() * right.getReal() - left.getReal() * right.getImag()) / (sum);

        return ComplexNumberFactory.createNumber(real, imag);
    }
}
