package com.microservices.demo.currencyExchangeService;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

	@Autowired
	private Environment environment;
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	@RequestMapping(value = "/currency-exchange/from/{from}/to/{to}", method = RequestMethod.GET)
	public ExchangeValue retrieveExchaValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue = 
				exchangeValueRepository.findByFromAndTo(from, to);
		
		exchangeValue.setPort(
				Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchangeValue;
	}
}
