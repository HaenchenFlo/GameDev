package main;

import java.awt.*;
import java.awt.image.BufferedImage;

//Klasse für Voreinstellungen

public class Utility {

    public BufferedImage scaleImage(BufferedImage original, int width, int heigth) {

        BufferedImage scaledImage = new BufferedImage(width, heigth, original.getType());
        Graphics2D g2 = scaledImage.createGraphics();
        g2.drawImage(original, 0,0,width, heigth, null);
        g2.dispose();

        return scaledImage;
    }
}
