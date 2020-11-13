import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    void testFizzBuzzNumber() {
        assertEquals("2",FizzBuzz.fizzBuzz(2));
    }

    @Test
    void testFizzBuzzThreeFizz(){
        assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    void testFizzBuzzSixFizz(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(6));
    }

    @Test
    void testFizzBuzzNineFizz(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(9));
    }

    @Test
    void testFizzBuzzFiveBuzz(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
    }

    @Test
    void testFizzBuzzTenBuzz(){
        assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    void testFizzBuzzFifteenFizzBuzz(){
        assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }


}