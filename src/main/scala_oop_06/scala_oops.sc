
//By making the parametrs as val we are promoting it to the fields
// so that those can be accessed using object
class Person(val name: String, age: Int)

val p = new Person("KJedar", 20);

print(p.name);

class Teacher(name: String, age: Int, val profession: String)

val t = new Teacher("Harsh", 30, "HR")

print(t.profession)


//
class Employee(val name: String, val salary: Int, val age: Int) {
  val attr = 30;

  def ageValidate(age: Int): Boolean = {
    if (age < 18)
      return false;
    return true;
  }

  def salaryCompute(salary: Int): Int = {
    salary * 2;
  }

}

val employee = new Employee("Kedar", 1000, 20);
employee.ageValidate(10);
print(employee.salaryCompute(1000));


//Singleton DP in scala - only one instance will be created
//also same fields can be shared across called class level functionality
object Person {
  val type_eyes = 2;

  def canFly: Boolean = false;
}

print(Person.type_eyes); //2


//Instance level functionality : which have different sets and not shared

class Person(val age: Int, val name: String)

val person = new Person(10, "Kedar");
val person_1 = new Person(20, "Test");

print(person == person_1) //different instance hence false

//Inheritance :

class Animal {

  def hunt = print("Animals hunt to survive");
}

class Cat extends Animal {

  def perferredMeal = print("Milk");
}

val cat = new Cat;
cat.hunt;
cat.perferredMeal;

//Access modifiers

//private , protected, no modifier(public)


//Abstract class can contain unimplemented methods .
//Implementation can be provided by classes inheriting it

abstract class Animal {
  val createdType: String;

  def eat;
}

class dog extends Animal {
  override val createdType: String = "Str";

  override def eat: Unit = println("Hey dogwa");
}

val p = new dog;
p.eat;

//trait is same as that of abstract class
//only thing is we can achieve multiple inheritance in case of traits
//traits does not have constructor

trait carnivore {
  def masseater
}

trait omnivore {
  def maneater
}

class dog extends Animal with carnivore with omnivore {
  override val createdType: String = "dog";

  override def eat: Unit = print("I eat whatever i like")

  override def masseater: Unit = print("I am mass eater")

  override def maneater: Unit = print("Sometimes")
}


val doi = new dog;
doi.maneater;


//both abstract and trait have implementd and unimplemeted methods



//case classes :it helps to avoid boiler plate code

//1-> use case to avoid writing promotion of parameter to field

case class Test(marks :Int)
{
  def calculate = print(marks);
}

val t = new Test(30);
print(t.calculate);


//2 : case classes are sensible to string

print(t.toString) //Test(30)


//3.  case classes have equals and hashcode implemented already

var p1 = new Test(30);
var p2 = new Test(30);

print(p1==p2);

//4 case classes are serilizable
