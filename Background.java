import java.awt.*;
import java.applet.*;
class Background
{
    public static void drawSky(Graphics g)
    {
        Expo.setColor(g,Expo.lightBlue);
        Expo.fillRectangle(g,0,0,1000,350);
    }
    public static void drawPavement(Graphics g) //Truck drives on it, but on left side cauz England
    {
        Expo.setColor(g,Expo.grey);
        Expo.fillRectangle(g,0,350,1000,650);
    }
    public static void drawSun(Graphics g)//Well, we all need a sun so life.
    {
        Expo.setColor(g,Expo.yellow);
        Expo.fillCircle(g,0,0,100);
        int x1=0;
        int y1=0;
        int x2=0;
        int y2=200;
        for(int ray = 1; ray <=10000; ray ++)//This is a forloop for the sun's rays :)
        {
            Expo.drawLine(g,x1,y1,x2,y2);
            y2 -=12;
            x2 +=20;
        }
    }
    public static void drawLines(Graphics g)//This is for the lines in the middle of the road
    {
            int x1 = 0;
            int y1 = 525;
            int x2 = 50;
            int y2 = 500;
        for(int line = 1; line <= 7; line ++)
        {
            Expo.setColor(g,Expo.yellow);
           x1 += 125;
           x2 += 125;
            Expo.fillRectangle(g,x1,y1,x2,y2);
        }
    }
    public static void drawGrass(Graphics g)
    {
        Expo.setColor(g,Expo.darkGreen);
        Expo.fillRectangle(g,0,390,1000,325);
    }
}