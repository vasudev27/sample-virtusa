package com.virtusa.sample.numberToWordConverter.constants;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NUmberWordsEnumTest {

    @Test
    public void testUnits() {
        assertEquals(NumberWordsEnum.one, NumberWordsEnum.getWordFromNum(1));
        assertEquals(NumberWordsEnum.two, NumberWordsEnum.getWordFromNum(2));
        assertEquals(NumberWordsEnum.three, NumberWordsEnum.getWordFromNum(3));
        assertEquals(NumberWordsEnum.four, NumberWordsEnum.getWordFromNum(4));
        assertEquals(NumberWordsEnum.five, NumberWordsEnum.getWordFromNum(5));
        assertEquals(NumberWordsEnum.six, NumberWordsEnum.getWordFromNum(6));
        assertEquals(NumberWordsEnum.seven, NumberWordsEnum.getWordFromNum(7));
        assertEquals(NumberWordsEnum.eight, NumberWordsEnum.getWordFromNum(8));
        assertEquals(NumberWordsEnum.nine, NumberWordsEnum.getWordFromNum(9));
        assertEquals(NumberWordsEnum.ten, NumberWordsEnum.getWordFromNum(10));
        assertEquals(NumberWordsEnum.eleven, NumberWordsEnum.getWordFromNum(11));
        assertEquals(NumberWordsEnum.twelve, NumberWordsEnum.getWordFromNum(12));
        assertEquals(NumberWordsEnum.thirteen, NumberWordsEnum.getWordFromNum(13));
        assertEquals(NumberWordsEnum.fourteen, NumberWordsEnum.getWordFromNum(14));
        assertEquals(NumberWordsEnum.fifteen, NumberWordsEnum.getWordFromNum(15));
        assertEquals(NumberWordsEnum.sixteen, NumberWordsEnum.getWordFromNum(16));
        assertEquals(NumberWordsEnum.seventeen, NumberWordsEnum.getWordFromNum(17));
        assertEquals(NumberWordsEnum.eighteen, NumberWordsEnum.getWordFromNum(18));
        assertEquals(NumberWordsEnum.nineteen, NumberWordsEnum.getWordFromNum(19));

    }

    @Test
    public void tesTens() {
        assertEquals(NumberWordsEnum.twenty, NumberWordsEnum.getWordFromNum(20));
        assertEquals(NumberWordsEnum.thirty, NumberWordsEnum.getWordFromNum(30));
        assertEquals(NumberWordsEnum.forty, NumberWordsEnum.getWordFromNum(40));
        assertEquals(NumberWordsEnum.fifty, NumberWordsEnum.getWordFromNum(50));
        assertEquals(NumberWordsEnum.sixty, NumberWordsEnum.getWordFromNum(60));
        assertEquals(NumberWordsEnum.seventy, NumberWordsEnum.getWordFromNum(70));
        assertEquals(NumberWordsEnum.eighty, NumberWordsEnum.getWordFromNum(80));
        assertEquals(NumberWordsEnum.ninety, NumberWordsEnum.getWordFromNum(90));

    }
}
