import java.io.File;

import com.google.gson.GsonBuilder;

import io.nuovolauncher.sc.update.CurrentVersionConfig;

public class GetCurrentVersion {
  public static String getFName() {
    File f = new File(System.getProperty("user.home") + "/.minecraft/mods/SolderCraft-*-*.jar"));
    String fname = new String(f.getName());
    return fname;
  }
  public static String getVersionMain() {
    String version_fname = getFName();
    //TODO: Look into a less redundant way to split the recombine the text. KISS?
    String version = version_fname.split("-")[1];
    String build_number = version_fname.split("-")[2]
    String version_and_build = version + "-" + build_number;
    System.out.println("Current Version of SolderCraft: " + version_and_build);
    
    return version_and_build;
}
