package Homework;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BattleshipMenu extends JFrame {

    public BattleshipMenu() {
        initializeUI();
    }

    private void initializeUI() {
        setTitle("Battleships Game");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLACK);

        // Layout manager
        setLayout(new BorderLayout(10, 20));

        // Title
        JLabel titleLabel = new JLabel("Battleships", SwingConstants.CENTER);
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 48)); // Increased font size to make the title taller
        add(titleLabel, BorderLayout.NORTH);

        // Panel for buttons, with vertical alignment
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 1, 10, 20)); // Adjusted vertical spacing
        buttonPanel.setOpaque(false); // To keep the black background

        // Join Game Button
        JButton joinButton = new JButton("Join Game");
        joinButton.setFont(new Font("Arial", Font.BOLD, 18));
        joinButton.setPreferredSize(new Dimension(200, 50)); // Explicitly set the size of the buttons
        joinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Join Game clicked!");
                // TODO: Add your action here
            }
        });

        // Create Game Button
        JButton createButton = new JButton("Create Game");
        createButton.setFont(new Font("Arial", Font.BOLD, 18));
        createButton.setPreferredSize(new Dimension(200, 50)); // Ensure both buttons are the same size
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Create Game clicked!");
                // TODO: Add your action here
            }
        });

        buttonPanel.add(joinButton);
        buttonPanel.add(createButton);

        // Adding panel to the frame, centered
        add(buttonPanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new BattleshipMenu().setVisible(true);
            }
        });
    }
}

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class BattleshipMenu extends JFrame {
//
//    public BattleshipMenu() {
//        initializeUI();
//    }
//
//    private void initializeUI() {
//        setTitle("Battleship Game");
//        setSize(400, 300); // Adjusted the size to give more space
//        setLocationRelativeTo(null);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        getContentPane().setBackground(Color.BLACK);
//
//        // Layout manager
//        setLayout(new BorderLayout(10, 20)); // Added spacing between components
//
//        // Title
//        JLabel titleLabel = new JLabel("Battleship", SwingConstants.CENTER);
//        titleLabel.setForeground(Color.WHITE);
//        titleLabel.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 36)); // Made the font more artistic
//        add(titleLabel, BorderLayout.NORTH);
//
//        // Panel for buttons, with vertical alignment
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new GridLayout(2, 1, 10, 10)); // Changed to 2 rows for vertical alignment
//        buttonPanel.setOpaque(false); // To keep the black background
//
//        // Join Game Button
//        JButton joinButton = new JButton("Join Game");
//        joinButton.setFont(new Font("Arial", Font.BOLD, 18));
//        joinButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Join Game clicked!");
//                // TODO: Add your action here
//            }
//        });
//
//        // Create Game Button
//        JButton createButton = new JButton("Create Game");
//        createButton.setFont(new Font("Arial", Font.BOLD, 18));
//        createButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Create Game clicked!");
//                // TODO: Add your action here
//            }
//        });
//
//        buttonPanel.add(joinButton);
//        buttonPanel.add(createButton);
//
//        // Adding panel to the frame, centered
//        add(buttonPanel, BorderLayout.CENTER);
//    }
//
//    public static void main(String[] args) {
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
//                new BattleshipMenu().setVisible(true);
//            }
//        });
//    }
//}

