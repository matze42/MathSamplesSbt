package MathUtils


class Ggt {

  def isPrime(number: Int): Boolean = {
    if (number == 1 || number == 2) return true
    val upperLimit =  Math.sqrt(number).ceil.toInt
    for (i <- 2 to upperLimit) {
      if (number % i == 0) return false
    }
    true

  }

def ggt(number1: Int, number2: Int): Int = {
  0
}

  def primeFactors(number: Long): List[Long] = {
    var primeFactors :List[Long] = Nil
    var i = 0
    val upperLimit = Math.sqrt(number).ceil.toLong
    println("UL: "+upperLimit)
    println("Prime: "+Prime.primes(i))
    while (Prime.primes(i) <= upperLimit) {
      if (number % Prime.primes(i) == 0)  {
        println("passt")
       // primeFactors + 5L
        println(primeFactors)
      }
      i+=1
    }
  primeFactors
  }

}
