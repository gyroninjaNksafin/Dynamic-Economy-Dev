package me.ksafin.DynamicEconomy;


import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.logging.Logger;

import org.bukkit.Material;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import couk.Adamki11s.Extras.Colour.ExtrasColour;
import couk.Adamki11s.Extras.Inventory.ExtrasInventory;



public class Item {

	private static FileConfiguration itemConfig;
	private static ExtrasColour color = new ExtrasColour();
	static Logger log = Logger.getLogger("Minecraft");
	private static File itemsFile;
	
	static NumberFormat f = NumberFormat.getNumberInstance(Locale.US);
    public static DecimalFormat decFormat = (DecimalFormat)f;
	
	private ExtrasInventory inv = new ExtrasInventory();
	
	//public static boolean DynamicEconomy.usestock = DynamicEconomy.DynamicEconomy.usestock;
	//public static boolean DynamicEconomy.useboundaries = DynamicEconomy.DynamicEconomy.useboundaries;
	//public static String prefix = DynamicEconomy.prefix;
	//public static int defaultAmount = DynamicEconomy.defaultAmount;
	
	public Item(FileConfiguration config) {
		itemConfig = config;
	}
	
	public static void setItemsFile(File file) {
		itemsFile = file;
	}
	
	public static String getTrueName(String arg) {

		arg = arg.toUpperCase();
		
			if ((arg.equalsIgnoreCase("STONE")) || (arg.equalsIgnoreCase("SMOOTHSTONE")) || (arg.equalsIgnoreCase("1"))) {
				return "STONE";
			} else if (arg.equalsIgnoreCase("GRASS") || (arg.equalsIgnoreCase("2"))) {
				return "GRASS";
			} else if (arg.equalsIgnoreCase("DIRT") || (arg.equalsIgnoreCase("3"))) {
				return "DIRT";
			} else if ((arg.equalsIgnoreCase("PLANK")) || (arg.equalsIgnoreCase("WOODENPLANK"))  || (arg.equalsIgnoreCase("PLANKS")) || (arg.equalsIgnoreCase("WOODENPLANKS")) || (arg.equalsIgnoreCase("5"))) {
				return "PLANK";
			} else if ((arg.equalsIgnoreCase("PINEPLANK")) || (arg.equalsIgnoreCase("PINEPLANKS")) || (arg.equalsIgnoreCase("5:1"))) {
				return "PINEPLANK";
			} else if ((arg.equalsIgnoreCase("BIRCHPLANK"))  || (arg.equalsIgnoreCase("BIRCHPLANKS")) || (arg.equalsIgnoreCase("5:2"))) {
				return "BIRCHPLANK";
			} else if ((arg.equalsIgnoreCase("JUNGLEPLANK"))  || (arg.equalsIgnoreCase("JUNGLEPLANKS")) || (arg.equalsIgnoreCase("5:3"))) {
				return "JUNGLEPLANK";
			} else if ((arg.equalsIgnoreCase("COBBLESTONE")) || (arg.equalsIgnoreCase("COBBLE")) || (arg.equalsIgnoreCase("4"))) {
				return "COBBLESTONE";
			} else if (arg.equalsIgnoreCase("SAPLING") || (arg.equalsIgnoreCase("6"))) {
				return "SAPLING";
			} else if (arg.equalsIgnoreCase("BIRCHSAPLING") || (arg.equalsIgnoreCase("6:1"))|| (arg.equalsIgnoreCase("SPRUCESAPLING"))) {
				return "BIRCHSAPLING";
			} else if (arg.equalsIgnoreCase("PINESAPLING") || (arg.equalsIgnoreCase("6:2"))) {
				return "PINESAPLING";
			} else if (arg.equalsIgnoreCase("JUNGLESAPLING") || (arg.equalsIgnoreCase("6:3"))) {
				return "JUNGLESAPLING";
			} else if (arg.equalsIgnoreCase("BEDROCK") || (arg.equalsIgnoreCase("7"))) {
				return "BEDROCK";
			} else if (arg.equalsIgnoreCase("STILLWATER") || (arg.equalsIgnoreCase("8"))) {
				return "STILLWATER";
			} else if (arg.equalsIgnoreCase("WATER") || (arg.equalsIgnoreCase("9"))) {
				return "WATER";
			} else if (arg.equalsIgnoreCase("STILLLAVA") || (arg.equalsIgnoreCase("10"))) {
				return "STILLLAVA";
			} else if (arg.equalsIgnoreCase("LAVA") || (arg.equalsIgnoreCase("11"))) {
				return "LAVA";
			} else if (arg.equalsIgnoreCase("SAND") || (arg.equalsIgnoreCase("12"))) {
				return "SAND";
			} else if (arg.equalsIgnoreCase("GRAVEL") || (arg.equalsIgnoreCase("13"))) {
				return "GRAVEL";
			} else if (arg.equalsIgnoreCase("WOOD") || (arg.equalsIgnoreCase("LOG")) || (arg.equalsIgnoreCase("17")) || (arg.equalsIgnoreCase("17:0"))) {
				return "WOOD";
			} else if (arg.equalsIgnoreCase("BIRCHWOOD") || (arg.equalsIgnoreCase("BIRCHLOG")) || (arg.equalsIgnoreCase("17:2"))) {
				return "BIRCHWOOD";
			} else if (arg.equalsIgnoreCase("DARKWOOD") || (arg.equalsIgnoreCase("DARKLOG")) || (arg.equalsIgnoreCase("PINEWOOD")) || (arg.equalsIgnoreCase("SPRUCEWOOD")) || (arg.equalsIgnoreCase("17:1"))) {
				return "PINEWOOD";
			} else if (arg.equalsIgnoreCase("JUNGLEWOOD") || (arg.equalsIgnoreCase("JUNGLELOG")) || (arg.equalsIgnoreCase("17:3"))) {
				return "JUNGLEWOOD";
			} else if (arg.equalsIgnoreCase("SPONGE") || (arg.equalsIgnoreCase("19"))) {
				return "SPONGE";
			} else if (arg.equalsIgnoreCase("GLASS") || (arg.equalsIgnoreCase("GLASSBLOCK")) || (arg.equalsIgnoreCase("20"))) {
				return "GLASS";
			} else if (arg.equalsIgnoreCase("LAPISLAZULIBLOCK") || (arg.equalsIgnoreCase("22"))) {
				return "LAPISLAZULIBLOCK";
			} else if (arg.equalsIgnoreCase("DISPENSER") || (arg.equalsIgnoreCase("23"))) {
				return "DISPENSER";
			} else if (arg.equalsIgnoreCase("SANDSTONE") || (arg.equalsIgnoreCase("SANDBRICK")) || (arg.equalsIgnoreCase("24"))) {
				return "SANDSTONE";
			} else if (arg.equalsIgnoreCase("HIEROGLYPHICSANDSTONE") || (arg.equalsIgnoreCase("CREEPERSANDSTONE")) || (arg.equalsIgnoreCase("24:1"))) {
				return "HIEROGLYPHICSANDSTONE";
			} else if (arg.equalsIgnoreCase("SMOOTHSANDSTONE") || (arg.equalsIgnoreCase("24:2"))) {
				return "SMOOTHSANDSTONE";
			} else if (arg.equalsIgnoreCase("NOTEBLOCK") || (arg.equalsIgnoreCase("MUSICBLOCK")) || (arg.equalsIgnoreCase("25"))) {
				return "NOTEBLOCK";
			} else if (arg.equalsIgnoreCase("POWEREDRAIL") || (arg.equalsIgnoreCase("POWERRAIL")) || (arg.equalsIgnoreCase("POWERTRACK")) || (arg.equalsIgnoreCase("POWEREDTRACK")) || (arg.equalsIgnoreCase("27"))) {
				return "POWEREDRAIL";
			} else if (arg.equalsIgnoreCase("DETECTORRAIL") || (arg.equalsIgnoreCase("DETECTORTRACK")) || (arg.equalsIgnoreCase("28"))) {
				return "DETECTORRAIL";
			} else if (arg.equalsIgnoreCase("STICKYPISTON") || (arg.equalsIgnoreCase("29"))) {
				return "STICKYPISTON";
			} else if (arg.equalsIgnoreCase("WEB") || (arg.equalsIgnoreCase("SPIDERWEB")) || (arg.equalsIgnoreCase("30"))) {
				return "WEB";
			} else if (arg.equalsIgnoreCase("DEADSHRUB") || (arg.equalsIgnoreCase("31:0")) || (arg.equalsIgnoreCase("31"))) {
				return "DEADSHRUB";
			} else if (arg.equalsIgnoreCase("TALLGRASS") || (arg.equalsIgnoreCase("31:1"))  || (arg.equalsIgnoreCase("31001"))) {
				return "TALLGRASS";
			} else if (arg.equalsIgnoreCase("FERN") || (arg.equalsIgnoreCase("31:2"))  || (arg.equalsIgnoreCase("31002"))) {
				return "FERN";
			} else if (arg.equalsIgnoreCase("PISTON") || (arg.equalsIgnoreCase("33"))) {
				return "PISTON";
			} else if (arg.equalsIgnoreCase("WOOL") || (arg.equalsIgnoreCase("35"))) {
				return "WOOL";
			} else if (arg.equalsIgnoreCase("ORANGEWOOL") || (arg.equalsIgnoreCase("35:1"))) {
				return "ORANGEWOOL";
			} else if (arg.equalsIgnoreCase("MAGENTAWOOL") || (arg.equalsIgnoreCase("35:2"))) {
				return "MAGENTAWOOL";
			} else if (arg.equalsIgnoreCase("LIGHTBLUEWOOL") || (arg.equalsIgnoreCase("35:3"))) {
				return "LIGHTBLUEWOOL";
			} else if (arg.equalsIgnoreCase("YELLOWWOOL") || (arg.equalsIgnoreCase("35:4"))) {
				return "YELLOWWOOL";
			} else if (arg.equalsIgnoreCase("LIMEWOOL") || (arg.equalsIgnoreCase("35:5"))) {
				return "LIMEWOOL";
			} else if (arg.equalsIgnoreCase("PINKWOOL") || (arg.equalsIgnoreCase("35:6"))) {
				return "PINKWOOL";
			} else if (arg.equalsIgnoreCase("GRAYWOOL") || arg.equalsIgnoreCase("GREYWOOL") || (arg.equalsIgnoreCase("35:7"))) {
				return "GRAYWOOL";
			} else if (arg.equalsIgnoreCase("LIGHTGRAYWOOL") || arg.equalsIgnoreCase("LIGHTGREYWOOL") || (arg.equalsIgnoreCase("35:8"))) {
				return "LIGHTGRAYWOOL";
			} else if (arg.equalsIgnoreCase("CYANWOOL") ||  (arg.equalsIgnoreCase("35:9"))) {
				return "CYANWOOL";
			} else if (arg.equalsIgnoreCase("PURPLEWOOL") || (arg.equalsIgnoreCase("35:10"))) {
				return "PURPLEWOOL";
			} else if (arg.equalsIgnoreCase("BLUEWOOL") || (arg.equalsIgnoreCase("35:11"))) {
				return "BLUEWOOL";
			} else if (arg.equalsIgnoreCase("BROWNWOOL") || (arg.equalsIgnoreCase("35:12"))) {
				return "BROWNWOOL";
			} else if (arg.equalsIgnoreCase("GREENWOOL") || (arg.equalsIgnoreCase("35:13"))) {
				return "GREENWOOL";
			} else if (arg.equalsIgnoreCase("REDWOOL") || (arg.equalsIgnoreCase("35:14"))) {
				return "REDWOOL";
			} else if (arg.equalsIgnoreCase("BLACKWOOL") || (arg.equalsIgnoreCase("35:15"))) {
				return "BLACKWOOL";
			} else if (arg.equalsIgnoreCase("DANDELION") || (arg.equalsIgnoreCase("YELLOWFLOWER")) || (arg.equalsIgnoreCase("37"))) {
				return "DANDELION";
			} else if (arg.equalsIgnoreCase("ROSE") || (arg.equalsIgnoreCase("REDFLOWER")) || (arg.equalsIgnoreCase("38"))) {
				return "ROSE";
			} else if (arg.equalsIgnoreCase("BROWNMUSHROOM") || (arg.equalsIgnoreCase("39"))) {
				return "BROWNMUSHROOM";
			} else if (arg.equalsIgnoreCase("REDMUSHROOM") || (arg.equalsIgnoreCase("40"))) {
				return "REDMUSHROOM";
			} else if (arg.equalsIgnoreCase("GOLDBLOCK") || (arg.equalsIgnoreCase("BLOCKOFGOLD")) || (arg.equalsIgnoreCase("41"))) {
				return "GOLDBLOCK";
			} else if (arg.equalsIgnoreCase("IRONBLOCK") || (arg.equalsIgnoreCase("BLOCKOFIRON")) || (arg.equalsIgnoreCase("42"))) {
				return "IRONBLOCK";
			} else if (arg.equalsIgnoreCase("DOUBLESLABS") || (arg.equalsIgnoreCase("DOUBLESLAB")) ||  (arg.equalsIgnoreCase("DOUBLESTEP")) || (arg.equalsIgnoreCase("43"))) {
				return "DOUBLESLABS";
			} else if (arg.equalsIgnoreCase("STONESLAB") || (arg.equalsIgnoreCase("SLAB")) || (arg.equalsIgnoreCase("SLABS")) || (arg.equalsIgnoreCase("STONESLABS")) || (arg.equalsIgnoreCase("44"))) {
				return "SLABS";
			} else if (arg.equalsIgnoreCase("SANDSTONESLAB") || (arg.equalsIgnoreCase("SANDSTONESLABS")) || (arg.equalsIgnoreCase("SANDSLABS")) || (arg.equalsIgnoreCase("SANDSLAB")) || (arg.equalsIgnoreCase("44:1"))) {
				return "SANDSTONESLABS";
			} else if (arg.equalsIgnoreCase("PLANKSLABS") || (arg.equalsIgnoreCase("PLANKSLAB")) || (arg.equalsIgnoreCase("WOODSLABS")) || (arg.equalsIgnoreCase("WOODSLAB")) || (arg.equalsIgnoreCase("44:2"))) {
				return "PLANKSLABS";
			} else if (arg.equalsIgnoreCase("COBBLESLAB") || (arg.equalsIgnoreCase("COBBLESLABS")) || (arg.equalsIgnoreCase("44:3"))) {
				return "COBBLESLABS";
			} else if (arg.equalsIgnoreCase("BRICKSLABS") || (arg.equalsIgnoreCase("BRICKSLAB")) || (arg.equalsIgnoreCase("44:4"))) {
				return "BRICKSLABS";
			} else if (arg.equalsIgnoreCase("STONEBRICKSLAB") || (arg.equalsIgnoreCase("STONEBRICKSLABS")) || (arg.equalsIgnoreCase("STONEBRICKSSLABS")) || (arg.equalsIgnoreCase("STONEBRICKSSLAB")) || (arg.equalsIgnoreCase("44:5"))) {
				return "STONEBRICKSLABS";
			} else if (arg.equalsIgnoreCase("BRICKBLOCK") || (arg.equalsIgnoreCase("45"))) {
				return "BRICKBLOCK";
			} else if (arg.equalsIgnoreCase("TNT") || (arg.equalsIgnoreCase("48"))) {
				return "TNT";
			} else if (arg.equalsIgnoreCase("BOOKSHELF") || (arg.equalsIgnoreCase("47"))) {
				return "BOOKSHELF";
			} else if (arg.equalsIgnoreCase("MOSSYCOBBLE") || (arg.equalsIgnoreCase("MOSSCOBBLE")) || (arg.equalsIgnoreCase("MOSSYCOBBLESTONE")) ||  (arg.equalsIgnoreCase("48"))) {
				return "MOSSYCOBBLE";
			} else if (arg.equalsIgnoreCase("OBSIDIAN") || (arg.equalsIgnoreCase("OBBY")) || (arg.equalsIgnoreCase("49"))) {
				return "OBSIDIAN";
			} else if (arg.equalsIgnoreCase("TORCH") || (arg.equalsIgnoreCase("50"))) {
				return "TORCH";
			} else if (arg.equalsIgnoreCase("FIRE") || (arg.equalsIgnoreCase("51"))) {
				return "FIRE";
			} else if (arg.equalsIgnoreCase("MOBSPAWNER") || (arg.equalsIgnoreCase("SPAWNER")) || (arg.equalsIgnoreCase("52"))) {
				return "MOBSPAWNER";
			} else if (arg.equalsIgnoreCase("WOODENSTAIRS") || (arg.equalsIgnoreCase("WOODSTAIRS")) || (arg.equalsIgnoreCase("PLANKSTAIRS")) || (arg.equalsIgnoreCase("53"))) {
				return "WOODENSTAIRS";
			} else if (arg.equalsIgnoreCase("CHEST") || (arg.equalsIgnoreCase("54"))) {
				return "CHEST";
			} else if (arg.equalsIgnoreCase("DIAMONDBLOCK") || (arg.equalsIgnoreCase("BLOCKOFDIAMOND")) || (arg.equalsIgnoreCase("57"))) {
				return "DIAMONDBLOCK";
			} else if (arg.equalsIgnoreCase("CRAFTBENCH") || (arg.equalsIgnoreCase("CRAFTINGBENCH")) || (arg.equalsIgnoreCase("CRAFTINGTABLE")) || (arg.equalsIgnoreCase("58"))) {
				return "CRAFTBENCH";
			} else if (arg.equalsIgnoreCase("FURNACE") || (arg.equalsIgnoreCase("61"))) {
				return "FURNACE";
			}  else if (arg.equalsIgnoreCase("BURNINGFURNACE") || (arg.equalsIgnoreCase("62"))) {
				return "BURNINGFURNACE";
			} else if (arg.equalsIgnoreCase("LADDER") || (arg.equalsIgnoreCase("LADDERS")) || (arg.equalsIgnoreCase("65"))) {
				return "LADDER";
			} else if (arg.equalsIgnoreCase("RAIL") || (arg.equalsIgnoreCase("RAILS")) || (arg.equalsIgnoreCase("TRACKS")) || (arg.equalsIgnoreCase("66"))) {
				return "RAIL";
			} else if (arg.equalsIgnoreCase("COBBLESTAIRS") || (arg.equalsIgnoreCase("COBBLESTONESTAIRS")) || (arg.equalsIgnoreCase("67"))) {
				return "COBBLESTAIRS";
			} else if (arg.equalsIgnoreCase("LEVER") || (arg.equalsIgnoreCase("69"))) {
				return "LEVER";
			} else if (arg.equalsIgnoreCase("STONEPLATE") || (arg.equalsIgnoreCase("STONEPRESSUREPLATE")) || (arg.equalsIgnoreCase("70"))) {
				return "STONEPLATE";
			} else if (arg.equalsIgnoreCase("WOODENPLATE") || (arg.equalsIgnoreCase("WOODENPRESSUREPLATE")) || (arg.equalsIgnoreCase("72"))) {
				return "WOODENPLATE";
			} else if (arg.equalsIgnoreCase("GLOWINGREDSTONEORE") || (arg.equalsIgnoreCase("GLOWINGREDSTONE")) || (arg.equalsIgnoreCase("74"))) {
				return "GLOWINGREDSTONEORE";
			} else if (arg.equalsIgnoreCase("BUTTON") || (arg.equalsIgnoreCase("STONEBUTTON")) || (arg.equalsIgnoreCase("77"))) {
				return "BUTTON";
			} else if (arg.equalsIgnoreCase("ICE") || (arg.equalsIgnoreCase("ICEBLOCK")) || (arg.equalsIgnoreCase("79"))) {
				return "ICE";
			} else if (arg.equalsIgnoreCase("CACTUS") || (arg.equalsIgnoreCase("CACTI")) || (arg.equalsIgnoreCase("81"))) {
				return "CACTUS";
			} else if (arg.equalsIgnoreCase("CLAYBLOCK") || (arg.equalsIgnoreCase("82"))) {
				return "CLAYBLOCK";
			} else if (arg.equalsIgnoreCase("JUKEBOX") || (arg.equalsIgnoreCase("84"))) {
				return "JUKEBOX";
			} else if (arg.equalsIgnoreCase("FENCE") || (arg.equalsIgnoreCase("85"))) {
				return "FENCE";
			} else if (arg.equalsIgnoreCase("PUMPKIN") || (arg.equalsIgnoreCase("86"))) {
				return "PUMPKIN";
			} else if (arg.equalsIgnoreCase("NETHERRACK") || (arg.equalsIgnoreCase("87"))) {
				return "NETHERRACK";
			} else if (arg.equalsIgnoreCase("SOULSAND") || (arg.equalsIgnoreCase("SLOWSAND")) || (arg.equalsIgnoreCase("QUICKSAND")) || (arg.equalsIgnoreCase("88"))) {
				return "SOULSAND";
			} else if (arg.equalsIgnoreCase("GLOWSTONE") || (arg.equalsIgnoreCase("GLOWSTONEBLOCK") ) || (arg.equalsIgnoreCase("89"))) {
				return "GLOWSTONE";
			} else if (arg.equalsIgnoreCase("TRAPDOOR") || (arg.equalsIgnoreCase("96"))) {
				return "TRAPDOOR";
			} else if (arg.equalsIgnoreCase("STONEBRICKS") || (arg.equalsIgnoreCase("STONEBRICK")) || (arg.equalsIgnoreCase("98"))) {
				return "STONEBRICKS";
			} else if (arg.equalsIgnoreCase("MOSSYSTONEBRICKS") || (arg.equalsIgnoreCase("MOSSYSTONEBRICK"))|| (arg.equalsIgnoreCase("98001")) || (arg.equalsIgnoreCase("98:1"))) {
				return "MOSSYSTONEBRICKS";
			} else if (arg.equalsIgnoreCase("CRACKEDSTONEBRICKS") || (arg.equalsIgnoreCase("CRACKEDSTONEBRICK"))|| (arg.equalsIgnoreCase("98002")) || (arg.equalsIgnoreCase("98:2"))) {
				return "CRACKEDSTONEBRICKS";
			} else if (arg.equalsIgnoreCase("CIRCLESTONEBRICKS") || (arg.equalsIgnoreCase("CIRCLESTONEBRICK"))|| (arg.equalsIgnoreCase("98003")) || (arg.equalsIgnoreCase("98:3"))) {
				return "CIRCLESTONEBRICKS";
			} else if (arg.equalsIgnoreCase("IRONBARS") || (arg.equalsIgnoreCase("101"))) {
				return "IRONBARS";
			} else if (arg.equalsIgnoreCase("GLASSPANE") || (arg.equalsIgnoreCase("102"))) {
				return "GLASSPANE";
			} else if (arg.equalsIgnoreCase("VINES") || (arg.equalsIgnoreCase("106"))) {
				return "VINES";
			} else if (arg.equalsIgnoreCase("FENCEGATE") || (arg.equalsIgnoreCase("107"))) {
				return "FENCEGATE";
			} else if (arg.equalsIgnoreCase("BRICKSTAIRS") || (arg.equalsIgnoreCase("108"))) {
				return "BRICKSTAIRS";
			} else if (arg.equalsIgnoreCase("STONEBRICKSTAIRS") || (arg.equalsIgnoreCase("109"))) {
				return "STONEBRICKSTAIRS";
			} else if (arg.equalsIgnoreCase("MYCELIUM") || (arg.equalsIgnoreCase("110"))) {
				return "MYCELIUM";
			} else if (arg.equalsIgnoreCase("LILYPAD") || (arg.equalsIgnoreCase("LILYPADS")) || (arg.equalsIgnoreCase("111"))) {
				return "LILYPAD";
			} else if (arg.equalsIgnoreCase("NETHERBRICK") || (arg.equalsIgnoreCase("NETHERSTONE")) || (arg.equalsIgnoreCase("112"))) {
				return "NETHERBRICK";
			} else if (arg.equalsIgnoreCase("NETHERBRICKFENCE") || (arg.equalsIgnoreCase("NETHERSTONEFENCE")) || (arg.equalsIgnoreCase("113"))) {
				return "NETHERBRICKFENCE";
			} else if (arg.equalsIgnoreCase("NETHERBRICKSTAIRS") || (arg.equalsIgnoreCase("NETHERSTONESTAIRS")) || (arg.equalsIgnoreCase("114"))) {
				return "NETHERBRICKSTAIRS";
			} else if (arg.equalsIgnoreCase("ENCHANTMENTTABLE") || (arg.equalsIgnoreCase("116"))) {
				return "ENCHANTMENTTABLE";
			} else if (arg.equalsIgnoreCase("ENDSTONE") || (arg.equalsIgnoreCase("121"))) {
				return "ENDSTONE";
			} else if (arg.equalsIgnoreCase("DRAGONEGG") || (arg.equalsIgnoreCase("122"))) {
				return "DRAGONEGG";
			} else if (arg.equalsIgnoreCase("REDSTONELAMP") || (arg.equalsIgnoreCase("RSLAMP")) || (arg.equalsIgnoreCase("123"))) {
				return "REDSTONELAMP";
			} else if (arg.equalsIgnoreCase("OAKSLAB") || (arg.equalsIgnoreCase("OAKSLABS")) || (arg.equalsIgnoreCase("126"))) {
				return "OAKSLAB";
			} else if (arg.equalsIgnoreCase("PINESLAB") || (arg.equalsIgnoreCase("PINESLABS")) || (arg.equalsIgnoreCase("126001")) || (arg.equalsIgnoreCase("126:1"))) {
				return "PINESLAB";
			} else if (arg.equalsIgnoreCase("BIRCHSLAB") || (arg.equalsIgnoreCase("BIRCHSLABS")) || (arg.equalsIgnoreCase("126002")) || (arg.equalsIgnoreCase("126:2"))) {
				return "BIRCHSLAB";
			} else if (arg.equalsIgnoreCase("JUNGLESLAB") || (arg.equalsIgnoreCase("JUNGLESLABS")) || (arg.equalsIgnoreCase("126003")) || (arg.equalsIgnoreCase("126:3"))) {
				return "JUNGLESLAB";
			} else if (arg.equalsIgnoreCase("SANDSTONESTAIRS") || (arg.equalsIgnoreCase("128"))) {
				return "SANDSTONESTAIRS";
			} else if (arg.equalsIgnoreCase("IRONSHOVEL") || (arg.equalsIgnoreCase("ISHOVEL")) || (arg.equalsIgnoreCase("256"))) {
				return "IRONSHOVEL";
			} else if (arg.equalsIgnoreCase("IRONPICKAXE") || (arg.equalsIgnoreCase("IPICKAXE")) || (arg.equalsIgnoreCase("IPICK")) || (arg.equalsIgnoreCase("IRONPICK")) || (arg.equalsIgnoreCase("257"))) {
				return "IRONPICKAXE";
			} else if (arg.equalsIgnoreCase("IRONAXE") || (arg.equalsIgnoreCase("IAXE")) || (arg.equalsIgnoreCase("IRONHATCHET")) || (arg.equalsIgnoreCase("IHATCHET")) || (arg.equalsIgnoreCase("258"))) {
				return "IRONAXE";
			} else if (arg.equalsIgnoreCase("IRONSHOVEL") || (arg.equalsIgnoreCase("ISHOVEL")) || (arg.equalsIgnoreCase("256"))) {
				return "IRONSHOVEL";
			} else if (arg.equalsIgnoreCase("FLINTANDSTEEL") || (arg.equalsIgnoreCase("FLINTSTEEL")) || (arg.equalsIgnoreCase("259"))) {
				return "FLINTANDSTEEL";
			} else if (arg.equalsIgnoreCase("APPLE") || (arg.equalsIgnoreCase("REDAPPLE")) || (arg.equalsIgnoreCase("260"))) {
				return "APPLE";
			} else if (arg.equalsIgnoreCase("BOW") || (arg.equalsIgnoreCase("261"))) {
				return "BOW";
			} else if (arg.equalsIgnoreCase("ARROW") || (arg.equalsIgnoreCase("ARROWS")) || (arg.equalsIgnoreCase("262"))) {
				return "ARROW";
			} else if (arg.equalsIgnoreCase("COAL") || (arg.equalsIgnoreCase("263")) || (arg.equalsIgnoreCase("263:0"))) {
				return "COAL";
			} else if (arg.equalsIgnoreCase("CHARCOAL") || (arg.equalsIgnoreCase("263:1"))) {
				return "CHARCOAL";
			} else if (arg.equalsIgnoreCase("DIAMOND") || (arg.equalsIgnoreCase("264"))) {
				return "DIAMOND";
			} else if (arg.equalsIgnoreCase("IRONINGOT") || (arg.equalsIgnoreCase("IRON")) || (arg.equalsIgnoreCase("265"))) {
				return "IRONINGOT";
			} else if (arg.equalsIgnoreCase("GOLDINGOT") || (arg.equalsIgnoreCase("GOLD")) || (arg.equalsIgnoreCase("266"))) {
				return "GOLDINGOT";
			} else if (arg.equalsIgnoreCase("IRONSWORD") || (arg.equalsIgnoreCase("ISWORD")) || (arg.equalsIgnoreCase("267"))) {
				return "IRONSWORD";
			} else if (arg.equalsIgnoreCase("WOODENSWORD") || (arg.equalsIgnoreCase("WSWORD")) || (arg.equalsIgnoreCase("268"))) {
				return "WOODENSWORD";
			} else if (arg.equalsIgnoreCase("WOODENSHOVEL") || (arg.equalsIgnoreCase("WSHOVEL")) || (arg.equalsIgnoreCase("269"))) {
				return "WOODENSHOVEL";
			} else if (arg.equalsIgnoreCase("WOODENPICKAXE") || (arg.equalsIgnoreCase("WPICKAXE")) || (arg.equalsIgnoreCase("WPICK")) || (arg.equalsIgnoreCase("WOODENPICK")) || (arg.equalsIgnoreCase("270"))) {
				return "WOODENPICKAXE";
			} else if (arg.equalsIgnoreCase("WOODENAXE") || (arg.equalsIgnoreCase("WAXE")) || (arg.equalsIgnoreCase("WOODENHATCHET")) || (arg.equalsIgnoreCase("WHATCHET")) || (arg.equalsIgnoreCase("271"))) {
				return "WOODENAXE";
			}  else if (arg.equalsIgnoreCase("STONESWORD") || (arg.equalsIgnoreCase("SSWORD")) || (arg.equalsIgnoreCase("272"))) {
				return "STONESWORD";
			} else if (arg.equalsIgnoreCase("STONESHOVEL") || (arg.equalsIgnoreCase("SSHOVEL")) || (arg.equalsIgnoreCase("273"))) {
				return "STONESHOVEL";
			} else if (arg.equalsIgnoreCase("STONEPICKAXE") || (arg.equalsIgnoreCase("SPICKAXE")) || (arg.equalsIgnoreCase("SPICK")) || (arg.equalsIgnoreCase("STONEPICK")) || (arg.equalsIgnoreCase("274"))) {
				return "STONEPICKAXE";
			} else if (arg.equalsIgnoreCase("STONEAXE") || (arg.equalsIgnoreCase("SAXE")) || (arg.equalsIgnoreCase("STONEHATCHET")) || (arg.equalsIgnoreCase("SHATCHET")) || (arg.equalsIgnoreCase("275"))) {
				return "STONEAXE";
			} else if (arg.equalsIgnoreCase("DIAMONDSWORD") || (arg.equalsIgnoreCase("DSWORD")) || (arg.equalsIgnoreCase("276"))) {
				return "DIAMONDSWORD";
			} else if (arg.equalsIgnoreCase("DIAMONDSHOVEL") || (arg.equalsIgnoreCase("DSHOVEL")) || (arg.equalsIgnoreCase("277"))) {
				return "DIAMONDSHOVEL";
			} else if (arg.equalsIgnoreCase("DIAMONDPICKAXE") || (arg.equalsIgnoreCase("DPICKAXE")) || (arg.equalsIgnoreCase("DPICK")) || (arg.equalsIgnoreCase("DIAMONDPICK")) || (arg.equalsIgnoreCase("278"))) {
				return "DIAMONDPICKAXE";
			} else if (arg.equalsIgnoreCase("DIAMONDAXE") || (arg.equalsIgnoreCase("DAXE")) || (arg.equalsIgnoreCase("DIAMONDHATCHET")) || (arg.equalsIgnoreCase("DHATCHET")) || (arg.equalsIgnoreCase("279"))) {
				return "DIAMONDAXE";
			} else if (arg.equalsIgnoreCase("STICK") || (arg.equalsIgnoreCase("WOODENSTICK")) || (arg.equalsIgnoreCase("280"))) {
				return "STICK";
			} else if (arg.equalsIgnoreCase("BOWL") || (arg.equalsIgnoreCase("281"))) {
				return "BOWL";
			} else if (arg.equalsIgnoreCase("MUSHROOMSOUP") || (arg.equalsIgnoreCase("282"))) {
				return "MUSHROOMSOUP";
			} else if (arg.equalsIgnoreCase("GOLDSWORD") || (arg.equalsIgnoreCase("GSWORD")) || (arg.equalsIgnoreCase("283"))) {
				return "GOLDSWORD";
			} else if (arg.equalsIgnoreCase("GOLDSHOVEL") || (arg.equalsIgnoreCase("GSHOVEL")) || (arg.equalsIgnoreCase("284"))) {
				return "GOLDSHOVEL";
			} else if (arg.equalsIgnoreCase("GOLDPICKAXE") || (arg.equalsIgnoreCase("GPICKAXE")) || (arg.equalsIgnoreCase("GPICK")) || (arg.equalsIgnoreCase("GOLDPICK")) || (arg.equalsIgnoreCase("285"))) {
				return "GOLDPICKAXE";
			} else if (arg.equalsIgnoreCase("GOLDAXE") || (arg.equalsIgnoreCase("GAXE")) || (arg.equalsIgnoreCase("GOLDHATCHET")) || (arg.equalsIgnoreCase("GHATCHET")) || (arg.equalsIgnoreCase("286"))) {
				return "GOLDAXE";
			} else if (arg.equalsIgnoreCase("STRING") || (arg.equalsIgnoreCase("287"))) {
				return "STRING";
			} else if (arg.equalsIgnoreCase("FEATHER") || (arg.equalsIgnoreCase("288"))) {
				return "FEATHER";
			} else if (arg.equalsIgnoreCase("GUNPOWDER") || (arg.equalsIgnoreCase("289"))) {
				return "GUNPOWDER";
			} else if (arg.equalsIgnoreCase("WOODENHOE") || (arg.equalsIgnoreCase("WHOE")) || (arg.equalsIgnoreCase("290"))) {
				return "WOODENHOE";
			} else if (arg.equalsIgnoreCase("STONEHOE") || (arg.equalsIgnoreCase("SHOE")) || (arg.equalsIgnoreCase("291"))) {
				return "STONEHOE";
			} else if (arg.equalsIgnoreCase("IRONHOE") || (arg.equalsIgnoreCase("IHOE")) || (arg.equalsIgnoreCase("292"))) {
				return "IRONHOE";
			} else if (arg.equalsIgnoreCase("DIAMONDHOE") || (arg.equalsIgnoreCase("DHOE")) || (arg.equalsIgnoreCase("293"))) {
				return "DIAMONDHOE";
			} else if (arg.equalsIgnoreCase("GOLDHOE") || (arg.equalsIgnoreCase("GHOE")) || (arg.equalsIgnoreCase("294"))) {
				return "GOLDHOE";
			} else if (arg.equalsIgnoreCase("SEEDS") || (arg.equalsIgnoreCase("295"))) {
				return "SEEDS";
			} else if (arg.equalsIgnoreCase("WHEAT") || (arg.equalsIgnoreCase("296"))) {
				return "WHEAT";
			} else if (arg.equalsIgnoreCase("BREAD") || (arg.equalsIgnoreCase("297"))) {
				return "BREAD";
			} else if (arg.equalsIgnoreCase("LEATHERCAP") || (arg.equalsIgnoreCase("LEATHERHELMET")) || (arg.equalsIgnoreCase("298"))) {
				return "LEATHERCAP";
			} else if (arg.equalsIgnoreCase("LEATHERTUNIC") || (arg.equalsIgnoreCase("LEATHERCHESTPLATE")) || (arg.equalsIgnoreCase("299"))) {
				return "LEATHERTUNIC";
			} else if (arg.equalsIgnoreCase("LEATHERPANTS") || (arg.equalsIgnoreCase("LEATHERLEGGINGS")) || (arg.equalsIgnoreCase("300"))) {
				return "LEATHERPANTS";
			} else if (arg.equalsIgnoreCase("LEATHERBOOTS") || (arg.equalsIgnoreCase("301"))) {
				return "LEATHERBOOTS";
			} else if (arg.equalsIgnoreCase("CHAINMAILHELMET") || (arg.equalsIgnoreCase("CMHELMET")) || (arg.equalsIgnoreCase("302"))) {
				return "CHAINMAILHELMET";
			} else if (arg.equalsIgnoreCase("CHAINMAILCHESTPLATE") || (arg.equalsIgnoreCase("CMCHESTPLATE")) || (arg.equalsIgnoreCase("303"))) {
				return "CHAINMAILCHESTPLATE";
			} else if (arg.equalsIgnoreCase("CHAINMAILLEGGINGS") || (arg.equalsIgnoreCase("CMLEGGINGS")) || (arg.equalsIgnoreCase("304"))) {
				return "CHAINMAILLEGGINGS";
			} else if (arg.equalsIgnoreCase("CHAINMAILBOOTS") || (arg.equalsIgnoreCase("CMBOOTS")) || (arg.equalsIgnoreCase("305"))) {
				return "CHAINMAILBOOTS";
			} else if (arg.equalsIgnoreCase("IRONHELMET") || (arg.equalsIgnoreCase("IHELMET")) || (arg.equalsIgnoreCase("306"))) {
				return "IRONHELMET";
			} else if (arg.equalsIgnoreCase("IRONCHESTPLATE") || (arg.equalsIgnoreCase("ICHESTPLATE")) || (arg.equalsIgnoreCase("307"))) {
				return "IRONCHESTPLATE";
			} else if (arg.equalsIgnoreCase("IRONLEGGINGS") || (arg.equalsIgnoreCase("ILEGGINGS")) || (arg.equalsIgnoreCase("308"))) {
				return "IRONLEGGINGS";
			} else if (arg.equalsIgnoreCase("IRONBOOTS") || (arg.equalsIgnoreCase("IBOOTS")) || (arg.equalsIgnoreCase("309"))) {
				return "IRONBOOTS";
			} else if (arg.equalsIgnoreCase("DIAMONDHELMET") ||(arg.equalsIgnoreCase("DHELMET")) ||  (arg.equalsIgnoreCase("310"))) {
				return "DIAMONDHELMET";
			} else if (arg.equalsIgnoreCase("DIAMONDCHESTPLATE") ||(arg.equalsIgnoreCase("DCHESTPLATE")) ||  (arg.equalsIgnoreCase("311"))) {
				return "DIAMONDCHESTPLATE";
			} else if (arg.equalsIgnoreCase("DIAMONDLEGGINGS") ||(arg.equalsIgnoreCase("DLEGGINGS")) ||  (arg.equalsIgnoreCase("312"))) {
				return "DIAMONDLEGGINGS";
			} else if (arg.equalsIgnoreCase("DIAMONDBOOTS") ||(arg.equalsIgnoreCase("DBOOTS")) ||  (arg.equalsIgnoreCase("313"))) {
				return "DIAMONDBOOTS";
			} else if (arg.equalsIgnoreCase("GOLDHELMET") ||(arg.equalsIgnoreCase("GHELMET")) ||  (arg.equalsIgnoreCase("314"))) {
				return "GOLDHELMET";
			} else if (arg.equalsIgnoreCase("GOLDCHESTPLATE") ||(arg.equalsIgnoreCase("GCHESTPLATE")) ||  (arg.equalsIgnoreCase("315"))) {
				return "GOLDCHESTPLATE";
			} else if (arg.equalsIgnoreCase("GOLDLEGGINGS") ||(arg.equalsIgnoreCase("GLEGGINGS")) ||  (arg.equalsIgnoreCase("316"))) {
				return "GOLDLEGGINGS";
			} else if (arg.equalsIgnoreCase("GOLDBOOTS") ||(arg.equalsIgnoreCase("GBOOTS")) ||  (arg.equalsIgnoreCase("317"))) {
				return "GOLDBOOTS";
			} else if (arg.equalsIgnoreCase("FLINT") || (arg.equalsIgnoreCase("318"))) {
				return "FLINT";
			} else if (arg.equalsIgnoreCase("RAWPORKCHOP") || (arg.equalsIgnoreCase("RAWPORK")) || (arg.equalsIgnoreCase("319"))) {
				return "RAWPORKCHOP";
			} else if (arg.equalsIgnoreCase("COOKEDPORKCHOP") || (arg.equalsIgnoreCase("COOKEDPORK")) || (arg.equalsIgnoreCase("320"))) {
				return "COOKEDPORKCHOP";
			} else if (arg.equalsIgnoreCase("PAINTING") || (arg.equalsIgnoreCase("321"))) {
				return "PAINTING";
			} else if (arg.equalsIgnoreCase("GOLDENAPPLE") || (arg.equalsIgnoreCase("GOLDAPPLE")) || (arg.equalsIgnoreCase("322"))) {
				return "GOLDENAPPLE";
			} else if (arg.equalsIgnoreCase("SIGN") || (arg.equalsIgnoreCase("SIGNPOST")) || (arg.equalsIgnoreCase("323"))) {
				return "SIGN";
			} else if (arg.equalsIgnoreCase("WOODENDOOR") || (arg.equalsIgnoreCase("WOODDOOR")) || (arg.equalsIgnoreCase("324"))) {
				return "WOODENDOOR";
			} else if (arg.equalsIgnoreCase("BUCKET") || (arg.equalsIgnoreCase("BUKKIT")) || (arg.equalsIgnoreCase("325"))) {
				return "BUKKET";
			} else if (arg.equalsIgnoreCase("WATERBUCKET") || (arg.equalsIgnoreCase("326"))) {
				return "WATERBUCKET";
			} else if (arg.equalsIgnoreCase("LAVABUCKET") || (arg.equalsIgnoreCase("327"))) {
				return "LAVABUCKET";
			} else if (arg.equalsIgnoreCase("MINECART") || (arg.equalsIgnoreCase("328"))) {
				return "MINECART";
			} else if (arg.equalsIgnoreCase("SADDLE") || (arg.equalsIgnoreCase("329"))) {
				return "SADDLE";
			} else if (arg.equalsIgnoreCase("IRONDOOR") || (arg.equalsIgnoreCase("330"))) {
				return "IRONDOOR";
			} else if (arg.equalsIgnoreCase("NETHERRACK") || (arg.equalsIgnoreCase("87"))) {
				return "NETHERRACK";
			} else if (arg.equalsIgnoreCase("REDSTONE") || (arg.equalsIgnoreCase("REDSTONEDUST")) || (arg.equalsIgnoreCase("RS")) || (arg.equalsIgnoreCase("331"))) {
				return "REDSTONE";
			} else if (arg.equalsIgnoreCase("SNOWBALL") || (arg.equalsIgnoreCase("332"))) {
				return "SNOWBALL";
			} else if (arg.equalsIgnoreCase("BOAT") || (arg.equalsIgnoreCase("333"))) {
				return "BOAT";
			} else if (arg.equalsIgnoreCase("GOLDORE") || (arg.equalsIgnoreCase("14"))) {
				return "GOLDORE";
			} else if (arg.equalsIgnoreCase("IRONORE") || (arg.equalsIgnoreCase("15"))) {
				return "IRONORE";
			} else if (arg.equalsIgnoreCase("COALORE") || (arg.equalsIgnoreCase("16"))) {
				return "COALORE";
			} else if (arg.equalsIgnoreCase("LAPISLAZULIORE") || (arg.equalsIgnoreCase("21"))) {
				return "LAPISLAZULIORE";
			} else if (arg.equalsIgnoreCase("DIAMONDORE") || (arg.equalsIgnoreCase("56"))) {
				return "DIAMONDORE";
			} else if (arg.equalsIgnoreCase("REDSTONEORE") || (arg.equalsIgnoreCase("73"))) {
				return "REDSTONEORE";
			} else if (arg.equalsIgnoreCase("LEATHER") || (arg.equalsIgnoreCase("334"))) {
				return "LEATHER";
			} else if (arg.equalsIgnoreCase("MILK") || (arg.equalsIgnoreCase("MILKBUCKET")) || (arg.equalsIgnoreCase("BUCKETOFMILK")) || (arg.equalsIgnoreCase("335"))) {
				return "MILK";
			} else if (arg.equalsIgnoreCase("CLAYBRICK") || (arg.equalsIgnoreCase("BRICK")) || (arg.equalsIgnoreCase("336"))) {
				return "BRICK";
			} else if (arg.equalsIgnoreCase("CLAY") || (arg.equalsIgnoreCase("337"))) {
				return "CLAY";
			} else if (arg.equalsIgnoreCase("SUGARCANE") || (arg.equalsIgnoreCase("REED")) || (arg.equalsIgnoreCase("338"))) {
				return "SUGARCANE";
			} else if (arg.equalsIgnoreCase("PAPER") || (arg.equalsIgnoreCase("339"))) {
				return "PAPER";
			} else if (arg.equalsIgnoreCase("BOOK") || (arg.equalsIgnoreCase("340"))) {
				return "BOOK";
			} else if (arg.equalsIgnoreCase("SLIMEBALL") || (arg.equalsIgnoreCase("SLIME")) || (arg.equalsIgnoreCase("341"))) {
				return "SLIMEBALL";
			} else if (arg.equalsIgnoreCase("MINECARTWITHCHEST") || (arg.equalsIgnoreCase("342"))) {
				return "MINECARTWITHCHEST";
			} else if (arg.equalsIgnoreCase("MINECARTWITHFURNACE") || (arg.equalsIgnoreCase("POWEREDMINECART")) ||  (arg.equalsIgnoreCase("343"))) {
				return "MINECARTWITHFURNACE";
			} else if (arg.equalsIgnoreCase("EGG") || (arg.equalsIgnoreCase("344"))) {
				return "EGG";
			} else if (arg.equalsIgnoreCase("COMPASS") || (arg.equalsIgnoreCase("345"))) {
				return "COMPASS";
			} else if (arg.equalsIgnoreCase("FISHINGROD") || (arg.equalsIgnoreCase("346"))) {
				return "FISHINGROD";
			} else if (arg.equalsIgnoreCase("CLOCK") || (arg.equalsIgnoreCase("347"))) {
				return "CLOCK";
			} else if (arg.equalsIgnoreCase("GLOWSTONEDUST") || (arg.equalsIgnoreCase("348"))) {
				return "GLOWSTONEDUST";
			} else if (arg.equalsIgnoreCase("RAWFISH") || (arg.equalsIgnoreCase("349"))) {
				return "RAWFISH";
			} else if (arg.equalsIgnoreCase("COOKEDFISH") || (arg.equalsIgnoreCase("350"))) {
				return "COOKEDFISH";
			} else if (arg.equalsIgnoreCase("INK") || (arg.equalsIgnoreCase("INKSACK")) || (arg.equalsIgnoreCase("351"))) {
				return "INK";
			} else if (arg.equalsIgnoreCase("REDINK") || (arg.equalsIgnoreCase("REDDYE")) || (arg.equalsIgnoreCase("ROSERED")) || (arg.equalsIgnoreCase("351:1"))) {
				return "REDINK";
			} else if (arg.equalsIgnoreCase("GREENINK") || (arg.equalsIgnoreCase("GREENDYE")) || (arg.equalsIgnoreCase("CACTUSGREEN")) || (arg.equalsIgnoreCase("351:2"))) {
				return "GREENINK";
			}  else if (arg.equalsIgnoreCase("BROWNINK") || (arg.equalsIgnoreCase("BROWNDYE")) || (arg.equalsIgnoreCase("COCOABEANBROWN")) || (arg.equalsIgnoreCase("351:3"))) {
				return "BROWNINK";
			}  else if (arg.equalsIgnoreCase("LAPISLAZULI") || (arg.equalsIgnoreCase("LAPIS")) || (arg.equalsIgnoreCase("LAZULI")) || (arg.equalsIgnoreCase("351:4"))) {
				return "LAPISLAZULI";
			}  else if (arg.equalsIgnoreCase("PURPLEINK") || (arg.equalsIgnoreCase("PURPLEDYE")) || (arg.equalsIgnoreCase("351:5"))) {
				return "PURPLEINK";
			}  else if (arg.equalsIgnoreCase("CYANINK") || (arg.equalsIgnoreCase("CYANDYE")) || (arg.equalsIgnoreCase("351:6"))) {
				return "CYANINK";
			}  else if (arg.equalsIgnoreCase("LIGHTGRAYINK") || (arg.equalsIgnoreCase("LIGHTGRAYDYE")) || (arg.equalsIgnoreCase("LIGHTGREYINK")) || (arg.equalsIgnoreCase("LIGHTGREYDYE")) || (arg.equalsIgnoreCase("351:7"))) {
				return "LIGHTGRAYINK";
			}  else if (arg.equalsIgnoreCase("GRAYINK") || (arg.equalsIgnoreCase("GRAYDYE")) || (arg.equalsIgnoreCase("GREYINK")) || (arg.equalsIgnoreCase("GREYDYE")) || (arg.equalsIgnoreCase("351:8"))) {
				return "GRAYINK";
			}  else if (arg.equalsIgnoreCase("PINKINK") || (arg.equalsIgnoreCase("PINKDYE")) || (arg.equalsIgnoreCase("351:9"))) {
				return "PINKINK";
			}  else if (arg.equalsIgnoreCase("LIMEINK") || (arg.equalsIgnoreCase("LIMEDYE")) || (arg.equalsIgnoreCase("351:10"))) {
				return "LIMEINK";
			}  else if (arg.equalsIgnoreCase("YELLOWINK") || (arg.equalsIgnoreCase("YELLOWDYE")) || (arg.equalsIgnoreCase("DANDELIONYELLOW")) || (arg.equalsIgnoreCase("351:11"))) {
				return "YELLOWINK";
			}  else if (arg.equalsIgnoreCase("LIGHTBLUEINK") || (arg.equalsIgnoreCase("LIGHTBLUEDYE")) || (arg.equalsIgnoreCase("351:12"))) {
				return "LIGHTBLUEINK";
			}  else if (arg.equalsIgnoreCase("MAGENTAINK") || (arg.equalsIgnoreCase("MAGENTADYE")) || (arg.equalsIgnoreCase("351:13"))) {
				return "MAGENTAINK";
			}  else if (arg.equalsIgnoreCase("ORANGEINK") || (arg.equalsIgnoreCase("ORANGEDYE")) || (arg.equalsIgnoreCase("351:14"))) {
				return "ORANGEINK";
			}  else if (arg.equalsIgnoreCase("BONEMEAL") || (arg.equalsIgnoreCase("351:15"))) {
				return "BONEMEAL";
			}  else if (arg.equalsIgnoreCase("BONE") || (arg.equalsIgnoreCase("352"))) {
				return "BONE";
			} else if (arg.equalsIgnoreCase("SUGAR") || (arg.equalsIgnoreCase("353"))) {
				return "SUGAR";
			} else if (arg.equalsIgnoreCase("CAKE") || (arg.equalsIgnoreCase("354"))) {
				return "CAKE";
			} else if (arg.equalsIgnoreCase("BED") || (arg.equalsIgnoreCase("355"))) {
				return "BED";
			} else if (arg.equalsIgnoreCase("REDSTONEREPEATER") || (arg.equalsIgnoreCase("REPEATER")) || (arg.equalsIgnoreCase("DIODE")) || (arg.equalsIgnoreCase("356"))) {
				return "REPEATER";
			} else if (arg.equalsIgnoreCase("COOKIE") || (arg.equalsIgnoreCase("357"))) {
				return "COOKIE";
			} else if (arg.equalsIgnoreCase("MAP") || (arg.equalsIgnoreCase("358"))) {
				return "MAP";
			} else if (arg.equalsIgnoreCase("SHEARS") || (arg.equalsIgnoreCase("359"))) {
				return "SHEARS";
			} else if (arg.equalsIgnoreCase("MELONSLICE") || (arg.equalsIgnoreCase("MELON")) || (arg.equalsIgnoreCase("360"))) {
				return "MELONSLICE";
			} else if (arg.equalsIgnoreCase("PUMPKINSEED") || (arg.equalsIgnoreCase("PUMPKINSEEDS")) || (arg.equalsIgnoreCase("361"))) {
				return "PUMPKINSEED";
			} else if (arg.equalsIgnoreCase("MELONSEED") || (arg.equalsIgnoreCase("MELONSEEDS")) || (arg.equalsIgnoreCase("362"))) {
				return "MELONSEED";
			} else if (arg.equalsIgnoreCase("RAWBEEF") || (arg.equalsIgnoreCase("363"))) {
				return "RAWBEEF";
			} else if (arg.equalsIgnoreCase("COOKEDBEEF") || (arg.equalsIgnoreCase("STEAK")) || (arg.equalsIgnoreCase("364"))) {
				return "STEAK";
			} else if (arg.equalsIgnoreCase("RAWCHICKEN") || (arg.equalsIgnoreCase("365"))) {
				return "RAWCHICKEN";
			} else if (arg.equalsIgnoreCase("COOKEDCHICKEN") || (arg.equalsIgnoreCase("366"))) {
				return "COOKEDCHICKEN";
			} else if (arg.equalsIgnoreCase("ROTTENFLESH") || (arg.equalsIgnoreCase("367"))) {
				return "ROTTENFLESH";
			} else if (arg.equalsIgnoreCase("ENDERPEARL") || (arg.equalsIgnoreCase("368"))) {
				return "ENDERPEARL";
			} else if (arg.equalsIgnoreCase("BLAZEROD") || (arg.equalsIgnoreCase("369"))) {
				return "BLAZEROD";
			} else if (arg.equalsIgnoreCase("GHASTTEAR") || (arg.equalsIgnoreCase("370"))) {
				return "GHASTTEAR";
			} else if (arg.equalsIgnoreCase("GOLDNUGGET") || (arg.equalsIgnoreCase("371"))) {
				return "GOLDNUGGET";
			} else if (arg.equalsIgnoreCase("NETHERWART") || (arg.equalsIgnoreCase("372"))) {
				return "NETHERWART";
			} else if (arg.equalsIgnoreCase("GLASSBOTTLE") || (arg.equalsIgnoreCase("GLASSVIAL")) || (arg.equalsIgnoreCase("VIAL")) || (arg.equalsIgnoreCase("374"))) {
				return "GLASSBOTTLE";
			} else if (arg.equalsIgnoreCase("SPIDEREYE") || (arg.equalsIgnoreCase("375"))) {
				return "SPIDEREYE";
			} else if (arg.equalsIgnoreCase("BREWINGSTAND") || (arg.equalsIgnoreCase("379"))) {
				return "BREWINGSTAND";
			} else if (arg.equalsIgnoreCase("CAULDRON") || (arg.equalsIgnoreCase("380"))) {
				return "CAULDRON";
			} else if (arg.equalsIgnoreCase("EXPERIENCE") || (arg.equalsIgnoreCase("999")) || (arg.equalsIgnoreCase("EXP")) || (arg.equalsIgnoreCase("EXPPOINTS"))) {
				return "EXPERIENCE";
			} else if (arg.equalsIgnoreCase("POTIONOFREGENERATIONEXTENDED") || (arg.equalsIgnoreCase("373:8257"))) {
				return "POTIONOFREGENERATIONEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFSWIFTNESSEXTENDED")) || (arg.equalsIgnoreCase("373:8258"))) {
				return "POTIONOFSWIFTNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFFIRERESISTANCEEXTENDED")) || (arg.equalsIgnoreCase("373:8259"))) {
				return "POTIONOFFIRERESISTANCEEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFHEALINGEXTENDED")) || (arg.equalsIgnoreCase("373:8261"))) {
				return "POTIONOFHEALINGEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFSTRENGTHEXTENDED")) || (arg.equalsIgnoreCase("373:8265"))) {
				return "POTIONOFSTRENGTHEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFPOISONEXTENDED")) || (arg.equalsIgnoreCase("373:8260"))) {
				return "POTIONOFPOISONEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFWEAKNESSEXTENDED")) || (arg.equalsIgnoreCase("373:8264"))) {
				return "POTIONOFWEAKNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFSLOWNESSEXTENDED")) || (arg.equalsIgnoreCase("373:8266"))) {
				return "POTIONOFSLOWNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFHARMINGEXTENDED")) || (arg.equalsIgnoreCase("373:8268"))) {
				return "POTIONOFHARMINGEXTENDED";
			} else if ((arg.equalsIgnoreCase("POTIONOFREGENERATIONII")) || (arg.equalsIgnoreCase("373:8225"))) {
				return "POTIONOFREGENERATIONII";
			} else if ((arg.equalsIgnoreCase("POTIONOFSWIFTNESSII")) || (arg.equalsIgnoreCase("373:8226"))) {
				return "POTIONOFSWIFTNESSII";
			} else if ((arg.equalsIgnoreCase("POTIONOFFIRERESISTANCEII")) || (arg.equalsIgnoreCase("373:8227"))) {
				return "POTIONOFFIRERESISTANCEII";
			} else if ((arg.equalsIgnoreCase("POTIONOFHEALINGII")) || (arg.equalsIgnoreCase("373:8229"))) {
				return "POTIONOFHEALINGII";
			} else if ((arg.equalsIgnoreCase("POTIONOFSTRENGTHII")) || (arg.equalsIgnoreCase("373:8233"))) {
				return "POTIONOFSTRENGTHII";
			} else if ((arg.equalsIgnoreCase("POTIONOFPOISONII")) || (arg.equalsIgnoreCase("373:8228"))) {
				return "POTIONOFPOISONII";
			} else if ((arg.equalsIgnoreCase("POTIONOFWEAKNESSII")) || (arg.equalsIgnoreCase("373:8232"))) {
				return "POTIONOFWEAKNESSII";
			} else if ((arg.equalsIgnoreCase("POTIONOFSLOWNESSII")) || (arg.equalsIgnoreCase("373:8234"))) {
				return "POTIONOFSLOWNESSII";
			} else if ((arg.equalsIgnoreCase("POTIONOFHARMINGII")) || (arg.equalsIgnoreCase("373:8236"))) {
				return "POTIONOFHARMINGII";
			} else if ((arg.equalsIgnoreCase("POTIONOFREGENERATION")) || (arg.equalsIgnoreCase("373:8193"))) {
				return "POTIONOFREGENERATION";
			} else if ((arg.equalsIgnoreCase("POTIONOFSWIFTNESS")) || (arg.equalsIgnoreCase("373:8194"))) {
				return "POTIONOFSWIFTNESS";
			} else if ((arg.equalsIgnoreCase("POTIONOFFIRERESISTANCE")) || (arg.equalsIgnoreCase("373:8195"))) {
				return "POTIONOFFIRERESISTANCE";
			} else if ((arg.equalsIgnoreCase("POTIONOFHEALING")) || (arg.equalsIgnoreCase("373:8261"))) {
				return "POTIONOFHEALING";
			} else if ((arg.equalsIgnoreCase("POTIONOFSTRENGTH")) || (arg.equalsIgnoreCase("373:8201"))) {
				return "POTIONOFSTRENGTH";
			} else if ((arg.equalsIgnoreCase("POTIONOFPOISON")) || (arg.equalsIgnoreCase("373:8196"))) {
				return "POTIONOFPOISON";
			} else if ((arg.equalsIgnoreCase("POTIONOFWEAKNESS")) || (arg.equalsIgnoreCase("373:8200"))) {
				return "POTIONOFWEAKNESS";
			} else if ((arg.equalsIgnoreCase("POTIONOFSLOWNESS")) || (arg.equalsIgnoreCase("373:8202"))) {
				return "POTIONOFSLOWNESS";
			} else if ((arg.equalsIgnoreCase("POTIONOFHARMING")) || (arg.equalsIgnoreCase("373:8204"))) {
				return "POTIONOFHARMING";
			} else if ((arg.equalsIgnoreCase("AWKWARDPOTION")) || (arg.equalsIgnoreCase("373:16"))) {
				return "AWKWARDPOTION";
			} else if ((arg.equalsIgnoreCase("THICKPOTION")) || (arg.equalsIgnoreCase("373:32"))) {
				return "THICKPOTION";
			} else if ((arg.equalsIgnoreCase("MUNDANEPOTIONEXTENDED")) || (arg.equalsIgnoreCase("373:64"))) {
				return "MUNDANEPOTIONEXTENDED";
			} else if ((arg.equalsIgnoreCase("MUNDANEPOTION")) || (arg.equalsIgnoreCase("373:8192"))) {
				return "MUNDANEPOTION";
			} else if ((arg.equalsIgnoreCase("WATERBOTTLE")) || (arg.equalsIgnoreCase("373:0"))) {
				return "WATTERBOTTLE";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFREGENERATIONEXTENDED")) || (arg.equalsIgnoreCase("373:16449"))) {
				return "SPLASHPOTIONOFREGENERATIONEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSWIFTNESSEXTENDED")) || (arg.equalsIgnoreCase("373:16450"))) {
				return "SPLASHPOTIONOFSWIFTNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFFIRERESISTANCEEXTENDED")) || (arg.equalsIgnoreCase("373:16451"))) {
				return "SPLASHPOTIONOFFIRERESISTANCEEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHEALINGEXTENDED")) || (arg.equalsIgnoreCase("373:16453"))) {
				return "SPLASHPOTIONOFHEALINGEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSTRENGTHEXTENDED")) || (arg.equalsIgnoreCase("373:16457"))) {
				return "SPLASHPOTIONOFSTRENGTHEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFPOISONEXTENDED")) || (arg.equalsIgnoreCase("373:16452"))) {
				return "SPLASHPOTIONOFPOISONEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFWEAKNESSEXTENDED")) || (arg.equalsIgnoreCase("373:16456"))) {
				return "SPLASHPOTIONOFWEAKNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSLOWNESSEXTENDED")) || (arg.equalsIgnoreCase("373:16458"))) {
				return "SPLASHPOTIONOFSLOWNESSEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHARMINGEXTENDED")) || (arg.equalsIgnoreCase("373:16460"))) {
				return "SPLASHPOTIONOFHARMINGEXTENDED";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFREGENERATIONII")) || (arg.equalsIgnoreCase("373:16417"))) {
				return "SPLASHPOTIONOFREGENERATIONII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSWIFTNESSII")) || (arg.equalsIgnoreCase("373:16418"))) {
				return "SPLASHPOTIONOFSWIFTNESSII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFFIRERESISTANCEII")) || (arg.equalsIgnoreCase("373:16419"))) {
				return "SPLASHPOTIONOFFIRERESISTANCEII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHEALINGII")) || (arg.equalsIgnoreCase("373:16421"))) {
				return "SPLASHPOTIONOFHEALINGII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSTRENGTHII")) || (arg.equalsIgnoreCase("373:16425"))) {
				return "SPLASHPOTIONOFSTRENGTHII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFPOISONII")) || (arg.equalsIgnoreCase("373:16420"))) {
				return "SPLASHPOTIONOFPOISONII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFWEAKNESSII")) || (arg.equalsIgnoreCase("373:16424"))) {
				return "SPLASHPOTIONOFWEAKNESSII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSLOWNESSII")) || (arg.equalsIgnoreCase("373:16426"))) {
				return "SPLASHPOTIONOFSLOWNESSII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHARMINGII")) || (arg.equalsIgnoreCase("373:16428"))) {
				return "SPLASHPOTIONOFHARMINGII";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFREGENERATION")) || (arg.equalsIgnoreCase("373:16385"))) {
				return "SPLASHPOTIONOFREGENERATION";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSWIFTNESS")) || (arg.equalsIgnoreCase("373:16386"))) {
				return "SPLASHPOTIONOFSWIFTNESS";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFFIRERESISTANCE")) || (arg.equalsIgnoreCase("373:16387"))) {
				return "SPLASHPOTIONOFFIRERESISTANCE";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHEALING")) || (arg.equalsIgnoreCase("373:16389"))) {
				return "SPLASHPOTIONOFHEALING";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSTRENGTH")) || (arg.equalsIgnoreCase("373:16393"))) {
				return "SPLASHPOTIONOFSTRENGTH";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFPOISON")) || (arg.equalsIgnoreCase("373:16388"))) {
				return "SPLASHPOTIONOFPOISON";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFWEAKNESS")) || (arg.equalsIgnoreCase("373:16392"))) {
				return "SPLASHPOTIONOFWEAKNESS";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFSLOWNESS")) || (arg.equalsIgnoreCase("373:16394"))) {
				return "SPLASHPOTIONOFSLOWNESS";
			} else if ((arg.equalsIgnoreCase("SPLASHPOTIONOFHARMING")) || (arg.equalsIgnoreCase("373:16396"))) {
				return "SPLASHPOTIONOFHARMING";
			} else if ((arg.equalsIgnoreCase("SPLASHMUNDANEPOTION")) || (arg.equalsIgnoreCase("373:16384"))) {
					return "SPLASHMUNDANEPOTION";
			} else if (arg.equalsIgnoreCase("MUSICDISK13") || (arg.equalsIgnoreCase("2256"))) {
				return "MUSICDISK13";
			} else if (arg.equalsIgnoreCase("MUSICDISKCAT") || (arg.equalsIgnoreCase("2257"))) {
				return "MUSICDISKCAT";
			} else if (arg.equalsIgnoreCase("MUSICDISKBLOCKS") || (arg.equalsIgnoreCase("2258"))) {
				return "MUSICDISKBLOCKS";
			} else if (arg.equalsIgnoreCase("MUSICDISKCHIRP") || (arg.equalsIgnoreCase("2259"))) {
				return "MUSICDISKCHIRP";
			} else if (arg.equalsIgnoreCase("MUSICDISKFAR") || (arg.equalsIgnoreCase("2260"))) {
				return "MUSICDISKFAR";
			} else if (arg.equalsIgnoreCase("MUSICDISKMALL") || (arg.equalsIgnoreCase("2261"))) {
				return "MUSICDISKMALL";
			} else if (arg.equalsIgnoreCase("MUSICDISKMELLOHI") || (arg.equalsIgnoreCase("2262"))) {
				return "MUSICDISKMELLOHI";
			} else if (arg.equalsIgnoreCase("MUSICDISKSTAL") || (arg.equalsIgnoreCase("2263"))) {
				return "MUSICDISKSTAL";
			} else if (arg.equalsIgnoreCase("MUSICDISKSTRAD") || (arg.equalsIgnoreCase("2264"))) {
				return "MUSICDISKSTRAD";
			} else if (arg.equalsIgnoreCase("MUSICDISKWARD") || (arg.equalsIgnoreCase("2265"))) {
				return "MUSICDISKWARD";
			} else if (arg.equalsIgnoreCase("MUSICDISK11") || (arg.equalsIgnoreCase("2266"))) {
				return "MUSICDISK11";
			} else {
				return "";
			}
			
	}
	
