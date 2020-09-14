package loggerIII;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public ILogger getIlogger() {
        return new ServerLogger();
    }

    @Bean(name = "paymentAction")
    public  PaymentAction getPaymentAction() {
         return new PaymentAction();
     }
}

