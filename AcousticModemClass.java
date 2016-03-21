package com.java24hours;

public class AcousticModemClass extends Modem{
    int speed = 300; 
    
   public void connect(){
       System.out.println("Connecting to Internet at " + speed + " speed...");
   }
   public void disconnect(){
       System.out.println("Disconnecting from Internet now. Goodbye.");
   }
}