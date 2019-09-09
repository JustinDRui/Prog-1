class Main {
  public static void main(String[] args) {
  final double segmentA =  1;
  final double  segmentB = 1;
  final double segmentC = 1;
  final double Track = 3;
  final double speedA = 20.0;
  final double speedB = 60.0;
  final double speedC = 30.0;
  double time = 0;
  //all instances of car name aceleration mph/s ,start time s
  Car A = new Car("A",10.23,0.0);
	Car B = new Car("B",10.23,60.0);
  Car C = new Car("C",10.23,120.0);
  //car array 
  Car[] allcars = new Car[] {A,B,C};
  //prints table
  A.printCartable(0,allcars);
  System.out.println();
  //track race until 300 secs

  for(;time<300;time+=.5){
    //do for all cars
    for(int i =0;i<allcars.length;i++){
      //if car has started do this otherwise ignore
      if(time>=allcars[i].getstarttime()){
        //if car is in seg a
        if(allcars[i].getdistance()<=segmentA){
          allcars[i].settopspeedA();
          allcars[i].setspeed(time-allcars[i].getstarttime());
          allcars[i].setdistance(time-allcars[i].getstarttime());
          allcars[i].setlocation(time-allcars[i].getstarttime());
        }
        //if car is in sec b
        if(allcars[i].getlocation()>segmentA && allcars[i].getlocation()<=segmentB){
          allcars[i].settopspeedB();
          allcars[i].setspeed(time-allcars[i].getstarttime());
          allcars[i].setdistance(time-allcars[i].getstarttime());
          allcars[i].setlocation(time-allcars[i].getstarttime());
        } 
        //if car is in seg c
        if(allcars[i].getdistance()>segmentB && allcars[i].getdistance()<=segmentC){
          allcars[i].settopspeedC();
          allcars[i].setspeed(time-allcars[i].getstarttime());
          allcars[i].setdistance(time-allcars[i].getstarttime());
          allcars[i].setlocation(time-allcars[i].getstarttime());
        }  
        
      }
    } 
      //print every 30 secs
      if (time % 30 ==0){
        A.updatetable(time,allcars);      
        System.out.println();
      }
      //System.out.println(time);
  }
  }
}