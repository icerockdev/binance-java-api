package com.binance.api.client.domain.account;

import com.binance.api.client.constant.BinanceApiConstants;
import com.fasterxml.jackson.annotation.JsonSetter;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class NewOrderTrade {
    /**
     * Trade id.
     */
    private Long id;

    /**
     * Price.
     */
    private String price;

    /**
     * Quantity.
     */
    private String qty;

    /**
     * Commission.
     */
    private String commission;

    /**
     * Asset on which commission is taken
     */
    private String commissionAsset;

    public Long getId() {
        return id;
    }

    @JsonSetter("tradeId")
    public void setId(Long id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public String getCommissionAsset() {
        return commissionAsset;
    }

    public void setCommissionAsset(String commissionAsset) {
        this.commissionAsset = commissionAsset;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE)
                .append("id", id)
                .append("price", price)
                .append("qty", qty)
                .append("commission", commission)
                .append("commissionAsset", commissionAsset)
                .toString();
    }
}
