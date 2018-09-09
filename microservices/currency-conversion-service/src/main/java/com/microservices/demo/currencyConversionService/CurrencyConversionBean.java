package com.microservices.demo.currencyConversionService;

import java.math.BigDecimal;



public class CurrencyConversionBean {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal quantity;
	private BigDecimal totalCalculationAmount;
	private int port;
	
	
	
	
	public CurrencyConversionBean() {
		super();
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalCalculationAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
		this.totalCalculationAmount = totalCalculationAmount;
		this.port = port;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	/**
	 * @param totalCalculationAmount the totalCalculationAmount to set
	 */
	public void setTotalCalculationAmount(BigDecimal totalCalculationAmount) {
		this.totalCalculationAmount = totalCalculationAmount;
	}
	/**
	 * @return the quantity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}
	/**
	 * @return the totalCalculationAmount
	 */
	public BigDecimal getTotalCalculationAmount() {
		return totalCalculationAmount;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public String getFrom() {
		return from;
	}
	public String getTo() {
		return to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public int getPort() {
		return port;
	}
	
}
