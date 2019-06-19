package com.virtusa.sample.numberToWordConverter.service.impl;

import com.virtusa.sample.numberToWordConverter.dao.WordConverterDAO;
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
public class WordConverterServiceImplTest {
    @InjectMocks
    WordConverterServiceImpl wordConverterService;

    @Mock
    private WordConverterDAO wordConverterDAO;

    @Test
    public void contextLoads() {
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectNumbersOver999999999() {
        wordConverterService.convertNumToWord(1000000000);
    }

    @Test(expected = IllegalArgumentException.class)
    public void rejectNegitiveNumbers() {
        wordConverterService.convertNumToWord(-5);
    }

    @Test
    public void verifyDAOInvokation() {

        Mockito.when(wordConverterDAO.convertNumToWord(123)).thenReturn("xyz");
        wordConverterService.convertNumToWord(123);

        verify(wordConverterDAO, times(1)).convertNumToWord(any(Integer.class));
    }


}
