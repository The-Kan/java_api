package xmlparser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

//DOM parser, TransformerFactory 를 이용하여 xml파일을 출력한다
//Element로 NodeName, Attribute, TextContent 를 구성하여 노드끼리의 관계를  정의한다.


public class XmlParserWriter_master {
	public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {
		String path = "/Users/ydh/git/java_api/java_api/src/xmlparser";
		String xmlName = "darkmode_output.xml";
		String xmlPath = path + File.separator + xmlName;
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		Element element = document.createElement("Package");
		element.setAttribute("xmlns", "http://soap.sforce.com/2006/04/metadata");
		
		Element element2 = document.createElement("types");
		element2.setAttribute("key", "nice");
		
		Element element3 = document.createElement("members");
		element3.setTextContent("xyzsite");
		
		Element element4 = document.createElement("types");
		
		document.appendChild(element);
		element.appendChild(element2);
		element2.appendChild(element3);
		element.appendChild(element4);
		
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		
		transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); //정렬 스페이스4칸
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //들여쓰기
        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); //doc.setXmlStandalone(true); 했을때 붙어서 출력되는부분 개행
        		
		DOMSource source = new DOMSource(document);
		FileWriter fileWriter = new FileWriter(new File(xmlPath)); 
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		StreamResult result = new StreamResult(bufferedWriter);
		
		transformer.transform(source, result);
		
		
		
		
		
	}
}
