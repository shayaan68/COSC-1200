import javax.swing.*;
public class russianRouletteGUI extends JFrame{

    private JPanel mainPanel;

    private JLabel player1Label;
    private JLabel player2Label;
    private JLabel player3Label;
    private JLabel player4Label;
    private JLabel player5Label;

    private JLabel currentPlayerLabel;
    private JLabel skipsLabel;
    private JLabel statusLabel;

    private JButton triggerButton;
    private JButton skipButton;

    public russianRouletteGUI() {

        setTitle("Russian Roulette");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        mainPanel = new JPanel();
        mainPanel.setLayout(null);

        add(mainPanel);

        setupPlayers();
        setupGameControls();

        setVisible(true);
    }


private void setupPlayers() {

    player1Label = new JLabel("Player 1");
    player1Label.setBounds(150, 70, 150, 50);
    mainPanel.add(player1Label);

    player2Label = new JLabel("Player 2");
    player2Label.setBounds(430, 70, 150, 50);
    mainPanel.add(player2Label);

    player3Label = new JLabel("Player 3");
    player3Label.setBounds(730, 70, 150, 50);
    mainPanel.add(player3Label);

    player4Label = new JLabel("Player 4");
    player4Label.setBounds(200, 550, 150, 50);
    mainPanel.add(player4Label);

    player5Label = new JLabel("Player 5");
    player5Label.setBounds(650, 550, 150, 50);
    mainPanel.add(player5Label);
}

private void setupGameControls() {

    currentPlayerLabel = new JLabel("Current Player:");
    currentPlayerLabel.setBounds(50, 250, 300, 40);
    mainPanel.add(currentPlayerLabel);

    skipsLabel = new JLabel("Skips Left: 1");
    skipsLabel.setBounds(50, 290, 300, 40);
    mainPanel.add(skipsLabel);

    statusLabel = new JLabel("Game Started");
    statusLabel.setBounds(400, 400, 300, 40);
    mainPanel.add(statusLabel);

    triggerButton = new JButton("PULL TRIGGER");
    triggerButton.setBounds(400, 450, 180, 50);
    mainPanel.add(triggerButton);

    skipButton = new JButton("SKIP");
    skipButton.setBounds(600, 450, 120, 50);
    mainPanel.add(skipButton);
}


}