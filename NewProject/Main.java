package NewProject;

// name; Ahmad Mustafa
// Scope: Project NPS one more run from scratch
// Basically. You receive a key from a resident.
// The key is supposed to go to their friend Bill. The resident is Ph2C.
// You have space for 5 guests in the system.
// You already have 4 assigned spots, one more is remaining.
// You want to send the option for Reed to set that spot to his father Bill.
// Reed must put in the guest name and key and the last spot will be assigned to him.
// You can assume that the other spots has been filled by the programming staff.
// Result must have a running program which asks for key and unit, then validate that data to give access.
// On the backend, the program must have a prompt for the resident to set the key and unit.
// Essentially, you have 2 programs. 1 must ask for Reed to set the credz. 1 must ask user if he is the correct recipient (BILL)
// Go!

//Instructions:
// Bill asks hey can i have my father pick up this key? done
// Sure thing, i've sent a link to your app. Please set the key using that link setGuest(); create set guest done
// "HI AHmad, I have set the key." done
// Then I take the key that has beeen initialised by bill and assign it to guest5 done
// Guest5 has the data stored in the guests() array done
// Now that it has been stored in the system. Next day bill arrives done
// Bill sees that i am not at the front desk but there is a prompt on the screen to open the lockbox. done
// Bill tries to enter the data shared to him by Reed. done

// Base version success!

//NextUP:
// Set the credentials before you ask Bill and store them. done
// Keep it case sensitive. done
// Separate the set method and the validate method. (needs brain)
// Play with setGuest();
// Play with data();
// Define one clear goal for each method and divide frontEnd();
// Play with driver();

import java.util.Scanner;
public class Main {

    static void success() {// method if bill succeeds. Final version.
        System.out.println("*The vault bolts open!*");
        System.exit(404);
    }
    static void failure() {// method if bill fail. Final version
        System.out.println("Incorrect details, please wait for the receptionist to return.");
        System.exit(404);
    }
    static Guest setGuest() { // Ask reed for guest name and unit. Beta version
        Scanner input = new Scanner(System.in);

        String unit, name;

        System.out.println("Hi Reed, please Set the secret key: "); //Back end asking reed to set
        name = input.nextLine();

        System.out.println("Hi Reed, please Set the unit number: "); //back end asking reed to set his creddiz
        unit = input.nextLine();

        Guest guest1 = new Guest(name, unit);

        // System.out.println(guest1); // Successfully set the guest. Now assign this to guest5.
        return guest1;


    }
    static Guest[] data () { // User data storage. Beta version.

        Guest guest1 = new Guest("Jamie", "803");
        Guest guest2 = new Guest("Suzie", "804");
        Guest guest3 = new Guest("Miley", "805");
        Guest guest4 = new Guest("Celine", "806");
        Guest guest5 = setGuest();

        Guest[] guests = {guest1, guest2, guest3, guest4, guest5};
        return guests;
    }
    static void frontEnd() { // Asking user to input data. Then validating the data. 2 actions (Creates confusion). Beta version
        Scanner input = new Scanner(System.in);
        Guest[] guests = data();//import guest Data

        String name, unit;

        System.out.println("Enter secret key: "); //Front end asking to validate
        name = input.nextLine();

        System.out.println("Enter unit: "); //Front end asking Bill to validate his creddiz
        unit = input.nextLine();

        //Validate\
        for(int i = 0; i < guests.length; i++) {
            if (name.equals(guests[i].name)) {
                if (unit.equals(guests[i].unit)) {
                    success();
                }
            }
        }
        failure();

        Guest [] data = data(); //data import works
        System.out.println(data[2]);
    }
    static void driver() { // Structures all the methods. Beta version
        frontEnd();
    }

    public static void main(String[] args) { // Final version.
        driver();
    }
}

//After Project: Upload to GitHub
//Learn basic terminal. (As instructed by mr. Ghora.
