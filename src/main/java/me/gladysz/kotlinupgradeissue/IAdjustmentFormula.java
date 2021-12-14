package me.gladysz.kotlinupgradeissue;


import org.jetbrains.annotations.NotNull;

public interface IAdjustmentFormula<Args> {

  Adjustment adjust(@NotNull Args args);
}
