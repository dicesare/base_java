package com.antony_c.app;
import org.junit.jupiter.api.Test;
import javax.swing.JFrame;
import static org.junit.jupiter.api.Assertions.*;

class MyWindowTest {
    @Test
    void testMyWindow() {
        MyWindow window = new MyWindow();
        JFrame frame = window.getMainFrame();
        assertNotNull(frame);
        assertEquals("My First Window", frame.getTitle());
        assertEquals(500, frame.getWidth());
        assertEquals(500, frame.getHeight());
    }
}