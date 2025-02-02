public class  HotelBooking{
	private String guestName;
	private String roomType;
	private int nights;
	public  HotelBooking(){
		guestName = "guest";
		roomType = "normal";
		nights = 1;
	}
	public  HotelBooking(String name, String roomType, int nights){
		this.guestName= name;
		this.roomType = roomType;
		this.nights = nights;
	}
	public  HotelBooking(HotelBooking previousDetails){
		this.guestName= previousDetails.guestName;
		this.roomType = previousDetails.roomType;
		this.nights = previousDetails.nights;
	}
	public void display(){
		System.out.println("Name : " + guestName);
		System.out.println("RoomType : " + roomType);
		System.out.println("Number of Nights : " + nights);
	}	
	public static void main(String[] args){
		HotelBooking booking1 = new  HotelBooking();
		System.out.println("The details of Booking1 are : ");
		booking1.display();
		HotelBooking booking2 = new  HotelBooking("Rishabh" , "Delux" , 2);
		System.out.println("The details of Booking2 are : ");
		booking2.display();
		HotelBooking booking3 = new  HotelBooking(booking2);
		System.out.println("The details of the Booking3(copy of Booking2) are : ");
		booking3.display();
	}	
}