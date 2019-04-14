void setup(){
  noFill();
  size(800,400);
}

void draw(){
  noFill();
for(int i=24;i>0;i--){
      if(i%2==0){
        ellipse(80,100,10*i,10*i);
        ellipse(400,100,10*i,10*i);
      }
    }
}