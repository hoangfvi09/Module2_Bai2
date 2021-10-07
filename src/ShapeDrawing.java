import java.util.Scanner;

public class ShapeDrawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        String shape="";
//        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw the rectangle");
            System.out.println("2. Draw the square triangle");
            System.out.println("3. Draw the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    for(int i=0;i<4;i++){
                        for(int j=0;j<20;j++){
                            shape+="*";
                        }
                        shape+="\n";
                    }
                    System.out.println(shape);
                    break;
                case 2:
                    for(int i=1;i<7;i++){
                        for(int j=0;j<i;j++){
                            shape+="*";
                        }
                        shape+="\n";
                    }
                    System.out.println(shape);
                    break;
                case 3:
                    for(int i=3;i>=0;i--){
                        for(int j=i;j>0;j--){
                            shape+=" ";
                        }
                        for(int m=7-(2*i);m>0;m--){
                            shape+="*";
                        }
                        shape+="\n";

                    }
                    System.out.println(shape);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

    }
}
