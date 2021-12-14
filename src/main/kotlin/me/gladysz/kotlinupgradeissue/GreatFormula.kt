package me.gladysz.kotlinupgradeissue


import java.math.BigDecimal

class GreatFormula<Args : ArgsCommon>(val element: EumOne) : IAdjustmentFormula<Args> {

  override fun adjust(args: Args): Adjustment {
    return Adjustment(BigDecimal.ONE)
  }
}
