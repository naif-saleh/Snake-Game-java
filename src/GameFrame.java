import javax.swing.*;

public class GameFrame extends JFrame {

    GameFrame(){
         GamePanle panle = new GamePanle();
         this.add(new GamePanle());
         this.setTitle("Snake");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setResizable(false);
         this.pack();
         this.setVisible(true);
        // this.setLocationRelativeTo(null);
    }
}
