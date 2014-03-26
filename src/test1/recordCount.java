package test1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class recordCount {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// File Reader 
		String scan;
        FileReader file = new FileReader("/Users/Siddharth/Desktop/googlebooks-eng-all-1gram-20120701-a");
        BufferedReader br = new BufferedReader(file);
       
        // Record Counter 
        int linenumber = 0;
        while((scan = br.readLine()) != null)
        	linenumber++;
              {
           System.out.println(linenumber);
                }
        
        br.close();    
         
        
      
    	  
       }
        
		
		
	}

