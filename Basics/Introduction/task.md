
# Java Operators and Operands
Welcome to this introduction to the Java operators and operands.

Operators constitute the basic building block to any programming language.
They are classified based on the functionality they provide.

Operand is the object of a mathematical operation,  it is the object or quantity that is **operated** on.

We will talk about the most used operators below with a summary of what they are.

The `Main` class contains some example for each operator explained below.

## Arithmetic Operators

Used to perform simple arithmetic operations on primitive data types.
These operators consist of various unary and binary operators that can be applied on a single or two operands.

- `*` : Multiplication
- `/` : Division
- `%` : Modulo
- `+` : Addition
- `–` : Subtraction

## Unary Operators

Are arithmetic operators that perform an action on a single operand. 
They are used to increment, decrement or negate a value.

- `–` : Unary minus, negate the values.
- `+` : Unary plus indicates the positive value (numbers are positive without this, however). 
        It performs an automatic conversion to int when the type of its operand is the byte, char, or short.
        This is called unary numeric promotion.
- `++` : Increment operator. There are two varieties of increment operators.
  - Post-Increment: value is first used for computing the result and then incremented.
  - Pre-Increment: value is incremented first, and then the result is computed.
- `--` : Decrement operator. There are two varieties of decrement operators.
  - Post-decrement: value is first used for computing the result and then decremented.
  - Pre-Decrement: value is decremented first, and then the result is computed.
- `!` : Logical not operator, used for inverting a boolean value.

## Assignment Operator

`=` assignment operator is used to assigning a value to any variable. 
It has a right to left associativity, i.e. value given on the right-hand side of the operator is assigned to the 
variable on the left, and therefore right-hand side value must be declared before using it or should be a constant.

the assignment operator can be combined with other operators to build a shorter version of the statement called a 
Compound Statement. For example, instead of `a = a+5`, we can write `a += 5`.

- `+=`, for adding left operand with right operand and then assigning it to the variable on the left.
- `-=`, for subtracting right operand from left operand and then assigning it to the variable on the left.
- `*=`, for multiplying left operand with right operand and then assigning it to the variable on the left.
- `/=`, for dividing left operand by right operand and then assigning it to the variable on the left.
- `%=`, for assigning modulo of left operand by right operand and then assigning it to the variable on the left.

## Relational Operators

Used to check for relations like equality, greater than, and less than. They return boolean results.

- `==`, Equal to returns true if the left-hand side is equal to the right-hand side.
- `!=`, Not Equal to returns true if the left-hand side is not equal to the right-hand side.
- `<`, less than: returns true if the left-hand side is less than the right-hand side.
- `<=`, less than or equal to returns true if the left-hand side is less than or equal to the right-hand side.
- `>`, Greater than: returns true if the left-hand side is greater than the right-hand side.
- `>=`, Greater than or equal to returns true if the left-hand side is greater than or equal to the right-hand side.

## Logical Operators

Used to perform “logical AND” and “logical OR” operations, i.e., a function similar to AND gate and OR gate in digital electronics.
One thing to keep in mind is the second condition is not evaluated if the first one is enough to evaluate the condition. 
(e.g. the first condition is TRUE in a OR, Java won't check the second part because the first part is enough to satisfy the condition)

- `&&`, Logical AND: returns true when both conditions are true.
- `||`, Logical OR: returns true if at least one condition is true.
- `!`, Logical NOT: returns true when a condition is false and vice-versa

## Ternary Operator

Shorthand version of the if-else statement. It has three operands and hence the name ternary.

`condition ? if true : if false;`

## Bitwise Operators

Used to perform the manipulation of individual bits of a number. They can be used with any of the integer types.

- `&`, Bitwise AND operator: returns bit by bit AND of input values.
- `|`, Bitwise OR operator: returns bit by bit OR of input values.
- `^`, Bitwise XOR operator: returns bit-by-bit XOR of input values.
- `~`, Bitwise Complement Operator: This is a unary operator which returns the one’s complement representation of the input value, i.e., with all bits inverted.

## Shift Operators

Used to shift the bits of a number left or right, thereby multiplying or dividing the number by two, respectively.

`number shift_operator n_to_shift;`

- `<<`, Left shift operator: shifts the bits of the number to the left and fills 0 on voids left as a result. Similar effect as multiplying the number with some power of two.
- `>>`, Signed Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit depends on the sign of the initial number. Similar effect as dividing the number with some power of two.
- `>>>`, Unsigned Right shift operator: shifts the bits of the number to the right and fills 0 on voids left as a result. The leftmost bit is set to 0.

## instanceof operator

Used to test if an object is an instance of a class, a subclass, or an interface. It is a relational operator.

`object instanceof class/subclass/interface`