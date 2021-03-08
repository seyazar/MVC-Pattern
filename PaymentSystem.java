
package paymentsystem;

/**
 *
 * @author Şeyma
 */
public class PaymentSystem {

    public static void main(String[] args) {
        //create a PaymentModel object
        PaymentModelInterface model=new PaymentModel();
        // create a PaymentController object with the reference of model.
        PaymentControllerInterface controller=new PaymentController(model);
        //get current payment info 
        //controller.getCurrentPaymentInfo();
        //Set a new amount to be payed and get the notification of 
        //changed payment amount
        controller.setPaymentAmount(450);
        //controller.setPaymentAmount(800);
        
    }
    
}