public boolean getPrice(Player player, String[] args) {
	int amt = 0;
	String stringPlay = player.getName();
	double total = 0;
	if ((args.length < 1) || (args.length > 3)) {
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/price [Item]");
		 Utility.writeToLog(stringPlay + " incorrectly called /price");
		 return false;
	 } else if (args.length == 1) {
		 String item = "";
		 if (args[0].equalsIgnoreCase("hand")) {
			 int id = player.getInventory().getItemInHand().getTypeId();
			 int dur = player.getInventory().getItemInHand().getDurability();
			 
			 if (id == 17) {
				 if (dur == 1) {
					// dur = 2;
				 } else if (dur == 2) {
					// dur = 1;
				 }
			 }
			 
			 String name = "";
			 
			 if (dur == 0) {
				 name = String.valueOf(id);
			 } else {
				 name = id + ":" + dur;
			 }
			 
			 item = getTrueName(name);
		 } else {
			 item = getTrueName(args[0]);
		 }
		 
		 if (item.equals("")) {
			 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2This item does not exist.");
			 Utility.writeToLog(stringPlay + " called /price on non-existant item " + args[0]);
		 }
		 
		 decFormat.applyPattern("#.##");
		 
		 String reqDesc = item + ".description";
		 
		 String[] itemInfo = getAllInfo(item);
		 Double price = Double.parseDouble(itemInfo[1]);
		 int stock = Integer.parseInt(itemInfo[5]);
		 String desc = itemConfig.getString(reqDesc,"");
		 String priceStr = decFormat.format(price);
//		 int itemID = Integer.parseInt(itemInfo[6]);
		 
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2-----------------------------------");
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price of &f" + item + "&2 is &f" + DynamicEconomy.currencySymbol + priceStr);
	     color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Description: &f" + desc);
			if (DynamicEconomy.usestock){	
				color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Stock: &f" + stock);
			}
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2-----------------------------------");
		 Utility.writeToLog(stringPlay + " called /price for item " + item);
			return true;
	 } else if (args.length == 2){
		 amt = DynamicEconomy.defaultAmount;
	 } else if (args.length == 3){
		 String reqID = getTrueName(args[0]) + ".id";
		 long itemID = itemConfig.getLong(reqID);
		 String reqStock = getTrueName(args[0]) + ".stock";
		 int stock = itemConfig.getInt(reqStock);
		 
		 String type1 = args[1];
		 
		 if ((args[2].equalsIgnoreCase("all")) && (type1.equals("sell"))){
				amt = inv.getAmountOf(player, (int)itemID);
				amt--;
			} else if ((args[2].equalsIgnoreCase("all")) && (type1.equals("buy"))) {
				amt = stock;
			} else {
				amt = Integer.parseInt(args[2]);
			}
	 } 
	
	String item = getTrueName(args[0]);
	String type = args[1];
	String reqDesc = item + ".description";
	double tax;
	
	
	String[] itemInfo = getAllInfo(item);
	
	Double price = Double.parseDouble(itemInfo[1]);
	Double floor = Double.parseDouble(itemInfo[2]);
	Double ceiling = Double.parseDouble(itemInfo[3]);
	Double velocity = Double.parseDouble(itemInfo[4]);
	int stock = Integer.parseInt(itemInfo[5]);
//	int id = Integer.parseInt(itemInfo[6]);
	String desc = itemConfig.getString(reqDesc,"");
	
	if (DynamicEconomy.useboundaries != true) {
		floor = .01;
		ceiling = 1000000000.0;
	}
	
	if (type.equalsIgnoreCase("sale") || type.equalsIgnoreCase("sell")) {
		total = 0;
//		double newPrice = 0;
		
		if (DynamicEconomy.usePercentVelocity) {
			for (int x = 0; x < amt; x++) {
				price = price * (Math.pow((1-velocity),amt));
			
				if (price > ceiling) {
					price = ceiling;
				}
				if (price < floor) {
					price = floor;
				}
			
				total += price;
			}
		} else {
			for (int x = 0; x < amt; x++) {
				if (price == floor) {
					price = floor;
				} else {
					price = price - velocity;
					if (price < floor) {
						price = floor;
					}
				}
				total += price;
			}	
		}
		
		
		
		tax = DynamicEconomy.salestax * total;
		total -= tax;
		
		
	} else if (type.equalsIgnoreCase("purchase") || type.equalsIgnoreCase("buy")) {
		total = 0;
//		double newPrice;
		
		if (DynamicEconomy.usePercentVelocity) {
			for (int x = 0; x < amt; x++) {
				total += price;
				price = price / (Math.pow((1 - velocity), amt));
			
				if (price > ceiling) {
				price = ceiling;
				}
				if (price < floor) {
				price = floor;
				}
			}
		} else {
			for (int x = 0; x < amt; x++) {
				total += price;	
				if (price == ceiling) {
					price = ceiling;
				} else {
					price = price + velocity;
					if (price > ceiling) {
						price = ceiling;
					}
				}
		}
		}
		
		
		
		tax = DynamicEconomy.purchasetax * total;
		total += tax;
	} else {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2The type &f" + type + "&2 does not exist. Use either buy or sell.");
		Utility.writeToLog(stringPlay + " called invalid type '" + type + "'");
		return false;
	}
	String priceStr = decFormat.format(price);
	String totalStr = decFormat.format(total);
	tax = Double.valueOf(decFormat.format(tax));
	
	color.sendColouredMessage(player, DynamicEconomy.prefix + "&2-----------------------------------");
	color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price of &f" + item + "&2 is &f" + DynamicEconomy.currencySymbol + priceStr);
	color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Description: &f" + desc);
	if (DynamicEconomy.usestock){	
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Stock: &f" + stock);
	}
	if (type.equalsIgnoreCase("sale") || type.equalsIgnoreCase("sell")) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Selling &f" + amt + "&2 of &f" + item + "&2 + " + DynamicEconomy.currencySymbol + tax + " tax &fyields &2" + totalStr);
	} else if (type.equalsIgnoreCase("purchase") || type.equalsIgnoreCase("buy")) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Buying &f" + amt + "&2 of &f" + item + "&2 + " + DynamicEconomy.currencySymbol + tax + " tax &fcosts &2" + totalStr);
	}
	color.sendColouredMessage(player, DynamicEconomy.prefix + "&2-----------------------------------");
	if (args.length == 2) {
		Utility.writeToLog(stringPlay + " called /price " + args[0] + " " + args[1]);
	} else if (args.length == 3) {
		Utility.writeToLog(stringPlay + " called /price " + args[0] + " " + args[1] + " " + args[2]);
	}
	return true;
}


