package me.gladysz.kotlinupgradeissue;

import java.util.Arrays;
import java.util.List;


public class AggregateStep<Args extends Arguments, T extends Enum<T>> implements StepBased.IStep<Args, T> {

  final List<StepBased.IStep<Args, T>> steps;

  public AggregateStep(StepBased.IStep<Args, T>... steps) {
    this.steps = Arrays.asList(steps);
  }

  @Override
  public void apply(ElementStore<T> elementStore, Args args, TheObject theObject) {
    for (StepBased.IStep<Args, T> step : steps) {
      step.apply(elementStore, args, theObject);
    }
  }
}
