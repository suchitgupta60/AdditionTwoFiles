import java.io.*;
import java.util.*;
import java.util.ArrayList;

public class AddTwoFiles {


	String line="";
	//Persoana p = new Persoana();
	// Hobby h = new Hobby();
	public static void main(String args[]){
		try{
			FileReader  file1 =new FileReader("FileOne.txt");
			Scanner scan = new Scanner(new File("FileOne.txt"));
			ArrayList<String> values = new ArrayList<String>();
			System.out.println(values.size());
			FileReader file2 = new FileReader("FileTwo.txt");
			scan = new Scanner(new File("FileTwo.txt"));
			values = new ArrayList<String>();
			System.out.println(values.size());
			while(scan.hasNext()){
				values.add(scan.next());
			}
			BufferedReader br1 = new BufferedReader(file1);
			BufferedReader br2 = new BufferedReader(file2);
			String temp1="";
			String temp2="";
			while(br1.readLine() != null){
				temp1 = br1.readLine() + temp1;
			}
			while(br2.readLine() != null){
				temp2 = br2.readLine() + temp2;
			}
			String temp = temp1 + temp2;
			System.out.println("temp" + temp);
			FileWriter fw = new FileWriter("FileThree.txt");
			char buffer[] = new char[temp.length()];
			temp.getChars(0, temp.length(), buffer, 0);
			fw.write(buffer);
			file1.close();
			file2.close();
			fw.close();
		}
		catch(IOException ex){
			System.out.println("Error opening file.");
			System.exit(1);

		}
	}
}