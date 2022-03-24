package demoJunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
//import org.junit.jupiter.api.Assertions.assertEquals;

//import java.util.List;

public class MultipleAssertionTest {

    @Test
    @DisplayName("Should check all items in the List")
    void shouldCheckAllItemsInTheList(){
       List<Integer> numbers = List.of(2,3,5,7);
//        Assertions.assertAll(() -> assertEquals(1, numbers.get(0)),
//                () ->);
        Assertions.assertEquals(2,numbers.get(0));
        Assertions.assertEquals(3,numbers.get(1));
        Assertions.assertEquals(5,numbers.get(2));
        Assertions.assertEquals(7,numbers.get(3));
    }
}
