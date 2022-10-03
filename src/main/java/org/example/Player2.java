package org.example;

public class Player2 extends Player1 {
    private boolean armour;
    private int score;
    private String name;

    public Player2(String name, String weapon, int score, boolean armour) {
        super(name, weapon, score);
        this.score = score;
        this.name = name;
        this.armour = armour;
    }

    @Override
    public String printMessageWhenPlayerIsDead() {
        return "Game over, score is now " + this.score + " " + this.name + " is dead";
    }

    @Override
    public String hitByGun1() {
        String message = "";
        if (armour) {
            int reducer = 10;
            this.score -= reducer;
            if (this.score <= 0) {
                this.score = 0;
                message = printMessageWhenPlayerIsDead();
            }
           else {
                message = " Armour is on, " + this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score;
            }
        }
        if (!armour) {
            int reducer = 30;
            if (this.score <= 0) {
                this.score = 0;
                message = printMessageWhenPlayerIsDead();
            } else {
                this.score -= reducer;
                message = this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score;
            }
        }
        return message;
    }

    @Override
    public String hitByGun2() {
        String message = "";
        int reducer;
        if (armour) {
            reducer = 20;
            if (this.score <= 0) {
                this.score = 0;
                message = printMessageWhenPlayerIsDead();
            } else {
                this.score -= reducer;
                message = " Armour is on, " + this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score;
            }
        }

        if (!armour) {
            reducer = 40;
            if (this.score <= 0) {
                this.score = 0;
                message = printMessageWhenPlayerIsDead();
            } else {
                this.score -= reducer;
                message = " Armour is on, " + this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score;
            }
        }
        return message;
    }

    @Override
    public String hitOpponentWithGun1() {
        String message;
        if (this.score <= 0) {
            message = ("score is less than or equal to zero, need to heal first");
        } else {
            int increase = 40;
            this.score += increase;
            message = (this.name + " hit opponent with gun1, score is now increased by " + increase + " score is now " + this.score);
        }

        return message;
    }

    @Override
    public String hitOpponentWithGun2() {
        String message = "";
        if (this.score <= 0) {
            message = ("score is less than or equal to zero, need to heal first");
        } else {
            int increase = 50;
            this.score += increase;
            message = (this.name + " hit opponent with gun2, score is now increased by " + increase + " score is now," + this.score);
        }
        return message;
    }
}
