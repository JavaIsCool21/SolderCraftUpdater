import io.nuovolauncher.sc.update.UpdateConfig;
import io.nuovolauncher.sc.update.GetCurrentVersion;
import io.nuovolauncher.sc.update.UpdaterExceptions;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

import java.lang.StringBuffer;

import java.nio.charset.StandardCharsets;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Updater {
  public static void main(String args[]) {
      UpdateConfig uc = new UpdateConfig(1, GetCurrentVersion.getVersionMain());
      Gson gson = new GsonBuilder().setPrettyPrinting.create();
  
      byte[] request_json = gson.toJson(uc).getBytes(StandardCharsets.UTF_8);
      int length = request_json.length;
  
      //Init the connection
      URL url = new URL("nuovolauncher.io/soldercraft/sendupdateinfo");
      URLConnection con = url.openConnection();
      HttpURLConnection http =(HttpURLConnection) con;
      http.setRequestMethod("POST");
      http.setDoOutput(true);
  
      //Upload the JSON
      http.setFixedLengthStreamingMode(length);
      http.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
      http.connect();
      try(OutputStream os = http.getOutputStream()) {
        os.write(out);
     } catch(Exception) {
        System.out.println("An exception occured uploading the file");
        continue;
     } finally {
         System.out.println("Successfully uploaded file");
}
  
public StringBuffer getUpdateURL() {
     //Now retrieve the proper version
    URL updateURL = new URL("nuovolauncher.io/soldercraft/getupdateurl");
    HttpURLConnection updateConnection = (HttpURLConnection) update_url.openConnection();
    updateConnection.setRequestMethod("GET");
    updateConnection.setRequestProperty("User-Agent", "Mozilla/5.0");
    BufferedReader in = new BufferedReader(new InputStreamReader(updateConnection.getInputStream()));
    String update_url;
    StringBuffer resp = new StringBuffer();
    while((update_url = in.readLine()) != null) {
      response.append(inputLine);
    }
    in.close();
  
    return response;
}
  
  
  
