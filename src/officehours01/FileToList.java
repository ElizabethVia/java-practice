package officehours01;
import java.util.*;

import java.io.*;
public class FileToList {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("product.txt");
		//open file using scanner
		Scanner scan =new Scanner(file);
		//System.out.println(scan.nextLine());
		ArrayList<String> data=new ArrayList<>();
		
		//hasNextLine will be true if there is line of data
		//System.out.println(scan.hasNextLine());
		//System.out.println(scan.nextLine());
		while(scan.hasNextLine()) {
			String line=scan.nextLine();
			System.out.println(line);
			data.add(line);
			//it reads a line and switches to nextLine
		//System.out.println(scan.nextLine());
		}
		System.out.println("NUmber of product: "+data.size());
		System.out.println(data.toString());
	}

}
