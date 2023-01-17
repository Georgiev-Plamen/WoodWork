import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the board:");
        double lengthOfBoard = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width of the board:");
        double widthOfBoard = Double.parseDouble(scanner.nextLine());

        boolean boardWidthSideLonger = false;

        double biggerSideOfBoard = 0;
        if (lengthOfBoard >= widthOfBoard) {
            biggerSideOfBoard = lengthOfBoard;
        } else {
            biggerSideOfBoard = widthOfBoard;
            boardWidthSideLonger = true;
        }

        double boardFace = lengthOfBoard * widthOfBoard;

        System.out.println("Enter the length of the first piece:");
        double lengthFirstPiece = Double.parseDouble(scanner.nextLine());

        System.out.println("Enter the width of the first piece:");
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

        System.out.printf("from the bord remains: %.2f x %.2f", lengthOfBoard, widthOfBoard  );



    }
}
