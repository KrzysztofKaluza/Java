package com.krzysztof.accessingdatawithjpa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testToString() {
        Customer customer = new Customer("Krzysztof", "Kaluza");
        String effect = String.format("Customer[id=%d, firstName='%s', lastName='%s']", customer.getId(),
                customer.getFirstName(), customer.getLastName());
        assertEquals("Customer[id=null, firstName='Krzysztof', lastName='Kaluza']", effect);
    }

    @Test
    void getId() {
        Customer customer = new Customer("Krzysztof", "Kaluza");
        assertEquals(null, customer.getId());
    }

    @Test
    void getFirstName() {
        Customer customer = new Customer("Krzysztof", "Kaluza");
        assertEquals("Krzysztof", customer.getFirstName());
    }

    @Test
    void getLastName() {
        Customer customer = new Customer("Krzysztof", "Kaluza");
        assertEquals("Kaluza", customer.getLastName());
    }
}