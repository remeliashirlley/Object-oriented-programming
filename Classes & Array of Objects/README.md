## The Colossus Airlines fleet consists of one plane with a seating capacity of 12. It makes one flight daily. In this experiment, you are required to write a seating reservation application program.<br /> 
The problem specification is given below:<br /><br />
A. Write a class PlaneSeat that has the following features. Each PlaneSeat object should hold a seat identification number (seatId), a marker (assigned) that indicates whether the seat is assigned and the customer number (customerId) of the seat holder. <br />
The class diagram is given below:<br />

> PlaneSeat<br />
-seatId: int<br />
-assigned: boolean<br />
-customerId: int<br />
+PlaneSeat(seat_id: int)<br />
+getSeatID(): int<br />
+getCustomerID(): int<br />
+isOccupied(): boolean<br />
+assign(cust_id: int): void + unAssign(): void<br /><br />

where<br />
PlaneSeat() - is the constructor for the class.<br />
getSeatID() – a get method that returns the seat number.<br />
getCustomerID() – a get method that returns the customer number.<br />
isOccupied() – a method that returns a boolean on whether the seat is occupied. <br />
assign() – a method that assigns a seat to a customer.<br />
unAssign() – a method that unassigns a seat.<br />
Implement the class PlaneSeat.<br /><br />

B. Write a class Plane that comprises 12 seats. The class should create an array of 12 objects from the class PlaneSeat.<br />
The class diagram is given below:<br />

> Plane <br />
- seat: PlaneSeat[ ]<br />
- numEmptySeat:int<br />
+ Plane()<br />
- sortSeats() : PlaneSeat[ ]<br />
+ showNumEmptySeats(): void<br />
+ showEmptySeats(): void<br />
+ showAssignedSeats(bySeatId : boolean): void + assignSeat(seatId : int, cust_id : int): void<br />
+ unAssignSeat(seatId : int): void<br /><br />

where<br />
seat – instance variable containing information on the seats in the plane. It is declared as an
array of 12 seat objects.<br />
numEmptySeat – instance variable containing information on the number of empty seats. <br />
Plane() – a constructor for the class Plane.<br />
sortSeats() – a method to sort the seats according to ascending order of customerID.
A copy of the original seat array is used for sorting instead of the original. 
showNumEmptySeats() – a method to display the number of empty seats.<br />
showEmptySeats() – a method to display the list of empty seats.<br />
showAssignedSeat() – a method to display the assigned seats with seat ID and customer ID.
If bySeatId is true, the order will be by seatID, else order is by
customerID.
assignSeat() – a method that assigns a customer ID to an empty seat .<br />
unAssignSeat() – a method that unassigns a seat. Implement the class Plane.<br /><br />

C. Write an application class PlaneApp that implements the seating reservation program.<br />
The class PlaneApp should be able to support the following:<br />

> (1) Showthenumberofemptyseats<br />
(2) Show the list of empty seats<br />
(3) Show the list of customers together with their seat numbers in the order of the seat numbers<br />
(4) Show the list of customers together with their seat numbers in the order of the customer ID<br />
(5) Assignacustomertoaseat<br />
(6) Remove a seat assignment<br />
The menu should also contain option (7) (i.e. quit) for terminating the program. After the user selects a particular option, the corrsponding operation will be executed. If the selected option is not (7), then the program shows the menu for user selection again. This application does not need to save data into a file between runs.<br /><br />


Test Data:<br />
Test your application program with the following data:<br />
1. Assign a customer to a seat with SeatID=10, CustomerID = 10001.<br />
2. Assign a customer to a seat with SeatID=12, CustomerID = 10002.<br />
3. Assign a customer to a seat with SeatID=8, CustomerID = 10003.<br />
4. Show the the list of customers together with their seat numbers in the order of the seat numbers.<br />
5. Show the number of empty seats.<br />
6. Show the list of empty seats.<br />
7. Assign (attempt) a customer to a seat with any existing CustomerID, and SeatID. (Should give a
warning message!)<br />
8. Remove the seat assignment with SeatID=10.<br />
9. Assign (attempt) a customer to a seat with SeatID = 12.<br />
10. Remove the seat assignment with SeatID=12.<br />
11. Show the list of customers together with their seat numbers in the order of the seat numbers.<br />
12. Showthenumberofemptyseats.<br />
13. Show the list of empty seats.<br />
14. Quit<br /><br />

Expected outputs:<br />
(1)Show number of empty seats<br />
(2)Show the list of empty seats<br />
(3)Show the list of seat assignments by seat ID <br />
(4)Show the list of seat assignments by customer ID <br />
(5)Assign a customer to a seat<br />
(6)Remove a seat assignment<br />
(7) Exit<br /><br />
Enter the number of your choice: 5<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assigning Seat ..<br />
Please enter SeatID: 10<br />
Please enter Customer ID: 10001 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Seat Assigned!<br />
Enter the number of your choice: 5 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assigning Seat ..<br />
Please enter SeatID: 12<br />
Please enter Customer ID: 10002<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Seat Assigned!<br />
Enter the number of your choice: 5 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assigning Seat ..<br />
Please enter SeatID: 8<br />
Please enter Customer ID: 10003 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Seat Assigned!<br />
Enter the number of your choice: 3 <br />
The seat assignments are as follow: <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 8 assigned to CustomerID 10003. <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 10 assigned to CustomerID 10001. <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 12 assigned to CustomerID 10002. <br />
Enter the number of your choice: 4 <br />
The seat assignments are as follow: <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 10 assigned to CustomerID 10001. <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 12 assigned to CustomerID 10002. <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 8 assigned to CustomerID 10003. <br />
Enter the number of your choice: 1 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;There are 9 empty seats<br />
Enter the number of your choice: 2 <br />
The following seats are empty: <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 1<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 2<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 3<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 4<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 5<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 6<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 7<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 9<br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;SeatID 11<br />
Enter the number of your choice: 5 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Assigning Seat ..<br />
Please enter SeatID: 8<br />
Please enter Customer ID: 10004 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Seat already assigned to a customer.<br />
Enter the number of your choice: 6<br />
Enter SeatID to unassign customer from: 10 <br />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Seat Unassigned!
