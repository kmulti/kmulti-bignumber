# kmulti-bignumber

kmulti-bignumber provides multiplatform `expect` declarations
and `actual` implementations for BigDecimal and BigInteger types.

## Download

```
repositories {
    maven { url "https://dl.bintray.com/kmulti/kmulti-bignumber" }
}
```

Use these dependencies per Kotlin module respectively:

```
compile 'io.github.kmulti:kmulti-bignumber-common:1.2.41.2'
compile 'io.github.kmulti:kmulti-bignumber-js:1.2.41.2'
compile 'io.github.kmulti:kmulti-bignumber-jvm:1.2.41.2'
```

## Usage Notes

:no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign:

The JS subproject is just a stub implementation atop `Double`. Do not use it
unless you are okay with the usual floating point arithmetic surprises. The JVM subproject
unit tests show some of the invariants currently not satisfied by the JS implementation.

:no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign::no_entry_sign:

The behavior of `java.math.BigDecimal` with respect to
[structural equality](https://kotlinlang.org/docs/reference/equality.html) is preserved, i.e. in Java:
```java
BigDecimal first = new BigDecimal("1.0");
BigDecimal second = new BigDecimal("1.00");
boolean equal = first.equals(second); // `equal` is `false`
```
and in Kotlin:
```kotlin
val first = BigDecimal("1.0")
val second = BigDecimal("1.00")
val equal = first == second // `equal` is `false`
```
The infix functions `eq` and `neq` are provided to check for mathematical equality/inequality:
```kotlin
val equal = BigDecimal("1.0") eq BigDecimal("1.00") // `equal` is `true`
val notEqual = BigDecimal("1.0") neq BigDecimal("1.00") // `notEqual` is `false`
```
