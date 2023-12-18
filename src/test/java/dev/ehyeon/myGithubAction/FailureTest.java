package dev.ehyeon.myGithubAction;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FailureTest {

    @Test
    public void successTest() {

    }

    @Test
    public void failureTest() {
        Assertions.fail();
    }
}
