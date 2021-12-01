//[arrow-optics](../../../../index.md)/[arrow.optics](../../index.md)/[PTraversal](../index.md)/[Companion](index.md)

# Companion

[common]\
object [Companion](index.md)

## Functions

| Name | Summary |
|---|---|
| [codiagonal](codiagonal.md) | [common]<br>fun &lt;[S](codiagonal.md)&gt; [codiagonal](codiagonal.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Either](../../../../../arrow-core/arrow-core/arrow.core/-either/index.md)&lt;[S](codiagonal.md), [S](codiagonal.md)&gt;, [S](codiagonal.md)&gt; |
| [either](either.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[L](either.md), [R](either.md)&gt; [either](either.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Either](../../../../../arrow-core/arrow-core/arrow.core/-either/index.md)&lt;[L](either.md), [R](either.md)&gt;, [R](either.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) for [Either](../../../../../arrow-core/arrow-core/arrow.core/-either/index.md) that has focus in each [Either.Right](../../../../../arrow-core/arrow-core/arrow.core/-either/-right/index.md). |
| [id](id.md) | [common]<br>fun &lt;[S](id.md)&gt; [id](id.md)(): [PTraversal](../index.md)&lt;[S](id.md), [S](id.md), [S](id.md), [S](id.md)&gt; |
| [invoke](invoke.md) | [common]<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>[PTraversal](../index.md) constructor from multiple getters of the same source.<br>[common]<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), get6: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), get6: ([S](invoke.md)) -&gt; [A](invoke.md), get7: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), get6: ([S](invoke.md)) -&gt; [A](invoke.md), get7: ([S](invoke.md)) -&gt; [A](invoke.md), get8: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), get6: ([S](invoke.md)) -&gt; [A](invoke.md), get7: ([S](invoke.md)) -&gt; [A](invoke.md), get8: ([S](invoke.md)) -&gt; [A](invoke.md), get9: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt;<br>operator fun &lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; [invoke](invoke.md)(get1: ([S](invoke.md)) -&gt; [A](invoke.md), get2: ([S](invoke.md)) -&gt; [A](invoke.md), get3: ([S](invoke.md)) -&gt; [A](invoke.md), get4: ([S](invoke.md)) -&gt; [A](invoke.md), get5: ([S](invoke.md)) -&gt; [A](invoke.md), get6: ([S](invoke.md)) -&gt; [A](invoke.md), get7: ([S](invoke.md)) -&gt; [A](invoke.md), get8: ([S](invoke.md)) -&gt; [A](invoke.md), get9: ([S](invoke.md)) -&gt; [A](invoke.md), get10: ([S](invoke.md)) -&gt; [A](invoke.md), set: ([B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [B](invoke.md), [S](invoke.md)) -&gt; [T](invoke.md)): [PTraversal](../index.md)&lt;[S](invoke.md), [T](invoke.md), [A](invoke.md), [B](invoke.md)&gt; |
| [list](list.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](list.md)&gt; [list](list.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[A](list.md)&gt;, [A](list.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that focuses in each [A](list.md) of the source [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [map](map.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[K](map.md), [V](map.md)&gt; [map](map.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)&lt;[K](map.md), [V](map.md)&gt;, [V](map.md)&gt; |
| [nonEmptyList](non-empty-list.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](non-empty-list.md)&gt; [nonEmptyList](non-empty-list.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[NonEmptyList](../../../../../arrow-core/arrow-core/arrow.core/-non-empty-list/index.md)&lt;[A](non-empty-list.md)&gt;, [A](non-empty-list.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) for [NonEmptyList](../../../../../arrow-core/arrow-core/arrow.core/-non-empty-list/index.md) that has focus in each [A](non-empty-list.md). |
| [option](option.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](option.md)&gt; [option](option.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Option](../../../../../arrow-core/arrow-core/arrow.core/-option/index.md)&lt;[A](option.md)&gt;, [A](option.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) for [Option](../../../../../arrow-core/arrow-core/arrow.core/-option/index.md) that has focus in each [arrow.core.Some](../../../../../arrow-core/arrow-core/arrow.core/-some/index.md). |
| [pair](pair.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](pair.md)&gt; [pair](pair.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[A](pair.md), [A](pair.md)&gt;, [A](pair.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first and second value of a [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html) |
| [pPair](p-pair.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-pair.md), [B](p-pair.md)&gt; [pPair](p-pair.md)(): [PTraversal](../index.md)&lt;[Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[A](p-pair.md), [A](p-pair.md)&gt;, [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;[B](p-pair.md), [B](p-pair.md)&gt;, [A](p-pair.md), [B](p-pair.md)&gt;<br>[PTraversal](../index.md) to focus into the first and second value of a [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html) |
| [pTriple](p-triple.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-triple.md), [B](p-triple.md)&gt; [pTriple](p-triple.md)(): [PTraversal](../index.md)&lt;[Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)&lt;[A](p-triple.md), [A](p-triple.md), [A](p-triple.md)&gt;, [Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)&lt;[B](p-triple.md), [B](p-triple.md), [B](p-triple.md)&gt;, [A](p-triple.md), [B](p-triple.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second and third value of a [Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html) |
| [pTuple10](p-tuple10.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple10.md), [B](p-tuple10.md)&gt; [pTuple10](p-tuple10.md)(): [PTraversal](../index.md)&lt;[Tuple10](../../../../../arrow-core/arrow-core/arrow.core/-tuple10/index.md)&lt;[A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md), [A](p-tuple10.md)&gt;, [Tuple10](../../../../../arrow-core/arrow-core/arrow.core/-tuple10/index.md)&lt;[B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md), [B](p-tuple10.md)&gt;, [A](p-tuple10.md), [B](p-tuple10.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth, fifth, sixth, seventh, eight, ninth and tenth value of a [arrow.core.Tuple10](../../../../../arrow-core/arrow-core/arrow.core/-tuple10/index.md) |
| [pTuple4](p-tuple4.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple4.md), [B](p-tuple4.md)&gt; [pTuple4](p-tuple4.md)(): [PTraversal](../index.md)&lt;[Tuple4](../../../../../arrow-core/arrow-core/arrow.core/-tuple4/index.md)&lt;[A](p-tuple4.md), [A](p-tuple4.md), [A](p-tuple4.md), [A](p-tuple4.md)&gt;, [Tuple4](../../../../../arrow-core/arrow-core/arrow.core/-tuple4/index.md)&lt;[B](p-tuple4.md), [B](p-tuple4.md), [B](p-tuple4.md), [B](p-tuple4.md)&gt;, [A](p-tuple4.md), [B](p-tuple4.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third and fourth value of a [arrow.core.Tuple4](../../../../../arrow-core/arrow-core/arrow.core/-tuple4/index.md) |
| [pTuple5](p-tuple5.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple5.md), [B](p-tuple5.md)&gt; [pTuple5](p-tuple5.md)(): [PTraversal](../index.md)&lt;[Tuple5](../../../../../arrow-core/arrow-core/arrow.core/-tuple5/index.md)&lt;[A](p-tuple5.md), [A](p-tuple5.md), [A](p-tuple5.md), [A](p-tuple5.md), [A](p-tuple5.md)&gt;, [Tuple5](../../../../../arrow-core/arrow-core/arrow.core/-tuple5/index.md)&lt;[B](p-tuple5.md), [B](p-tuple5.md), [B](p-tuple5.md), [B](p-tuple5.md), [B](p-tuple5.md)&gt;, [A](p-tuple5.md), [B](p-tuple5.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth and fifth value of a [arrow.core.Tuple5](../../../../../arrow-core/arrow-core/arrow.core/-tuple5/index.md) |
| [pTuple6](p-tuple6.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple6.md), [B](p-tuple6.md)&gt; [pTuple6](p-tuple6.md)(): [PTraversal](../index.md)&lt;[Tuple6](../../../../../arrow-core/arrow-core/arrow.core/-tuple6/index.md)&lt;[A](p-tuple6.md), [A](p-tuple6.md), [A](p-tuple6.md), [A](p-tuple6.md), [A](p-tuple6.md), [A](p-tuple6.md)&gt;, [Tuple6](../../../../../arrow-core/arrow-core/arrow.core/-tuple6/index.md)&lt;[B](p-tuple6.md), [B](p-tuple6.md), [B](p-tuple6.md), [B](p-tuple6.md), [B](p-tuple6.md), [B](p-tuple6.md)&gt;, [A](p-tuple6.md), [B](p-tuple6.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth, fifth and sixth value of a [arrow.core.Tuple6](../../../../../arrow-core/arrow-core/arrow.core/-tuple6/index.md) |
| [pTuple7](p-tuple7.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple7.md), [B](p-tuple7.md)&gt; [pTuple7](p-tuple7.md)(): [PTraversal](../index.md)&lt;[Tuple7](../../../../../arrow-core/arrow-core/arrow.core/-tuple7/index.md)&lt;[A](p-tuple7.md), [A](p-tuple7.md), [A](p-tuple7.md), [A](p-tuple7.md), [A](p-tuple7.md), [A](p-tuple7.md), [A](p-tuple7.md)&gt;, [Tuple7](../../../../../arrow-core/arrow-core/arrow.core/-tuple7/index.md)&lt;[B](p-tuple7.md), [B](p-tuple7.md), [B](p-tuple7.md), [B](p-tuple7.md), [B](p-tuple7.md), [B](p-tuple7.md), [B](p-tuple7.md)&gt;, [A](p-tuple7.md), [B](p-tuple7.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth, fifth, sixth and seventh value of a [arrow.core.Tuple7](../../../../../arrow-core/arrow-core/arrow.core/-tuple7/index.md) |
| [pTuple8](p-tuple8.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple8.md), [B](p-tuple8.md)&gt; [pTuple8](p-tuple8.md)(): [PTraversal](../index.md)&lt;[Tuple8](../../../../../arrow-core/arrow-core/arrow.core/-tuple8/index.md)&lt;[A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md), [A](p-tuple8.md)&gt;, [Tuple8](../../../../../arrow-core/arrow-core/arrow.core/-tuple8/index.md)&lt;[B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md), [B](p-tuple8.md)&gt;, [A](p-tuple8.md), [B](p-tuple8.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth, fifth, sixth, seventh and eight value of a [arrow.core.Tuple8](../../../../../arrow-core/arrow-core/arrow.core/-tuple8/index.md) |
| [pTuple9](p-tuple9.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](p-tuple9.md), [B](p-tuple9.md)&gt; [pTuple9](p-tuple9.md)(): [PTraversal](../index.md)&lt;[Tuple9](../../../../../arrow-core/arrow-core/arrow.core/-tuple9/index.md)&lt;[A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md), [A](p-tuple9.md)&gt;, [Tuple9](../../../../../arrow-core/arrow-core/arrow.core/-tuple9/index.md)&lt;[B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md), [B](p-tuple9.md)&gt;, [A](p-tuple9.md), [B](p-tuple9.md)&gt;<br>[PTraversal](../index.md) to focus into the first, second, third, fourth, fifth, sixth, seventh, eight and ninth value of a [arrow.core.Tuple9](../../../../../arrow-core/arrow-core/arrow.core/-tuple9/index.md) |
| [sequence](sequence.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](sequence.md)&gt; [sequence](sequence.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Sequence](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)&lt;[A](sequence.md)&gt;, [A](sequence.md)&gt; |
| [string](string.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun [string](string.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) for [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) that focuses in each [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) of the source [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html). |
| [triple](triple.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](triple.md)&gt; [triple](triple.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html)&lt;[A](triple.md), [A](triple.md), [A](triple.md)&gt;, [A](triple.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second and third value of a [Triple](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/index.html) |
| [tuple10](tuple10.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple10.md)&gt; [tuple10](tuple10.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple10](../../../../../arrow-core/arrow-core/arrow.core/-tuple10/index.md)&lt;[A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md), [A](tuple10.md)&gt;, [A](tuple10.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth, fifth, sixth, seventh, eight, ninth and tenth value of a [arrow.core.Tuple10](../../../../../arrow-core/arrow-core/arrow.core/-tuple10/index.md) |
| [tuple4](tuple4.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple4.md)&gt; [tuple4](tuple4.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple4](../../../../../arrow-core/arrow-core/arrow.core/-tuple4/index.md)&lt;[A](tuple4.md), [A](tuple4.md), [A](tuple4.md), [A](tuple4.md)&gt;, [A](tuple4.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third and fourth value of a [arrow.core.Tuple4](../../../../../arrow-core/arrow-core/arrow.core/-tuple4/index.md) |
| [tuple5](tuple5.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple5.md)&gt; [tuple5](tuple5.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple5](../../../../../arrow-core/arrow-core/arrow.core/-tuple5/index.md)&lt;[A](tuple5.md), [A](tuple5.md), [A](tuple5.md), [A](tuple5.md), [A](tuple5.md)&gt;, [A](tuple5.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth and fifth value of a [arrow.core.Tuple5](../../../../../arrow-core/arrow-core/arrow.core/-tuple5/index.md) |
| [tuple6](tuple6.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple6.md)&gt; [tuple6](tuple6.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple6](../../../../../arrow-core/arrow-core/arrow.core/-tuple6/index.md)&lt;[A](tuple6.md), [A](tuple6.md), [A](tuple6.md), [A](tuple6.md), [A](tuple6.md), [A](tuple6.md)&gt;, [A](tuple6.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth, fifth and sixth value of a [arrow.core.Tuple6](../../../../../arrow-core/arrow-core/arrow.core/-tuple6/index.md) |
| [tuple7](tuple7.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple7.md)&gt; [tuple7](tuple7.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple7](../../../../../arrow-core/arrow-core/arrow.core/-tuple7/index.md)&lt;[A](tuple7.md), [A](tuple7.md), [A](tuple7.md), [A](tuple7.md), [A](tuple7.md), [A](tuple7.md), [A](tuple7.md)&gt;, [A](tuple7.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth, fifth, sixth and seventh value of a [arrow.core.Tuple7](../../../../../arrow-core/arrow-core/arrow.core/-tuple7/index.md) |
| [tuple8](tuple8.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple8.md)&gt; [tuple8](tuple8.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple8](../../../../../arrow-core/arrow-core/arrow.core/-tuple8/index.md)&lt;[A](tuple8.md), [A](tuple8.md), [A](tuple8.md), [A](tuple8.md), [A](tuple8.md), [A](tuple8.md), [A](tuple8.md), [A](tuple8.md)&gt;, [A](tuple8.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth, fifth, sixth, seventh and eight value of a [arrow.core.Tuple8](../../../../../arrow-core/arrow-core/arrow.core/-tuple8/index.md) |
| [tuple9](tuple9.md) | [common]<br>@[JvmStatic](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-static/index.html)<br>fun &lt;[A](tuple9.md)&gt; [tuple9](tuple9.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[Tuple9](../../../../../arrow-core/arrow-core/arrow.core/-tuple9/index.md)&lt;[A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md), [A](tuple9.md)&gt;, [A](tuple9.md)&gt;<br>[Traversal](../../index.md#153853783%2FClasslikes%2F-617900156) to focus into the first, second, third, fourth, fifth, sixth, seventh, eight and ninth value of a [arrow.core.Tuple9](../../../../../arrow-core/arrow-core/arrow.core/-tuple9/index.md) |
| [void](void.md) | [common]<br>fun &lt;[S](void.md), [A](void.md)&gt; [void](void.md)(): [Traversal](../../index.md#153853783%2FClasslikes%2F-617900156)&lt;[S](void.md), [A](void.md)&gt;<br>[PTraversal](../index.md) that points to nothing |