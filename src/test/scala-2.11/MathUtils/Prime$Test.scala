package MathUtils

import org.scalatest.FunSuite

/**
 * Created by matthiasheck on 19.09.15.
 */
class Prime$Test extends FunSuite {

  test("testIs") {
    assert(Prime.is(1) == false)
    assert(Prime.is(2) == true)
    assert(Prime.is(99991) == true)
  }

  test("Stream") {
    for (i <- 0 to 5)
      println(i + "= " + Prime.primes(i))
  }

}