public void setPrice(Player player, String[] args) {
	String stringPlay = player.getName();
	if (args.length !=2) {
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/setprice [Item] [Price]");
		 Utility.writeToLog(stringPlay + " incorrectly called /setprice");
	 } else {
	String item = getTrueName(args[0]);
	
	String reqFloor = item + ".floor";
	String reqCeiling = item + ".ceiling";
	
	Double price = Double.parseDouble(args[1]);
	Double oldPrice = itemConfig.getDouble(item + ".price",0);
	Double changePrice = price - oldPrice;
	
	Double floor = itemConfig.getDouble(reqFloor,0);
	Double ceiling = itemConfig.getDouble(reqCeiling,0);
	
	decFormat.applyPattern("#.##");
	
	price = Double.valueOf(decFormat.format(price));
	floor = Double.valueOf(decFormat.format(floor));
	ceiling = Double.valueOf(decFormat.format(ceiling));
	
	if (item.equals("")) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
		Utility.writeToLog(stringPlay + " called /setprice for the non-existent item '" + item + "'");
	} else {
		
		boolean withinbounds;
		
		if (DynamicEconomy.useboundaries == false) {
			withinbounds = true;
		} else {
			withinbounds = ((price >= floor) && (price <= ceiling));
		}
		
		if (withinbounds) {
			String request = item + ".price";
			itemConfig.set(request, price);
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price of " + item + " set to &f" + DynamicEconomy.currencySymbol + price);
			saveItemFile();
			Utility.writeToLog(stringPlay + " set the price of " + item + " to " + price);
			dataSigns.checkForUpdates(item, 0, changePrice);
		} else {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Desired price is not within bounds.");
			color.sendColouredMessage(player, DynamicEconomy.prefix +  "&2MIN: &f" + DynamicEconomy.currencySymbol + floor + " &2MAX: &f" + DynamicEconomy.currencySymbol + ceiling);
			Utility.writeToLog(stringPlay + " attempted to set the price of " + item + "outside of bounds");
		}
		
	}
}
	
	
	
}



