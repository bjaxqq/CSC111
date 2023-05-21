# Barber Shop Simulation

A barber shop has one or more barbers who service customers as they arrive on a firstcome-first-serve basis. Depending on the type of haircut a customer desires the service time varies. A barber shop also has a limited number of chairs for waiting customers. If all the chairs are filled, an arriving customer leaves without entering. For this assignment you will simulate a barber shop with customers arriving at various times each requiring a variety of service times. We are interested in observing the behavior of the barber shop at intervals of time. To simulate customers arriving at you will use a queue and to simulate customers waiting in a barber shop you will use a circular queue where the size is equal to the number of chairs available.

Your program will read a text file that contains a customer’s arrival time, his service time (i.e., the time the barber requires to give this customer the haircut he desires,) and his name. Below is a sample input file.

    1 3 Bob
    2 2 Jim
    4 2 Bert
    8 7 Greg
    9 3 Tom
    10 2 Earl
    11 3 Jon
    12 2 Bill

At each time interval report the customer that is arriving, the customer that is being serviced by the barber, and customers waiting in chairs. If the barber shop is full (i.e., all the chairs are filled) an arriving customer leaves without a haircut. (See the sample output file BarberShopOutput.docx. For the sample, the barber shop has 3 chairs available.) Your program needs to accommodate a variable number of chairs.

For this assignment, you may work in pairs. When you submit your final solution, you need to detail each partner’s contribution.