package me.gladysz.kotlinupgradeissue;

import java.math.BigDecimal;


public class ElementAdjustment<T extends Enum<T>> {

  private final BigDecimal ratio;
  private final T key;
  private String description;


  public ElementAdjustment(T key, BigDecimal ratio, String description) {
    this.key = key;
    this.ratio = ratio;
    this.description = description;
  }

}
