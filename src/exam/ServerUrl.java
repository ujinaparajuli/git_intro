package exam;
import java.io.*; 
import java.net.*; 

public class ServerUrl {
	public static void main(String args[]){

		if(args.length >0){
		try{
		       
		    URL u = new URL("https://www.bing.com/"); 
		            URLConnection uc = u.openConnection(); 
		            InputStream stream = uc.getInputStream(); 
		            BufferedInputStream buffer = new BufferedInputStream(stream); 

		            InputStreamReader reader = new InputStreamReader(buffer); 

		            int c; 
		            while ((c = reader.read()) != -1) { 
		                    System.out.print((char) c); 
		            } 
		            } catch (IOException ex) { 
		                    System.err.println(ex); 
		            } 
		    }
		}

}
