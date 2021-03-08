
package paymentsystem;

import java.util.ArrayList;

/**
 *
 * @author Şeyma
 */
public class PaymentModel implements PaymentModelInterface {
    //create arraylist for adding the observers.
private ArrayList paymentObservers= new ArrayList();
private double paymentAmount=0;
   
    // set the new amount and notify the observers (call notifyObservers())
    @Override
    public void setPaymentAmount(double paymentAmount) {
       this.paymentAmount=paymentAmount;
       //Every time that payment amount setted, observers will be notified
       notifyObservers();
    }

    @Override
    public double getPaymentAmount() {
        return paymentAmount;
    }
    
    // add observer(s) to the arraylist
    @Override
    public void registerPaymentObserver(PaymentObserver observer) {
        paymentObservers.add(observer);
    }

    //Remove the observer (un-register)
    @Override
    public void removePaymentObserver(PaymentObserver observer) {
        int i= paymentObservers.indexOf(observer);
        if(i<=0)
            paymentObservers.remove(observer);
    }
    
  
    @Override
    public void notifyObservers() {
        for(int i=0;i<paymentObservers.size();i++)
        {
        PaymentObserver observer=(PaymentObserver)paymentObservers.get(i);
        //call updatepaymentAmount() method for every observer so every observer will be updated
        observer.updatePaymentAmount(paymentAmount);

        }
    }
    
}
