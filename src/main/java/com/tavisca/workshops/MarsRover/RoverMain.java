package com.tavisca.workshops.MarsRover;

import java.util.Scanner;

public class RoverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\t\t=========================================================");
        System.out.println("\t\t                 Welcome to Mars Rover                   ");
        System.out.println("\t\t=========================================================");

//        System.out.print("\n\t\tEnter the Initial Position : ");
        String initialVector = "3 3 E";
//        System.out.print("\n\t\tEnter the Commands : ");
        String commands = "MMRMMRMRRM";

        String[] vector = initialVector.split(" ");
        int x = Integer.parseInt(vector[0]);
        int y = Integer.parseInt(vector[1]);
        char dir = vector[2].trim().charAt(0);

        Rover rover = new Rover();
        rover.setStartingPosition(x, y, dir);
        System.out.println("\n\t\tInitial Position : " +rover.getCurrentPosition());

        rover.rove(commands);
        System.out.println("\n\t\tCurrent Position : " +rover.getCurrentPosition());

        System.out.println("\t\t=========================================================");
        System.out.println("\t\t                 Thanks. Visit Again...                  ");
        System.out.println("\t\t=========================================================");
    }
}
