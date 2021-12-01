#### P1. Write a program that reads a character from the user and then uses a switch statement to achieve what the following if statement does.  
> if  ((choice == ‘A’)  || (choice == ‘a’))<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printf(“Action movie fan\n”);<br />
else if  ((choice == ‘C’)  || (choice == ‘c’))<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printf(“Comedy movie fan\n”);<br />
else if  ((choice == ‘D’)  || (choice == ‘d’))<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printf(“Drama movie fan\n”);<br />
else<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;printf(“Invalid choice\n”);<br />
                    
Test cases: ‘a’, ‘A’, ‘c’, ‘C’, ‘d’, ‘D’, ‘b’, ‘B’.<br />
Expected outputs: ‘a’, ‘A’ – Action movie fan; ‘c’, ‘C’ – Comedy movie fan; ‘d’, ‘D’ – Drame movie fan; ‘b’, ‘B’ – Invalid choice.<br />

#### P2. The salary scheme for a company is given as follows:
> Salary range for grade A: $700 - $899 <br />
Salary range for grade B: $600 - $799 <br />
Salary range for grade C: $500 - $649 <br />
A person whose salary is between $600 and $649 is in grade C if his merit points are below 10, otherwise he is in grade B. A person whose salary is between $700 and $799 is in grade B if his merit points are below 20, otherwise, he is in grade A. Write a program to read in a person’s salary and his merit points, and displays his grade.<br /><br />

Test cases: (1) salary : $500, merit : 10; (2) salaray : $610, merit : 5; (3) salary : $610, merit : 10; (4) salary : $710, merit : 15; (5) salary : $710, merit : 20; (6) salary : 800, merit : 30.<br />
Expected outputs: (1) salary : $500, merit : 10 – Grade C; (2) salaray : $610, merit : 5 – Grade C; (3) salary : $610, merit : 10 – Grade B; (4) salary : $710, merit : 15 – Grade B; (5) salary : $710, merit : 20 – Grade A; (6) salary : 800, merit : 30 – Grade A.<br />

#### P3. Write a program to generate tables of currency conversions from Singapore dollars to US dollars. Use title and column headings. Assume the following conversion rate: 1 US dollar(US$) = 1.82 Singapore dollars (S$)
> Allow the user to enter the starting value, ending value and the increment between lines in S$. The starting value, ending value and the increment are all integer values. Generate three output tables using the following loops with the same input data from the user:<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;1. Use a for loop to generate the first table;<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;2. Use a while loop to generate the second table; and<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;3. Use a do/while loop to generate the third table.<br />

Test cases: (1) starting : 1, ending : 5, increment : 1; (2) starting : 0, ending : 40, increment: 5; (3)
starting : 40, ending : 0, increment: 5 (treat this case as an error).<br />
Expected outputs:<br />
(1) starting : 1, ending : 5, increment : 1; <br />
US$         S$ <br />
-------------- <br />
1 1.82<br />
2 3.64<br />
3 5.46<br />
4 7.28<br />
5 9.1<br /><br />
(2) starting : 0, ending : 40, increment: 5;<br />
 US$      S$<br />
 --------------<br />
 0        0.0<br />
 5        9.1<br />
 10       18.2<br />
 15       27.3<br />
 20       36.4<br />
 25       45.5<br />
 30       54.6<br />
 35       63.7<br />
 40       72.8<br /><br />
(3) starting : 40, ending : 0, increment: 5 (treat this case as an error) – Error input!!<br />

#### P4. Write a program that reads the height from a user and prints a pattern with the specified height. 
> For example, when the user enters height = 3, the following pattern is printed:
AA <br />
BBAA <br />
AABBAA <br />
If the height is 7, then the following pattern is printed:
AA<br />
BBAA<br />
AABBAA<br />
BBAABBAA <br />
AABBAABBAA <br />
BBAABBAABBAA <br />
AABBAABBAABBAA<br /><br />

Test cases: 0, 3, 7
Expected outputs: (1) height = 0 – Error input!! (2) height = 3 & (3) height = 7 – same as the sample patterns.
