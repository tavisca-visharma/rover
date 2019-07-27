package com.tavisca.workshops.MarsRover;

import com.tavisca.workshops.Position.Vector;

public class Rover {
    private Vector vector;

    Rover(){
        vector = new Vector(0,0,'E');
    }

    public void setStartingPosition(int x, int y, char direction) {
        vector = new Vector(x,y,direction);
    }

    public int getXCoordinate() {
        return vector.getX();
    }

    public int getYCoordinate() {
        return vector.getY();
    }

    public char getDirection() {
        return vector.getDirection();
    }

}
