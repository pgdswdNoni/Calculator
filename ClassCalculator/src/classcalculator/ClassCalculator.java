/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classcalculator;

/**
 *
 * @author User1
 */
public class ClassCalculator{
    
   /**
 * Calculates the present day value of an amount 
 * that is received at a future date. 
 * 
 * @param futureValue
 * @param rate
 * @param period
 * @return 
 */
    public static double presentValue(double futureValue, double rate, double period) {
        return futureValue / Math.pow((1 + rate), period);
    }
/**
 * Calculates the present value of future one dollar cash flows.
 * @param presentValue
 * @param rate
 * @param period
 * @return 
 */
    public static double presentValueAnnuity(double presentValue, double rate, double period) {
        return presentValue * (1 - Math.pow(1 + rate, 1 / period)) / rate;
    }
/**
 * Calculates a series of periodic payments
 * @param presentValue
 * @param rate
 * @param period
 * @return 
 */
    public  static double presentValueAnnuityDue(double presentValue, double rate, double period) {

        return presentValue * ((1 - Math.pow((1 + rate) * (period - 1), -1)) / (rate)) + presentValue;
    }
   /**
    * Calculate the cash flows of an annuity when future value is known
    * @param futureValue
    * @param rate
    * @param period
    * @return 
    */  
    public static double futureValue(double futureValue, double rate, double period) {
        return futureValue / Math.pow((1 + rate), period);
    }
   /**
    * Calculate what the value at a future date would be for a series of periodic payments.
    * @param payment
    * @param rate
    * @param period
    * @return 
    */ 
    public static double futureValueAnnuity(double payment,double rate, double period){
    
    return payment*(Math.pow(1+rate,period)-1/rate);
    }
    /**
     * Calculate the ending value of a series of payments 
     * or cash flows where the first payment is received immediately.
     * @param presentValue
     * @param rate
     * @param period
     * @return 
     */
    public static double futureValueAnnuityDue(double presentValue, double rate, double period) {

        return presentValue * ((Math.pow((1 + rate), (period)) - 1) / rate) * (1 + rate);
    }
    /**
     * calculate the amount due at the end of a balloon loan.
     * @param payment
     * @param rate
     * @param numOfPayments
     * @param presentValue
     * @return 
     */
    public static double balloonPayment(double payment, double rate,  int numOfPayments,double presentValue ){
        double num1 =Math.pow(1+rate, numOfPayments);
        double num2= 1/rate;
        
        return presentValue*num1 - payment*(num1-num2);
    
    }
    /**
     * calculate the required rate of return  on the basis of present value and
     * future value 
     * @param futureValue
     * @param presentValue
     * @return 
     */
    public  static double requiredRateOfReturn(double futureValue, double presentValue,int period){
    return Math.pow((futureValue/presentValue),1/period);
        
    }
    /**
     * Calculate the length of time a present value would need to reach the future value, 
     * given a certain interest rate.
     * @param futureValue
     * @param presentValue
     * @param rate
     * @return 
     */
    public static double numberOfPeriods( double futureValue, double presentValue, double rate ){
     return Math.log(futureValue/presentValue)/Math.log(1+rate);
    
    
    }
}
