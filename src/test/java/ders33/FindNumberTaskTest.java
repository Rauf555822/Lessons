package ders33;
import org.example.ders33.FindNumberTask;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindNumberTaskTest {

    FindNumberTask findNumberTask = new FindNumberTask();

    @Test
    public void findMax_Success() {

        //Mocking
        int [] numbersMock = {1,2,3,4,5};

        //Running
        int actual = findNumberTask.findMax(numbersMock);

        int expected = 5;

        //Assertion (Testing)
        assertEquals(expected, actual);
    }

    @Test
    public void findAverage_Success() {

        int [] numbersMock = {1,2,3,4,5};

        double actual = findNumberTask.findAverage(numbersMock);

        double expected = 3;


        assertEquals(expected, actual);
    }
}

