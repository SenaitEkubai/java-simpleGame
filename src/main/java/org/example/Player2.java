package org.example;

public class Player2 extends Player1 {
    private boolean armour;
    private int score;
    private String name;

    public Player2(String name, String weapon, int score, boolean armour) {
        super(name, weapon, score);
        this.score=score;
        this.name=name;
        this.armour = armour;
    }

    @Override
    public void printMessageWhenPlayerIsDead() {
        System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
    }

    @Override
    public void hitByGun1() {
        int reducer;
        if (armour) {
            reducer = 10;
            if (this.score <= 0) {
                this.score = 0;
             printMessageWhenPlayerIsDead();
            } else {
                this.score -= reducer;
                System.out.println(" Armour is on, "+this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score);

            }


        }
        if (!armour) {
            reducer = 30;
            if (this.score <= 0) {
                this.score = 0;
             printMessageWhenPlayerIsDead();
            } else {
                this.score -= reducer;
                System.out.println(this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score);

            }
        }
    }
}
