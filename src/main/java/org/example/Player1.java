package org.example;

public class Player1 {
    private String name;
    private String weapon;
    private int score;

    public Player1(String name, String weapon, int score) {
        this.name = name;
        this.weapon = weapon;
        this.score = score;
    }

    public String hitByGun1() {
        String message;
        int reducer = 30;
        if (this.score <= 0 || (this.score -= reducer) <= 0) {
            this.score = 0;
            // System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
            message = "Game over, score is now " + this.score + " " + this.name + " is dead";
        } else {
            this.score -= reducer;
            System.out.println(this.score -=reducer);

            //System.out.println(this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score);
            message = this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score;
        }
        return message;
    }

    public String hitOpponentWithGun1() {
        String message;
        if (this.score <= 0) {
            System.out.println("score is less than or equal to zero, need to heal first");
            message = ("score is less than or equal to zero, need to heal first");
        } else {
            int increase = 40;
            this.score += increase;
            System.out.println(this.name + " hit opponent with gun1, score is now increased by " + increase + " score is now " + this.score);
            message = (this.name + " hit opponent with gun1, score is now increased by " + increase + " score is now " + this.score);
        }

        return message;
    }

    public String hitOpponentWithGun2() {
        String message = "";
        if (this.score <= 0) {
            System.out.println("score is less than or equal to zero, need to heal first");
            message = ("score is less than or equal to zero, need to heal first");
        } else {
            int increase = 50;
            this.score += increase;
            System.out.println(this.name + " hit opponent with gun2, score is now increased by " + increase + " score is now," + this.score);
            message = (this.name + " hit opponent with gun2, score is now increased by " + increase + " score is now," + this.score);
        }
        return message;
    }

    public String hitByGun2() {
        String message = "";
        int reducer = 40;
        if (this.score <= 0 || (this.score -= reducer) <= 0) {
            this.score = 0;
            System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
            message = "Game over, score is now " + this.score + " " + this.name + " is dead";
        } else {
            this.score -= reducer;
            System.out.println(this.name + " is hit by Gun2, score is reduced by " + reducer + ", Score is now " + this.score);
            message = this.name + " is hit by Gun2, score is reduced by " + reducer + ", Score is now " + this.score;
        }
        return message;
    }

    public int heal() {
        int newScore = this.score = 100;
        return newScore;
    }

    public String printMessageWhenPlayerIsDead() {
        System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
        return "Game over, score is now " + this.score + " " + this.name + " is dead";
    }
}
