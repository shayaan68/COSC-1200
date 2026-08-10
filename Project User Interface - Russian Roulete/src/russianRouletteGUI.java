import java.awt.*;
import javax.swing.*;

public class russianRouletteGUI extends JFrame {

    private JPanel mainPanel;

    private JComboBox<String> playerCountBox;
    private JButton continueButton;

    private JTextField[] nameFields;

    private JLabel currentPlayerLabel;
    private JLabel skipsLabel;
    private JLabel statusLabel;

    private JButton triggerButton;
    private JButton skipButton;

    private int playerCount;
    private String[] playerNames;

    private runRounds rounds;
    private getSkipsLeft skips;
    private getGunResult gun;
    private getPlayerStatus playerStatus;

    private BalloonPanel[] balloons;

    private JLabel gunLabel;


    public russianRouletteGUI() {

        setTitle("Russian Roulette");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        add(mainPanel);

        setupPlayerCountScreen();

        setVisible(true);
    }


 
    // PLAYER COUNT SCREEN
    
    private void setupPlayerCountScreen() {

        mainPanel.removeAll();


        JLabel titleLabel =
            new JLabel("RUSSIAN ROULETTE");

        titleLabel.setFont(
            new Font("Arial", Font.BOLD, 30)
        );

        titleLabel.setBounds(
            340,
            80,
            350,
            50
        );

        mainPanel.add(titleLabel);


        JLabel playerCountLabel =
            new JLabel("How many players are playing?");

        playerCountLabel.setBounds(
            350,
            180,
            300,
            40
        );

        mainPanel.add(playerCountLabel);


        String[] options = {
            "2",
            "3",
            "4",
            "5"
        };


        playerCountBox =
            new JComboBox<>(options);

        playerCountBox.setBounds(
            430,
            230,
            100,
            40
        );

        mainPanel.add(playerCountBox);


        continueButton =
            new JButton("Continue");

        continueButton.setBounds(
            400,
            300,
            160,
            45
        );

        mainPanel.add(continueButton);


        continueButton.addActionListener(e -> {

            playerCount =
                Integer.parseInt(
                    (String)
                    playerCountBox.getSelectedItem()
                );

            setupNameScreen();
        });


        mainPanel.repaint();
        mainPanel.revalidate();
    }


    // PLAYER NAME SCREEN

    private void setupNameScreen() {

        mainPanel.removeAll();

        nameFields =
            new JTextField[playerCount];


        JLabel titleLabel =
            new JLabel("ENTER PLAYER NAMES");

        titleLabel.setFont(
            new Font("Arial", Font.BOLD, 25)
        );

        titleLabel.setBounds(
            350,
            40,
            350,
            50
        );

        mainPanel.add(titleLabel);


        for (int i = 0;
             i < playerCount;
             i++) {

            JLabel nameLabel =
                new JLabel(
                    "Player "
                    + (i + 1)
                    + " Name:"
                );


            nameLabel.setBounds(
                250,
                120 + (i * 60),
                150,
                40
            );

            mainPanel.add(nameLabel);


            nameFields[i] =
                new JTextField();


            nameFields[i].setBounds(
                400,
                120 + (i * 60),
                180,
                40
            );

            mainPanel.add(
                nameFields[i]
            );
        }


        JButton startButton =
            new JButton("Start Game");


        startButton.setBounds(
            320,
            150 + (playerCount * 60),
            200,
            45
        );

        mainPanel.add(startButton);


        startButton.addActionListener(e -> {

            playerNames =
                new String[playerCount];


            for (int i = 0;
                 i < playerCount;
                 i++) {

                playerNames[i] =
                    nameFields[i].getText();

            }

            startGame();
        });


        mainPanel.repaint();
        mainPanel.revalidate();
    }

   
    // START GAME

    private void startGame() {

        rounds =
            new runRounds();

        skips =
            new getSkipsLeft(
                playerCount
            );

        gun =
            new getGunResult();

        playerStatus =
            new getPlayerStatus(
                playerCount
            );


        setupGameScreen();
    }


 
    // GAME SCREEN
 
