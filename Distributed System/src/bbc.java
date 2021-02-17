
// BBC Web service Invocation -   Retrieves latest top headlines from BBC News
// K Djemame
// 11/11/2019

import java.io.*;
import java.net.*;

public class bbc {

    private final static String api_key = "2f388031592e4940b93f901337b0b8fd";

    static String out = "";

    public static void invokeBBC() {
        URL apiURL;
        HttpURLConnection conn;
        InputStream in;

        try {
            // API url with attached api key
            apiURL = new URL("https://newsapi.org/v2/top-headlines?sources=bbc-news&apiKey=" + api_key); 

            // open connection
            conn = (HttpURLConnection) apiURL.openConnection();
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Content-type", "application/json");
            conn.setRequestMethod("GET"); 
            conn.connect(); 

            System.out.println("Server Response: " + conn.getResponseCode() + " Connection was successful.");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Connection failed: " + conn.getResponseCode());
            }

            System.out.println("\nFetching data...\n");

            in = conn.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));

            while ((out = reader.readLine()) != null) { 
                // read each line of data returned from API
                System.out.println(out);
            }

            // close connection
            in.close(); 
        }

        catch(IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        try {
            invokeBBC();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }

        System.out.println("\n\nEnd of program");
    }
}

