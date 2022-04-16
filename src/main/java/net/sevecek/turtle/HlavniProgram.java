package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


        zofka.setSpeed(100);

        //this.nakresliPrasatko(zofka,200,10);

        //zofka.turnLeft(90);
        //this.nakresliNUhelnik(zofka, 50,8);

        //zofka.move(200);
        //this.nakresliNUhelnik(zofka, 8,50);
        //zofka.move(200);
        //this.nakresliSlunicko(zofka, 20,12);

        this.nakresliKompozici(zofka);

    }
    public void nakresliKompozici(Turtle zelva) {
        zelva.setLocation(150,50);
        nakresliSlunicko(zelva,10,12);
        zelva.setLocation(100,180);
        nakresliRaduDomu(zelva,50,5,50);
        zelva.setLocation(100,300);
        nakresliRaduDomu(zelva,50,2,350);
        zelva.setLocation(300,300);
        nakresliPrasatko(zelva,50,20);
    }
    public void nakresliRaduDomu(Turtle zelva, int delka, int pocetDomu, int odstup) {
        for (int i = 0; i < pocetDomu; i++) {
            nakresliDomecek(zelva, delka);
            zelva.turnLeft(60);
            zelva.penUp();
            zelva.move(odstup);
            zelva.turnRight(90);
            zelva.move(delka);
            zelva.turnRight(180);
            zelva.penDown();
        }
    }
    public void nakresliNUhelnik(Turtle zelva, int delka, int pocetkroku) {

        for (int i = 0; i < pocetkroku; i++) {
            zelva.move(delka);
            zelva.turnRight(360.0 / pocetkroku);
        }
    }
    public void nakresliSlunicko(Turtle zelva, int delka, int pocetkroku) {

        for (int i = 0; i < pocetkroku; i++) {
            zelva.move(delka);
            zelva.turnRight( 360.0/pocetkroku);
            zelva.turnLeft(90);
            zelva.move(delka);
            zelva.turnRight(180);
            zelva.move(delka);
            zelva.turnLeft(90);
        }
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

    public void nakresliDomecek(Turtle zelva, int delka) {

        ctverec(zelva, delka);
        zelva.move(delka);
        strecha(zelva, delka);

    }

    public void ctverec(Turtle zelva, int delka) {

        for (int i = 0; i < 4; i++) {
            zelva.move(delka);
            zelva.turnRight(90);
        }
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
