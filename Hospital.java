class Hospital{
String place;
int rooms;
double ratings;

    public Hospital(){
	System.out.println("Default Constructor");
	}
	
	public Hospital(String place, int room, double ratings){
	this.place = place;
	this.rooms = rooms;
	this.ratings = ratings;
	}
	
	public void display(){
	System.out.println(place);
	System.out.println(rooms);
	System.out.println(ratings);
	}
	}