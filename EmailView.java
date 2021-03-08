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
public class EmailView implements PaymentObserver {
    //hold a reference for both PaymentModel and PaymentController 
   private PaymentModelInterface paymentModel;
   private PaymentControllerInterface paymentController;
   private double paymentAmount;
    
    //get the reference of the paymentModel and PaymentController and store them
    public EmailView(PaymentModelInterface paymentModel,PaymentControllerInterface paymentController){
        this.paymentModel=paymentModel;
        this.paymentController=paymentController;
        //Register the email as a PaymentObserver
        paymentModel.registerPaymentObserver((PaymentObserver)this);
    }
    
    
    //when updatePaymentAmount() called
    // payment amount will be set and call displayPayment() method
      @Override
    public void updatePaymentAmount(double paymentAmount) {
        this.paymentAmount=paymentAmount;
        displayPayment();
    }
    
   //override the displayPayment() method for Email
    @Override
    public void displayPayment(){     
     //display the payment amount
        System.out.println("Email=> Your payment amount has been updated: "+paymentAmount+" tl");
    }
}
