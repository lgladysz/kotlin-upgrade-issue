package me.gladysz.kotlinupgradeissue;


public interface ElementStoreAdjustmentFormula<Args, T extends Enum<T>> {
  Adjustment adjust(Args args, ElementStore<T> elementStore);
}
