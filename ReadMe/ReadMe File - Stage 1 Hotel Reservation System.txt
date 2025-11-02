ReadMe File - Stage 1: Hotel Reservation System

Entity Defined:
The Entity for this system is Hotel Reservation System, that stores
- Guest Name
- Guest Email
- Number of Guests
- Room Type 
- Bed Type 
- Room Number
- Nights Staying
- Total Cost

How to use our System:
1. Run the program
2. From the menu:
	- Enter 1 to add a reservation
	- Enter 2 to remove a reservation
	- Enter 3 to view all reservations
	- Enter 4 to exit
3. Follow the on-screen prompts to enter guest details.

Why we chose our design as a choice:
 
We used Array Lists to hold reservation data. Each index across all lists represents one complete reservation.
- An example of this would include: Index 0 in all lists refer to the same guests reservation. 

We used a while loop and a switch menu to allow the user to add, remove and view reservations without having to restart the system each time it is run.

We also used nextLine() and input.nextInt() to avoid scanner input issues such as if the user enters a non-numeric input for a name or write in a number for name etc. 

Why we chose Lists
Well first it was required of us to use it for Stage 1.
Lists allow dynamic storage - reservations can grow as needed.
Array Lists gives fast access using indexes which makes parallel lists easy to manage. 