public static void saveItemFile(){
	try {
		itemConfig.save(itemsFile);
	} catch (Exception e) {
		log.info("[DynamicEconomy] IOException saving Items.yml.");
		Utility.writeToLog("[DynamicEconomy] IOException saving Items.yml.");
	}
}



public void setFloor(Player player, String[] args) {
	String stringPlay = player.getName();
 if (args.length !=2) {
	 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/setfloor [Item] [FloorPrice]");
	 Utility.writeToLog(stringPlay + " incorrectly called /setfloor");
 } else if (DynamicEconomy.useboundaries == false) {
	 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Boundaries such as floor and ceiling are disabled.");
	 Utility.writeToLog(stringPlay + " called /setfloor, but boundaries are disabled");
 } else {
	String item = getTrueName(args[0]);
	
	Double floor = Double.parseDouble(args[1]);
	Double oldFloor = itemConfig.getDouble(item + ".floor",0);
	Double change = floor - oldFloor;
	
	String request = item + ".floor";
	String priceRequest = item + ".price";
	Double price = itemConfig.getDouble(priceRequest,0);
	
	decFormat.applyPattern("#.##");
	
	price = Double.valueOf(decFormat.format(price));
	floor = Double.valueOf(decFormat.format(floor));
	
	boolean withinbounds;
	
	if (DynamicEconomy.useboundaries == false) {
		withinbounds = true;
	} else {
		withinbounds = (floor < price);
	}
	
	if (item.equals("")) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
		Utility.writeToLog(stringPlay + " attempted to set the floor of the non-existent item '" + item + "'");
	} else { 
		if (withinbounds == false) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2The price of " + item + " is lower than desired floor.");
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2You must increase price above desired floor, or set lower floor.");
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2DESIRED FLOOR: &f" + DynamicEconomy.currencySymbol + floor + " PRICE: &f" + DynamicEconomy.currencySymbol + price);
			Utility.writeToLog(stringPlay + " attempted to set floor of " + item + " to " + floor + ", but the price is lower than the desired floor.");
		} else {
			itemConfig.set(request,floor);
			saveItemFile();
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price Floor of &f" + item + " set to&f " + DynamicEconomy.currencySymbol + floor);
			Utility.writeToLog(stringPlay + " set the floor of " + item + " to " + floor);
			dataSigns.checkForUpdatesNonRegular(item, 0, 0, change);
		}
	}
	
 } 
}

