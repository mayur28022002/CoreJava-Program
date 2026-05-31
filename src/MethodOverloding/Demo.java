package MethodOverloding;
/*
 Method Overloding:-1)A class Having More than one method with the same but different
 formal argument is known as method overloding.
 2)Can we overload main method?
    Yes.
 3)Method Overloading works at compile time.
   Java compiler decides which overloaded method should be called based on the arguments passed.
   -Real Time Example is UPI App LIKE PHONEPAY,GOOGLE PAY
 */
public class Demo {
  public int add(int a,int b) {
	  return a+b;  
  }
  public double add(double a,double b) {
	  return a+b;
  }
  public int sub(int a,int b) {
	  return a-b;
  }
}
