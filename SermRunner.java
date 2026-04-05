class SerumRunner{
public static void main(String[] args){
Serum.getSerumName();
Serum.getQuality("Best");
int price = Serum.getPrice();
System.out.println(price);
int amt = Serum.getAmt(50, 60);
System.out.println(amt);
}
}