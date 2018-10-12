package org.musigma.extendedtest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.concurrent.TimeUnit;

@RunWith(JUnit4.class)
public class ExtendedTest {
    @Test
    public void waitForSomeTime() throws InterruptedException {
        TimeUnit.SECONDS.sleep(30);
    }
}
