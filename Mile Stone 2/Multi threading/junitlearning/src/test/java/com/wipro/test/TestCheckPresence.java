package com.wipro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.Test;
import com.wipro.task.DailyTasks;

public class TestCheckPresence {

    @Test
    public void testCheckPresenceTrue() {
        DailyTasks dt = new DailyTasks();
        assertTrue(dt.checkPresence("Wipro Technologies", "Wipro"));
    }

    @Test
    public void testCheckPresenceFalse() {
        DailyTasks dt = new DailyTasks();
        assertFalse(dt.checkPresence("Wipro Technologies", "Java"));
    }
}