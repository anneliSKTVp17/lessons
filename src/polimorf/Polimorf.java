/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorf;

/**
 *
 * @author user2
 */
public class Polimorf {

    /**
     * @param args the command line arguments
     */
        // TODO code application logic here
        //пример полиморфизма
  public static void main(String[] args) {
        Car[] cars = new Car[4];
        cars[0] = new Ferrari();
        cars[1] = new Mercedes();
        cars[2] = new Toyota();
        cars[3] = new Nissan();
        for (Car car : cars) {
            car.forward();
}
  }
}