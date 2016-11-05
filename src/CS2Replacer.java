
public class CS2Replacer {

	public static final int swapScript(int id) {
		if (id == 3088) {
			// System.out.println("Swapped!");
			return 5339;
		}
		return id;
	}

	public static final String filterCrashUrl(String url) {
		return "http://www.noszscape.org/site/index.php?page=crashland"; //Need To Get Proper Website
	}

	public static final String filterUrl(String url) {
		// System.err.println("openUrl(" + url + ")");
		if (url.contains("mod=accountappeal"))
			return "http://www.noszscape.org/site/index.php?page=recover"; //Need To Get Proper Website
		return url;
	}

	public static final String blockRuntime(IComponentDefinition def, int inter,
			String str) {
		int interfaceId = inter >> 16;
		int componentId = inter & 0xFFFF;
		// System.out.println("Interface[" + interfaceId + "," + componentId +
		// "]:" + str);

		if (interfaceId == 907 && (componentId == 52 || componentId == 53
				|| componentId == 54)) {
			if (str.contains("<col=0296fe><u=0296fe>"))
				return def.aString1212.replace("<col=0166ff><u=0166ff>",
						"<col=0296fe><u=0296fe>");
			else if (str.contains("<col=0166ff><u=0166ff>"))
				return def.aString1212.replace("<col=0296fe><u=0296fe>",
						"<col=0166ff><u=0166ff>");
			return null;
		}
		if (interfaceId == 907 && (componentId == 14 || componentId == 15
				|| componentId == 16)) {
			if (str.contains("<col=0296fe><u=0296fe>"))
				return def.aString1212.replace("<col=0166ff><u=0166ff>",
						"<col=0296fe><u=0296fe>");
			else if (str.contains("<col=0166ff><u=0166ff>"))
				return def.aString1212.replace("<col=0296fe><u=0296fe>",
						"<col=0166ff><u=0166ff>");
			return null;
		}
		if (interfaceId == 907 && (componentId == 26 || componentId == 27
				|| componentId == 28)) {
			if (str.contains("<col=0296fe><u=0296fe>"))
				return def.aString1212.replace("<col=0166ff><u=0166ff>",
						"<col=0296fe><u=0296fe>");
			else if (str.contains("<col=0166ff><u=0166ff>"))
				return def.aString1212.replace("<col=0296fe><u=0296fe>",
						"<col=0166ff><u=0166ff>");
			return null;
		}
		if (interfaceId == 907 && (componentId == 38 || componentId == 39
				|| componentId == 40)) {
			if (str.contains("<col=0296fe><u=0296fe>"))
				return def.aString1212.replace("<col=0166ff><u=0166ff>",
						"<col=0296fe><u=0296fe>");
			else if (str.contains("<col=0166ff><u=0166ff>"))
				return def.aString1212.replace("<col=0296fe><u=0296fe>",
						"<col=0166ff><u=0166ff>");
			return null;
		}

		if (interfaceId == 596 && str.startsWith(
				"Invalid username or password.<br><br>For accounts created"))
			return "Invalid username or password.<br><br>If you are new player, please try using other username consisting of 2 to 12 a-z and 0-9 characters.";

		return str;
	}

	public static final String filterRuntime(String str) {
		return str;
	}

	public static int LAST_LOAD = -1;
	public static final String filterLoad(String str) {
		if (str.toLowerCase().contains("runescape")) {
			str = str.replace("runescape", Loader.SERVER_NAME);
			str = str.replace("RuneScape", Loader.SERVER_NAME);
			str = str.replace("Runescape", Loader.SERVER_NAME);
		}

		return str;
	}

}
