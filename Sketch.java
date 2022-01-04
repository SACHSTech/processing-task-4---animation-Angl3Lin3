import processing.core.PApplet;

public class Sketch extends PApplet {

  public float radius = 250;
  public float angle1 = 0;
  public float angle2 = -110;
  public float circleX1;
  public float circleY1;
  public float circleX2;
  public float circleY2;
  public float colour1 = 219;
  public float colour2 = 156;

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(31, 156, 219);
  }

  public void draw() {

	  if(circleY1 == 150){
      background(31, 156, 219);
    }
  
    if(circleY2 < 500){
      background(0);
      colour1 = 219;
      colour2 = 156;
      stroke(225);
      fill(225);
  
      ellipse(40, 70, 5, 5);
      ellipse(80, 30, 5, 5);
      ellipse(100, 90, 5, 5);
      ellipse(130, 50, 5, 5);
      ellipse(70, 190, 5, 5);
      ellipse(150, 200, 5, 5);
      ellipse(170, 20, 5, 5);
      ellipse(210, 180, 5, 5);
      ellipse(240, 90, 5, 5);
      ellipse(280, 230, 5, 5);
      ellipse(330, 170, 5, 5);
      ellipse(360, 60, 5, 5);
    }

    if(circleY1 < 300){
      background(31, colour2, colour1);
      colour1-=2;
      colour2-=3;
    }

    stroke(19, 128, 79);
    fill(19, 128, 79);
    rect(0, 300, 400, 400);

    circleX1 = 200 + cos(angle1)*radius;
    circleY1 = 400 + sin(angle1)*radius;

    stroke(255, 177, 51);
    fill(255, 177, 51);
    ellipse(circleX1, circleY1, 50, 50);

    angle1 += PI/120;

    circleX2 = 200 + cos(angle2)*radius;
    circleY2 = 400 + sin(angle2)*radius;

    stroke(225);
    fill(225);
    ellipse(circleX2, circleY2, 50, 50);

    angle2 += PI/120;


    
  }

}