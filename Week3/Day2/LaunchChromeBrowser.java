package week3.day2;
//           Clild               extends Parent
public class LaunchChromeBrowser extends LaunchEdgeBrowser {
	
	
public void launchBrowser() {
	super.launchBrowser();
	System.out.println("Chrome is launched");

}

public static void main(String[] args) {
	LaunchChromeBrowser browse=new LaunchChromeBrowser();
	browse.launchBrowser();
}
}
