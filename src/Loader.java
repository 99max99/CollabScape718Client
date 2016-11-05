import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;  //test you dumb fuck

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Loader extends Applet {
	private static final long serialVersionUID = 7639088664641445302L;
	public static Properties client_parameters = new Properties();
	public JFrame client_frame;
	public JPanel client_panel = new JPanel();

	public static boolean usingRS = false;
	public static boolean useIsaac = false;
	public static boolean useRoute = true;
	public static boolean useMapsTest = false;//run it

	public static String BLOCK_IDS = "";
	public static boolean DISABLE_XTEA_CRASH = true;
	public static boolean DISABLE_USELESS_PACKETS = true;
	public static boolean DISABLE_RSA = false;
	public static boolean DISABLE_CS_MAP_CHAR_CHECK = true;
	public static boolean DISABLE_SOFTWARE_MODE = true;
	public static boolean ENABLE_LOBBY = false;
	public static String SERVER_NAME = "CollabScape718";
	public static final int REVISION = 718;
	public static String GAME_IP = "localhost"; //CHANGEIP
	public static String LOBBY_IP = "localhost";
	public static boolean VB_ENABLED = false;
	public static final int LOBBY_PORT = 43593; //PORTHERE
	public static final boolean NSN_ENABLED = true;
	public static int SUB_REVISION = 20;
	public static Loader instance;
	public static int[] outSizes = new int[256];
	public static boolean localHost;

	public static void main(String[] args) throws IOException {
		if (args.length > 0) {
			if (Boolean.parseBoolean(args[0]))
				LOBBY_IP = GAME_IP = "localhost"; //CHANGEIP
			SUB_REVISION = Integer.parseInt(args[1]);
		}
		Loader loader = instance = new Loader();
		loader.doFrame();
	}

	public void init() {
		instance = this;
		doApplet();
	}

	void doApplet() {
		setParams();
		startClient();
	}

	public void doFrame() {
		setParams();
		openFrame();
		startClient();
	}

	void setParams() {
		// applet parameters, not client
		client_parameters.put("separate_jvm", "true");
		client_parameters.put("java_arguments",
				"-Xmx256m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");

		client_parameters.put("boxbgcolor", "black");
		client_parameters.put("image",
				"http://www.runescape.com/img/game/splash2.gif");
		client_parameters.put("centerimage", "true");
		client_parameters.put("boxborder", "false");
		client_parameters.put("27", "0");
		client_parameters.put("1", "0");
		client_parameters.put("16", "false");
		client_parameters.put("17", "false");
		client_parameters.put("21", "1"); // WORLD ID
		client_parameters.put("30", "false");
		client_parameters.put("20", "lobby17.runescape.com");
		client_parameters.put("29", "");
		client_parameters.put("11", "true");
		client_parameters.put("25", "1378752098");
		client_parameters.put("28", "0");
		client_parameters.put("8", ".runescape.com");
		client_parameters.put("23", "false");
		client_parameters.put("32", "0");
		client_parameters.put("15",
				"wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
		client_parameters.put("0", "IjGJjn4L3q5lRpOR9ClzZQ");
		client_parameters.put("2", "");
		client_parameters.put("4", "1"); // LOBBY ID
		client_parameters.put("14", "");
		client_parameters.put("5", "8194");
		client_parameters.put("-1", "QlwePyRU5GcnAn1lr035ag");
		client_parameters.put("6", "0");
		client_parameters.put("24",
				"true,false,0,43,200,18,0,21,354,-15,Verdana,11,0xF4ECE9,candy_bar_middle.gif,candy_bar_back.gif,candy_bar_outline_left.gif,candy_bar_outline_right.gif,candy_bar_outline_top.gif,candy_bar_outline_bottom.gif,loadbar_body_left.gif,loadbar_body_right.gif,loadbar_body_fill.gif,6");
		client_parameters.put("3", "hAJWGrsaETglRjuwxMwnlA/d5W6EgYWx");
		client_parameters.put("12", "false");
		client_parameters.put("13", "0");
		client_parameters.put("26", "0");
		client_parameters.put("9", "77");
		client_parameters.put("22", "false");
		client_parameters.put("18", "false");
		client_parameters.put("33", "");
		client_parameters.put("haveie6", "false");
	}

	void openFrame() {
		client_frame = new JFrame("CollabScape718 - Because We Can");
		client_frame.setLayout(new BorderLayout());
		client_panel.setLayout(new BorderLayout());
		client_panel.add(this);//
		client_panel.setPreferredSize(new Dimension(765, 553));
		client_frame.getContentPane().add(client_panel, "Center");
		client_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		client_frame.pack();
		client_frame.setVisible(true);

		client_frame.setLocationRelativeTo(null);

	}

	void startClient() {
		try {
			pb clnt = new pb();
			clnt.x(this);
			clnt.g();
			clnt.start();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}

	public String getParameter(String string) {
		return (String) client_parameters.get(string);
	}

	public URL getDocumentBase() {
		return getCodeBase();
	}

	public URL getCodeBase() {
		try {
			if (usingRS)
				return new URL("http://world11.runescape.com");
			else
				return new URL("http://" + GAME_IP);
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}
	}
}
