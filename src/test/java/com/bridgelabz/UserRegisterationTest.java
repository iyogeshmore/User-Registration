package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegisterationTest {
@Test
public void givenFirstName_WhenProper_ShouldReturnTrue() {
    UserRegistration userRegistration = new UserRegistration();
    boolean result = userRegistration.validateFirstName("Yogesh");
    Assertions.assertTrue(result);
}
}
