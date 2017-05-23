package com.leaderment.orm.pojo;

import java.util.Date;

public class FulfillmentInWarehouse {
    private Integer inWarehouseId;

    private Date shipmentDate;

    private Integer inWarehouseNumber;

    private Integer supplierOrderItemId;

    private String shipmentNo;

    private String invoiceNo;

    private Double memoMoney;

    private Date inWarehouseDate;

    private Double purchasePrice;

    private Integer currencyType;

    private Date paymentDate;

    private Integer supplierId;

    private Integer inventoryRegionId;

    private Integer status;

    public Integer getInWarehouseId() {
        return inWarehouseId;
    }

    public void setInWarehouseId(Integer inWarehouseId) {
        this.inWarehouseId = inWarehouseId;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Integer getInWarehouseNumber() {
        return inWarehouseNumber;
    }

    public void setInWarehouseNumber(Integer inWarehouseNumber) {
        this.inWarehouseNumber = inWarehouseNumber;
    }

    public Integer getSupplierOrderItemId() {
        return supplierOrderItemId;
    }

    public void setSupplierOrderItemId(Integer supplierOrderItemId) {
        this.supplierOrderItemId = supplierOrderItemId;
    }

    public String getShipmentNo() {
        return shipmentNo;
    }

    public void setShipmentNo(String shipmentNo) {
        this.shipmentNo = shipmentNo == null ? null : shipmentNo.trim();
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo == null ? null : invoiceNo.trim();
    }

    public Double getMemoMoney() {
        return memoMoney;
    }

    public void setMemoMoney(Double memoMoney) {
        this.memoMoney = memoMoney;
    }

    public Date getInWarehouseDate() {
        return inWarehouseDate;
    }

    public void setInWarehouseDate(Date inWarehouseDate) {
        this.inWarehouseDate = inWarehouseDate;
    }

    public Double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(Integer currencyType) {
        this.currencyType = currencyType;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public Integer getInventoryRegionId() {
        return inventoryRegionId;
    }

    public void setInventoryRegionId(Integer inventoryRegionId) {
        this.inventoryRegionId = inventoryRegionId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}