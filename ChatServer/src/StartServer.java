/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kenil
 */
import java.rmi.*;
import java.rmi.server.*;
 
public class StartServer {
	public static void main(String[] args) {
		try {
				//System.setSecurityManager(new RMISecurityManager());
			 	java.rmi.registry.LocateRegistry.createRegistry(1099);
			 	
				ChatServerInt b=new ChatServer();	
				Naming.rebind("rmi://172.16.25.152/myabc", b);
				System.out.println("[System] Chat Server is ready.");
			}catch (Exception e) {
					System.out.println("Chat Server failed: " + e);
			}
	}
}