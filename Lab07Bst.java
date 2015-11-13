// Lab07Bst.java
// The OOP Graphics Program
// This is the student, starting file for Lab 07B.
// This is an "Open-Ended" asignment.


import java.awt.*;
import java.applet.*;


public class Lab07Bst extends Applet
{
    public void paint(Graphics g)
    {
        Background.drawSky(g);
        Background.drawPavement(g);
        Background.drawSun(g); //The big thing in the corner
        Background.drawLines(g); //Lines on the road
        Background.drawGrass(g); //Grass where the tree is located
        Truck.drawTires(g);
        Truck.drawWheels(g);
        Truck.drawCab(g);
        Truck.drawBed(g);
        Truck.drawHood(g);
        Truck.drawFenders(g);//Fenders to protect truck from mad mud fom the mad mud pits in Vernon
        Truck.drawHeadlight(g);//Lights to see through the mad fog in Vernon
        Truck.drawExhaust(g); //Smoke Stack becauz Vernon
        Truck.drawTailights(g); //
        Tree.drawTrunk(g);
        Tree.drawLeaves(g); // Leaves are really just a green circle
    }
}




