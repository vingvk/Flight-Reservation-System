package com.company.FRSproject;

public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("76467", "Bengaluru",
                "Delhi", "DepartureDateTime", "ArrivalDateTime",
                "6F", 5000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("67898", "India", "Dubai",
                "DepartureDateTime", "ArrivalDateTIme",
                "10A", 15000, false, null, null,
                "Dubai Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}
