/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.util.Calendar;

/**
 * This class is used to create a Calendar object with the current date, then
 * create a good morning, afternoon or evening message.
 * @author mdeboer1
 */
public class WelcomeService {
    private Calendar timeOfDay;
    private String periodOfDay;

    public WelcomeService() {
    }

    public WelcomeService(Calendar timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    /**
     * This method sets the Calendar instance, then uses the hour of day 
     * property of the Calendar object to be used to determine if it is 
     * morning, afternoon or evening.
     */
    public final void setTimeOfDay() {
        timeOfDay = Calendar.getInstance();
        int hourOfDay = timeOfDay.get(Calendar.HOUR_OF_DAY);
        if (hourOfDay < 12){
            periodOfDay = "Morning";
        }
        else if (hourOfDay < 18){
            periodOfDay = "Afternoon";
        }
        else {
            periodOfDay = "Evening";
        }
    }
    
    /**
     * this method receives the user name from the MessageController and returns
     * the appropriate temporal message
     * @param userName - property received from MessageController
     * @return - Temporal greeting message
     * @throws NullPointerException - exception if name is null
     */
    public final String generateMessage(String userName) throws
            NullPointerException {
        String name = null;
        try{
            name = userName;
        }catch (NullPointerException npe){
        }
        
        String message = "Good " + periodOfDay + " " + name + ". Welcome!";
        return message;
    }
//    
//    public static void main(String[] args) {
//        WelcomeService service = new WelcomeService();
//        service.setTimeOfDay();
//        System.out.println(service.generateMessage("Mark"));
//    }
}
