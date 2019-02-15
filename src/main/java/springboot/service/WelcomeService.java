package springboot.service;

import org.springframework.stereotype.Component;
import java.net.InetAddress;
import java.net.UnknownHostException;

@Component
public class WelcomeService{
	
	public String getWelcomeMessage() {
		
		InetAddress ip = null;
		String serverName = "Unknown";
		
		try 
		{
		  ip = InetAddress.getLocalHost();
		  serverName = ip.getHostAddress();
		} catch (UnknownHostException e) {
			serverName = "Cant be determined!";
		}
		
		return "<HTML><BODY><H>Welcome to Server: <B>" + serverName + "</B></H></BODY></HTML>";
	}
}
