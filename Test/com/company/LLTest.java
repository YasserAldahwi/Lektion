package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LLTest {

    @Test
    void getArea(){
        var ll = new LL();
        assertEquals(5, ll.getArea());

    }

}