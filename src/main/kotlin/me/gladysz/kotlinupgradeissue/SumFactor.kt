package me.gladysz.kotlinupgradeissue

import java.math.BigDecimal.ONE


class SumFactor<Args : ArgsCommon>(val element: EumOne, val someType: SomeType) : IAdjustmentFormula<Args> {

  override fun adjust(args: Args): Adjustment {
    return Adjustment(ONE)
  }
}
