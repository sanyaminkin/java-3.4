package ru.netology.manager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetMaxLength {
    MovieManager manager = new MovieManager();

    @Test
    public void setMaxLengthBelowZero() {
        int clientMaxLength = -8;
        manager.setMaxLength(clientMaxLength);
        int expected = 10;
        int actual = manager.getMaxLength();
        assertEquals(expected, actual);
    }
    @Test
    public void setMaxLengthZero() {
        int clientMaxLength = 0;
        manager.setMaxLength(clientMaxLength);
        int expected = 0;
        int actual = manager.getMaxLength();
        assertEquals(expected, actual);
    }
    @Test
    public void setMaxLengthAboveZero() {
        int clientMaxLength = 5;
        manager.setMaxLength(clientMaxLength);
        int expected = 5;
        int actual = manager.getMaxLength();
        assertEquals(expected, actual);
    }
    @Test
    public void setMaxLengthAny() {
        int clientMaxLength = 22;
        manager.setMaxLength(clientMaxLength);
        int expected = 22;
        int actual = manager.getMaxLength();
        assertEquals(expected, actual);
    }
}

