package lesson4;



import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final int SIZE = 3;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';

    private static  char[][] MAP ;
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String HEADER_FIRST_SYMBOL = "♥";
    private static final String SPACE_MAP = " ";
    private static int turnsCount;

    public static void main(String[] args) {
        turnGame();
    }

    public static void turnGame() {
        do {
            System.out.println("/nИгра начинается!");
            init();
            printMap();
            playGame();
        } while (isContinueGame());
        endGame();
    }

    private static void init() {
        turnsCount = 0;
        MAP = new char[SIZE][SIZE];

        initMap();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHeader();
        printMapBody();
    }

    private static void printMapHeader() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP);
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            printMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)){
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)){
                break;
            }

            //возврат к пункту 1.
        }
    }

    private static void humanTurn() {
        System.out.println("Ход человека");

        int rowNumber;
        int columnNumber;

        while (true) {
            rowNumber = getValidNumber() - 1;
            columnNumber = getValidNumber() - 1;

            if (isCellFree(rowNumber, columnNumber)){
                break;
            }
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        turnsCount++;
    }

    private static int getValidNumber() {
        while (true){
            System.out.print("Введите координату(1 " + SIZE + "): ");
            if (in.hasNext()){
                int n = in.nextInt();
                if(isNumberValid(n)){
                    return n;
                }
                System.out.print("/n Проверьте значение координаты. 1 +" + SIZE);
            }else {
                in.next();
                System.out.println("/nВвод допускает лишь целые числа");
            }
        }

    }

    private static boolean isNumberValid(int n) {
        return n >= 1 && n <= SIZE;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;
    }

    private static void aiTurn() {
        System.out.println("Ход исскуственного интелекта");

        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(SIZE);
            columnNumber = random.nextInt(SIZE);


        }  while (!isCellFree(rowNumber, columnNumber));


        MAP[rowNumber][columnNumber] = DOT_AI;
        turnsCount++;
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)){
            if (symbol == DOT_HUMAN){
                System.out.println("/nВы чемпион");
            }else {
                System.out.println("Вы проиграли.");
            }
            return true;
        }
        if (checkDraw()){
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static boolean checkDraw() {

        return turnsCount >= SIZE * SIZE;
    }

    private static boolean checkWin(char symbol) {
        for (int i = 0; i < 3; i++)
            if ((MAP[i][0] == symbol && MAP[i][1] == symbol &&  MAP[i][2] == symbol) ||
                    (MAP[0][i] == symbol && MAP[1][i] == symbol &&
                            MAP[2][i] == symbol))
                return true;
        if ((MAP[0][0] == symbol && MAP[1][1] == symbol &&
                MAP[2][2] == symbol) ||
                (MAP[2][0] == symbol && MAP[1][1] == symbol &&
                        MAP[0][2] == symbol))
            return true;
        return false;
    }


    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? Y/N");
        return switch (in.next()) {
            case "Y"-> true;
            default -> false;
        };
    }

    private static void endGame() {
        in.close();
        System.out.println("Возвращайтесь еще!");
    }
}
