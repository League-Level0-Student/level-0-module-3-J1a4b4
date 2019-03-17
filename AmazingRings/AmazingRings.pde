int xI = 0;
int xII = 1000;
void setup(){
size(1000, 1000);
}
void draw(){
background(100);
for(int i = 50; i > 0; i--){
noFill();
ellipse(xI, 500, i*10, i*10);
}

xI = xI + 1;
if(xI>1000){
xI = 0;
}
for(int j = 50; j > 0; j--){
noFill();
ellipse(xII, 500, j*10, j*10);
}
xII = xII - 1;
if(xII<0){
xII = 1000;
}
}