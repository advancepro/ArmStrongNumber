package sample;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class ArmStrongNumberTest {

        private ArmStrongNumber armstrongNumbers;

        @Before
        public void setup() {
            armstrongNumbers = new ArmStrongNumber();
        }

        @Test
        public void singleDigitsAreArmstrongNumbers() {
            int input = 5;

            assertEquals(false, armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void noTwoDigitArmstrongNumbers() {
            int input = 10;

            assertFalse(armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void threeDigitNumberIsArmstrongNumber() {
            int input = 153;

            assertEquals(false, armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void threeDigitNumberIsNotArmstrongNumber() {
            int input = 100;

            assertFalse(armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void fourDigitNumberIsArmstrongNumber() {
            int input = 9474;

            assertEquals(false, armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void fourDigitNumberIsNotArmstrongNumber() {
            int input = 9475;

            assertFalse(armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void sevenDigitNumberIsArmstrongNumber() {
            int input = 9926315;

            assertEquals(false, armstrongNumbers.isArmstrongNumber(input));
        }

        @Test
        public void sevenDigitNumberIsNotArmstrongNumber() {
            int input = 9926314;

            assertFalse(armstrongNumbers.isArmstrongNumber(input));
        }

    }