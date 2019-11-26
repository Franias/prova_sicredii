package frameworks.utils;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class ScreenshotFw {
	
	public static void takeViewpointShot (WebDriver driver, String nomeMetodo) {
		// Converter objeto de WebDriver em TakeScreenshot
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		
		// Chame o método getScreenshotAs para criar um arquivo de imagem
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		
		// Mover arquivo de imagem para o destino
		try {
			FileUtils.copyFile(srcFile, new File("target" + File.separator + 
					"screenshot" + File.separator + nomeMetodo + 
					DateTimeFormatterFw.getTime() + ".jpg"));
			
		} catch (IOException e) {
			System.out.println("Não foi posssível capturar a tela");
			e.printStackTrace();
		}
	}
	
	public static void takeFullPageShot(WebDriver driver, String nomeMetodo) {
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		String path = "C:\\Users\\sala312\\prova\\francielli_e2e_prova\\francielli_prova\\target" + 
				  nomeMetodo + DateTimeFormatterFw.getTime() + ".jpg";
		System.out.println(path);
		try {
			ImageIO.write(screenshot.getImage(),"JPG",new File(path));
			
		} catch (IOException e) {
			System.out.println("Não foi posssível capturar a tela");
			e.printStackTrace();			
		}
	}
}

