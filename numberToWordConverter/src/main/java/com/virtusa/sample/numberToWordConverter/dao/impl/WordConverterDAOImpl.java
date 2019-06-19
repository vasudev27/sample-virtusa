package com.virtusa.sample.numberToWordConverter.dao.impl;

import com.virtusa.sample.numberToWordConverter.constants.NumberWordsEnum;
import com.virtusa.sample.numberToWordConverter.dao.WordConverterDAO;
import org.springframework.stereotype.Repository;

@Repository
public class WordConverterDAOImpl implements WordConverterDAO {

    public String convertNumToWord(final int number) throws IllegalArgumentException {

        StringBuffer result = new StringBuffer();

        final int millions = number / 1000000;
        int remainder = number % 1000000;
        final int thousands = remainder / 1000;
        remainder = remainder % 1000;
        final int hundreds = remainder / 100;
        final int tensAndUnits = remainder % 100;

        appendMillions(millions, result);
        appendThousands(thousands, result);
        appendHundreds(hundreds, result);
        appendTensAndUnits(tensAndUnits, result);


        return result.toString();
    }

    private void appendMillions(final int millions, StringBuffer result) {
        if (millions > 0) {
            append(convertNumToWord(millions) + " million", result);
        }
    }

    private void appendThousands(final int thousands, StringBuffer result) {
        if (thousands > 0) {
            append(convertNumToWord(thousands) + " thousand", result);
        }
    }

    private void appendHundreds(final int hundreds, StringBuffer result) {
        if (hundreds > 0) {
            append(NumberWordsEnum.getWordFromNum(hundreds) + " hundred", result);
        }
    }

    private void appendTensAndUnits(final int tensAndUnits, StringBuffer result) {

        if (tensAndUnits > 0 || result.length() == 0) {
            appendWithAnd(convertTensAndUnits(tensAndUnits), result);
        }
    }

    private void append(final String words, StringBuffer result) {
        appendWithSeparator(words, " ", result);
    }

    private void appendWithAnd(final String words, StringBuffer result) {
        appendWithSeparator(words, " and ", result);
    }

    private void appendWithSeparator(final String words, final String separator, StringBuffer result) {
        if (result.length() > 0) {
            result.append(separator);
        }
        result.append(words);
    }

    private String convertTensAndUnits(final int number) {
        final int tens = number / 10;
        final int units = number - tens * 10;

        if (number < 20) {
            return NumberWordsEnum.getWordFromNum(number).getDesc();
        } else if (units == 0) {
            return NumberWordsEnum.getWordFromNum(tens * 10).getDesc();
        } else {
            return NumberWordsEnum.getWordFromNum(tens * 10).getDesc() + " " + NumberWordsEnum.getWordFromNum(units).getDesc();
        }
    }

}
