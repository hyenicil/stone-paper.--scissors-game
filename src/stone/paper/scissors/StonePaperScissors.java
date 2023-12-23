
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {

        mainMenu();
    }

    private static ArrayList<String> scores = new ArrayList<>();

    private static void scores () {

        if (scores.isEmpty()) {
            System.out.println("There is no score.");
        } else {
            System.out.println("Scores:");
            Collections.sort(scores);

            for (String score : scores) {
                System.out.println(score);
            }
        }
        mainMenu();
    }
    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        printFirstMenus();;
        int begin = input.nextInt();
        switch (begin) {
            case 1:
                newGame();
                break;
            case 2:
                scores();
                break;
            case 3:
                System.out.println("Game is closing.");
                System.exit(0);
                break;
            default:
                System.out.println("You chose wrong number.");
                mainMenu();
        }

    }
    public static void printFirstMenus() {
        System.out.println("1->New Game");
        System.out.println("2->Scores");
        System.out.println("3->Exit");
        System.out.println("Choose:");
    }
    public static void printSecondMenus() {
        System.out.println("Welcome to rock, paper, scissors game.");
        System.out.println("1->STONE");
        System.out.println("2->SCISSORS");
        System.out.println("3->PAPER");
        System.out.println("4->Main Menu");
        System.out.println("Please chose a number:");
    }

    public static String glopalPrint(int a) {
       return  switch (a){
            case 1 ->"STONE";
            case 2 ->"SCISSORS";
            default -> "PAPER";
        };
    }


    public static void printStatus(int choosen, int pc,String message)
    {
        System.out.println("You chose->"+ glopalPrint(choosen) + " Pc chose->"+ glopalPrint(pc));
        System.out.println(message);
    }
    public static void newGame() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int score = 0;
        while (a == 0) {
            printSecondMenus();
            int choosen = input.nextInt();
            int pc = (int) (1 + Math.random() * 3);
            if (choosen == 4) {
                mainMenu();
            }
            if (pc == choosen) {
                if (choosen == 1) {
                    printStatus(choosen, pc, "Draw.");
                } else if (choosen == 2) {
                    printStatus(choosen, pc, "Draw.");
                } else if (choosen == 3) {
                    printStatus(choosen, pc, "Draw.");
                }

            }else if (choosen == 1 && pc == 2) {
                    printStatus(choosen, pc, "You won.");
                    score += 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                } else if (choosen == 1 && pc == 3) {
                    printStatus(choosen, pc, "You lost.");
                    score -= 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                } else if (choosen == 2 && pc == 1) {
                    printStatus(choosen, pc, "You lost.");
                    score -= 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                } else if (choosen == 2 && pc == 3) {
                    printStatus(choosen, pc, "You won.");
                    score += 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                } else if (choosen == 3 && pc == 1) {
                    printStatus(choosen, pc, "You won.");
                    score += 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                } else if (choosen == 3 && pc == 2) {
                    printStatus(choosen, pc, "You won.");
                    score -= 10;
                    System.out.println("You win.\nYour point is " + score);
                    scores.add("Point: " + score);
                }
            }
        }
    }
