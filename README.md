# Design-Patterns

This project serve as Practice code from "Head first Design Patterns". Let's get started.

---

The "duck" super class

<img src="src/images/duck-1.png">

* Problem "RubberDuck" cant quack or fly

### Design Principle 1 : Identify the aspects of your application that vary and separate them from what stays the same.
take the parts that vary and encapsulate them, so that later you can alter or extend the parts that vary without affecting
those that don’t.

* Solution :

We know that fly() and quack() are the parts of the Duck class that vary across ducks. To separate these behaviors from the Duck class, we’ll pull both methods
out of the Duck class and create a new set of classes to represent each behavior.

So how are we going to design the set of classes that
implement the fly and quack behaviors?

### Design Principle 2 : Program to an interface, not an implementation.
“Program to an interface” really means “Program to a supertype.”

<img src="src/images/program-to-an-interface.png">

Implement Duck behaviour 

<img src="src/images/implement-duck-behaviour.png">

Integrate the Duck Behaviour 

A Duck will now delegate its flying and quacking behaviors, instead of using quacking and
flying methods defined in the Duck class (or subclass).

[Visit this commit](https://github.com/Apurba000/Design-Patterns/commit/bb865d6a562fe63dc9308429b2add436af5247c0)

But check the MallardDuck Constructor it violates the rule "Program to interface not the implements"

<img src="src/images/mllard-duck-constructor.png">

Yes , That's exactly we are doing for now. Later we will fix it. 

Now we can set the duck behaviour dynamically as follows
<img src="src/images/set-behaviour.png">
<img src="src/images/set-behaviour-2.png">

Now See the BIG picture
<img src="src/images/has-a-is-a.png">

The HAS-A relationship is an interesting one: each duck has a FlyBehavior and a QuackBehavior to which it
delegates flying and quacking. When you put two classes together like this you’re using
composition. Instead of inheriting their behavior, the ducks get their behavior by being composed with the right
behavior object.

Favor composition over inheritance.
### Design Principle 3 : Favor composition over inheritance.

The above pattern is called 
#### "The Strategy Pattern"

Definition :
The Strategy Pattern defines a family of algorithms,
encapsulates each one, and makes them interchangeable.
Strategy lets the algorithm vary independently from
clients that use it.










