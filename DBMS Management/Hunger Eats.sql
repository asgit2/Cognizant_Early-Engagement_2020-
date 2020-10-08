 /* 1. Hunger eats - change datatype */

 alter table customers modify column customer_id int;

 /* 2. Hunger eats - update table */
  update customers set phone_no = 9876543210 where customer_id='CUST1004';


  /* 3.  Hunger eats - Change the field name */

   alter table hotel_details change column rating Hotel_rating int;