package co.edu.uniandes;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class ImageDownloader {

	public static String URLS_FILE = "../NewsletterGenerator/data/urlsImagenes.txt";
	public static final String TARGER_DIRECTORY = "../NewsletterGenerator/staticFiles/Images";
	//public static final String TARGER_DIRECTORY = "../NewsletterGenerator/staticFiles/NewsletterAndroid/app/src/main/res/drawable-hdpi";
	
	public static ArrayList<String> urls = new ArrayList<String>();

	public static void main(String[] arguments) 
	{	
		if (arguments.length>0)
		{
			System.out.println("Image Downloader Argument[0] (URLS_FILE) =" + arguments[0]);
			URLS_FILE = arguments[0];
		}
		
		System.out.println("---- Image Downloader Start ----");
		
		//Load Urls
		File fileUrls = new File(URLS_FILE);
		try {
			System.out.println("Loading Urls File");
			loadURLs(fileUrls);
		} catch (IOException e) {
			System.out.println("Error loading URLs_FILE= "+fileUrls.getAbsolutePath());
			e.printStackTrace();
		}
		
		//Download Images
		System.out.println("Downloading Images from Urls loaded");
		String filePathDir = new File(TARGER_DIRECTORY).getAbsolutePath();
		System.out.println("targetDirPath="+filePathDir);
		
		for (String imageUrl : urls) {

			int lastSlash = imageUrl.lastIndexOf("/");
			int lastDot = imageUrl.lastIndexOf(".");
			//+1 to remove slash of the name
			String targetFileName  = imageUrl.substring(lastSlash + 1, lastDot);
			String extension  = imageUrl.substring(lastDot);

			targetFileName = normalizeString(targetFileName);
			targetFileName = targetFileName + extension;
			System.out.println("targetFileName= "+targetFileName); 

		
			try {
				downloadImage(imageUrl,filePathDir,targetFileName);
			}
			catch (IOException io){
				System.out.println("Error downloading image, URL = " +imageUrl);
				io.printStackTrace();
			}
		}
		System.out.println(" ---- Image Downloader Finish ----");
	}

	public static void loadURLs(File fileUrls) throws IOException{
		// Open the file
		FileInputStream fstream = new FileInputStream(fileUrls);

		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   {
			// Print the content on the console
			System.out.println (strLine);
			urls.add(strLine);
		}

		//Close the input stream
		br.close();
	}

	public static void downloadImage(String sourceUrl, String targetDirectory, String targetName)throws MalformedURLException, IOException, FileNotFoundException
	{
		URL imageUrl = new URL(sourceUrl);

		InputStream imageReader = new BufferedInputStream(imageUrl.openStream());
		FileOutputStream fileOutput = new FileOutputStream(targetDirectory +File.separator+ targetName);
		OutputStream imageWriter = new BufferedOutputStream(fileOutput);


		int readByte;

		while ((readByte = imageReader.read()) != -1)
		{
			imageWriter.write(readByte);
		}
		imageReader.close();
		imageWriter.close();
	}
	
	public static String normalizeString(String myString){
	
		myString = myString.replaceAll("[-+.^:,]","");
		myString = myString.toLowerCase();
		myString = myString.replace("á","a");
		myString = myString.replace("é","e");
		myString = myString.replace("í","i");
		myString = myString.replace("ó","o");
		myString = myString.replace("ú","u");
		myString = myString.replace("ñ","n");
		
		return myString;
	}


}
