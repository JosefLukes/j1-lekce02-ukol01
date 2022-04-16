package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        zofka.setSpeed(10);

        this.nakresliPrasatko(zofka,200,10);





    }




    public void nakresliPrasatko(Turtle zelva,int delkaSteny, int delkaNozicky) {
        ctverec(zelva,delkaSteny);
        zelva.turnRight(90);
        zelva.move(delkaSteny);
        zelva.turnRight(90);
        nozicka(zelva,delkaNozicky);
        zelva.move(delkaSteny);
        zelva.turnLeft(90);
        nozicka(zelva,delkaNozicky);
        strecha(zelva,delkaSteny);
    }
    public void ctverec(Turtle zelva, int delka) {

        for (int i = 0; i < 4; i++) {
            zelva.move(delka);
            zelva.turnRight(90);

        }
        //zelva.move(150);
    }

        public void strecha(Turtle zelva, int delka) {
                zelva.turnRight(30);
                zelva.move(delka);
                zelva.turnRight(120);
                zelva.move(delka);
    }

    public void nozicka(Turtle zelva, int delka) {

        zelva.turnRight(45);
        zelva.move(delka);
        zelva.turnRight(180);
        zelva.move(delka);
        zelva.turnRight(90);
        zelva.move(delka);
        zelva.turnRight(180);
        zelva.move(delka);
        zelva.turnLeft(45);
    }


}
