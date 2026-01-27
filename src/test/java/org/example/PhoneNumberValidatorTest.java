package org.example;

import org.example.utils.PhoneNumberValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



class PhoneNumberValidatorTest {

     private PhoneNumberValidator underTest;

     @BeforeEach
     void setUp() {
         underTest = new PhoneNumberValidator();
     }

     @ParameterizedTest
     @CsvSource({"+447000000000, TRUE"})
     void itShouldValidatePhoneNumber(String phoneNumber, String expected){


         //Act
         boolean isValid = underTest.test(phoneNumber);

         //Assert
         assertThat(isValid).isEqualTo(Boolean.valueOf(expected));

     }
    @Test
    @DisplayName("Should fail when length bigger than 13")
    void itShouldValidatePhoneNumberWhenIncorrectAndLengthIsBiggerThan13(){

        //Arrange
        String phoneNumber = "+447000000008888";

        //Act
        boolean isValid = underTest.test(phoneNumber);

        //Assert
        assertThat(isValid).isFalse();

    }
    @Test

    @DisplayName("Should fail when does not start with +")
    void itShouldValidatePhoneNumberWhenPhoneNumberDoesNotStartWithPlus(){

        //Arrange
        String phoneNumber = "447000000008888";

        //Act
        boolean isValid = underTest.test(phoneNumber);

        //Assert
        assertThat(isValid).isFalse();

    }



}
