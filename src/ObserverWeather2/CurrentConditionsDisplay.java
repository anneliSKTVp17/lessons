/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather2;

import Observer3.Observer;
import java.util.Observable;

/**
 *
 * @author user2
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
 Observable observable;
 private float temperature;
 private float humidity;
 
 public CurrentConditionsDisplay()

    @Override
    public void update(float temp, float humidity, float pressure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
