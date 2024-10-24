package com.example.Teori.PolymorphismTest;

public class Staff {
    StaffMember[] staffList;

    public Staff ()
    {
        staffList = new StaffMember[6];
        
        staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[1] = new Employee ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[2] = new Employee ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);
        staffList[3] = new Hourly ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);
        staffList[4] = new Volunteer ("Woody", "789 Off Rocker", "555-0000");
        staffList[5] = new Volunteer ("Woody", "789 Off Rocker", "555-0000");
        
        ((Executive)staffList[0]).AwardBonus(500);
        ((Hourly)staffList[3]).addHours(40);
    }
    public void payday()
    {
        double amount;

        for (int count = 0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);
            amount = staffList[count].pay();

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);
            
            System.out.println("------------------------------------------");

        }
    }    

}
