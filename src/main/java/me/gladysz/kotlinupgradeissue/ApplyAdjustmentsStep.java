package me.gladysz.kotlinupgradeissue;


public class ApplyAdjustmentsStep<Args extends Arguments, T extends Enum<T>> implements StepBased.IStep<Args, T> {

  public ApplyAdjustmentsStep(Iterable<IElementAdjustmentFormula<T, Args>> adjustments) {
  }


  public ApplyAdjustmentsStep(IElementAdjustmentFormula<T, Args> adjustment) {
  }


  public ApplyAdjustmentsStep(final IAdjustmentFormula<Args> adjustmentFormula, final T key) {
    this(args -> {
      Adjustment adjustment = adjustmentFormula.adjust(args);
      return new ElementAdjustment<>(key, adjustment.getRatio(), adjustment.getDescription());
    });
  }


  public ApplyAdjustmentsStep(final ElementStoreAdjustmentFormula<Args, T> adjustmentFormula, final T key) {
    this(new IElementAdjustmentFormula<T, Args>() {
      @Override
      public ElementAdjustment<T> adjust(Args args) {
        return adjust(args, null);
      }


      @Override
      public ElementAdjustment<T> adjust(Args args, ElementStore<T> elementStore) {
        Adjustment adjustment = adjustmentFormula.adjust(args, elementStore);
        return new ElementAdjustment<>(key, adjustment.getRatio(), adjustment.getDescription());
      }
    });
  }


  @Override
  public void apply(ElementStore<T> elementStore, Args args, TheObject theObject) {
  }
}
