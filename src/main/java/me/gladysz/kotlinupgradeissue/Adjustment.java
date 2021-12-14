package me.gladysz.kotlinupgradeissue;

import java.math.BigDecimal;


public class Adjustment {

  private final BigDecimal ratio;


  public Adjustment(BigDecimal ratio) {
    this.ratio = ratio;
  }


  public BigDecimal getRatio() {
    return ratio;
  }


  public String getDescription() {
    return "";
  }
}
