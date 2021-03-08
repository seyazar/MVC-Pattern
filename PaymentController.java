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
public class PaymentController implements PaymentControllerInterface {
private PaymentModelInterface model;
private PaymentObserver viewsms,viewEmail;

public PaymentController(PaymentModelInterface model){
this.model=model;
//Create smsView and EmailView objects in the constructor of Payment Controller
viewsms=new SmsView(model,this);
viewEmail=new EmailView(model,this);
}

//Set the new payment amount
    @Override
    public void setPaymentAmount(double paymentAmount) {
        model.setPaymentAmount(paymentAmount);
    }

    //call this method in order to learn the current payment amount
    @Override
    public void getCurrentPaymentInfo() {
        model.notifyObservers();
        
    }
    
}
