# Java_21_Inheritance_Tracing_Exercise_1

This exercise uses classes without data (“_utility-type_” classes).

Rules used in tracing this code:

1- Analyze one-by-one the statements in main()

The first thing the constructor of a subclass will do is to call the constructor of the superclass; when there is no such call in the code, the default _super()_ will automatically be called; 

_this(0)_;   is the constructor of the current class with the parameter 0

_s.poit(s2)_;  means the method _poit(s2)_ of a **Bird** object, with the parameter s2 of **Loony** type; this means that the control will go to the method _narf()_ of **Loony** class.

