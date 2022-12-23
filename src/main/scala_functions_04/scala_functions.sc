//functional programming in scala

def square(x: Int): Int = x * x;
print(square(2));

def cubeIt(x: Int): Int = x * x * x;
print(cubeIt(3));

//taking function as a parameter

def transform(x: Int, f: Int => Int): Int = {
  f(x)
}
print(transform(2, square));

//f :int => int says that pass the function as a parameter whose return type is int

def convert(x: String): String = x.toUpperCase;

print("Passing string in lowercase", convert("kedar"));


def converterFunction(x: String, f: String => String): String = {
  f(x)
}
print(converterFunction("kedar", convert));

//anonymous function

transform(2, x => {
  val y = x * 2;
  y * y
});


//normal function

def divide(x: Int): Int = {
  x / 2;
}

//multiply function

def multiple(x: Int): Int = {
  x * x;
}

//Anonymous function

print(transform(2, x => x / 2));

print(multiple(6));

def conversion(i: Int, f: Int => Int): Int = {
  f(i);
}

print(conversion(2, multiple));

///Impure functions
def func_1(i: Int): Int = {
  //i=i+1; -> Reassignment /mutation not allowed ,this makes impure function
  return i;
}

//How to solve above?

def func(i: Int): Int = {
  return i + 1;
}


//Type 2: When your function has side effects

def func_2(i: Int): Int = {
  print("Hello") //this function is making impure side effect
  return i;

}

//Type 3: When there is external dependency func tend to become impure

var a = 10;
def func_3(i: Int): Int = {
  return i + a; //there is an external dependency on var a
}

//How to solve the above problem ?

def func_3(i: Int, a: Int): Int = {
  return a + i;
}


//func returning func :


def func = {
  i: Int => i * i;
}

print(func(2));


//Higher order functions:
//A function which takes either func as a input parameter
//or returns another func as output


var i = 1 to 10;

def makeThingsDouble(i: Int): Int = {
  i * 2;
}

i.map(makeThingsDouble)

//Anonymous function:
//A function without a name

//The above code can be replaced as

i.map(x => x * 2);


//Loop

//find factorial of number using loops

def func_factorial(input: Int): Int = {
  var result = 1;
  for (i <- 1 to input) {
    result = result * i;
  }
  result
}
print(func_factorial(3));

//Using recursion :

def func_recursion(input: Int): Int = {
  if (input == 1)
    input;
  else
    input * func_recursion(input - 1);
}

print(func_recursion(3));

//print range

def printNum(i: Int): Int = {
  for (value <- 1 to i)
    print(value)
  return 0;
}

//Partial applied functions: This is an act of creating brand new functions
//existing functions


def divideFunc(i:Int, t:Int)  : Int = {
   i/t;

}

divideFunc(10,5);

//creating partial applied function from above func

val divideFunctionCreated = divideFunc(10,_:Int);

print(divideFunctionCreated(2));

//Example 2:

 def sumFunc(a:Int , b:Int) : Int ={
   a+b;
 }

//creating partially applied function:

val increment = sumFunc(1,_:Int);

print(increment(2)); //3


//closure: which is using a variable which is defined outside the scope of function. So every time a function is called then it takes the latest value of that variable in account..It picksthe latest value dynamically

  var a  = 5;

  def sum_v(X:Int) :Int = {
     X + a;
  }

  print(sum_v(1));  //7

  a = 10;

  print(sum_v(1));