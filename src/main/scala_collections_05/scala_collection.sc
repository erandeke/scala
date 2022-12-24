//scala collections

//Array
val a = Array(1, 2, 3, 4);
for (x <- a) {
  print(x);
}
//we can make a string and print
print(a.mkString("!"))

//List : contains elements of same datatype
val list = List(1, 2, 3, 4, 5);
println(list.head); //1
println(list.tail) //2,3,4,5
println(list.reverse);

//tuple : row record from a database kindof .
//It can hold elements of different data types.

val tup = ("kedar", "1000", 100);
print(tup._1);
print(tup._2);
print(tup._3);

//Range
//to
var rng = 1 to 10;
for (x <- rng) {
  print(x);
}

//Set :
//It holds only unique values
 val t = Set(1,2,2,3);
print(t) //1,2,3

val mp = Map("a"->1,
"b"->2,
"c"->43);
