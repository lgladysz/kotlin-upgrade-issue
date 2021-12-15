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
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .addStep { six(args, someType) }
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .addStep { five(args, someType) }
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .addStep { one(args, someType) }
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(GreatFormula<TheArgs>(ONE), TWO)
      .addStep { three(args, someType) }
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .add(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .addStep { four(args, someType) }
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .addStep { seven(args, someType) }
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(SomeFormula<TheArgs>(ElementFormula<TheArgs>(someType), ingredient, THREE, someType), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .adjust(StoreFormula<TheArgs>(), TWO)
      .init(ElementFormula<TheArgs>(someType), TWO)
      .init(ElementFormula<TheArgs>(someType), TWO)
      .minimum(ElementFormula<TheArgs>(someType), TWO)
      .add(ElementFormula<TheArgs>(someType), TWO)
      .add(ElementFormula<TheArgs>(someType), TWO)
      .build()
  }


  private fun one(args: TheArgs, someType: SomeType):
      StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

  private fun two(
    eumOne: EumOne,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

  private fun three(
    args: TheArgs,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )


  private fun four(
    args: TheArgs, someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

  private fun five(
    args: TheArgs, someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

  private fun six(
    args: TheArgs,
    someType: SomeType
  ): StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

  private fun seven(args: TheArgs, someType: SomeType)
      : StepBased.IStep<TheArgs, EnumTwo> = AggregateStep<TheArgs, EnumTwo>(
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(GreatFormula<TheArgs>(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    AggregateStep<TheArgs, EnumTwo>(two(ONE, someType)),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyMinimumElementStep<TheArgs, EnumTwo>(OtherTypeFormula(ONE), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO),
    ApplyAdjustmentsStep<TheArgs, EnumTwo>(SumFactor<TheArgs>(ONE, someType), TWO)
  )

}
