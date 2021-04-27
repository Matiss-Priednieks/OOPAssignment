package ie.tudublin;
import processing.core.PVector;


public class Menu extends Pongrave
{
    Pongrave Pongrave;
    PVector menubox;
    PVector buttonsize;
    PVector buttonloc;
    String buttontext;

    public Menu(Pongrave pongrave, int gap, String buttontext) {
        Pongrave = pongrave;
        menubox = new PVector(Pongrave.width/4, Pongrave.height/1.5f);
        buttonsize = new PVector(Pongrave.width/4 - 50, Pongrave.height/10);
        buttonloc = new PVector(Pongrave.width/2, gap);
        this.buttontext = buttontext;

    }

    // void Setup()
    // {
    //     menubox = new PVector(Pongrave.width/4, height - 50);
    // }

    void render()
    {
        Pongrave.pushMatrix();
        Pongrave.rectMode(CENTER);
        Pongrave.colorMode(RGB);
        Pongrave.fill(0);
        Pongrave.stroke(255);
        Pongrave.strokeWeight(5);
        Pongrave.rect(Pongrave.width/2, Pongrave.height/2, menubox.x, menubox.y);
        Pongrave.popMatrix();
    }

    void button()
    {
        Pongrave.pushMatrix();
        Pongrave.rectMode(CENTER);
        Pongrave.colorMode(RGB);
        Pongrave.fill(0);
        Pongrave.stroke(255);
        Pongrave.strokeWeight(5);
        Pongrave.rect(buttonloc.x, buttonloc.y, buttonsize.x, buttonsize.y);
        Pongrave.popMatrix();

        Pongrave.pushMatrix();
        Pongrave.textAlign(CENTER);
        Pongrave.textSize(50);
        Pongrave.fill(255);
        Pongrave.text(buttontext, buttonloc.x, buttonloc.y + buttonsize.y/4);
        Pongrave.popMatrix();
    }

    // public void mousePressed()
    // {

    // }

}
