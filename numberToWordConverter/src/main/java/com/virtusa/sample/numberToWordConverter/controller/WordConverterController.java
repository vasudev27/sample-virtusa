package com.virtusa.sample.numberToWordConverter.controller;

import com.virtusa.sample.numberToWordConverter.service.WordConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class WordConverterController {

    @Autowired
    private WordConverterService wordConverterService;


    public String convertNumToWord(int number) throws IllegalArgumentException {

        return wordConverterService.convertNumToWord(number);

    }
}
