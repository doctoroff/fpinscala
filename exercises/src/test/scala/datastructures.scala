import fpinscala.datastructures._
import org.scalatest.flatspec.AnyFlatSpec

class ListDropTest extends AnyFlatSpec {
  val list = List(0, 1, 2, 3, 4, 5, 6, 7)
  val emptyList = List()

  "Dropping the first 2 elements" should "return List(2, 3, ..., 7)" in {
    assert (List.drop(list, 2) == List(2, 3, 4, 5, 6, 7))
  }

  "Dropping the first 5 elements" should "return List(5, 6, 7)" in {
    assert (List.drop(list, 5) == List(5, 6, 7))
  }

  "Dropping 0 elements" should "return the entire list" in {
    assert (List.drop(list, 0) == list)
  }

  "Dropping from an empty list" should "return Nil" in {
    assert (List.drop(emptyList, 3) == Nil)
  }
}

class ListDropWhileTest extends AnyFlatSpec {
  val list = List(2, 4, 6, 8, 10, 12)

  val isEven = (n: Int) => n % 2 == 0
  val isOdd = (n: Int) => n % 2 != 0
  val equalsTwo = (n: Int) => n == 2

  "Dropping evens from the list" should "return an empty list" in {
    assert (List.dropWhile(list, isEven) == List())
  }

  "Dropping odds from the list" should "return the original list" in {
    assert (List.dropWhile(list, isOdd) == list)
  }

  "Dropping two" should "return List(4, 6, 8, 10, 12)" in {
    assert (List.dropWhile(list, equalsTwo) == List(4, 6, 8, 10, 12))
  }

}