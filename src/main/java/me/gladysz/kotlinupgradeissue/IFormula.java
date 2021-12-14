package me.gladysz.kotlinupgradeissue;

import org.jetbrains.annotations.NotNull;


public interface IFormula<Args, Key extends Enum<Key>> {
  Element evaluate(@NotNull Args args, @NotNull ElementStore<Key> elementStore);
}
