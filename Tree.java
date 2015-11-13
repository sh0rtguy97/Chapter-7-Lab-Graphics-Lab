import java.awt.*;
import java.applet.*;
class Tree
{
    public static void drawTrunk(Graphics g)
    {
        Expo.setColor(g,Expo.brown);
        Expo.fillRectangle(g,700,375,730,250);
    }
    public static void drawLeaves(Graphics g)
    {
        Expo.setColor(g,Expo.darkGreen);
        Expo.fillCircle(g,715,220,40);
    }
}
