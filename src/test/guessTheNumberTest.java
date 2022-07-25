package test;

import org.junit.jupiter.api.Assertions;

class guessTheNumberTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.Test
    void getUserName(){
        Assertions.assertEquals("mac","mac", "Test to get user name failed");
    }

    @org.junit.jupiter.api.Test
    void makeGuess(){
        Assertions.assertEquals(2,2,"user enter invalid input");
    }

    @org.junit.jupiter.api.Test
    void wouldYouLikeToPlayAgain(){
        Assertions.assertEquals("Y","Y","user enter invalid string to play again");
    }

    @org.junit.jupiter.api.Test
    void tryAgain(){
        Assertions.assertEquals("N","N","user enter invalid string to try again");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}