package me.gladysz.kotlinupgradeissue


class ElementFormula<Args : ArgsCommon>(
  val product: SomeType
) : IFormula<Args, EnumTwo> {


  override fun evaluate(args: Args, elementStore: ElementStore<EnumTwo>): Element {
    return Element("")
  }
}