public void setCeiling(Player player, String[] args) {
	String stringPlay = player.getName();
if (args.length !=2) {
   color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/setceiling [Item] [FloorPrice]");
   Utility.writeToLog(stringPlay + " incorrectly called /setceiling");
} else if (DynamicEconomy.useboundaries == false) {
	 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Boundaries such as floor and ceiling are disabled.");
	 Utility.writeToLog(stringPlay + " called /setceiling, but boundaries are disabled.");
} else {
	String item = getTrueName(args[0]);
	
	Double ceiling = Double.parseDouble(args[1]);
	Double oldCeiling = itemConfig.getDouble(item + ".ceiling",0);
	Double change = ceiling - oldCeiling;
	
	String request = item + ".ceiling";
	String priceRequest = item + ".price";
	Double price = itemConfig.getDouble(priceRequest,0);
	
	decFormat.applyPattern("#.##");
	
	price = Double.valueOf(decFormat.format(price));
	ceiling = Double.valueOf(decFormat.format(ceiling));
	
	boolean withinbounds;
	
	if (DynamicEconomy.useboundaries == false) {
		withinbounds = true;
	} else {
		withinbounds = (ceiling > price);
	}
	
	if (item.equals("")) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
		Utility.writeToLog(stringPlay + " attempted to set the floor of the non-existent item '" + item + "'");
	} else { 
		if (withinbounds == false) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2The price of " + item + " is higher than desired ceiling.");
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2You must decrease price to below desired ceiling, or set higher ceiling.");
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2DESIRED CEILING: &f" + DynamicEconomy.currencySymbol + ceiling + " PRICE: &f" + DynamicEconomy.currencySymbol + price);
			Utility.writeToLog(stringPlay + " attempted to set ceiling of " + item + " to " + ceiling + ", but the price is higher than the desired ceiling.");
		} else {
			itemConfig.set(request,ceiling);
			saveItemFile();
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price Ceiling of &f" + item + " set to &f" + DynamicEconomy.currencySymbol + ceiling);
			Utility.writeToLog(stringPlay + " set the floor of " + item + " to " + ceiling);
			dataSigns.checkForUpdatesNonRegular(item, 0, change, 0);
		}
	}
	
}
}


