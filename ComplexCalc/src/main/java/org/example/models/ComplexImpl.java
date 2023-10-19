package org.example.models;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class ComplexImpl implements Complex {
    private final double re;
    private final double im;

    public ComplexImpl(double real, double imag) {
        re = real;
        im = imag;
    }

    @Override
    public double getReal() {
        return re;
    }

    @Override
    public double getImag() {
        return im;
    }

    public String toString() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.getDefault());
        symbols.setDecimalSeparator('.');
        DecimalFormat dec = new DecimalFormat("#.#########", symbols);
        return dec.format(re) + " + " + dec.format(im) + "i";
    }
}
