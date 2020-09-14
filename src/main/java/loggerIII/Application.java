package loggerIII;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
	public static void main(String[] args) {
        ApplicationContext context = 
                        new AnnotationConfigApplicationContext(Config.class);
        PaymentAction paymentAction = (PaymentAction) context.getBean("paymentAction");
        paymentAction.pay(new BigDecimal(2)); 
    }


}
