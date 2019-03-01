package br.com.cit.dojo.jogodavelha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isWinner = false;
        int countRound = 1;
        char[][] game = {{'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}};

        while (!isWinner && countRound <= 9) {
            int line = sc.nextInt();
            int column = sc.nextInt();

            if (countRound % 2 == 0)
                game[line][column] = 'O';
            else
                game[line][column] = 'X';
            printGame(game);
            countRound++;
            isWinner = verifyWinner(game);
        }

        System.out.println("Fim de jogo");
    }

    public static boolean verifyWinner(char[][] game) {

        if (game[0][0] == game[0][1] && game[0][0] == game[0][2] && game[0][0] != '-')
            return true;

        if (game[1][0] == game[1][1] && game[1][0] == game[1][2] && game[1][0] != '-')
            return true;

        if (game[2][0] == game[2][1] && game[2][0] == game[2][2] && game[2][0] != '-')
            return true;

        if (game[0][0] == game[1][0] && game[0][0] == game[2][0] && game[0][0] != '-')
            return true;

        if (game[0][1] == game[1][1] && game[0][1] == game[2][1] && game[0][1] != '-')
            return true;

        if (game[0][2] == game[1][2] && game[0][2] == game[2][2] && game[0][2] != '-')
            return true;

        if (game[0][0] == game[1][1] && game[0][0] == game[2][2] && game[0][0] != '-')
            return true;

        if (game[0][2] == game[1][1] && game[0][2] == game[2][0] && game[0][2] != '-')
            return true;

        return false;
    }


    public static void printGame(char[][] game) {
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.print(game[l][c]);

            }
            System.out.println();
        }
    }
}
