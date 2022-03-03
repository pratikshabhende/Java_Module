package com.cybage.test;

class A 
{ 
   protected void display() 
    { 
        System.out.println("SoftwareTestingHelp"); 
    } 
} 
 
class B extends A {}  
class C extends B {}
 //The protected access modifier is accessible within package and outside the package but through inheritance only
class Main{
     public static void main(String args[]) 
   {   
       B obj = new B();     //create object of class B   
       obj.display();       //access class A protected method using obj
       C cObj = new C();    //create object of class C
       cObj.display ();     //access class A protected method using cObj
   }   
}