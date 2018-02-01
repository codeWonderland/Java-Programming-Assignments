package me.codewonderland.lab11;

/**
 * Created by aliceeaster on 4/13/17.
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

// A two-player version of Tic Tac Toe
public class TicTacToeApp {

    // Whether it is X's turn
    boolean itIsXsTurn = true;

    // The actual game board.
    // 0 = the square is unfilled
    // 1 = there is an X (player 1)
    // 2 = there is an O (player 2)
    // Initially, the board starts unfilled
    // Note board[1][1] refers to the center square
    int[][] board = {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
    };

    // The window frame
    JFrame frame;

    // Create the GUI
    public void createAndShowGUI() {
        // Every application starts with a window frame
        frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new GridLayout(3,3));

        // Put the GUI here
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                TicTacToeCell cell = new TicTacToeCell(j, i);
                frame.getContentPane().add(cell);
                cell.addActionListener(new CellListener());
            }
        }

        // Size the window and show it
        frame.getContentPane().setPreferredSize(new Dimension(300, 300));
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.toFront();
    }

    class CellListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // The cell that the user clicked
            TicTacToeCell c = (TicTacToeCell) e.getSource();

            if (didPlayerWin(1)) {
                JOptionPane.showMessageDialog(frame, "X wins three in a row!");
            } else if (didPlayerWin(2)) {
                JOptionPane.showMessageDialog(frame, "O wins three in a row!");
            } else {
                // Put code here that executes when a cell is clicked
                if (c.mark == 0) {
                    if (itIsXsTurn) {
                        c.mark = 1;
                        board[c.row][c.column] = 1;
                    } else {
                        c.mark = 2;
                        board[c.row][c.column] = 2;
                    }
                    itIsXsTurn = !itIsXsTurn;
                    c.repaint();
                }
            }

            if (didPlayerWin(1)) {
                JOptionPane.showMessageDialog(frame, "X wins three in a row!");
            } else if (didPlayerWin(2)) {
                JOptionPane.showMessageDialog(frame, "O wins three in a row!");
            }
        }
    }

    public boolean didPlayerWin(int n) {
        if (board[0][0] == n && board[0][1] == n && board[0][2] == n) {
            return true;
        } else if (board[1][0] == n && board[1][1] == n && board[1][2] == n) {
            return true;
        } else if (board[2][0] == n && board[2][1] == n && board[2][2] == n) {
            return true;
        } else if (board[0][0] == n && board[1][1] == n && board[2][2] == n) {
            return true;
        } else if (board[2][0] == n && board[1][1] == n && board[0][2] == n) {
            return true;
        } else if (board[0][0] == n && board[0][1] == n && board[0][2] == n) {
            return true;
        } else if (board[1][0] == n && board[1][1] == n && board[1][2] == n) {
            return true;
        } else if (board[2][0] == n && board[2][1] == n && board[2][2] == n) {
            return true;
        }
        return false;
    }

    // Create the application and show it
    public static void main(String[] args) {
        TicTacToeApp application = new TicTacToeApp();
        application.createAndShowGUI();
    }
}