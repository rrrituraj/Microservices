package com.microservices.demo.currencyConversionService;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@FeignClient(name="currency-exchange-service", url = "localhost:8000")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	//@RequestMapping(value = "currency-exchange/from/{from}/to/{to}", method = RequestMethod.GET, produces = "application/json")
	@RequestMapping(value = "currency-exchange-service/currency-exchange/from/{from}/to/{to}", method = RequestMethod.GET, produces = "application/json")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable("from") String from,
			@PathVariable("to") String to); 
	
}
