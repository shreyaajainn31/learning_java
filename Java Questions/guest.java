import java.util.*;
public class guest {
    public static void main(String[] args) {

        String[] guests = new String[10];
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("You can choose one of the following options:");

            System.out.println("1 - Display all guests");
            System.out.println("2 - Add Guest");
            System.out.println("3 - Remove Guest");
            System.out.println("4 - Exit");

            System.out.print("Type Option 1, 2, 3 or 4: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                displayGuests(guests);
            }
             else if (choice == 2) {
                addGuests(guests);
            }
            else if(choice == 3){
              removeGuests(guests);
            }
            else if(choice == 4){
                break;
            }
        }
    }

    public static void displayGuests(String [] guests){
        System.out.println();
        System.out.println("These are the guests:");

        int j = 0;


        for(int i = 0; i<guests.length;i++){

            if(guests[i] != null) {
                System.out.println((j+1) + ". "+ guests[i]);
                j++;
            }
        }

       for(int k = 0; k < guests.length; k++){
            if(guests[k] == null) {
                System.out.println((j+1) + ".--");
                j++;
            }
        }
    }
    public static void removeGuests(String [] guests){

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the name you want to remove:");
        String name = s.next();
        for(int i = 0; i<guests.length; i++){
            if(guests[i].equals(name)){
                guests[i] = null;
                break;
            }
        }
    }
    public static void addGuests(String [] guests){
        Scanner s = new Scanner(System.in);
        for(int i = 0; i<guests.length; i++){
            if(guests[i] == null){
                System.out.print("Enter the name you want to add:");
                guests[i] = s.next();
                break;
            }
            if(i == guests.length-1){
                System.out.println("Sorry no more space.");
            }
        }
    }


}
