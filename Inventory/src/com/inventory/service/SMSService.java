package com.inventory.service;

import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.net.URL; 

public class SMSService 
{
    public static void sendSMS(String msg, String receivermobno) 
    {
	   try 
	   {
		   String apiquery ="https://smsapi.engineeringtgr.com/send/?Mobile=7003871310&Password=surat&Message="+msg+"&To="+receivermobno+"&Key=amisksAirXgYaN75oef1mhuVng";
	       //URL url = new URL("https://smsapi.engineeringtgr.com/send/?Mobile=xxxxxxxxxx&Password=xxxxxx&Message=test&To=xxxxxxxxxx&Key=xxxxxxxxxxxxxx");
		   
		   URL url = new URL(apiquery);
		   URLConnection urlcon = url.openConnection();
	       InputStream stream = urlcon.getInputStream();
	       
	       int i;
	       String response="";
	       while ((i = stream.read()) != -1) 
	       {
	                response+=(char)i;
	       }
	       
	       if(response.contains("success"))
	       {
	                System.out.println("Successfully send SMS");
	                //your code when message send success
	       }
	       else
	       {
	                System.out.println(response);
	                //your code when message not send
	       }
	    } catch (IOException e) { System.out.println(e.getMessage());}
	 }
}