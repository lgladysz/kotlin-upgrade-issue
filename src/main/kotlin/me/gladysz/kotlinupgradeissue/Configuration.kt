package me.gladysz.kotlinupgradeissue

import me.gladysz.kotlinupgradeissue.EnumThree.THREE
import me.gladysz.kotlinupgradeissue.EnumTwo.TWO
import me.gladysz.kotlinupgradeissue.EumOne.ONE

class Configuration(
  private val ingredient: Ingredient
) {

  fun provider(
    args: TheArgs
  ): Map<SomeType, IBuilder<TheArgs, EnumTwo>> {
    return SomeType.values()
      .associateBy({ it }, { builder(ingredient, args, it) })
  }

  private fun builder(
    ingredient: Ingredient,
    args: TheArgs,
    someType: SomeType
  ) : IBuilder<TheArgs, EnumTwo> {
    return StepBased.builder<TheArgs, EnumTwo>()
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .addStep { six(args, someType) }
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .addStep { five(args, someType) }
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .addStep { one(args, someType) }
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(GreatFormula(ONE), TWO)
      .addStep { three(args, someType) }
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .addStep { four(args, someType) }
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .addStep { seven(args, someType) }
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(SomeFormula(ElementFormula(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula(), TWO)
      .adjust(StoreFormula(), TWO)
      .init(ElementFormula(someType), TWO)
      .init(ElementFormula(someType), TWO)
      .minimum(ElementFormula(someType), TWO)
      .add(ElementFormula(someType), TWO)
      .add(ElementFormula(someType), TWO)
      .build()
  }


  private fun one(args: TheArgs, someType: SomeType):
      StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

  private fun two(
    eumOne: EumOne,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

  private fun three(
    args: TheArgs,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )


  private fun four(
    args: TheArgs, someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

  private fun five(
    args: TheArgs, someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

  private fun six(
    args: TheArgs,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

  private fun seven(args: TheArgs, someType: SomeType)
      : StepBased.IStep<TheArgs, EnumTwo> = AggregateStep(
    ApplyAdjustmentsStep(GreatFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    AggregateStep(two(ONE, someType)),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyMinimumElementStep(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO),
    ApplyAdjustmentsStep(SumFactor(ONE, someType), TWO)
  )

}
