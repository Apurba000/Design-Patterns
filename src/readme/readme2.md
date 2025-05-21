## Chapter 3 : the Decorator Pattern

<img src="../images/starbuzz-1.png">
<img src="../images/starbuzz-2.png">

The Open-Closed Principle

## Design principle 5 : Classes should be open for extension, but closed for modification.

" _While it may seem like a contradiction, there are techniques for allowing code to be
extended without direct modification. Be careful when choosing the areas of code
that need to be extended; applying the Open-Closed Principle EVERYWHERE is
wasteful and unnecessary, and can lead to complex, hard-to-understand code._ "

### Meet the Decorator Pattern

So, here’s what we’ll do. we’ll start with a beverage and “decorate”
it with the condiments at runtime. For example, if the customer wants a
Dark Roast with Mocha and Whip, then we’ll:
1. Start with a DarkRoast object.
2. Decorate it with a Mocha object.
3. Decorate it with a Whip object.
4. Call the cost() method and rely on delegation to add up the condiment costs.

<img src="../images/starbuzz-3.png">
<img src="../images/starbuzz-4.png">

Okay, here’s what we k now about Decorators, so far...
* Decorators have the same supertype as the objects they decorate.
* You can use one or more decorators to wrap an object.
* Given that the decorator has the same supertype as the object it decorates, we can
pass around a decorated object in place of the original (wrapped) object.
* The decorator adds its own behavior before and/or after delegating to the object it
decorates to do the rest of the job. 
* Objects can be decorated at any time, so we can decorate objects dynamically at
runtime with as many decorators as we like.

Definition : _The Decorator Pattern attaches additional responsibilities to an object dynamically.
Decorators provide a flexible alternative to subclassing for extending functionality._

<img src="../images/starbuzz-5.png">

