package com.tavisca.workshops.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoverTest {

    Rover rover;

    @BeforeEach
    void initialization(){
        rover = new Rover();
    }

    @Test
    void roverCanBeInitializedWithGivenPosition() {
        rover.setStartingPosition(1, 3, 'N');
        assertEquals(1, rover.getXCoordinate());
        assertEquals(3, rover.getYCoordinate());
        assertEquals('N', rover.getDirection());
    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateLeftFromNorthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateLeftFromEastDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateRightFromSouthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateRightFromWestDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateRightFromNorthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateRightFromEastDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateLeftFromSouthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanRotateLeftFromWestDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanMoveForwardInNorthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanMoveForwardInEastDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanMoveForwardInSouthDirection() {

    }

    @Test
    @Tag("to_be_done-tests")
    void roverCanMoveForwardInWestDirection() {

    }

}
