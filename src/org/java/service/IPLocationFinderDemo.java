package org.java.service;

import com.lavasoft.GeoIPService;
import com.lavasoft.GeoIPServiceSoap;

/*
 * GeoIPService URI
 * 
 * http://wsgeoip.lavasoft.com/ipservice.asmx?WSDL
 */

public class IPLocationFinderDemo {

	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("You need to pass in one IP address");
		}
		else {
			String ipAddress = args[0];
			System.out.println("IP Address passed as an Configuration Variable : \n" + ipAddress);
					
			GeoIPService ipService = new GeoIPService();
			System.out.println("WebService URI : \n" + ipService.getGeoIPServiceSoap().toString());
			
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();					
			System.out.println("XML Response from WebService :\n" 
						+ geoIPServiceSoap.getIpLocation(ipAddress).toString());			
		}

	}

}
