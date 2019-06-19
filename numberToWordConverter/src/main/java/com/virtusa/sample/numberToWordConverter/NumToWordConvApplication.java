package com.virtusa.sample.numberToWordConverter;

import com.virtusa.sample.numberToWordConverter.controller.WordConverterController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class NumToWordConvApplication {

    private static Logger logger = LoggerFactory.getLogger(NumToWordConvApplication.class);

    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(NumToWordConvApplication.class, args);

        WordConverterController wordConverterController = appContext.getBean(WordConverterController.class);

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the positive integer less than 999,999,999. Enter negitive value to exit");

        try {
            while ((num = scanner.nextInt()) > 0) {

                System.out.println(wordConverterController.convertNumToWord(num));
                System.out.println("Keep Going! Enter the positive integer less than 999,999,999");
            }

            System.out.println("Number is negative! System Shutdown!");
            System.exit(1);

        } catch (NumberFormatException e) {
            System.out.println(" Invalid input! System Shutdown!");
        } catch (Exception e) {
            System.out.println(" Invalid input! System Shutdown!");
        } finally {
            System.exit(1);
        }

    }

}
