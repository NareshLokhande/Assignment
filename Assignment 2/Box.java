public class Box {
	int height;
	int width;
	int breadth;

			// Constructor
	public Box(int h, int w, int b) {
	height = h;
	width = w;
	breadth = b;
	}

			// Method to calculate the volume of the room
	public int getVolume() {
		return height * width * breadth;
	}
	
		// Method to calculate the Area of the room
	public int getArea() {
		return height * width + width * breadth + height *breadth;
	}

	public static void main(String[] args) {
			// Create an instance of Room
	Box mybox1 = new Box(4,4,5);
	Box mybox2 = new Box(5,7,8);

	// Display the volume and area of the Box1
	System.out.println("Volume of the Box1: " + mybox1.getVolume());
	System.out.println("Area of the Box1: " + mybox1.getArea());
	
	// Display the volume and area of the Box2
	System.out.println("Volume of the Box2: " + mybox2.getVolume());
	System.out.println("Area of the Box2: " + mybox2.getArea());
    
    }
}
