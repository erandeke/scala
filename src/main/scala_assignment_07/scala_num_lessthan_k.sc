import scala.io.StdIn.readLine

def main(args: Array[String]): Unit = {
  var input = readLine();

  var arrayOfInput: Array[Int] = input.split(" ").map(x => x.toInt);

  var numLine = readLine();

  var arrayOfNum: Array[Int] = numLine.split(" ").map(x => x.toInt);

  val numK = arrayOfNum(1);
  for (x <- arrayOfNum) {
    if (x < numK)
      print("Number found to be lesser thank that of K" + x);

  }


}