package skiena

import org.scalatest._
import org.scalatest.matchers._

class Sorter$Test extends FlatSpec with Matchers {

  "Array" should "Be sorted by Sorter" in {
    val arr = Array(1, 17, 3,  89, 2, 5)
    Sorter.insertionSort(arr)
    arr shouldBe sorted
  }

}
