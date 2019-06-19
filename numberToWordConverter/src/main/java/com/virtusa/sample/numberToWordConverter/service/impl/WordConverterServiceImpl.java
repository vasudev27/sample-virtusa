package com.virtusa.sample.numberToWordConverter.service.impl;

import com.virtusa.sample.numberToWordConverter.dao.WordConverterDAO;
import com.virtusa.sample.numberToWordConverter.service.WordConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WordConverterServiceImpl implements WordConverterService {

    @Autowired
    private WordConverterDAO wordConverterDAO;


    public String convertNumToWord(int number) throws IllegalArgumentException {

        if (number > 999999999) {
            throw new IllegalArgumentException();
        } else if (number < 0) {
            throw new IllegalArgumentException();
        }

        return wordConverterDAO.convertNumToWord(number);
    }

}
