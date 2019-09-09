/* CS3331 Adv. Object Oriented Programming
 * Instructor: Dr. Roach
   Program 1
 * Last modified on [9/9/19]
 * Modified and submitted by: [Justin Ruiloba]
*/
//intial version taken from program 0 and changed into car class 9/5/19
//9/7 working on time update table and speed as well as location and distance
//9/9comments
//
//


//class for all cars
public class Car {
  //track distance in total
  final double Track = 3;
  //speeds in respective segments
  final double speedA = 20.0;
  final double speedB = 60.0;
  final double speedC = 30.0;
	//attributes of class 
	private  String name;
	private  double aceleration;
	private double distance =0.0;
  private double location =0.0;
	private double speed = 0;
	private double topspeed = 0;
  private double carstarttime;
	// This is the default constructor of the class Runner, no parameters
	public Car(){
		
	}
	
	
	
	// Create a full constructor that receives as variables all the attributes
	public Car(String name,Double aceleration,Double carstarttime){
		this.name = name;
		this.speed = 0;
		this.aceleration = aceleration;
		this.distance = 0;
    this.carstarttime = carstarttime;
    this.topspeed=0;
  }
	
	//Setters Here for name, top_speed, and aceleration 
	public void setname (String nameIn){
		this.name = nameIn;// complete with the code , use the word "this" as explained last lecture.
	}
	
	// Complete with the setters for genre, length and isRatedPG.
	public void setspeed (double time){
		this.speed = Math.min((this.aceleration*time),this.topspeed);// complete with the code , use the word "this" as explained last lecture.
	}
  public void settopspeedA (){
		this.topspeed = speedA;// complete with the code , use the word "this" as explained last lecture.
	}
  public void settopspeedB (){
		this.topspeed = speedB;// complete with the code , use the word "this" as explained last lecture.
	}
  public void settopspeedC (){
		this.topspeed = speedC ;// complete with the code , use the word "this" as explained last lecture.
	}
	
	public void setaceleration (double acelerationIn){
		this.aceleration = acelerationIn;// complete with the code , use the word "this" as explained last lecture.
	}
	public void setdistance(double time){
	//distance is given by velocity* time
    //if negative time ignore
    if(time<0){
      ;
    }
    else{
      //compute distance
      this.distance = (this.speed * time); 
    }
  }
  public void setlocation(double time){
	//velocity = aceleration * time or if the top speed has been reached must use top speed
    if(time<0){
      ;
    }
    else{
      this.location = (this.speed * time); 
    }
    
	}
  //when car starts
  public void setcarstarttime(double carstarttimein){
	//velocity = aceleration * time or if the top speed has been reached must use top speed
    this.carstarttime = carstarttimein;
    
	}
	
	//Create the Getter methods here.
	public String getname(){
		return this.name;// complete here, use the word "this".
	}
	
	public Double getspeed(){
		return this.speed;// complete here, use the word "this".
	}
	public Double getaceleration(){
		return this.aceleration;// complete here, use the word "this".
		}
    public Double getdistance(){
		return this.distance;// complete here, use the word "this".
		}
    public Double getlocation(){
		return this.location;// complete here, use the word "this".
		}
		public Double getstarttime(){
		return this.carstarttime;// complete here, use the word "this".
		}
	
	//prints Runner table columns
	public void printCartable(double time,Car[] allcars){
		System.out.print("Time\t"); 
    for(int i =0;i<allcars.length;i++){
      System.out.print("Car "+allcars[i].getname()+"\t\t\t\t");
    }
    System.out.println();
    System.out.print("\t\t");
    for(int j = 0;j<allcars.length;j++){
      System.out.print("speed\tlocation\t");
    }
    System.out.println();
    

  }
  //update data in table
  public void updatetable(double time,Car[] allcars){
    if(time<10){
      System.out.print(time+"\t\t");
    }
    else{
      System.out.print(time+"\t");
    }
    for(int k = 0;k<allcars.length;k++ ){
      System.out.print(allcars[k].getspeed()+"\t\t"+allcars[k].getlocation()+"\t\t\t");
    }




  }

    
  }
