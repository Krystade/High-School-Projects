//JackSchmid
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;


public class LoadImageApp extends Component {
    BufferedImage img;

    public void paint(Graphics g) {
        g.drawImage(img, 0, 0, null);
    }

    public LoadImageApp() {
       try {
           img = ImageIO.read(new File("Map\\Map.jpg"));
       } catch (IOException e) {
       }
    }
    
    public LoadImageApp(String image) {
       String path = "Map\\" + image + ".jpg";
       try {
           img = ImageIO.read(new File(path));
       } catch (IOException e) {
       }
    }

    public Dimension getPreferredSize() {
        if (img == null) {
             return new Dimension(100,100);
        } else {
           return new Dimension(img.getWidth(null), img.getHeight(null));
       }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("Map");
        f.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                }
        });
        f.add(new LoadImageApp());
        f.pack();
        f.setVisible(true);
    }
}