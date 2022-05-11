package sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Translator {
    public static void main(String[] args) throws IOException {
        String text = "Hello world!";
        //Translated text: Xin chao the gioi!
        System.out.println("Translated text: " + translate("en", "vi", text));
    }

    public static String translate(String langFrom, String langTo, String text) throws IOException {
        // INSERT YOUR URL HERE
        String urlStr = "https://script.google.com/macros/s/AKfycbw2qKkvobro8WLNZUKi2kGwGwEO4W8cBavcKqcuCIGhGBBtVts/exec" +
                "?q=" + URLEncoder.encode(text, "UTF-8")
                + "&target=" + langTo +
                "&source=" + langFrom;
        URL url = new URL(urlStr);
        StringBuilder response = new StringBuilder();
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestProperty("User-Agent", "Mozilla/5.0");
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response.toString();
    }
}
