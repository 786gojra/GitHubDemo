package demoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DisabledTest {

    @Test
    @Disabled("Not implemented yet")
    void shouldShowSimpleAssertion(){
        Assertions.assertEquals(1, 1);
    }
}

// I added the reason why the test should not run because it is not implemented yet
// or it is not ready yet