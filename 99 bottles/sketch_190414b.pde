  void setup(){
 
    for(int i=99;i>-1;i--){
      int j=i-1;
      if(i==2){
        println("2 bottles of beer on the wall, 2 bottles of beer.");
        println("Take one down and pass it around, 1 bottle of beer on the wall.");
      }
      else if(i==1){
        println("1 bottle of beer on the wall, 1 bottle of beer.");
        println("Take one down and pass it around, no more bottles of beer on the wall");
      }
      else if(i==0){
        println("No more bottles of beer on the wall, no more bottles of beer.");
        println("Go to the store and buy some more, 99 bottles of beer on the wall.");
      }
      else{
      println(i+" bottles of beer on the wall, "+i+" bottles of beer.");
      println("Take one down and pass it around, "+j+" bottles of beer on the wall.");
      }
    }
    
  };