public void getFloor(Player player, String[] args) {
	String stringPlay = player.getName();
	if (args.length !=1) {
		   color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/getfloor [Item]");
		   Utility.writeToLog(stringPlay + " incorrectly called /getfloor");

	} else if (DynamicEconomy.useboundaries == false) {
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Boundaries such as floor and ceiling are disabled.");
		   Utility.writeToLog(stringPlay + " called /getfloor, but boundaries are disabled.");

	 } else {
		String item = getTrueName(args[0]);
		String request = item + ".floor";
		
		
		
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
			Utility.writeToLog(stringPlay + " attempted to get the floor of the non-existent item '" + item + "'");
		} else { 
			Double floor = itemConfig.getDouble(request,0);
			decFormat.applyPattern("#.##");
			floor = Double.valueOf(decFormat.format(floor));
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price Floor of &f" + item + " &2is &f" + DynamicEconomy.currencySymbol + floor);
			Utility.writeToLog(stringPlay + " called /getfloor for item '" + item + "'");
		}
		
	}
}



public void getCeiling(Player player, String[] args) {
	String stringPlay = player.getName();
	if (args.length !=1) {
		   color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/getceiling [Item]");
		   Utility.writeToLog(stringPlay + " incorrectly called /getceiling");
	} else if (DynamicEconomy.useboundaries == false) {
		 color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Boundaries such as floor and ceiling are disabled.");
		  Utility.writeToLog(stringPlay + " called /getceiling, but boundaries are disabled.");
	 } else {
		String item = getTrueName(args[0]);
		String request = item + ".ceiling";
		
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
			Utility.writeToLog(stringPlay + " attempted to get the ceiling of the non-existent item '" + item + "'");
		} else { 
			Double ceiling = itemConfig.getDouble(request,0);
			decFormat.applyPattern("#.##");
			ceiling = Double.valueOf(decFormat.format(ceiling));
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Price Ceiling of &f" + item + "&2 is &f" + DynamicEconomy.currencySymbol + ceiling);
			Utility.writeToLog(stringPlay + " called /getceiling for item '" + item + "'");
		}
		
	}
}

