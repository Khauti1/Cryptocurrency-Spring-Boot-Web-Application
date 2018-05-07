package io.springboot.webapp.snippet.domain;

import java.math.BigDecimal;

public class Cryptocurrency24Hr {
	private String id;
	private String syntax;
	private String symbol;
	private BigDecimal priceChange;
	private BigDecimal priceChangePercentage;
	private BigDecimal weightedAvgPrice;
	private BigDecimal prevClosePrice;
	private BigDecimal lastPrice;
	private BigDecimal lastQty;
	private BigDecimal bidPrice;
	private BigDecimal bidQty;
	private BigDecimal askPrice;
	private BigDecimal askQty;
	private BigDecimal openPrice;
	private BigDecimal highPrice;
	private BigDecimal lowPrice;
	private BigDecimal volume;
	private BigDecimal quoteVolume;
	private String openTime;
	private String closeTime;
	private String firstId;
	private String lastId;
	private BigDecimal count;
	
	public Cryptocurrency24Hr() {
			this.id = java.util.UUID.randomUUID().toString().replaceAll("-", "");;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getSyntax() {
		return syntax;
	}
	public void setSyntax(String syntax) {
		this.syntax = syntax;
	}

	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	public BigDecimal getPriceChange() {
		return priceChange;
	}
	public void setPriceChange(BigDecimal priceChange) {
		this.priceChange = priceChange;
	}
	
	public BigDecimal getPriceChangePercentage() {
		return priceChangePercentage;
	}
	public void setPriceChangePercentage(BigDecimal priceChangePercentage) {
		this.priceChangePercentage = priceChangePercentage;
	}
	
	public BigDecimal getWeightedAvgPrice() {
		return weightedAvgPrice;
	}
	public void setWeightedAvgPrice(BigDecimal weightedAvgPrice) {
		this.weightedAvgPrice = weightedAvgPrice;
	}
	
	public BigDecimal getPrevClosePrice() {
		return prevClosePrice;
	}
	public void setPrevClosePrice(BigDecimal prevClosePrice) {
		this.prevClosePrice = prevClosePrice;
	}
	
	public BigDecimal getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(BigDecimal lastPrice) {
		this.lastPrice = lastPrice;
	}
	
	public BigDecimal getLastQty() {
		return lastQty;
	}
	public void setLastQty(BigDecimal lastQty) {
		this.lastQty = lastQty;
	}
	
	public BigDecimal getBidPrice() {
		return bidPrice;
	}
	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}
	
	public BigDecimal getBidQty() {
		return bidQty;
	}
	public void setBidQty(BigDecimal bidQty) {
		this.bidQty = bidQty;
	}
	
	public BigDecimal getAskPrice() {
		return askPrice;
	}
	public void setAskPrice(BigDecimal askPrice) {
		this.askPrice = askPrice;
	}
	
	public BigDecimal getAskQty() {
		return askQty;
	}
	public void setAskQty(BigDecimal askQty) {
		this.askQty = askQty;
	}
	
	public BigDecimal getOpenPrice() {
		return openPrice;
	}
	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}
	
	public BigDecimal getHighPrice() {
		return highPrice;
	}
	public void setHighPrice(BigDecimal highPrice) {
		this.highPrice = highPrice;
	}
	
	public BigDecimal getLowPrice() {
		return lowPrice;
	}
	public void setLowPrice(BigDecimal lowPrice) {
		this.lowPrice = lowPrice;
	}
	
	public BigDecimal getVolume() {
		return volume;
	}
	public void setVolume(BigDecimal volume) {
		this.volume = volume;
	}
	
	public BigDecimal getQuoteVolume() {
		return quoteVolume;
	}
	public void setQuoteVolume(BigDecimal quoteVolume) {
		this.quoteVolume = quoteVolume;
	}
	
	public String getOpenTime() {
		return openTime;
	}
	public void setOpenTime(String openTime) {
		this.openTime = openTime;
	}
	
	public String getCloseTime() {
		return closeTime;
	}
	public void setCloseTime(String closeTime) {
		this.closeTime = closeTime;
	}
	
	public String getFirstId() {
		return firstId;
	}
	public void setFirstId(String firstId) {
		this.firstId = firstId;
	}
	
	public String getLastId() {
		return lastId;
	}
	public void setLastId(String lastId) {
		this.lastId = lastId;
	}
	
	public BigDecimal getCount() {
		return count;
	}
	public void setCount(BigDecimal count) {
		this.count = count;
	}
}
