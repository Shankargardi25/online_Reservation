

import java.util.Scanner;


class reservation
{
  static boolean[] seats = new boolean[10];

    void viewseat()
    {
        for (int i = 0; i<seats.length; i++)
        {
            if (seats[i])
            {
                System.out.print(" x ");
            }
else
{
                System.out.print(i+1+" ");
            }
            System.out.println();
            }
        }
    String name,from,to;
    int age,noofseats;
//    float price;
    Scanner sc = new Scanner(System.in);
void book()
{
    System.out.println("enter number of seats required :");
    noofseats=sc.nextInt();
    for (int i=0;i<noofseats;i++)
    {
        System.out.println("hii,Enter seat number you wanwt to resrve between 1-10:");
        int seatnumber = sc.nextInt();
        if (seatnumber < 1 || seatnumber > 10)
        {
            System.out.println("wrong choice seat from above ");

        }
        else if (seats[seatnumber - 1]) {
            System.out.println("seat already reserverd");
        }
        else {
            seats[seatnumber - 1] = true;
            System.out.println("seat reserved");
        }
        System.out.println("-----Enter Passenger detail---");
        System.out.println("Enter passenger name: ");
        name=sc.next();
        System.out.println("Enter passenger's age :");
        age=sc.nextInt();
        System.out.print("From : ");
        from=sc.next();
        System.out.print("To :" );
        to=sc.next();

        if (from.equals("pune") && to.equals("manmad"))
        {
            System.out.println("price = 200.0 RS");
            System.out.println("Your ticket is booked. ");
            System.out.println("Hope you enjoy the ride.");
        }
        if (from.equals("pune") && to.equals("au"))
        {
            System.out.println("price = 260.0 RS");
            System.out.println("Your ticket is booked. ");
            System.out.println("Hope you enjoy the ride.");
        }
        if (from.equals("pune") && to.equals("jalna"))
        {
            System.out.println("price = 320.0 RS");
            System.out.println("Your ticket is booked. ");
            System.out.println("Hope you enjoy the ride.");
        }


    }
}
    void cancel(){
        String name1,from1,to1;

        System.out.println("Enter number of seats you want to cancel :");
        noofseats=sc.nextInt();
        for (int i=0;i<noofseats;i++)
        {
            System.out.println("enter the seat number you want to cancel:");
            int seatnumber=sc.nextInt();
            System.out.println("------------------enter passenger details :----------------------");
            System.out.println("enter passenger's name: ");
            name1=sc.next();

            System.out.println("From :");
            from1=sc.next();
            System.out.println("To :");
            to1=sc.next();
            if (name1.equals(name)  && from1.equals(from) && to1.equals(to))
            {
                if (seatnumber < 1 || seatnumber > 10) {
                    System.out.println("wrong choice");
                } else if (!seats[seatnumber - 1]) {
                    System.out.println("seat not reserved");
                } else {
                    seats[seatnumber - 1] = false;
                    System.out.println("reservation canceled");
                }
                System.out.println("ticket cancelled ..");
                if (from.equals("pune") && to.equals("Manmad"))
                {
                    System.out.println("Refund = 180.0 RS");
                }
                else if (from.equals("pune") && to.equals("chhrapati Sambhaji nagar"))
                {
                    System.out.println("Refund = 220.0 RS");
                }
                else if(from.equals("pune") && to.equals("jalna"))
                {
                    System.out.println("Refund = 260.0 RS");
                }
            }
            else {
                System.out.println("enter right details ");


            }

        }
}
}
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

reservation r=new reservation();

        while(true)
        {
            System.out.println("-----------------Enter your choice : -------------");
            System.out.println("1.View Seat Arrangement :");
            System.out.println("2.Book ticket :");
            System.out.println("3.Cancel your Reservation:");
            System.out.println("4.Exit :");
            int op=sc.nextInt();
            switch(op)
            {
                case 1 -> r.viewseat();



                case 2 ->r.book();


                case 3-> r.cancel();



                case 4->System.exit(0);


                default -> System.out.println(" koi itta galat kese ho sakta hai bhai ");


            }
        }
    }
}


