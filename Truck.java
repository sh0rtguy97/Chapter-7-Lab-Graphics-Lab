import java.awt.*;
import java.applet.*;

class Truck
{
    public static void drawWheels(Graphics g)
    {
        Expo.setColor(g,Expo.lightGrey);
        Expo.fillCircle(g,300,400,25);
        Expo.fillCircle(g,550,400,25);
    }
    public static void drawCab(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillRectangle(g,425,400,525,250);
        Expo.setColor(g,Expo.white);
        Expo.fillRectangle(g,440,325,510,260);
        Expo.setColor(g,Expo.black);
        Expo.drawLine(g,430,255,430,390);
        Expo.drawLine(g,430,390,505,390);
    }
    public static void drawTires(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.fillCircle(g,300,400,30);
        Expo.fillCircle(g,550,400,30);
    }
    public static void drawFenders(Graphics g)
    {
        Expo.setColor(g,Expo.black);
        Expo.fillArc(g,550,405,40,40,270,90);
        Expo.fillArc(g,300,405,40,40,270,90);
    }
    public static void drawBed(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillRectangle(g,225,400,425,325);
    }
    public static void drawHood(Graphics g)
    {
        Expo.setColor(g,Expo.red);
        Expo.fillRectangle(g,525,400,600,325);
    }
    public static void drawHeadlight(Graphics g)
    {
        Expo.setColor(g,Expo.lightYellow);
        Expo.fillArc(g,600,340,10,10,180,0);
    }
    public static void drawExhaust(Graphics g)
    {
        Expo.setColor(g,Expo.lightGrey);
        Expo.fillRectangle(g,410,325,425,250);
        Expo.fillArc(g,410,250,15,15,0,90);
        Expo.fillRectangle(g,405,250,415,235);
    }
    public static void drawTailights(Graphics g)
    {
        Expo.setColor(g,Expo.darkRed);
        Expo.fillRectangle(g,225,375,240,340);
    }
}