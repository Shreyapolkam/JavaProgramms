public class Student1{
    static String name="vamshi";
	static  int rollno=102;
	static  int marks=98;
	
    public static void main (String[] args){
		Student student=new Student();//object creation
		System.out.println("Student Name : "+name);//directly static context
		System.out.println("Student RollNumber : "+student.rollno);//by using object refernce
		System.out.println("Student Marks : "+Student1.marks);//by using classname
		
	}	
}               
	               
