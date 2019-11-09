
package org.animals;

class Lion
{

	String colour ();
	Float weight();
	Int age();

Lion(){}

Lion(String colour,Float weight,Int age)
{
	this.colour=colour;this.weight=weight;this.age=age;
}

	public Boolean isVeg()
{
           return True;

}
	public Boolean canClimb()
{
            return false;
}
	public void getSound()
{
	System.out.println("Roars");
	
}
class Monkey

{
	String colour ();
	Float weight();
	Int age();

Monkey(){}


Monkey(String colour,Float weight,Int age)
{
	this.colour=colour;this.weight=weight;this.age=age;
}

	public Boolean isVeg()
{
 return True;

}
	public Boolean canClimb()
{
 return True;

}
	public void getSound()
{
	System.out.println("barks");

}

}
class Elephant

{
	String colour ();
	Float weight();
	Int age();

Elephant(){}

Elephant(String colour,Float weight,Int age)
{
	this.colour=colour;this.weight=weight;this.age=age;
}

	public Boolean isVeg()
{
return True;

}
	public Boolean canClimb()
{
 return false;
}
	public void getSound()
{
	System.out.println("trumpets");


}
}


