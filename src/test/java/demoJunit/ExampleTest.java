package demoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExampleTest {

    @Test
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1,1);
    }

    @Test
    void shouldShowSimpleAssertion_(){
        Assertions.assertEquals(1,2);
    }

    @Test
    void shouldShowSimpleAssertion__(){
        Assertions.assertEquals(2,2);
    }


}

// Test failed: 1, passed:2 of 3 tests -16 ms