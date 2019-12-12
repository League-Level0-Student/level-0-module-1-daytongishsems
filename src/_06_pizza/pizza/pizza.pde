
void setup() {
      
size(500,500);
}
void draw() {
 
  fill(#F0CC94);
ellipse(250, 250, 450,450);

fill(#FF0A0A);
ellipse(250,250,380,380);  

fill(#F6FF00);
ellipse(250,250,300,300);   
      
PImage cheese = loadImage ("Download-Cheese-Transparent.png");
 cheese.resize(100,100);
image (cheese,100,150);
    
    PImage pepperoni = loadImage("pepperoni-transparent-3.png");
   pepperoni.resize(100,100);
    image(pepperoni, 200,200);
    
    
    
    
    
}
