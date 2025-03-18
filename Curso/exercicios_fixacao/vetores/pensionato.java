import java.util.Scanner;

public class pensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] name = new String[10];
        String[] email = new String[10];
        int[] rooms = new int[10];
       

        for(int i = 0 ; i < n; i++){
            System.out.printf("Rent #%d\n", i + 1);
            System.out.print("Name: ");
            String nameSdy = sc.nextLine();
            System.out.print("Email: ");
            String emailSdy = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            name[room - 1] = nameSdy;
            email[room - 1] = emailSdy;
            rooms[room - 1] = room;
        }

        System.out.println("Busy rooms:");
        for(int i = 0 ; i < name.length; i++){
            if(rooms[i] != 0){
                System.out.printf("%d: %s, %s\n", (i+1), name[i], email[i]);
            }
        }

        sc.close();
    }
}
