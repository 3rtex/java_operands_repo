# Java Operators Precedence

Operator precedence defines the order in which a given mathematical expression is evaluated. 
When an expression includes multiple operators then every single part of the given expression is evaluated 
in a certain order following some rules defined as per operator precedence. The higher precedence is evaluated 
first and the lowest precedence is evaluated last.

# Java Operator Associativity
With the same precedence follow operator associativity defined for their operator group. 
In Java, operators can either follow left-associative, right-associative, or have no associativity. 
Operators with left-associative are evaluated from the left to right, operators with right-associative 
are evaluated from right to the left, and with no associativity, do not follow any predefined order.

<style type="text/css">
.tg  {border-collapse:collapse;border-spacing:0;}
.tg td{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  overflow:hidden;padding:10px 5px;word-break:normal;}
.tg th{border-color:black;border-style:solid;border-width:1px;font-family:Arial, sans-serif;font-size:14px;
  font-weight:normal;overflow:hidden;padding:10px 5px;word-break:normal;}
.tg .tg-0pky{border-color:inherit;text-align:left;vertical-align:top}
</style>
<table class="tg">
<thead>
  <tr>
    <th class="tg-0pky">Precedence</th>
    <th class="tg-0pky">Operator</th>
    <th class="tg-0pky">Type</th>
    <th class="tg-0pky">Associativity</th>
  </tr>
</thead>
<tbody>
  <tr>
    <td class="tg-0pky">15</td>
    <td class="tg-0pky">()<br>[]<br>·</td>
    <td class="tg-0pky">Parentheses<br>Array subscript<br>Member selection</td>
    <td class="tg-0pky">Left to Right</td>
  </tr>
  <tr>
    <td class="tg-0pky">14</td>
    <td class="tg-0pky">++<br>--</td>
    <td class="tg-0pky">Unary post-increment<br>Unary post-decrement</td>
    <td class="tg-0pky">Right to left</td>
  </tr>
  <tr>
    <td class="tg-0pky">13</td>
    <td class="tg-0pky">++<br>--<br>+<br>-<br>!<br>~<br>(type)</td>
    <td class="tg-0pky">Unary pre-increment<br>Unary pre-decrement<br>Unary plus<br>Unary minus<br>Unary logical negation<br>Unary bitwise complement<br>Unary type cast</td>
    <td class="tg-0pky">Right to left</td>
  </tr>
  <tr>
    <td class="tg-0pky">12</td>
    <td class="tg-0pky">*<br>/<br>%</td>
    <td class="tg-0pky">Multiplication<br>Division<br>Modulus</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">11</td>
    <td class="tg-0pky">+<br>-</td>
    <td class="tg-0pky">Addition<br>Subtraction</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">10</td>
    <td class="tg-0pky">&lt;&lt;<br>&gt;&gt;<br>&gt;&gt;&gt;</td>
    <td class="tg-0pky">Bitwise left shift<br>Bitwise right shift with sign extension<br>Bitwise right shift with zero extension</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">9</td>
    <td class="tg-0pky">&lt;<br>&lt;=<br>&gt;<br>&gt;=<br>instanceof</td>
    <td class="tg-0pky">Relational less than<br>Relational less than or equal<br>Relational greater than<br>Relational greater than or equal<br>Type comparison (objects only)</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">8</td>
    <td class="tg-0pky">==<br>!=</td>
    <td class="tg-0pky">Relational is equal to<br>Relational is not equal to</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">7</td>
    <td class="tg-0pky">&amp;</td>
    <td class="tg-0pky">Bitwise AND</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">6</td>
    <td class="tg-0pky">^</td>
    <td class="tg-0pky">Bitwise exclusive OR</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">5</td>
    <td class="tg-0pky">|</td>
    <td class="tg-0pky">Bitwise inclusive OR</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">4</td>
    <td class="tg-0pky">&amp;&amp;</td>
    <td class="tg-0pky">Logical AND</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">3</td>
    <td class="tg-0pky">||</td>
    <td class="tg-0pky">Logical OR</td>
    <td class="tg-0pky">Left to right</td>
  </tr>
  <tr>
    <td class="tg-0pky">2</td>
    <td class="tg-0pky">? :</td>
    <td class="tg-0pky">Ternary conditional</td>
    <td class="tg-0pky">Right to left</td>
  </tr>
  <tr>
    <td class="tg-0pky">1</td>
    <td class="tg-0pky">=<br>+=<br>-=<br>*=<br>/=<br>%=</td>
    <td class="tg-0pky">Assignment<br>Addition assignment<br>Subtraction assignment<br>Multiplication assignment<br>Division assignment<br>Modulus assignment</td>
    <td class="tg-0pky">Right to left</td>
  </tr>
</tbody>
</table>

### Note: Larger the number higher the precedence

# Exercise

Understand the line and find the value of the `e` variable.
Try the exercise on paper or notepad.