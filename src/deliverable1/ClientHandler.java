/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable1;

/**
 *
 * @author alexm
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author Alexander
 */
public class ClientHandler extends Thread{
    Server server;
    BufferedReader inReader;
    PrintWriter outWriter;
    
    public ClientHandler(Server s, Socket sock){
        server = s;
        System.out.println("Client started: " + sock.getInetAddress().toString());
        
        try{
            inReader = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            outWriter = new PrintWriter(sock.getOutputStream());
            
        }catch(IOException e){
            System.out.println("Exception in ClientHandler");
        }
        
    }
    public void run(){
        try{        
            String input;
            while((input = inReader.readLine()) != null){  
                //System.err.println("test" + input);
                processInput(input);
            }
        }catch(IOException e){
            System.out.println("Exception in ClientHandler:  Client likely Disconnected");
        }
         
    }
    
    private void processInput(String inputstring){
        System.out.println("Processing Command");
        String[] stringarray = inputstring.split(",");
        if(stringarray[0].equals("/login")) {
            if(stringarray.length != 3) {
                outWriter.println("/login,false,false");
                outWriter.flush();
            }
            else {
                int result = server.checkCredentials(stringarray[1], stringarray[2]);
                switch (result) {
                    case 1:
                        outWriter.println("/login,true,admin");
                        outWriter.flush();
                        break;
                    case 2:
                        outWriter.println("/login,true,faculty");
                        outWriter.flush();
                        break;
                    case 3:
                        outWriter.println("/login,true,student");
                        outWriter.flush();
                        break;
                    case 4:
                        outWriter.println("/login,true,dean");
                        outWriter.flush();
                    default:
                        outWriter.println("/login,false,false");
                        outWriter.flush();
                        break;
                }
            }
        }
        else if(stringarray[0].equals("/addq")) {
            if(stringarray.length != 4) {
                outWriter.println("/addq,false");
                outWriter.flush();
            }
            else {
                server.qPool.addQuestion(stringarray[3], stringarray[1]);
                
                outWriter.println("/addq," + stringarray[3] + "," + stringarray[2] + "," + stringarray[1] + "," + "true");
                outWriter.flush();
            }
        }
    }
}