public void getVelocity(Player player, String[] args) {
	String stringPlay = player.getName();
	if (args.length !=1) {
		   color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/getvelocity [Item]");
		   Utility.writeToLog(stringPlay + " incorrectly called /getvelocity");
	} else {
		String item = getTrueName(args[0]);
		String request = item + ".velocity";
		
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
			Utility.writeToLog(stringPlay + " attempted to get the velocity of the non-existent item '" + item + "'");
		} else { 
			Double velocity = itemConfig.getDouble(request,0);
			decFormat.applyPattern("#.##");
			velocity = Double.valueOf(decFormat.format(velocity));
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Velocity of &f" + item + " &2is &f" + velocity);
			Utility.writeToLog(stringPlay + " called /getvelocity for item '" + item + "'");
		}
	}
}

public void setVelocity(Player player, String[] args) {
	String stringPlay = player.getName();
	if (args.length !=2) {
		   color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/setvelocity [Item] [Velocity]");
		   Utility.writeToLog(stringPlay + " incorrectly called /setvelocity");
	} else {
		String item = getTrueName(args[0]);
		Double velocity = Double.parseDouble(args[1]);
		Double oldVelocity = itemConfig.getDouble(item + ".velocity",0);
		Double change = velocity - oldVelocity;
		
		decFormat.applyPattern("#.##");
		velocity = Double.valueOf(decFormat.format(velocity));
		
		
		String request = item + ".velocity";
		
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + Messages.itemDoesntExist);
			Utility.writeToLog(stringPlay + " attempted to set the velocity of the non-existent item '" + item + "'");
		} else { 
			itemConfig.set(request,velocity);
			saveItemFile();
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Velocity of &f" + item + " &2set to &f" + velocity);
			Utility.writeToLog(stringPlay + " set the velocity of " + item + " to " + velocity);
			dataSigns.checkForUpdatesNonRegular(item, change, 0, 0);
			
		}
	}
}

public static String[] getAllInfo(String item) {
	item = getTrueName(item);
	
	String requestPrice = item + ".price";
	String requestFloor = item + ".floor";
	String requestCeiling = item + ".ceiling";
	String requestVelocity = item + ".velocity";
	String requestStock = item + ".stock";
	String requestID = item + ".id";
	
	double price = itemConfig.getDouble(requestPrice,0);
	double floor = itemConfig.getDouble(requestFloor,0);
	double ceiling = itemConfig.getDouble(requestCeiling,0);
	double velocity = itemConfig.getDouble(requestVelocity,0);
	int stock = itemConfig.getInt(requestStock,0);
	long id = itemConfig.getLong(requestID,0);
	
	String priceStr = Double.toString(price);
	String floorStr = Double.toString(floor);
	String ceilingStr = Double.toString(ceiling);
	String velocityStr = Double.toString(velocity);
	String stockStr = Integer.toString(stock);
	String idStr = Long.toString(id);
	
	String [] info = {item,priceStr,floorStr,ceilingStr,velocityStr,stockStr,idStr};
	
	return info;
	
}


public static int getMaxDur(String itemName) {
	int maxDur = 0;
	
	if (itemName.equals("WOOD_PICKAXE")) {
		maxDur = Material.WOOD_PICKAXE.getMaxDurability();
	} else if (itemName.equals("WOOD_AXE")) {
		maxDur = Material.WOOD_AXE.getMaxDurability();
	} else if (itemName.equals("WOOD_SPADE")) {
		maxDur = Material.WOOD_SPADE.getMaxDurability();
	} else if (itemName.equals("WOOD_HOE")) {
		maxDur = Material.WOOD_HOE.getMaxDurability();
	} else if (itemName.equals("WOOD_SWORD")) {
		maxDur = Material.WOOD_SWORD.getMaxDurability();
	} 
	
	if (itemName.equals("STONE_PICKAXE")) {
		maxDur = Material.STONE_PICKAXE.getMaxDurability();
	} else if (itemName.equals("STONE_AXE")) {
		maxDur = Material.STONE_AXE.getMaxDurability();
	} else if (itemName.equals("STONE_SPADE")) {
		maxDur = Material.STONE_SPADE.getMaxDurability();
	} else if (itemName.equals("STONE_HOE")) {
		maxDur = Material.STONE_HOE.getMaxDurability();
	} else if (itemName.equals("STONE_SWORD")) {
		maxDur = Material.STONE_SWORD.getMaxDurability();
	}
	
	if (itemName.equals("IRON_PICKAXE")) {
		maxDur = Material.IRON_PICKAXE.getMaxDurability();
	} else if (itemName.equals("IRON_AXE")) {
		maxDur = Material.IRON_AXE.getMaxDurability();
	} else if (itemName.equals("IRON_SPADE")) {
		maxDur = Material.IRON_SPADE.getMaxDurability();
	} else if (itemName.equals("IRON_HOE")) {
		maxDur = Material.IRON_HOE.getMaxDurability();
	} else if (itemName.equals("IRON_SWORD")) {
		maxDur = Material.IRON_SWORD.getMaxDurability();
	}
	
	if (itemName.equals("GOLD_PICKAXE")) {
		maxDur = Material.GOLD_PICKAXE.getMaxDurability();
	} else if (itemName.equals("GOLD_AXE")) {
		maxDur = Material.GOLD_AXE.getMaxDurability();
	} else if (itemName.equals("GOLD_SPADE")) {
		maxDur = Material.GOLD_SPADE.getMaxDurability();
	} else if (itemName.equals("GOLD_HOE")) {
		maxDur = Material.GOLD_HOE.getMaxDurability();
	} else if (itemName.equals("GOLD_SWORD")) {
		maxDur = Material.GOLD_SWORD.getMaxDurability();
	}
	
	if (itemName.equals("DIAMOND_PICKAXE")) {
		maxDur = Material.DIAMOND_PICKAXE.getMaxDurability();
	} else if (itemName.equals("DIAMOND_AXE")) {
		maxDur = Material.DIAMOND_AXE.getMaxDurability();
	} else if (itemName.equals("DIAMOND_SPADE")) {
		maxDur = Material.DIAMOND_SPADE.getMaxDurability();
	} else if (itemName.equals("DIAMOND_HOE")) {
		maxDur = Material.DIAMOND_HOE.getMaxDurability();
	} else if (itemName.equals("DIAMOND_SWORD")) {
		maxDur = Material.DIAMOND_SWORD.getMaxDurability();
	}
	
	// ARMOR
	
	if (itemName.equals("IRON_HELMET")) {
		maxDur = Material.IRON_HELMET.getMaxDurability();
	} else if (itemName.equals("IRON_CHESTPLATE")) {
		maxDur = Material.IRON_CHESTPLATE.getMaxDurability();
	} else if (itemName.equals("IRON_LEGGINGS")) {
		maxDur = Material.IRON_LEGGINGS.getMaxDurability();
	} else if (itemName.equals("IRON_BOOTS")) {
		maxDur = Material.IRON_BOOTS.getMaxDurability();
	} 
	
	if (itemName.equals("GOLD_HELMET")) {
		maxDur = Material.GOLD_HELMET.getMaxDurability();
	} else if (itemName.equals("GOLD_CHESTPLATE")) {
		maxDur = Material.GOLD_CHESTPLATE.getMaxDurability();
	} else if (itemName.equals("GOLD_LEGGINGS")) {
		maxDur = Material.GOLD_LEGGINGS.getMaxDurability();
	} else if (itemName.equals("GOLD_BOOTS")) {
		maxDur = Material.GOLD_BOOTS.getMaxDurability();
	} 
	
	if (itemName.equals("DIAMOND_HELMET")) {
		maxDur = Material.DIAMOND_HELMET.getMaxDurability();
	} else if (itemName.equals("DIAMOND_CHESTPLATE")) {
		maxDur = Material.DIAMOND_CHESTPLATE.getMaxDurability();
	} else if (itemName.equals("DIAMOND_LEGGINGS")) {
		maxDur = Material.DIAMOND_LEGGINGS.getMaxDurability();
	} else if (itemName.equals("DIAMOND_BOOTS")) {
		maxDur = Material.DIAMOND_BOOTS.getMaxDurability();
	} 
	
	if (itemName.equals("LEATHER_HELMET")) {
		maxDur = Material.LEATHER_HELMET.getMaxDurability();
	} else if (itemName.equals("LEATHER_CHESTPLATE")) {
		maxDur = Material.LEATHER_CHESTPLATE.getMaxDurability();
	} else if (itemName.equals("LEATHER_LEGGINGS")) {
		maxDur = Material.LEATHER_LEGGINGS.getMaxDurability();
	} else if (itemName.equals("LEATHER_BOOTS")) {
		maxDur = Material.LEATHER_BOOTS.getMaxDurability();
	} 
	
	
	
	return maxDur;
	
}

