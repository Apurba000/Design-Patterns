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


