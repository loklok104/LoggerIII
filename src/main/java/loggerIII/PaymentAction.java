package loggerIII;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentAction {
	
	@Autowired
	private ILogger logger;

	public void pay(BigDecimal payValue) {
		logger.log("pay begin, payValue is " + payValue);
		logger.log("pay end");
	}
}

