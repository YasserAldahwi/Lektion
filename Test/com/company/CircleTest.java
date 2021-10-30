package com.company;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    private Circle circle;
    @BeforeEach
    void setUp() {
        circle = new Circle(6);
    }

    @Test
    void getRadius() {

        assertEquals(6, circle.getRadius());
    }

    @Test
    void setRadius() {
        circle.setRadius(10);
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getArea() {

        assertEquals(113,Math.round(circle.getArea()));
    }

    @Test
    void getCircumference() {

    }


}