package mx.com.streams.domain;

import java.math.BigDecimal;

public class Invoice {

  String invoiceNum;
  BigDecimal price;
  BigDecimal quantity;

  public Invoice(String invoiceNum, BigDecimal price, BigDecimal quantity) {
    this.invoiceNum = invoiceNum;
    this.price = price;
    this.quantity = quantity;
  }

  public String getInvoiceNum() {
    return invoiceNum;
  }

  public void setInvoiceNum(String invoiceNum) {
    this.invoiceNum = invoiceNum;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }
}
