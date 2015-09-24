/**
 * Created by matthiasheck on 22.09.15.
 */
object LottoZahl {
  def main(args: Array[String]) {
    for(i<-1 to 50) {
      println( util.Random.shuffle(1 to 49).toList.take(6).sorted )
    }
  }
}
