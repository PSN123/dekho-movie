package signup;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import signup.getset;

public class smsuser {
        
public String sendSms(getset si) {

            try {
			// Construct data
			String apiKey = "apikey=" + "ji4EyBDkB0M-rWIOSiXxVCYVEVynoArgXnghaOjE5q";
			String message = "&message=" + "hi " + si.getFirat_name() + si.getLast_name() + "Thankyou for choosing us";
			String sender = "&sender=" + "TXTLCL";
			String numbers = "&numbers=" + si.getContact();
System.out.println("ja rha hai msg"+si.getContact());               	
// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
			String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				stringBuffer.append(line);
                        }
			rd.close();
			
			return stringBuffer.toString();
		} catch (Exception e) {
			System.out.println("Error SMS "+e);
		 			
		
                        return "Error "+e;
		}
	}
}
