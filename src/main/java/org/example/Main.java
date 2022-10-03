package org.example;

public class Main {
    public static void main(String[] args) {
        Player1 player1 = new Player1("Sarah", "gun", 40);
        Player2 player2 = new Player2("Jane", "gun", 10,true);

        // call methods on each player
        System.out.println(player1.hitByGun1());
    }
}