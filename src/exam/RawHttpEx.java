package exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class RawHttpEx {
	public static void main(String arg[]) throws IOException{
		String host ="127.0.0.1";
		int port  = 8080;
		Socket socket = new Socket(host,port);
		BufferedReader in = new BufferedReader( new InputStreamReader(socket.getInputStream()));
		PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
		out.println("Get/index.html HTTP/1.0");
		out.println();
		out.flush();
		String line;

		while((line = in.readLine()) !=null){
		    System.out.println(line);
		}
		in.close();
		out.close();
		}

}
