package MathUtils

import org.scalatest.{BeforeAndAfterEach, FunSuite}

/**
 * Created by matthiasheck on 19.09.15.
 */
class GgtTest extends FunSuite with BeforeAndAfterEach {


  override def beforeEach() {

  }

  test("1 is Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(1) == true)
  }

  test("2 is Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(2) == true)
  }

  test("3 is Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(3) == true)
  }
  test("4 is NOT Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(4) == false)
  }

  test("13 is Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(13) == true)
  }

  test("99991 is  Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(99991) == true)
  }
  test("99997 is NOT Prime") {
    val ggt = new Ggt
    assert(ggt.isPrime(99997) == false)
  }


  test("Primefactors") {
    val ggt = new Ggt
    for (i <- ggt.primeFactors(80)) {
      println("Hase :" + i)
    }
  }
}
