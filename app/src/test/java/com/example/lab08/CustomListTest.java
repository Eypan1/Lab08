package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);

        // Verify the city is in the lists
        assertTrue(list.hasCity(edmonton));

        // Delete the city
        list.deleteCity(edmonton);

        // Verify if it was removed
        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        // The empty list should have 0 cities
        assertEquals(0, list.countCities());

        // Add one city to the list
        City edmonton = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertEquals(1, list.countCities());

        // Add another city to the lista
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        assertEquals(2, list.countCities());

        // Delete a city from the list (Vancouver)
        list.deleteCity(vancouver);
        assertEquals(1, list.countCities());

    }

}