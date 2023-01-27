package com.driver;

public class F1 extends Car{

    public F1(String name, boolean isManual) {
        //Use arbitrary values for parameters which are not mentioned
        super();
        this.setName(name);
        this.setIsManual(isManual);
    }

    public void accelerate(int rate){
        //set the value of new speed by using currentSpeed and rate
        int newSpeed = this.getCurrentSpeed()+rate;
        /**
         * speed 0: gear 1
         * speed 1-50: gear 1
         * speed 51-100: gear 2
         * speed 101-150: gear 3
         * speed 151-200: gear 4
         * speed 201-250: gear 5
         * speed more than 250: gear 6
         */

        if(newSpeed == 0) {
            //Stop the car, set gear as 1
            stop();
            this.setCurrentGear(1);

        }  else if(newSpeed <= 50){
            this.setCurrentGear(1);
        }
        else if(newSpeed <=100){
            this.setCurrentGear(2);
        }else if(newSpeed <=150){
            this.setCurrentGear(3);
        }else if(newSpeed <=200){
            this.setCurrentGear(4);
        }else if(newSpeed <=250){
            this.setCurrentGear(5);
        }else {
            this.setCurrentGear(6);
        }
        //for all other cases, change the gear accordingly

        if(newSpeed > 0) {
            this.changeSpeed(newSpeed, this.getCurrentDirection());
        }
    }

}