import javax.swing.*;


public class PKMNViewer {

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();

        frame.setSize(417,417);
        frame.setTitle("Pokemon Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PKMNGame component = new PKMNGame();
        frame.add(component);
        frame.setVisible(true);
    }
}