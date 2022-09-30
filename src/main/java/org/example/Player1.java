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

    public void hitByGun1() {
        int reducer = 30;

        if (this.score <= 0) {
            this.score = 0;
            System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
        } else {
            this.score -= reducer;
            System.out.println(this.name + " is hit by Gun1, score is reduced by " + reducer + ", Score is now " + this.score);

        }


    }

    public void hitOpponentWithGun1() {
        if(this.score <= 0){
            System.out.println("score is less than or equal to zero, need to heal first");
        }else{
            int increase = 40;
            this.score +=increase;
            System.out.println(this.name + " hit opponent with gun1, score is now increased by " + increase + " score is now," + this.score);

        }
        }

    public void hitOpponentWithGun2() {
        if(this.score <= 0){
            System.out.println("score is less than or equal to zero, need to heal first");
        }else{
            int increase = 50;
            this.score +=increase;
            System.out.println(this.name + " hit opponent with gun2, score is now increased by " + increase + " score is now," + this.score);

        }
    }


    public void hitByGun2() {
        int reducer = 40;
        if (this.score <= 0) {
            this.score = 0;
            System.out.println("Game over, score is now " + this.score + " " + this.name + " is dead");
        } else {
            this.score -= reducer;
            System.out.println(this.name + " is hit by Gun2, score is reduced by " + reducer + ", Score is now " + this.score);

        }


    }

    public void heal() {
        this.score = 100;
    }
}
