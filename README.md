# kotlin-upgrade-issue
Example project with a hanging build after migration from Kotlin 1.3.50 to 1.6.10.

Evertything was builded with `./mvnw clean install` command.

The problem is with the class `me.gladysz.kotlinupgradeissue.Configuration`.

On commit:
* `Kotlin 1.3.50 - working fine` - Compilation was successful in about 7 seconds.
* `Kotlin 1.6.10 - build hangs` - Compilation hangs.
* `Kotlin 1.6.10 - fix` - Compilation was successful in about 7 seconds.
