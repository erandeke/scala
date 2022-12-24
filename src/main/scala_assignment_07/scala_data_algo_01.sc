import scala.io.StdIn.{readInt, readLine}

def main(): Unit = {

  //num of customers
  var numOfCustomer: Int = 5

  //get the bill amounts
  var billAmounts: String = "10 20 30 25 16 40 36"

  //convert the string in int array for the bill amounts
  var bills: Array[Int] = billAmounts.split(" ").map(x => x.toInt);

  var count = 0;
  for (x <- bills) {
    val sqrRoot = Math.sqrt(x);
    if (sqrRoot.ceil - sqrRoot == 0) {
      count = count + 1;
    }
  }
  print(count);

}