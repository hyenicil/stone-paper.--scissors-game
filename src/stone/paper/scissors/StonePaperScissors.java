package stone.paper.scissors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StonePaperScissors {

    private static ArrayList<String> scores = new ArrayList<>();

    public static void mainMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1->New Game");
        System.out.println("2->Scores");
        System.out.println("3->Exit");
        System.out.println("Choose:");
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

    public static void newGame() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        int score = 0;
        while (a == 0) {
            System.out.println("Welcome to rock, paper, scissors game.");

            System.out.println("1->STONE");
            System.out.println("2->SCISSORS");
            System.out.println("3->PAPER");
            System.out.println("4->Main Menu");
            System.out.println("Please chose a number:");
            int choosen = input.nextInt();
            int pc = (int) (1 + Math.random() * 3);
            if (choosen == 4) {
                mainMenu();
            }
            if (pc == choosen) {
                if (choosen == 1) {
                    System.out.println("You chose->Stone" + "  Pc chose->Stone");
                    System.out.println("Draw.");
                } else if (choosen == 2) {
                    System.out.println("You chose->Scissors" + "  Pc chose->Scissors");
                    System.out.println("Draw.");
                } else if (choosen == 3) {
                    System.out.println("You chose->Paper" + "  Pc chose->Paper");
                    System.out.println("Draw.");
                }

            } else if (choosen == 1 && pc == 2) {
                System.out.println("You chose->Stone" + "  Pc chose->Scissors");
                System.out.println("You won.");
                score += 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            } else if (choosen == 1 && pc == 3) {
                System.out.println("You chose->Stone" + "  Pc chose->Paper");
                System.out.println("You lost.");
                score -= 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            } else if (choosen == 2 && pc == 1) {
                System.out.println("You chose->Scissors" + "  Pc chose->Stone");
                System.out.println("You lost.");
                score -= 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            } else if (choosen == 2 && pc == 3) {
                System.out.println("You chose->Scissors" + "  Pc chose->Paper");
                System.out.println("You won.");
                score += 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            } else if (choosen == 3 && pc == 1) {
                System.out.println("You chose->Paper" + "  Pc chose->Stone");
                System.out.println("You won.");
                score += 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            } else if (choosen == 3 && pc == 2) {
                System.out.println("You chose->Paper" + "  Pc chose->Scissors");
                System.out.println("You lost.");
                score -= 10;
                System.out.println("You win.\nYour point is " + score);
                scores.add("Point: " + score);
            }
        }

    }

    private static void scores() {

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

    public static void main(String[] args) {

        mainMenu();
    }

}
