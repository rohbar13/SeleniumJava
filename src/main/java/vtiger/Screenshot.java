package vtiger;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {

	public static void takeScreenshot(WebDriver driver,String picname) throws IOException {
		
		String path = "screenshot";
		File file = new File(path);
		
		if(!file.exists()) {
			System.out.println("*********screenshot folder does not exist*******");
			file.mkdirs();
		}
		
		String picpath = file.getAbsolutePath()+File.separator+picname;
		
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(picpath);
        FileUtils.copyFile(SrcFile, DestFile);
		
	}
	
	
	public static void takesScreenshotWithText(WebDriver driver,String picname, WebElement element) throws IOException
	{
		
		
		String path = "screenshot";
		File file = new File(path);
		
		if(!file.exists()) {
			System.out.println("*********screenshot folder does not exist*******");
			file.mkdirs();
		}
		
		String picpath = file.getAbsolutePath()+File.separator+picname;
		
		File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		final BufferedImage image = ImageIO.read(screenShotFile);
		Graphics g = image.getGraphics();
		g.setFont(g.getFont().deriveFont(30f));
		g.setColor(Color.red);
		g.drawString("-----Commments-----", element.getLocation().x, element.getLocation().y); //Top-left coordinates of your failed element
		g.dispose();
		ImageIO.write(image, "png", new File(picpath));
	}
	
	
	
	
	
}
