package me.gladysz.kotlinupgradeissue


class OtherTypeFormula(val element: EumOne) : IFormula<TheArgs, EnumTwo> {
  override fun evaluate(args: TheArgs, elementStore: ElementStore<EnumTwo>): Element {
    return Element("")
  }
}
