package br.com.erudio.math;

/**
 * SimpleMath
 */
public class SimpleMath {

    public Double sum(Double a, Double b) {
        return a + b;
    }

    public Double sustration(Double a, Double b) {
        return a - b;
    }

    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    public Double division(Double a, Double b) {
        return a / b;
    }

    public Double mean(Double a, Double b) {
        return (a + b) / 2;
    }

    public Double squareRoot(Double a) {
        return (Double) Math.sqrt(a);
    }
}