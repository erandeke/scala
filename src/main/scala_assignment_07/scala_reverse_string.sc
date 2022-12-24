
//Expected op
//uoy era woh iH (reverse the sentence literally)


val str: String = "Hi how are you";

val op = str.reverse;

print(op);





//Expected op: iH woh era uoy (reverse each word in the sentence)

val inp: Array[String] = str.split(" ").map(x => x.reverse);
for (x <- inp) {
  print(x + " ")
}


//Expected : changing the order of each words
//you are how Hi

val ans = str.split(" ").reverse;
print(ans.mkString(" ") + "")