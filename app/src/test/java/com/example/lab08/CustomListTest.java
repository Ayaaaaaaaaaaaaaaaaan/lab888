package com.example.lab08;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");
        list.addCity(toronto);

        list.deleteCity(toronto);
        assertFalse(list.hasCity(toronto));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        City montreal = new City("Montreal", "QC");

        list.addCity(vancouver);
        list.addCity(montreal);


        assertEquals(2, list.countCities());
    }
}
