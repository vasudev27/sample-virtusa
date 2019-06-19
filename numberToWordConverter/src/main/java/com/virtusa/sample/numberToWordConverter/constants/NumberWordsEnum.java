package com.virtusa.sample.numberToWordConverter.constants;

import java.util.Arrays;

public enum NumberWordsEnum {


    //zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, thirty, forty, fifty, sixty, seventy, eighty, ninety;

    zero(0, "zero"),
    one(1, "one"), two(2, "two"), three(3, "three"), four(4, "four"), five(5, "five"),
    six(6, "six"), seven(7, "seven"), eight(8, "eight"), nine(9, "nine"), ten(10, "ten"),
    eleven(11, "eleven"), twelve(12, "twelve"), thirteen(13, "thirteen"), fourteen(14, "fourteen"),
    fifteen(15, "fifteen"), sixteen(16, "sixteen"), seventeen(17, "seventeen"),
    eighteen(18, "eighteen"), nineteen(19, "nineteen"), twenty(20, "twenty"), thirty(30, "thirty"), forty(40, "forty"),
    fifty(50, "fifty"), sixty(60, "sixty"), seventy(70, "seventy"), eighty(80, "eighty"), ninety(90, "ninety"), Empty(-1, "");

    private String desc;

    private int key;

    NumberWordsEnum(int key, String desc) {
        this.key = key;
        this.desc = desc;
    }

    public static NumberWordsEnum getWordFromNum(final int key) {
        return Arrays.stream(values()).filter(value -> value.getKey() == key).findFirst().orElse(Empty);
    }

    public String getDesc() {
        return desc;
    }

    public int getKey() {
        return key;
    }

}
