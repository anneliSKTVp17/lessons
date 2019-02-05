/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user2
 */
public class JavaDevelopersJobSide implements Observed {
    List<String> vacancies = new ArrayList<>();
    
    List<Observer> subscribes = new ArrayList<>();
    
    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy); 
        notifyObservers();   
    }
    public void removeVacancy(String vacancy) {
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    public void addObserver(Observer observer) {
        this.subscribes.add(observer);
       
    }
    public void removeObserver(Observer observer) {
        this.subscribes.remove(observer);
    }
    public void notifyObservers() {
    for (Observer observer: subscribes) {
        observer.handleEvent(vacancies);
    }
    }
}
