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


## Chapter 2 : The Observer Pattern - Keep Your Object In The Know 

The Weather-O-Rama project. The system has three components. 
1. The Weather station - Physical device the acquires the actual weather data.
2. The WeatherData Object - tracks the data coming from the weather station and update the displays.
3. The Display - Shows users the current conditions


<img src="src/images/weather-o-rama-1.png">
<img src="src/images/weather-o-rama-2.png">

Taking a first, misguided implementation of the Weather Station

```
public class WeatherData {
    // instance variable declarations
    
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();
        
        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);
    }
    
    
    // other WeatherData methods here
}
```

Meet the observer pattern

<img src="src/images/observer-pattern-1.png">

"**The Observer Pattern defines a one-to-many
dependency between objects so that when one
object changes state, all of its dependents are
notified and updated automatically.**"

### The Power of Loose Coupling : 
When two objects are loosely coupled, they can interact, but they typically have very little knowledge
of each other.


### Design Principle 4 : Strive for loosely coupled designs between objects that interact.
Loosely coupled designs allow us to build flexible OO
systems that can handle change because they minimize
the interdependency between objects.

<img src="src/images/weather-o-rama-3.png">

[Initial Implementation of Weather Station](https://github.com/Apurba000/Design-Patterns/commit/0153fdfcd4f146318ee21354bec161651a16be4e)
[Observer Pattern Example From Swing GUI](https://github.com/Apurba000/Design-Patterns/blob/master/src/ch02/SwingObserverExample.java)


Back at Weather-O-Rama

There’s another way of handling the data in the Subject: we can rely on the
Observers to **pull** it from the Subject as needed. Right now, when the Subject’s data
changes, we **push** the new values for temperature, humidity, and pressure to the
Observers, by passing that data in the call to update().

[Check this commit for pulling](https://github.com/Apurba000/Design-Patterns/commit/855d85b4990b021b7261a44dbc3f3065912986fd)

You can push or pull data from the Subject when using the pattern (pull is considered more “correct”).

So far we learned 4 design principle these are :

* Design Principle 1 : Identify the aspects of your application that vary and 
them from what stays the same.
* Design Principle 2 : Program to an interface, not an implementation.
* Design Principle 3 : Favor composition over inheritance.
* Design Principle 4 : Strive for loosely coupled designs between objects that interact.

### [Go to Part 02](https://github.com/Apurba000/Design-Patterns/blob/master/src/readme/readme2.md)
