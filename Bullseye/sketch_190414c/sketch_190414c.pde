void setup(){
  draw();
  size(800,400);
    for(int i=8;i>0;i--){
      if(i%2==0){
        fill(255,0,0);
        ellipse(100,100,10*i,10*i);
      }
      else if(i%2==1){
        fill(0,0,0);
        ellipse(100,100,10*i,10*i);
      }
    }
  
}