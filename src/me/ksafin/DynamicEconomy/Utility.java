package me.ksafin.DynamicEconomy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.logging.Logger;
import java.util.Date;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import couk.Adamki11s.Extras.Colour.ExtrasColour;

public class Utility {
	
	public File log;
	public static Logger logger = Logger.getLogger("Minecraft");
	public static FileWriter out;
	public static BufferedWriter bf;
	private DynamicEconomy plugin;
	public static ExtrasColour color = new ExtrasColour();
	
	public Utility(File logFile, DynamicEconomy plug) {
		log = logFile;
		plugin = plug;
		checkLog();
		try {
		bf = new BufferedWriter(new FileWriter(log,true));
		} catch (Exception e) {
			logger.info("[DynamicEconomy] Error creating FileWriter for log.txt");
			e.printStackTrace();
		}
	}
	
	public static int[] decodeCoordinates(String stringCoords) {
		String[] split = stringCoords.split(" ");
		int[] intCoords = new int[3];
		for (int x = 0; x < 3; x++) {
			intCoords[x] = Integer.parseInt(split[x]);
		}
		return intCoords;
	}
	
	public static String encodeCoordinates(int[] coordsArray) {
		String coords = "";
		for (int x =0; x < 3; x++) {
			if (x < 2) {
			   coords += coordsArray[x] + " ";
			} else {
			   coords += coordsArray[x];
			}
		}
		return coords;
	}

	public void checkLog() {
		
		File file = new File(plugin.getDataFolder().getPath());
		if(!file.exists()) file.mkdir();
		
		File logF = new File(file.getPath() + File.separator + "log.txt");
		
		try
        {
            if(!logF.exists())
            {
                FileOutputStream fos = new FileOutputStream(logF);
                fos.flush();
                fos.close();
            }
        }
        catch(IOException ioe)
        {
            logger.info("[DynamicEconomy] Exception creating log.txt");
        }
		
	/*	if (log.exists() == false) {
			try {
			//logger.info(log.getAbsolutePath());
			//log.createNewFile();
			FileOutputStream fos = new FileOutputStream(log);
	        fos.flush();
	        fos.close();
			} catch (Exception e) {
				logger.info("[DynamicEconomy] Error creating log file.");
				e.printStackTrace();
			}
		} else {
			logger.info("[DynamicEconomy] Log file detected.");
		}*/
	}
	
	public static void writeToLog(String message) {
//		String date = Calendar.YEAR + "-" + (Calendar.MONTH + 1) + "-" + Calendar.DAY_OF_MONTH;
//		String timeS = Calendar.HOUR_OF_DAY + ":" + Calendar.MINUTE + ":" + Calendar.SECOND;
		
//		String timestamp = date + " " + timeS;
		Timestamp ts = new Timestamp(new Date().getTime());
		
		if (DynamicEconomy.logwriting) {
		try {
			bf.write("\n + [" + ts + "] " + message);
			bf.flush();
		} catch (Exception e) {
			logger.info("[DynamicEconomy] Exception writing to log.txt");
			e.printStackTrace();
		}
		} 
		
	}
	
	public static void wrongArgsMessage(Player player) {
		color.sendColouredMessage(player, "&2You have put entered &finvalid &2 arguments for this command. &fTry Again.");
	}
	
	public static boolean isQuiet(Player player) {
		String name = player.getName();
		
		FileConfiguration conf = DynamicEconomy.usersConfig;
		
		String node = name + ".QUIET";
		
		Boolean isQuiet = conf.getBoolean(node,true);
		
		return isQuiet;
	}
	
	public static void makeQuiet(Player player) {
		if (isQuiet(player)) {
			DynamicEconomy.usersConfig.set((player.getName() + ".QUIET"),false);
		} else {
			DynamicEconomy.usersConfig.set((player.getName() + ".QUIET"),true);
		}
		
		color.sendColouredMessage(player, "&2Your Quiet mode has been set to: &f" + isQuiet(player));
		
		try {
			DynamicEconomy.usersConfig.save(DynamicEconomy.usersFile);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getColor(String color) {

		if (color.startsWith("&")) {
			System.out.println(Integer.decode("0x" + color.substring(1, 2)));

			int colornum = Integer.decode("0x" + color.substring(1, 2));
			if (colornum >= 0 && colornum <= 15) {
				ChatColor CCcolor = ChatColor.values()[colornum];
				return CCcolor.toString();
			} else if (ChatColor.valueOf(color.substring(1).toUpperCase()) != null) {
				return ChatColor.valueOf(color.substring(1).toUpperCase()).toString();
			}
		}
		return "";
	}
}
