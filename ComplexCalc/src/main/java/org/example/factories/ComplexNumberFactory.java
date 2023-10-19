package org.example.factories;

import org.example.models.Complex;
import org.example.models.ComplexImpl;
import org.example.readers.ComplexReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComplexNumberFactory {
    private static final Logger logger = LoggerFactory.getLogger(ComplexNumberFactory.class);
    public static Complex createNumber(double re, double im) {
        var value = new ComplexImpl(re, im);
        logger.debug(String.format("create complex number %s", value));
        return value;
    }
}
