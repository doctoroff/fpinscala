import fpinscala.gettingstarted._
import org.scalatest.flatspec.AnyFlatSpec

class IsSortedTest extends AnyFlatSpec {
  val greater = (a: Int, b: Int) => a >= b
  
  "An unsorted array" should "return false" in {
    val array = Array(1,2,3,4,5,6,9,3,1)
    assert(!PolymorphicFunctions.isSorted(array, greater))
  }

  "A sorted array" should "return true" in {
    val array = Array(1,2,3,4,5,6,7,8,9)
    assert(PolymorphicFunctions.isSorted(array, greater))
  }
}