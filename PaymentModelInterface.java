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
public interface PaymentModelInterface {
   
    void setPaymentAmount(double amount);
    double getPaymentAmount();
    void registerPaymentObserver(PaymentObserver observer);
    void removePaymentObserver(PaymentObserver observer);
    void notifyObservers();
}
