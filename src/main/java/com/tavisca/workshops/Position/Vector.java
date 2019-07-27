package com.tavisca.workshops.Position;

public class Vector {
    private final Coordinates coordinates;
    private final char direction;

    public Vector(int x, int y, char direction){
        this.coordinates = new Coordinates(x,y);
        this.direction = direction;
    }

    public int getX(){
        return coordinates.getX();
    }

    public int getY(){
        return coordinates.getY();
    }

    public char getDirection(){
        return this.direction;
    }

}
