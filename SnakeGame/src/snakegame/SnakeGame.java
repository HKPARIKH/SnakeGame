package snakegame;
import javax.swing.*;
/**
 * @author Harsh Parikh^
 */
public class SnakeGame extends JFrame {
    SnakeGame() {
        super("Harsh's Snake Game"); //Page Title
        add(new Board());  //new panel
        pack(); //to load frames immidiatly even frame window is open 
        setLocationRelativeTo(null);
        setResizable(false);
    }
    public static void main(String[] args) {
        new SnakeGame().setVisible(true);
    }

}
