package demoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DisplayNameTest {

    @Test
    @DisplayName("Should demonstrate a simple Assertion")
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1, 1);
    }
}