package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent asia = new Continent("Asia");
        Continent europe = new Continent("Europe");
        Continent northAmerica = new Continent("North America");

        Country poland = new Country("Poland", new BigDecimal("10000"));
        Country russia = new Country("Russia", new BigDecimal("1000"));
        Country usa = new Country("USA", new BigDecimal("100"));
        Country japan = new Country("Japan", new BigDecimal("1000"));
        Country canada = new Country("Canada", new BigDecimal("100000"));
        Country france = new Country("France", new BigDecimal("1000"));
        Country china = new Country("China", new BigDecimal("1000000000000"));

        europe.addCountry(poland);
        europe.addCountry(russia);
        europe.addCountry(france);

        asia.addCountry(japan);
        asia.addCountry(china);

        northAmerica.addCountry(usa);
        northAmerica.addCountry(canada);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(northAmerica);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal expectedQuantity = new BigDecimal("1000000113100");
        Assert.assertEquals(expectedQuantity, allPeople);

    }
}
