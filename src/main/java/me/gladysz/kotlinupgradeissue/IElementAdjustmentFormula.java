package me.gladysz.kotlinupgradeissue;


public interface IElementAdjustmentFormula<T extends Enum<T>, V extends Arguments> {

  ElementAdjustment<T> adjust(V args);

  default ElementAdjustment<T> adjust(V args, ElementStore<T> elementStore) {
    return adjust(args);
  }

}
