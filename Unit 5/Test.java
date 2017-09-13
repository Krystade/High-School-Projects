import java.awt.*;
import javax.imageio.*;
import java.io.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
//JackSchmid
public class Test {
    public static void main(String[] args){
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("Map.jpg"));
        } catch (IOException e) {
        }
    }
}