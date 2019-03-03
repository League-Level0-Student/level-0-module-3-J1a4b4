int bottles = 99;
int beer = 98;
int yval = 10;
void setup() {
size(900, 1000);
background(50);
}
void draw() {
text(bottles + " bottles of beer on the wall, " + bottles + "bottles of beer, take one down and pass it around, " + beer + " bottles of beer on the wall.", 0, yval);  
bottles = bottles - 1;
beer = beer - 1;
yval = yval + 10;
}