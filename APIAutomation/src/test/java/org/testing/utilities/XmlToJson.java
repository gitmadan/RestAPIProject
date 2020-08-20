package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlToJson {

	public static String xmltojsonObject(String xml) {
		JSONObject responseMessage = XML.toJSONObject(xml); // {
		return responseMessage.toString();
	}

	public static String xmltojsonArray(String xml) {
		JSONArray j = new JSONArray(xml);
		return j.toString();
	}

	public static String jsontoXMLConversion(String jsonData) {
		JSONObject j = new JSONObject(jsonData);
		return XML.toString(j);

	}

	public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException {

		/*File f = new File("../APIAutomation/XmlFile.xml");
		DocumentBuilderFactory dm = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dm.newDocumentBuilder();
		Document doc = db.parse(f);		
		String data = doc.toString();
		System.out.println(data);*/
		// String data="<firstname>Gitika</firstname>";
		String data="<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\" ?>\r\n" + 
				"<RootElement>\r\n" + 
				"   <Elem1>\r\n" + 
				"      <Elem2>\r\n" + 
				"         <Elem3 Font=\"Verdana\" Size=\"10\" Style=\"Bold\"></Elem3>\r\n" + 
				"      </Elem2>\r\n" + 
				"   </Elem1>\r\n" + 
				"</RootElement>";
		String xmlTojson = xmltojsonObject(data);
		System.out.println(xmlTojson);
		

		String jsontoxml = jsontoXMLConversion(xmlTojson);
		System.out.println(jsontoxml);

	}

}
