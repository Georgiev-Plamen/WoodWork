import java.util.Scanner;

public class WoodWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the board:");
       // double lengthOfBoard = Double.parseDouble(scanner.nextLine());
        double lengthOfBoard = 5.0;

        System.out.println("Enter the width of the board:");
        // double widthOfBoard = Double.parseDouble(scanner.nextLine());
        double widthOfBoard = 5.0;

        double boardFace = lengthOfBoard * widthOfBoard;
        System.out.printf("Face of bord is : %.2f square cm.%n%n", boardFace);

        boolean boardWidthSideLonger = false;

        double biggerSideOfBoard = 0;
        if (lengthOfBoard >= widthOfBoard) {
            biggerSideOfBoard = lengthOfBoard;
        } else {
            biggerSideOfBoard = widthOfBoard;
            boardWidthSideLonger = true;
        }

        double remainBoardFace = 1;
        int count = 1;

        while ( remainBoardFace >= 0) {   // Защо подяволите не спира като се ичерпи дъската ???

            System.out.printf("Enter the length of the piece: %d%n", count);
            double lengthFirstPiece = Double.parseDouble(scanner.nextLine());

            System.out.printf("Enter the width of the piece: %d%n", count);
            double widthFirstPiece = Double.parseDouble(scanner.nextLine());

            double firstPieceFace = lengthFirstPiece * widthFirstPiece;

            double biggerSideOfPiece = 0;
            double smallSideOfPiece = 0;
            boolean pieceWidthSideLonger = false;

            if (lengthFirstPiece > widthFirstPiece) {
                biggerSideOfPiece = lengthFirstPiece;
                smallSideOfPiece = widthFirstPiece;
            } else {
                biggerSideOfPiece = widthFirstPiece;
                smallSideOfPiece = lengthFirstPiece;
                pieceWidthSideLonger = true;
            }


            if (boardWidthSideLonger) {
                widthOfBoard -= biggerSideOfPiece;
                lengthOfBoard -= smallSideOfPiece;
            } else {
                lengthOfBoard -= biggerSideOfPiece;
                widthOfBoard -= smallSideOfPiece;
            }

            remainBoardFace = lengthOfBoard * widthOfBoard;

            System.out.printf("from the bord remains: %.2f cm. x %.2f cm.%n", lengthOfBoard, widthOfBoard  );
            System.out.printf("Face of remains bord is : %.2f square cm.%n%n", remainBoardFace);
            count++;
        }




    }
}
