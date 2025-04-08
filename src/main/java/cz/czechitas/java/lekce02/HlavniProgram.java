package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();
    for (int i = 0; i < 3; i++) {
      drawHouse();
      zofka.turnRight(45);
      zofka.move(100);
      zofka.turnLeft(90);
      zofka.penUp();
      zofka.move(20);
      zofka.penDown();
      zofka.turnLeft(90);
    }
  }

  public void drawHouse() {
    for (int i = 0; i < 4; i++) {
      zofka.move(100);
      zofka.turnRight(90);
    }
    zofka.move(100);
    zofka.turnRight(45);
    zofka.move(70);
    zofka.turnRight(90);
    zofka.move(70);
  }

}