    private void setupGameScreen() {

        mainPanel.removeAll();


        JLabel titleLabel =
            new JLabel("RUSSIAN ROULETTE");

        titleLabel.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                26
            )
        );

        titleLabel.setBounds(
            370,
            10,
            350,
            50
        );

        mainPanel.add(titleLabel);


        // Player balloons
        balloons =
            new BalloonPanel[playerCount];


        for (int i = 0;
             i < playerCount;
             i++) {

            balloons[i] =
                new BalloonPanel(
                    playerNames[i]
                );

            mainPanel.add(
                balloons[i]
            );
        }


        // Balloon positions
        if (playerCount >= 1) {

            balloons[0].setBounds(
                60,
                80,
                160,
                220
            );
        }


        if (playerCount >= 2) {

            balloons[1].setBounds(
                260,
                50,
                160,
                220
            );
        }


        if (playerCount >= 3) {

            balloons[2].setBounds(
                460,
                80,
                160,
                220
            );
        }


        if (playerCount >= 4) {

            balloons[3].setBounds(
                150,
                330,
                160,
                220
            );
        }


        if (playerCount >= 5) {

            balloons[4].setBounds(
                390,
                330,
                160,
                220
            );
        }


        // Gun placeholder
        gunLabel =
            new JLabel("GUN");

        gunLabel.setFont(
            new Font(
                "Arial",
                Font.BOLD,
                45
            )
        );

        gunLabel.setBounds(
            730,
            210,
            200,
            100
        );

        mainPanel.add(gunLabel);


        // Current Player
        currentPlayerLabel =
            new JLabel();

        currentPlayerLabel.setBounds(
            680,
            330,
            280,
            40
        );

        mainPanel.add(
            currentPlayerLabel
        );


        // Skip label
        skipsLabel =
            new JLabel();

        skipsLabel.setBounds(
            680,
            370,
            250,
            40
        );

        mainPanel.add(
            skipsLabel
        );


        // Status
        statusLabel =
            new JLabel(
                "Game Started"
            );

        statusLabel.setBounds(
            680,
            410,
            280,
            40
        );

        mainPanel.add(
            statusLabel
        );


        // Pull Trigger
        triggerButton =
            new JButton(
                "PULL TRIGGER"
            );

        triggerButton.setBounds(
            680,
            480,
            140,
            50
        );

        mainPanel.add(
            triggerButton
        );


        // Skip
        skipButton =
            new JButton(
                "SKIP"
            );

        skipButton.setBounds(
            830,
            480,
            100,
            50
        );

        mainPanel.add(
            skipButton
        );


        triggerButton.addActionListener(e -> {

            pullTrigger();

        });


        skipButton.addActionListener(e -> {

            useSkip();

        });


        updateScreen();

        mainPanel.repaint();
        mainPanel.revalidate();
    }


   
    // PULL TRIGGER
   

    private void pullTrigger() {

        int currentPlayer =
            rounds.getCurrentPlayer();


        boolean playerDied =
            gun.pullTrigger();


        if (playerDied) {

            statusLabel.setText(
                playerNames[currentPlayer]
                + " has died!"
            );


            // Pop balloon
            balloons[currentPlayer]
                .popBalloon();


            // Mark dead
            playerStatus.playerDied(
                currentPlayer
            );


            // Reset all skips
            skips.resetSkips();


            // Check winner
            if (
                playerStatus.getAliveCount()
                == 1
            ) {

                gameOver();

                return;
            }

        }

        else {

            statusLabel.setText(
                playerNames[currentPlayer]
                + " survived!"
            );
        }


        nextLivingPlayer();

        updateScreen();
    }


  
    // SKIP
    
    private void useSkip() {

        int currentPlayer =
            rounds.getCurrentPlayer();


        if (
            skips.useSkip(
                currentPlayer
            )
        ) {

            statusLabel.setText(
                playerNames[currentPlayer]
                + " used their skip."
            );


            nextLivingPlayer();

            updateScreen();

        }

        else {

            statusLabel.setText(
                playerNames[currentPlayer]
                + " already used their skip."
            );
        }
    }


   
    // NEXT LIVING PLAYER
    
    private void nextLivingPlayer() {

        rounds.nextPlayer(
            playerCount
        );


        while (
            !playerStatus.isAlive(
                rounds.getCurrentPlayer()
            )
        ) {

            rounds.nextPlayer(
                playerCount
            );
        }
    }


    
    // UPDATE GUI
    

    private void updateScreen() {

        int currentPlayer =
            rounds.getCurrentPlayer();


        currentPlayerLabel.setText(
            "Current Player: "
            + playerNames[currentPlayer]
        );


        skipsLabel.setText(
            "Skips Left: "
            + skips.getSkipsLeft(
                currentPlayer
            )
        );


        // Update which balloon is current
        for (int i = 0;
             i < balloons.length;
             i++) {

            balloons[i]
                .setCurrentPlayer(
                    i == currentPlayer
                );
        }
    }


    
    // GAME OVER
    
    private void gameOver() {

        int winner =
            playerStatus.getWinner();


        int choice =
            JOptionPane.showConfirmDialog(
                this,

                playerNames[winner]
                + " is the winner!"
                + "\nWould you like to play again?",

                "Game Over",

                JOptionPane.YES_NO_OPTION
            );


        if (
            choice ==
            JOptionPane.YES_OPTION
        ) {

            setupPlayerCountScreen();

        }

        else {

            System.exit(0);
        }
    }


    
    // BALLOON CLASS
    

    private class BalloonPanel
        extends JPanel {

        private String playerName;

        private boolean popped =
            false;

        private boolean currentPlayer =
            false;


        public BalloonPanel(
            String playerName
        ) {

            this.playerName =
                playerName;

            setOpaque(false);
        }


        public void popBalloon() {

            popped = true;

            repaint();
        }


        public void setCurrentPlayer(
            boolean currentPlayer
        ) {

            this.currentPlayer =
                currentPlayer;

            repaint();
        }


        @Override
        protected void paintComponent(
            Graphics g
        ) {

            super.paintComponent(g);


            if (!popped) {

                // Balloon
                g.fillOval(
                    25,
                    10,
                    100,
                    120
                );


                // Balloon string
                g.drawLine(
                    75,
                    130,
                    75,
                    170
                );


                // Show turn indicator
                if (currentPlayer) {

                    g.drawString(
                        "CURRENT",
                        45,
                        190
                    );
                }


                // Player name
                g.drawString(
                    playerName,
                    45,
                    210
                );

            }

            else {

                g.setFont(
                    new Font(
                        "Arial",
                        Font.BOLD,
                        25
                    )
                );


                g.drawString(
                    "POP!",
                    50,
                    80
                );


                g.setFont(
                    new Font(
                        "Arial",
                        Font.PLAIN,
                        12
                    )
                );


                g.drawString(
                    playerName,
                    45,
                    210
                );
            }
        }
    }
}