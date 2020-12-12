package locker;

import java.util.Scanner;

public class programminglocker {

    public static void main(String[] args) {

        String fname = null;
        String lname = null;
        String day = null;
        String item = null;
        String hello = "Main menu" + '\n' + "1.new" + '\n' + "2.set" + '\n' + "3.show all" + '\n' + "4.exit";
       int numberOfNameForset=0 ;

        int select;
        System.out.print("Please input your number of locker:");
        Scanner scan = new Scanner(System.in);
        int numberarrey = scan.nextInt();
        person a = new person(numberarrey);
        locker locker1 = new locker(numberarrey);
        
        String[] secFName = a.getFirstName();
        String[] secLName = a.getLastName();
        String[] secDay = locker1.getDay();
        String[] secLocker = locker1.getLocker();
        System.out.println("");

        do {
            System.out.println(hello);
            System.out.print("select:");
            select = scan.nextInt();
           scan.nextLine();
            System.out.println("");
            switch (select) {
                case 1:

                    System.out.print("Your first name:" );
                    fname = scan.nextLine();

                    System.out.print("Your last name:" );
                    lname = scan.nextLine();

                    System.out.print("Input your day:");
                    day = scan.nextLine();

                    System.out.print("Item in locker:");
                    item = scan.nextLine();
                    a.addName(fname, lname);
                    locker1.adddDay(day);
                    locker1.addLocker(item);
                     System.out.println("");
                    break;

                case 2:
                        
                                System.out.print("Pleace input your first name:");
                                fname = scan.nextLine();
                                for (int i = 0; i < a.getFirstName().length; i++) {
                                    if (  fname.equals(secFName[i])) {
                                        numberOfNameForset = i;
                                    }
                                }
                                System.out.print("Pleace input your last name:");
                                lname = scan.nextLine();
                                for (int i = 0; i < a.getFirstName().length; i++) {
                                    if ( lname.equals(secLName[i]) ) {
                                        numberOfNameForset = i;
                                    }
                                }
                                System.out.print("Please input your new first name:");
                                secFName[numberOfNameForset] = scan.nextLine();

                                System.out.print("Please input your new last name:");
                                secLName[numberOfNameForset] = scan.nextLine();
                                
                                System.out.print("Please input your new date:");
                                secDay[numberOfNameForset] = scan.nextLine();
                                
                                System.out.print("Please input your new item:");
                                secLocker[numberOfNameForset] = scan.nextLine();
                                
                                System.out.println("");
                    
                    break;
                case 3:
                    System.out.println("All user of locker:");
                    for (int i = 0; i < secFName.length; i++) {
                        System.out.print((i + 1) + ".");
                        System.out.print(secFName[i] + '\t');
                        System.out.print(secLName[i] + '\t');
                        System.out.print(secDay[i] + '\t');
                        System.out.println(secLocker[i] + '\t');
                    }
                    System.out.println("");
                    break;
            }

        } while (select != 4);

    }

}
