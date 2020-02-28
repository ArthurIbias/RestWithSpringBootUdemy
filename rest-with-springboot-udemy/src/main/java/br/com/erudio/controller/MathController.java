package br.com.erudio.controller;

import br.com.erudio.exception.UnsuportedMathOpetarionException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converter.NumberConverter;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingController.
 */
@RestController
public class MathController {

    private final SimpleMath math = new SimpleMath();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") final String numberOne,
            @PathVariable(value = "numberTwo") final String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.sum(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable(value = "numberOne") final String numberOne,
            @PathVariable(value = "numberTwo") final String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.sustration(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable(value = "numberOne") final String numberOne,
            @PathVariable(value = "numberTwo") final String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.multiplication(NumberConverter.converToDouble(numberOne),
                NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable(value = "numberOne") final String numberOne,
            @PathVariable(value = "numberTwo") final String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.division(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mean(@PathVariable(value = "numberOne") final String numberOne,
            @PathVariable(value = "numberTwo") final String numberTwo) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberOne)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.mean(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
    }

    @RequestMapping(value = "/squareroot/{number}", method = RequestMethod.GET)
    public Double squareRoot(@PathVariable(value = "number") final String number) throws Exception {
        if (!NumberConverter.isNumeric(number)) {
            throw new UnsuportedMathOpetarionException("Please set a numeric value!");
        }

        return math.squareRoot(NumberConverter.converToDouble(number));
    }

}