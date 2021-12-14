package me.gladysz.kotlinupgradeissue

class SomeFormula<Args : ArgsCommon>(
  private val formula: IFormula<Args, EnumTwo>,
  private val ingredient: Ingredient,
  private val enumThree: EnumThree,
  private val someType: SomeType
) : IFormula<Args, EnumTwo> {

  override fun evaluate(args: Args, elementStore: ElementStore<EnumTwo>): Element {
    return Element("")
  }

}