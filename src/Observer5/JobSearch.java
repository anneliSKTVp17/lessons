/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer5;

/**
 *
 * @author user2
 */
public class JobSearch {
    
    
    public static void main(String[] args) {
        JavaDevelopersJobSide jobSite = new JavaDevelopersJobSide();
        Observer firstSubscriber = new Subscriber("Jelena Petrova");
        Observer secondSubscriber = new Subscriber("Tim Hex");
        Observer thirdSubscriber = new Subscriber("Aaron gimp");
        
        jobSide.addObserver(firstSubscriber);
        jobSide.addObserver(secondSubscriber);
        jobSide.addObserver(thirdSubscriber);
        
        jobSide.addVacancy("Java developer in Tallinn");
        jobSide.addVacancy("Java developer in Berlin");
        jobSide.addVacancy("Java developer in Riga");
        
    }
}
