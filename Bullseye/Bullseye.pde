int ringNumber = 8;
void setup(){
size(1000, 1000);
background(50);
}
void draw(){
if(ringNumber % 2 == 0){
fill(255, 0, 0);
ellipse(500, 500, 100 * ringNumber, 100 * ringNumber);
}else {
fill(0, 0, 0);
ellipse(500, 500, 100 * ringNumber, 100 * ringNumber);
}
if(ringNumber > 0){
ringNumber = ringNumber - 1;
}
}