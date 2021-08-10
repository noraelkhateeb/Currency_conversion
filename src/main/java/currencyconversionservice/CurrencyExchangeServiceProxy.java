package currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


//@FeignClient(name="currency.exchange.service" ,url="http://localhost:8000")
@FeignClient(name="currency.exchange.service")
//@FeignClient(name="netflix-zuul-api-gateway-server")
//@RibbonClient(name="currency.exchange.service")
public interface CurrencyExchangeServiceProxy {
	
	@GetMapping("/CurrencyExchange/from/{from}/to/{to}")
	public CurrencyConversionBean retrieveexchangevalue(@PathVariable("from") String from,@PathVariable("to") String to);
	
	
	
	

}
