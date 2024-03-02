public class 1Room {
	int height;
	int width;
	int breadth;

			// Constructor
	public 1Room(int h, int w, int b) {
	height = h;
	width = w;
	breadth = b;
	}

			// Method to calculate the volume of the room
	public int volume() {
		return height * width * breadth;
	}

	public static void main(String[] args) {
			// Create an instance of Room
	Room myRoom = new 1Room(3,4,5);

			// Display the volume of the room
        System.out.println("Volume of the room: " + myRoom.volume() + " cubic units");
    }
}
