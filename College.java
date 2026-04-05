class College{
String place;
int blocks;
double ratings;

public College(){
System.out.println("Default Constructor");
}

public College(String place,int blocks, double ratings){
this.place = place;
this.blocks = blocks;
this.ratings = ratings;
}

public void display(){
System.out.println(place);
System.out.println(blocks);
System.out.println(ratings);
}
}