package com.driver;

public class F1 extends Car {
    private int currentspeed;
   private int gear;
    public F1(String name, boolean isManual) {
        super(name,0,0,0,isManual,"",0);
        this.gear=0;

    }

    public void accelerate(int rate){
        int newSpeed = 0; //set the value of new speed by using currentSpeed and rate
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */
        currentspeed=getCurrentSpeed();
        newSpeed=rate+currentspeed;
    //add rate to the current speed and change the gear accordingly
        if(newSpeed == 0) {
            currentspeed=0;
           this.gear=1;
            //Stop the car, set gear as 1
        }

        if(newSpeed>0 && newSpeed<=50){
            this.gear=1;
        }
        if(newSpeed>50 && newSpeed<=100){
            this.gear=2;
        }
        if(newSpeed>100 && newSpeed<=150){
            this.gear=3;
        }
        if(newSpeed>150 && newSpeed<=200){
            this.gear=4;
        }
        if(newSpeed>200 && newSpeed<=250){
            this.gear=5;
        }

        if(newSpeed>250){
            this.gear=6;
        }

        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
