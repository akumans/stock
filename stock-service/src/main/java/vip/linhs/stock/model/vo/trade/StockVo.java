package vip.linhs.stock.model.vo.trade;

import java.math.BigDecimal;

public class StockVo {

    private String stockCode;
    private String name;
    private String exchange;
    private String abbreviation;
    private int totalVolume;
    private BigDecimal price;
    private int availableVolume;

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public int getTotalVolume() {
        return totalVolume;
    }

    public void setTotalVolume(int totalVolume) {
        this.totalVolume = totalVolume;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getAvailableVolume() {
        return availableVolume;
    }

    public void setAvailableVolume(int availableVolume) {
        this.availableVolume = availableVolume;
    }

}
