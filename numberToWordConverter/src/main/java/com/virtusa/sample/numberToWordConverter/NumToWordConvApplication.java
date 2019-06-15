package com.virtusa.sample.numberToWordConverter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumToWordConvApplication {

	private static Logger logger = LoggerFactory.getLogger(NumToWordConvApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(NumToWordConvApplication.class, args);
		
		System.out.println("Please enter the positive integer");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// Reading data using readLine
		String input = "";
		int inputNumber;

		try {
			input = reader.readLine();
			inputNumber = Integer.parseInt(input);
			System.out.println(WordConverter.convertNumToWord(inputNumber));

		} catch (IOException e) {
			logger.error("Error while reading the input. " + e.getMessage());
		} catch (NumberFormatException e) {
			logger.error(input + " is invalid Number");
		} catch (IllegalArgumentException e) {
			logger.error(input + " is invalid positive integer. ");
		} catch (Exception e) {
			logger.error( "Internal Server Exception: "+ e.getMessage());
		}

	}

}
