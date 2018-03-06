import java.io.*;
import java.util.*; 

public class ScoreTrakker {
	private ArrayList<Student> listStudent = new ArrayList<Student>();

	public void loadDataFromFile(String fileName) {
		FileReader reader = null;
		Scanner in = null;
		try {
			reader = new FileReader(fileName);
			in = new Scanner(reader);
		} catch (FileNotFoundException e) {
			System.out.println("Can't open file: " + fileName);
		}

		while (in.hasNextLine()) {
			String sName = in.nextLine();
			String sScoreTemp = null;
			int sScore = 0; 
			try {
				sScoreTemp = in.nextLine();
				sScore = Integer.parseInt(sScoreTemp); 
			} catch(NumberFormatException e) {
				System.out.println("Incorrect format for " + sName + " not a valid score: " + sScoreTemp);
			}
			Student temp = new Student(sName, sScore);
			listStudent.add(temp); 					
		}
	}

	public void printInOrder () {
		Collections.sort(listStudent);
		for (Student s : listStudent) {
			System.out.println(s.toString());
		}
	}
	
	public void processFiles(String fileName){
		loadDataFromFile(fileName);
		printInOrder(); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScoreTrakker trakker = new ScoreTrakker();
		trakker.processFiles("scores.txt");
	}

}
