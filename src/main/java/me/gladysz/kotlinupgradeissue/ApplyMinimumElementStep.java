package me.gladysz.kotlinupgradeissue;


public class ApplyMinimumElementStep<Args extends Arguments, Key extends Enum<Key>> implements
    StepBased.IStep<Args, Key> {
  protected IFormula<Args, Key> formula;
  protected final Key key;


  public ApplyMinimumElementStep(IFormula<Args, Key> formula, Key key) {
    this.key = key;
    this.formula = formula;
  }


  @Override
  public void apply(ElementStore<Key> elementStore, Args args, TheObject theObject) {
  }

}