public static void banItem(Player player, String[] args) {
	
	if (args.length != 2) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/banitem [Item] [sale|purchase]");
		   Utility.writeToLog(player.getName() + " incorrectly called /banitem");
	} else {
		String item = getTrueName(args[0]);
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2This item does not exist.");
			Utility.writeToLog(player.getName() + " called /banitem on the non-existant item " + args[0]);
		} else {
			if ((args[1].equals("sale")) || (args[1].equals("purchase"))) {
				try {
					DynamicEconomy.config.load(DynamicEconomy.configFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				FileConfiguration conf = DynamicEconomy.config;
				
				String bannedString = "";
				
				if (args[1].equalsIgnoreCase("sale")) {
					bannedString = conf.getString("banned-sale-items","");
				} else if (args[1].equalsIgnoreCase("purchase")) {
					bannedString = conf.getString("banned-purchase-items","");
				}
				
				
				String banToken = "";
				
				if (bannedString.length() == 0) {
					banToken = item;
				} else {
					banToken = "," + item;
				}
				
				if (args[1].equalsIgnoreCase("sale")) {
					conf.set("banned-sale-items",bannedString + banToken);
				} else if (args[1].equalsIgnoreCase("purchase")) {
					conf.set("banned-purchase-items",bannedString + banToken);
				}
				
				try {
					DynamicEconomy.config.save(DynamicEconomy.configFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				DynamicEconomy.relConfig();
				
				color.sendColouredMessage(player, DynamicEconomy.prefix + "&f" + args[0] + "&2 banned from &f" + args[1] + "&2 succesfully.");
				Utility.writeToLog(player.getName() + " banned " + args[0] + " from " + args[1]);
				
			} else {
				color.sendColouredMessage(player, DynamicEconomy.prefix + "&f" + args[1] + "&2 is not a valid type. Only use &fsale &2or &fpurchase");
				Utility.writeToLog(player.getName() + " called /banitem with invalid type '" + args[1] + "'");
			}
		}
		
	}
	
	
	
	
	
}


public static void unbanItem(Player player, String[] args) {
	
	if (args.length != 2) {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/unbanitem [Item] [sale|purchase]");
		   Utility.writeToLog(player.getName() + " incorrectly called /unbanitem");
	} else {
		String item = getTrueName(args[0]);
		if (item.equals("")) {
			color.sendColouredMessage(player, DynamicEconomy.prefix + "&2This item does not exist.");
			Utility.writeToLog(player.getName() + " called /unbanitem on the non-existant item " + args[0]);
		} else {
			if ((args[1].equals("sale")) || (args[1].equals("purchase"))) {
				try {
					DynamicEconomy.config.load(DynamicEconomy.configFile);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				FileConfiguration conf = DynamicEconomy.config;
				
				String bannedString = "";
				String[] bannedArray;
				
				if (args[1].equalsIgnoreCase("sale")) {
					bannedString = conf.getString("banned-sale-items","");
				} else if (args[1].equalsIgnoreCase("purchase")) {
					bannedString = conf.getString("banned-purchase-items","");
				}
				
				bannedArray = bannedString.split(",");
				boolean contains = Arrays.asList(bannedArray).contains(item);
				
				if (contains) {
					ArrayList<String> bannedArrayList = new ArrayList<String>(Arrays.asList(bannedArray));
					bannedArrayList.remove(item);
					
					String newBannedString = "";
					
					for (int x = 0; x < bannedArrayList.size(); x++) {
						if (x == 0) {
							newBannedString = newBannedString + bannedArrayList.get(x);
						} else {
							newBannedString = newBannedString + "," + bannedArrayList.get(x);
						}
					}
					
					if (args[1].equalsIgnoreCase("sale")) {
						conf.set("banned-sale-items",newBannedString);
					} else if (args[1].equalsIgnoreCase("purchase")) {
						conf.set("banned-purchase-items",newBannedString);
					}

					
					try {
						DynamicEconomy.config.save(DynamicEconomy.configFile);
					} catch (Exception e) {
						e.printStackTrace();
					}
					
					DynamicEconomy.relConfig();
					
					color.sendColouredMessage(player, DynamicEconomy.prefix + "&f" + args[0] + "&2 unbanned from &f" + args[1] + "&2 succesfully.");
					Utility.writeToLog(player.getName() + " unbanned " + args[0] + " from " + args[1]);
					
				} else {
					color.sendColouredMessage(player, DynamicEconomy.prefix + "&2This item is not banned.");
					Utility.writeToLog(player.getName() + " called /unbanitem on " + args[0] + " which is not banned.");
				}
				
				
				
				
				
				
				
			} else {
				color.sendColouredMessage(player, DynamicEconomy.prefix + "&f" + args[1] + "&2 is not a valid type. Only use &fsale &2or &fpurchase");
				Utility.writeToLog(player.getName() + " called /unbanitem with invalid type '" + args[1] + "'");
			}
		}
		
	}
	
	
	
	
	
}


public static void getDurCommand(Player player, String[] args) {
	int playerDur;
	String itemName;
	int maxDur;
	double percentDur;	
	int usesLeft;
	String stringPlay = player.getName();
	
	if (args.length == 0) {
		
int slot = player.getInventory().getHeldItemSlot();
		
		ItemStack playerItem = player.getInventory().getItem(slot);
		int itemID = playerItem.getTypeId();
	
		if (((itemID >= 256 ) && (itemID <= 258)) || ((itemID >= 267) && (itemID <= 279)) || ((itemID >= 298) && (itemID <= 317)) || ((itemID >= 283) && (itemID <= 286)) || ((itemID >= 290) && (itemID <= 294))) {
		
		playerDur = playerItem.getDurability();
		
		
		itemName = playerItem.getType().toString();
		
		maxDur = Item.getMaxDur(itemName);
		
		usesLeft = maxDur - playerDur;
		
		percentDur = (double)playerDur / (double)maxDur;
		percentDur *= 100;
		percentDur = 100 - percentDur;
		decFormat.applyPattern("#.##");
		percentDur = Double.valueOf(decFormat.format(percentDur));
		
		color.sendColouredMessage(player, "&2The durability of your item is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
		Utility.writeToLog(stringPlay + " called /getdurability for item with ID of '" + itemID + "'");
		} else {
			color.sendColouredMessage(player, Messages.itemHasNoDurability);
			Utility.writeToLog(stringPlay + " called /getdurability for item with ID of '" + itemID + "', but failed because this item has no durability.");
		}
	} else if (args.length == 1) {
		if (args[0].equalsIgnoreCase("armor")) {
			ItemStack[] armor = player.getInventory().getArmorContents();
			int amountHelmet = armor[0].getAmount();
			int amountChestplate = armor[1].getAmount();
			int amountLeggings = armor[2].getAmount();
			int amountBoots = armor[3].getAmount();
			int amount;
		 if ((amountHelmet == 0) && (amountChestplate == 0) &&  (amountLeggings == 0) &&  (amountBoots == 0)) {	
			 color.sendColouredMessage(player, Messages.noArmorEquipped);
			 Utility.writeToLog(stringPlay + " attempted to call /getdurability armor, but has no armor equipped");
		 } else {
			 for (int x = 0; x < armor.length; x++) {
					playerDur = armor[x].getDurability();
					itemName = armor[x].getType().toString();
					maxDur = Item.getMaxDur(itemName);
					usesLeft = maxDur - playerDur;
					amount = armor[x].getAmount();
					percentDur = (double)playerDur / (double)maxDur;
					percentDur *= 100;
					percentDur = 100 - percentDur;
				if (amount == 0) {	
					if (x == 3) {
						color.sendColouredMessage(player, Messages.noHelmetEquipped);
						Utility.writeToLog(stringPlay + " called /getdurability armor without having a helmet equipped");
					} else if (x == 2) {
						color.sendColouredMessage(player, Messages.noChestplateEquipped);
						Utility.writeToLog(stringPlay + " called /getdurability armor without having a chestplate equipped");
					} else if (x == 1) {
						color.sendColouredMessage(player, Messages.noLeggingsEquipped);
						Utility.writeToLog(stringPlay + " called /getdurability armor without having leggings equipped");
					} else {
						color.sendColouredMessage(player, Messages.noBootsEquipped);
						Utility.writeToLog(stringPlay + " called /getdurability armor without having boots equipped");
					}
				} else {
					percentDur = Double.valueOf(decFormat.format(percentDur));
					color.sendColouredMessage(player, "&2The durability of &f" + itemName + "&2 is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
					Utility.writeToLog(stringPlay + " called /getdurability and found the durability of their '" + itemName + "' to be " + percentDur + "%");
				}
				}
		 }
		} else if (args[0].equalsIgnoreCase("helmet")) {
			ItemStack helmet = player.getInventory().getHelmet();
			int amount = helmet.getAmount();
		if (amount == 1) {	
			playerDur = helmet.getDurability();
			itemName = helmet.getType().toString();
			maxDur = Item.getMaxDur(itemName);
			usesLeft = maxDur - playerDur;
			percentDur = (double)playerDur / (double)maxDur;
			percentDur *= 100;
			percentDur = 100 - percentDur;
			percentDur = Double.valueOf(decFormat.format(percentDur));
			color.sendColouredMessage(player, "&2The durability of &f" + itemName + "&2 is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
			Utility.writeToLog(stringPlay + " called /getdurability and found the durability of their '" + itemName + "' to be " + percentDur + "%");
		} else {
			color.sendColouredMessage(player, Messages.noHelmetEquipped);
			Utility.writeToLog(stringPlay + " attempted to call /getdurability helmet, but did not have a helmet equipped");
		}
		} else if (args[0].equalsIgnoreCase("chestplate")) {
			ItemStack chestplate = player.getInventory().getChestplate();
			int amount = chestplate.getAmount();
		if (amount == 1) {	
			playerDur = chestplate.getDurability();
			itemName = chestplate.getType().toString();
			maxDur = Item.getMaxDur(itemName);
			usesLeft = maxDur - playerDur;
			percentDur = (double)playerDur / (double)maxDur;
			percentDur *= 100;
			percentDur = 100 - percentDur;
			percentDur = Double.valueOf(decFormat.format(percentDur));
			color.sendColouredMessage(player, "&2The durability of &f" + itemName + "&2 is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
			Utility.writeToLog(stringPlay + " called /getdurability and found the durability of their '" + itemName + "' to be " + percentDur + "%");
		} else {
			color.sendColouredMessage(player, Messages.noChestplateEquipped);
			Utility.writeToLog(stringPlay + " attempted to call /getdurability chestplate, but did not have a chestplate equipped");
		}
		} else if (args[0].equalsIgnoreCase("leggings")) {
			ItemStack leggings = player.getInventory().getLeggings();
			int amount = leggings.getAmount();
		if (amount == 1) {	
			playerDur = leggings.getDurability();
			itemName = leggings.getType().toString();
			maxDur = Item.getMaxDur(itemName);
			usesLeft = maxDur - playerDur;
			percentDur = (double)playerDur / (double)maxDur;
			percentDur *= 100;
			percentDur = 100 - percentDur;
			percentDur = Double.valueOf(decFormat.format(percentDur));
			color.sendColouredMessage(player, "&2The durability of &f" + itemName + "&2 is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
			Utility.writeToLog(stringPlay + " called /getdurability and found the durability of their '" + itemName + "' to be " + percentDur + "%");
		} else {
			color.sendColouredMessage(player, Messages.noLeggingsEquipped);
			Utility.writeToLog(stringPlay + " attempted to call /getdurability leggings, but did not have leggings equipped");
		}
		} else if (args[0].equalsIgnoreCase("boots")) {
			ItemStack boots = player.getInventory().getBoots();
			int amount = boots.getAmount();
		if (amount == 1) {	
			playerDur = boots.getDurability();
			itemName = boots.getType().toString();
			maxDur = Item.getMaxDur(itemName);
			usesLeft = maxDur - playerDur;
			percentDur = (double)playerDur / (double)maxDur;
			percentDur *= 100;
			percentDur = 100 - percentDur;
			percentDur = Double.valueOf(decFormat.format(percentDur));
			color.sendColouredMessage(player, "&2The durability of &f" + itemName + "&2 is at &f" + percentDur + "%.&2 You have &f" + usesLeft + "&2 uses left out of a possible &f" + maxDur);
			Utility.writeToLog(stringPlay + " called /getdurability and found the durability of their '" + itemName + "' to be " + percentDur + "%");
		} else {
			color.sendColouredMessage(player, Messages.noBootsEquipped);
			Utility.writeToLog(stringPlay + " attempted to call /getdurability boots, but did not have boots equipped");
		}
	} else {
		color.sendColouredMessage(player, DynamicEconomy.prefix + "&2Wrong Command Usage. &f/getdurability (helmet/chestplate/leggings/boots/armor)");
		Utility.writeToLog(stringPlay + " incorrectly called /getdurability");
	}
	
}




	

	
}
}
	

