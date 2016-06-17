package skiena

object Sorter {
  def insertionSort(arr: Array[Int]): Unit = {
    for ((a, i) <- arr.zipWithIndex) {
      var pos = i
      while (pos > 0 && arr(pos - 1) > a) {
        arr(pos) = arr(pos - 1)
        pos = pos - 1
      }
      arr(pos) = a
    }
  }
}
