```bash
namanbhalla@Namans-Scaler-MacbookM1Pro-16 ~ % psql
psql (14.1)
Type "help" for help.

namanbhalla=# create database scaler_july22_bookmyshow;
CREATE DATABASE
namanbhalla=# create user july22batch;
CREATE ROLE
namanbhalla=# grant all privileges on database scaler_july22 to july22batch;
GRANT
namanbhalla=#
```


// A (B) -> B will be taken from a DB
// A (Database)
// A has B
// A(B b)
// 


Agenda:
1. Implement Transaction Isolation in Spring Boot for BMS

Feature:
- Person wants to book a ticket for a show
- TicketController {
  - bookTicket(
    - show_id
    - list<show_seat_id>
    - user_id
  - )
- }


- TicketService {
  - bookTicket(
    - show_id
    - list<show_seat_id>
    - user_id
  - ) 
- }

- How will bookTicket() in TicketService work?
  - update show_seats
  - set status = LOCKED
  - where show_seat_id in ()



// City
// Theatre
// Auditorium
// Seat
// Show

// Break till 10:42 PM