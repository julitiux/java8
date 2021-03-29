package mx.com.streams.domain;

import java.math.BigDecimal;

public class Item {

  String name;
  Integer qty;
  BigDecimal price;

  public Item(String name, Integer qty, BigDecimal price) {
    this.name = name;
    this.qty = qty;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQty() {
    return qty;
  }

  public void setQty(Integer qty) {
    this.qty = qty;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }
}
