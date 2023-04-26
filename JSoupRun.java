package Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class JSoupRun {

	public static void main(String[] args) throws IOException{
	
		ArrayList<String> names2022 = new ArrayList<String>();
		ArrayList<String> names2021 = new ArrayList<String>();
		ArrayList<String> names2020 = new ArrayList<String>();

		org.jsoup.nodes.Document doc = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2022&month=0&season1=2022&ind=0")
				.timeout(6000).get();
		org.jsoup.nodes.Document doc1 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2021&month=0&season1=2021&ind=0")
				.timeout(6000).get();
		org.jsoup.nodes.Document doc2 = Jsoup.connect("https://www.fangraphs.com/leaders.aspx?pos=all&stats=bat&lg=all&qual=y&type=8&season=2020&month=0&season1=2020&ind=0")
				.timeout(6000).get();

		Elements body = doc.select("tbody");

		for (Element e: body.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				names2022.add(name);	
			}
		}
		System.out.println(names2022);
		
		Elements body1 = doc1.select("tbody");
		for (Element e: body1.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				names2021.add(name); 
			}
		}
		System.out.println(names2021);

		Elements body2 = doc2.select("tbody");
		for (Element e: body2.select("td.grid_line_regular")){
			final String name = e.select("a").text();
			if(name != "" && name.length() > 3) {
				names2020.add(name);	
			}
		}
		System.out.println(names2020);

		}
	}