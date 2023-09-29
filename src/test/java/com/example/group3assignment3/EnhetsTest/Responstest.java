package com.example.group3assignment3.EnhetsTest;

import com.example.group3assignment3.Respons;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Responstest {
    @Test
    public void testResponseCall() {
        Respons resp = new Respons("Linus");
        assertEquals("Hello, Linus", resp.getRespons());
    }
}
