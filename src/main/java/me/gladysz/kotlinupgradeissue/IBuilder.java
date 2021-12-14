package me.gladysz.kotlinupgradeissue;


public interface IBuilder<Args extends Arguments, Key extends Enum<Key>> {

  ElementStore<Key> evaluate(Args args, TheObject theObject);

  default ElementStore<Key> evaluate(ElementStore<Key> elementStore, Args args, TheObject theObject) {
    return evaluate(args, theObject);
  }

}
