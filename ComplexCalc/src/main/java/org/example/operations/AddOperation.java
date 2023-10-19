package org.example.operations;

import org.example.models.Complex;
import org.example.factories.ComplexNumberFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AddOperation implements ComplexOperation {
    private static final Logger logger = LoggerFactory.getLogger(AddOperation.class);
    @Override
    public Complex solve(Complex left, Complex right) {
        logger.debug(String.format("%s + %s", left, right));
        return ComplexNumberFactory.createNumber(left.getReal() + right.getReal(), left.getImag() + right.getImag());
    }
}
