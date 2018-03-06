/**
 * Student class -- Student has two private attributes: name and score.
 * Class implements comparable which compares students' scores. 
 * @author Hannah Lee
 * @author Kyle Strayer
 */
public class Student implements Comparable<Student>{
	private String name;
	private int score; 
	
	public Student(){
		name = "n/a";
		score = 0; 
	}
	
	public Student (String n, int s){
		name = n; 
		score = s; 
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	/**
	 * compareTo function -- implements Comparable, returns 1 if caller's score
	 * is higher than callee's score. 
	 */
	@Override
	public int compareTo(Student o) {
		return Integer.compare(this.score, o.score);
	}
	
	@Override
	public String toString() {
		return (name +  " " + score);
	}
	
	/*
	// Testing
	public static void main (String [] args){
		Student H = new Student("Jim Bird", 20);
		Student K = new Student(); 
		
		System.out.println(H.toString());
		System.out.println(K.toString());
		
	}
	*/

}
