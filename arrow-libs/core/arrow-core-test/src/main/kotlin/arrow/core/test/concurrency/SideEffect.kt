package arrow.core.test.concurrency

data class SideEffect(var counter: Int = 0) {
  fun increment() {
    counter++
  }
}