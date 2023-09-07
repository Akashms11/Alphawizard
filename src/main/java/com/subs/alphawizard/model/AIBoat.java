package com.subs.alphawizard.model;

import java.util.Random;

public class AIBoat {
    private int xPosition;
    private int yPosition;
    private int targetX;
    private int targetY;

    public AIBoat(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.targetX = generateRandomPosition();
        this.targetY = generateRandomPosition();
    }

    private int generateRandomPosition() {
        Random random = new Random();
        return random.nextInt(10); // Generate a random number between 0 and 9
    }

    public void move() {
        if (xPosition < targetX) {
            xPosition++;
        } else if (xPosition > targetX) {
            xPosition--;
        }

        if (yPosition < targetY) {
            yPosition++;
        } else if (yPosition > targetY) {
            yPosition--;
        }
    }

    public void printPosition() {
        System.out.println("Current Position: (" + xPosition + ", " + yPosition + ")");
    }

    public static void main(String[] args) {
        AIBoat aiBoat = new AIBoat(0, 0);

        for (int i = 0; i < 10; i++) {
            aiBoat.move();
            aiBoat.printPosition();
        }
    }
}

