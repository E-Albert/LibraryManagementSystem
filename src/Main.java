//contains entry point to program
public class Main {
    //method where program execution begins
    public static void main(String[] args) {
        //creates LMS object
        LibraryManagementSystem libraryManagementSystem = new LibraryManagementSystem();
        //calls LMS method to start user interaction
        libraryManagementSystem.menu();
    }
}
