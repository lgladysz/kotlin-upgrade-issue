package me.gladysz.kotlinupgradeissue

import java.math.BigDecimal.ONE


class StoreFormula<Args : ArgsCommon>
  : ElementStoreAdjustmentFormula<Args, EnumTwo> {

  override fun adjust(args: Args, elementStore: ElementStore<EnumTwo>) =
    Adjustment(ONE)
}
