/* There are two kinds of class : Abstract class and concrete class .
  Abstract class contains abstract keyword . ex: abstract class rectangle.
  when a method is created as abstract then the class must be abstract.
  when a class is derived from abstract class , then the derived class will also become abstract class.To avoid these overriding of method must take place.
*/
abstract class main1
{
  abstract void num(){};
}
class main2 extands main1
{
  void num()
  {
    psvm("welcome");
  }
}
  
