package test1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String scan;
        FileReader file = new FileReader("/Users/Siddharth/Desktop/googlebooks-eng-all-1gram-20120701-a");
        BufferedReader br = new BufferedReader(file);

        while((scan = br.readLine()) != null)
                {
            System.out.println(scan);
                }
        br.close();	
		
		
		
	}

}
