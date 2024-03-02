public class Student {
	String name;
	int maths;
	int science;
	int history;
	
	public Student(String name1, int marks1, int marks2, int marks3) {
	name = name1;
	maths = marks1;
	science = marks2;
	history = marks3;

	}
	
	public int totalMarks(){
	return maths + science + history;
	}

	public int average(){
	return totalMarks()/3;
	}
	
	public void displayStudentInfo(){
	System.out.println("Student Name: " + name);
	System.out.println("Total Marks: " + totalMarks());
	}
		
	public static void main(String[] args){
	Student student1 = new Student("Naresh", 55, 80, 78);
	
	student1.displayStudentInfo();	//Display of student Info
	System.out.println("Average Marks: " +student1.average());

	}
}
