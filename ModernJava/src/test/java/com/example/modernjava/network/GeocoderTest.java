package com.example.modernjava.network;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GeocoderTest {
    private Geocoder geocoder = new Geocoder();

    @Test
    void encodeAddress() throws Exception{
        String encoded = geocoder.encodeAddress(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA"));
        assertEquals("1600+Ampitheatre+Parkway,Mountain+View,CA", encoded);
    }

    @Test
    void getData() throws Exception{
        String data = geocoder.getData(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA"));
        System.out.println(data);
    }
}