//exception that handles wrong file name errors. Prevents system from crashing
import java.io.FileNotFoundException;
//allows files to be read
import java.io.File;
//a dynamic array
import java.util.ArrayList;
//an interface used to maintain order of elements
import java.util.List;
//used to read user input
import java.util.Scanner;

//class named LibraryManagementList that will hold attributes and behaviors of the class.
public class LibraryManagementSystem {
//list to store patrons
    private List<Patron> patrons;

    //constructor to initialize list
    public LibraryManagementSystem() {
        patrons = new ArrayList<>();
    }

    //method to add a patron
    public void addPatron(Patron patron) {
        patrons.add(patron);
        System.out.println("Successfully added patron.");
    }

    //method to remove a patron by id
    public void removePatron(int patronId) {
        //enhanced for loop to iterate through array and find matching id
        for (Patron patron : patrons) {
            if (patron.getId() == patronId) {
                patrons.remove(patron);
                System.out.println("Successfully removed patron.");
                return;
            }
        }
        //returns if matching id isn't found
        System.out.println("Patron not found.");
    }

    //method to display all patrons
    public void displayAllPatrons() {
        //checks if array is empty
        if (patrons.isEmpty()) {
            System.out.println("No patrons available to display.");
        } else {
            //enhanced for loop to iterate through array, format information, and display back to user
            for (Patron patron : patrons) {
                System.out.println(patron.getId() + "-" + patron.getName() + "-" + patron.getAddress() + "-" + patron.getOverdueFine() + "\n");
            }
        }
    }

    //method to load information from a file and add patrons to LMS
    public void loadPatronsFromFile(String filename) {
        try {
            //creation of scanner object to read file with given name
            Scanner fileScanner = new Scanner(new File(filename));
            while (fileScanner.hasNextLine()) {
                //reads next line of file
                String line = fileScanner.nextLine();
                //splits information, uses hyphen as separation checkpoints
                String[] details = line.split("-");
                //checks if line has 4 parts
                if (details.length == 4) {
                    //assigns each part to a variable
                    int id = Integer.parseInt(details[0].trim());
                    String name = details[1].trim();
                    String address = details[2].trim();
                    double overdueFine = Double.parseDouble(details[3].trim());
                    //creates new patron, initializes attributes, and adds to list of patrons
                    addPatron(new Patron(id, name, address, overdueFine));
                } else {
                    //error message
                    System.out.println("Invalid data format in line: " + line);
                }
            }
            //closes scanner after reading file
            fileScanner.close();
            System.out.println("Patrons successfully loaded from file.");
            //catch block that deals with file not being found
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (Exception e) {
            System.out.println("Error processing the file: " + e.getMessage());
        }
    }


    //method for user interaction with LMS
    public void menu() {
        //scanner to read user input
        Scanner scanner = new Scanner(System.in);
        //loop that continues until user exits program
        while (true) {
            //menu options
            System.out.println("Select a number to continue.");
            System.out.println("1. Add Patron");
            System.out.println("2. Remove Patron");
            System.out.println("3. Display All Patrons");
            System.out.println("4. Load Patrons from File");
            System.out.println("5. Exit");
            //reads users choice as int
            int choice = scanner.nextInt();
            //handles users choice
            switch (choice) {
                case 1:
                    //adds new patron
                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Fine: ");
                    double fine = scanner.nextDouble();
                    //creates new patron based on user input
                    addPatron(new Patron(id, name, address, fine));
                    break;
                case 2:
                    //removes patron
                    System.out.print("Enter ID to remove: ");
                    id = scanner.nextInt();
                    removePatron(id);
                    break;
                case 3:
                    //displays all patrons
                    displayAllPatrons();
                    break;
                case 4:
                    //loads patrons from file
                    System.out.print("Enter filename to load patrons: ");
                    scanner.nextLine(); // Consume newline
                    String filename = scanner.nextLine();
                    loadPatronsFromFile(filename);
                    break;
                case 5:
                    //exits program
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    //handles invalid choice
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }
    }
}
