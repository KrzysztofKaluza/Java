package com.krzysztof.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void getName() {
        Player p = new Player("Krzysztof", Color.WHITE);
        assertEquals("Krzysztof", p.getName());
    }

    @Test
    void getColor() {
        Player p = new Player("Krzysztof", Color.WHITE);
        assertEquals(Color.WHITE, p.getColor());
    }
}