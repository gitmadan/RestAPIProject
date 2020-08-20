package xmlHandling;

import java.io.File;
import java.io.IOException;

//import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;




public class XmlHandling {
	
public static void main(String args[]) throws ParserConfigurationException, SAXException, IOException
{
	
	File f=new File("../APIAutomation/XmlFile.xml");
	DocumentBuilderFactory dm=DocumentBuilderFactory.newInstance();
	DocumentBuilder db=dm.newDocumentBuilder();
	//Document doc=db.parse(f);
	Document doc=db.parse(f);
	NodeList ns=doc.getElementsByTagName("title");
	for(int i=0; i<=ns.getLength();i++)
	{
		Node n=ns.item(i);
		System.out.println(n.getTextContent());
	}
}
	
	
	

		

	}


