package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareToTest {
    @Test
    public void CompareToFirstMoreSecond() {
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 100, 11, 14);

        int expected = 1;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertTrue(actual > 0);

    }
    @Test
    public void CompareToFirstLessSecond() {
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 500, 11, 14);

        int expected = 1;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertTrue(actual < 0);

    }
    @Test
    public void CompareToFirstEqualsSecond() {
        Ticket ticket1 = new Ticket("MSK", "SPB", 200, 10, 12);
        Ticket ticket2 = new Ticket("MSK", "SPB", 200, 11, 14);

        int expected = 1;
        int actual = ticket1.compareTo(ticket2);

        Assertions.assertTrue(actual == 0);

    }

}