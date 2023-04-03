package com.snakeladder;

public class game {
    public static void main(String[] args) {
        int player1 = 0;
        int ran1 = (int) ((Math.random() * 10) % 6 + 1);
        System.out.println(ran1);
        int ran2 = (int) ((Math.random() * 10) % 2 + 1);
        System.out.println(ran2);

        switch (ran2) {
            case 1:
                System.out.println("no play");
                break;
            case 2:
                System.out.println("player move ahead of " + ran1);
                break;
            case 3:
                System.out.println("player move behind of" + ran1);
                break;
            default:
                System.out.println("no case");
                break;
        }
    }
}
