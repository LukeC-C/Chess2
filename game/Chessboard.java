package unit5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author lukecc
 */

public class Chessboard extends JFrame implements ActionListener {

    JButton[][] arr = new JButton[10][10];

    public Chessboard() {
        final int WIDTH = 500;
        final int HEIGHT = 500;
        final JLabel chessboard = new JLabel();

        setBounds(0, 0, WIDTH + (int) ((WIDTH / 4) / 10), HEIGHT + 37 /* please don't ask me why its 37, jButtons are a pain */);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // making the array of jbuttons for the chessboard
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    arr[i][j] =  new JButton();
                    arr[i][j].setBounds(0 + (WIDTH / 10 * i), 0 + (HEIGHT / 10 * j), WIDTH / 10, HEIGHT / 10);
                    arr[i][j].setBackground(Color.RED);
                    arr[i][j].addActionListener(this);
                    // thanks stackoverflow (@Jeff B)
                        arr[i][j].setOpaque(false);
                        arr[i][j].setContentAreaFilled(false);
                        arr[i][j].setBorderPainted(false);
                    this.add(arr[i][j]);
                } else if (i % 2 == 1 && j % 2 == 1) {
                    arr[i][j] = new JButton();
                    arr[i][j].setBounds(0 + (WIDTH / 10 * i), 0 + (HEIGHT / 10 * j), WIDTH / 10, HEIGHT / 10);
                    arr[i][j].setBackground(Color.RED);
                    arr[i][j].addActionListener(this);
                    arr[i][j].setOpaque(false);
                    arr[i][j].setContentAreaFilled(false);
                    arr[i][j].setBorderPainted(false);
                    this.add(arr[i][j]);
                } else {
                    arr[i][j] = new JButton();
                    arr[i][j].setBounds(0 + (WIDTH / 10 * i), 0 + (HEIGHT / 10 * j), WIDTH / 10, HEIGHT / 10);
                    arr[i][j].addActionListener(this);
                    arr[i][j].setOpaque(false);
                    arr[i][j].setContentAreaFilled(false);
                    arr[i][j].setBorderPainted(false);
                    this.add(arr[i][j]);
                }
            }
        }

        ImageIcon im = new ImageIcon("C:\\Users\\User\\Desktop\\ICS3U\\unit5\\Chessboard.png");
        chessboard.setIcon(im);
        chessboard.setBounds(0, 0, WIDTH, HEIGHT);
        this.add(chessboard);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (e.getSource() == arr[i][j]){
                    // arr[i][j].setText(i + ", " + j);
                    System.out.println(i + ", " + j);
                }
            }
        }
    }

    
    public static void main(String[] args) {
        new Chessboard();
    }
    
}
