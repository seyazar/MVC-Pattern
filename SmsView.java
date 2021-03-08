/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paymentsystem;

/**
 *
 * @author Şeyma
 */
public class SmsView implements PaymentObserver{
     //hold a reference for both PaymentModel and PaymentController 
   private PaymentModelInterface paymentModel;
   private PaymentControllerInterface paymentController;
   private double paymentAmount;
    
    //get the reference of the paymentModel and PaymentController and store them
    public SmsView(PaymentModelInterface paymentModel,PaymentControllerInterface paymentController){
        this.paymentModel=paymentModel;
       // this.paymentController=paymentController;
        //Register the sms as a PaymentObserver
        paymentModel.registerPaymentObserver((PaymentObserver)this);
    }
    
    //when updatePaymentAmount() called
    // payment amount will be set and call displayPayment() method
    @Override
    public void updatePaymentAmount(double paymentAmount) {
        this.paymentAmount=paymentAmount;
        displayPayment();
    }
    
    
    //override the displayPayment() method for Sms
    @Override
    public void displayPayment(){
     //Display the payment amount
        System.out.println("SMS=> Your payment amount has been updated: "+paymentAmount+" tl");
    }

  
}
