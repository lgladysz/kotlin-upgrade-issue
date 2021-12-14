package me.gladysz.kotlinupgradeissue;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StepBased<Args extends Arguments, Key extends Enum<Key>>
    implements IBuilder<Args, Key> {


  private final Iterable<Supplier<IStep<Args, Key>>> steps;


  protected StepBased(Iterable<Supplier<IStep<Args, Key>>> steps) {
    this.steps = steps;
  }


  @Override
  public ElementStore<Key> evaluate(Args args, TheObject theObject) {
    ElementStore<Key> elementStore = new ElementStore<>();
    for (Supplier<IStep<Args, Key>> step : steps) {
      step.get().apply(elementStore, args, theObject);
    }
    return elementStore;
  }


  @Override
  public ElementStore<Key> evaluate(ElementStore<Key> elementStoreArg, Args args, TheObject theObject) {
    ElementStore<Key> elementStore = elementStoreArg;
    for (Supplier<IStep<Args, Key>> step : steps) {
      step.get().apply(elementStore, args, theObject);
    }
    return elementStore;
  }


  public interface IStep<Args, Key extends Enum<Key>> {
    void apply(ElementStore<Key> elementStore, Args args, TheObject theObject);
  }


  public static <Args extends Arguments, Key extends Enum<Key>> Builder<Args, Key> builder() {
    return new Builder<>();
  }


  public static class Builder<Args extends Arguments, Key extends Enum<Key>> {
    protected List<Supplier<IStep<Args, Key>>> steps = new ArrayList<>();


    public Builder<Args, Key> addStep(Supplier<IStep<Args, Key>> step) {
      steps.add(step);
      return this;
    }


    public Builder<Args, Key> init(IFormula<Args, Key> formula, Key key) {
      return this;
    }


    public Builder<Args, Key> add(IFormula<Args, Key> formula, Key key) {
      return this;
    }


    public Builder<Args, Key> add(Supplier<IFormula<Args, Key>> formula, Key key) {
      return this;
    }


    public Builder<Args, Key> addIf(boolean condition, IFormula<Args, Key> formula, Key key) {
      return this;
    }


    public Builder<Args, Key> adjust(IElementAdjustmentFormula<Key, Args> formula) {
      steps.add(() -> new ApplyAdjustmentsStep<>(formula));
      return this;
    }


    public Builder<Args, Key> adjust(IAdjustmentFormula<Args> formula, Key key) {
      steps.add(() -> new ApplyAdjustmentsStep<>(formula, key));
      return this;
    }


    public Builder<Args, Key> adjust(ElementStoreAdjustmentFormula<Args, Key> formula, Key key) {
      steps.add(() -> new ApplyAdjustmentsStep<>(formula, key));
      return this;
    }


    public Builder<Args, Key> adjust(Supplier<ElementStoreAdjustmentFormula<Args, Key>> formula, Key key) {
      steps.add(() -> new ApplyAdjustmentsStep<>(formula.get(), key));
      return this;
    }


    public Builder<Args, Key> adjustIf(IElementAdjustmentFormula<Key, Args> formula, boolean condition) {
      if (condition) {
        steps.add(() -> new ApplyAdjustmentsStep<>(formula));
      }
      return this;
    }


    public Builder<Args, Key> minimum(IFormula<Args, Key> formula, Key key) {
      steps.add(() -> new ApplyMinimumElementStep<>(formula, key));
      return this;
    }


    public StepBased<Args, Key> build() {
      return new StepBased<>(steps);
    }


  }

}

