package com.example.modernjava.network;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static spock.util.matcher.HamcrestMatchers.closeTo;

class GeocoderTest {
    private Geocoder geocoder = new Geocoder();

    @Test
    void encodeAddress() throws Exception{
        String encoded = geocoder.encodeAddress(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA"));
        assertEquals("1600+Ampitheatre+Parkway,Mountain+View,CA", encoded);
    }

    @Test
    public void getData() throws Exception {
        String data = geocoder.getData(
                Arrays.asList("1600 Ampitheatre Parkway", "Mountain View", "CA"));
        System.out.println(data);
        assertThat(data, both(containsString("37.42")).and(containsString("-122.08")));
    }

    @Test
    public void fillInLatLng() {
        Location location = new Location(
                "1600 Ampitheatre Parkway", "Mountain View", "CA");
        geocoder.fillInLatLng(location);
        assertThat(location.getLatitude(), is(closeTo(37.42, 0.01)));
        assertThat(location.getLongitude(), is(closeTo(-122.08, 0.01)));
    }
}