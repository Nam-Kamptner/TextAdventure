package Window;

import javax.swing.*;
import java.awt.*;

public class drawWindow {
    JFrame window;
    int x, y;

    public drawWindow(int x, int y){
        window = new JFrame();
        this.x = x;
        this.y = y;
    }

    public void draw() {
        window.setSize(x, y);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
    }

}
