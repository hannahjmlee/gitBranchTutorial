import java.util.*;

/**
 * MapDemo class -- experimental class that works with different
 * types of maps and how they work.
 * 
 * @author Hannah Lee
 */

/*
 * When you change the map declaration to use a TreeMap, when printing the values of the map,
 * everything is printed in alphabetical order based on the keys. The keys determine the order
 * in which everything is printed. It is also important to note that words that start with all
 * keys that start with an uppercase letter are printed before those that start with a lowercase
 * letter. Therefore Abe, Charles, and Zach are all printed out before beth, mike, and zane.  
 */

/*
 * The error message states: Cannot instantiate the type Map<String, String>
 * This does not work because the built-in Map is an interface and it cannot be instantiated. 
 * Therefore, we must choose between the concrete classes (such as HashMap and TreeMap) in order
 * to instantiate type <String, String>. 
 */

/*
 * The values function returns a collection view of the values contained within the map. So, if
 * the following values were inputted into the map: Amanda -> Biology, Mike -> CS, Hannah -> Math,
 * Jack -> Geology, the values are printed out as: [Biology, Math, Geology, CS]. These values are
 * printed out in this format in the alphabetical order of their keys. This is why the above example
 * prints out [Amanda's course, Hannah's course, Jack's course, Mike's course]. 
 */

public class MapDemo {
	private Map <String, String> mapCourses; 
	
	/**
	 * MapDemo constructor -- creates a new TreeMap that holds a String key
	 * and a String value. 
	 */
	public MapDemo(){
		mapCourses = new TreeMap<String, String>();
	}
	
	/**
	 * getStudents function -- reads in students and their favorite courses until
	 * the user chooses to quit. Student name's and courses are then added into the
	 * course map. 
	 * 
	 */
	public void getStudents(){
		Scanner in = new Scanner(System.in);
		String studentName = "";
		String favoriteCourse = "";
		
		do
		{
			System.out.println("Enter student's name: ");
			studentName = in.next();
			if (!(studentName.equalsIgnoreCase("Q"))){
				System.out.println("Enter " + studentName + "'s favorite course: ");
				favoriteCourse = in.next(); 
				mapCourses.put(studentName, favoriteCourse); 
				System.out.println();
			}
		} while (!(studentName.equalsIgnoreCase("Q")));
		
		System.out.println();
	}
	
	/**
	 * printCourses function -- prints out the student's name and their corresponding
	 * favorite course. 
	 */
	public void printCourses(){
		Set<String> keySet = mapCourses.keySet();
		for (String key: keySet){
			System.out.println(key + "'s favorite course is " + mapCourses.get(key));
		}
		
		// System.out.println(mapCourses.values());  
	}
	
	public static void main (String[] args){
			MapDemo md = new MapDemo();
			md.getStudents();
			md.printCourses();		
	}
}
