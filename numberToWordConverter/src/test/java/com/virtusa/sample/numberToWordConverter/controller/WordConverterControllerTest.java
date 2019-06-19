package com.virtusa.sample.numberToWordConverter.controller;

import com.virtusa.sample.numberToWordConverter.service.WordConverterService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WordConverterControllerTest {

    @InjectMocks
    WordConverterController wordConverterController;

    @Mock
    private WordConverterService wordConverterService;

    @Test
    public void contextLoads() {
    }

    @Test
    public void verifyServInvokation() {

        Mockito.when(wordConverterService.convertNumToWord(123)).thenReturn("xyz");
        wordConverterController.convertNumToWord(123);

        verify(wordConverterService, times(1)).convertNumToWord(any(Integer.class));
    }

}
