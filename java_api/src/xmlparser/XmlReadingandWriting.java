package xmlparser;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.io.StringWriter;
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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public class XmlReadingandWriting {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException, TransformerException {
		String pathonMAC = "/Users/ydh/git/java_api/java_api/src/xmlparser"; // Path on MAC
		String pathonWindow = "C:\\Users\\YDH\\git\\java_api\\java_api\\src\\xmlparser"; // Path on Window
		String xmlName = "darkmode.xml";
		String xmlPath = pathonWindow + File.separator + xmlName;
		
		
		String out_xmlName = "darkmode_new.xml";
		String out_xmlPath = pathonWindow + File.separator + out_xmlName;
		
		DocumentBuilderFactory  builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(xmlPath); 
		
		// 문자열 없애기
		TransformerFactory factory = TransformerFactory.newInstance();
		Transformer transformer = factory.newTransformer();
		
		
		//transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no"); 
		
		StringWriter writer = new StringWriter();
		
		transformer.transform(new DOMSource(document), new StreamResult(writer));
		
        
		String xml_str = writer.toString();
		
		//xml_str = xml_str.replaceAll(System.getProperty("line.separator"), "");
		//xml_str = trim(xml_str);
		//System.out.println(" 시작 " + xml_str + " 끝 ");
		
		//document = builder.parse(new InputSource(new StringReader(xml_str)));
		
		//
		
		
		
		document = builder.parse(new ByteArrayInputStream(xml_str.getBytes()));
		
		//
		
		
		 //문자열 탭만 제거하여 테스트 
		//String test_str = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?><Package xmlns=\"http://soap.sforce.com/2006/04/metadata\"><types><members>xyzsite</members><name>CustomSite</name></types><types><members>xyzsite</members><name>Network</name></types><types><members>xyzsite1</members><name>SiteDotCom</name></types><types><members>xyzsite Profile</members><name>Profile</name></types><version>30.0</version></Package>";
		//document = builder.parse(new InputSource(new StringReader(test_str)));
		
		
		
		
		
		Element root = document.getDocumentElement();
		
		System.out.println(root.getNodeName());
		
		NodeList list = root.getChildNodes();
		
		// Plist를 읽어와서 데이터를 쌍으로 만들어 놓기.
		
		
		
		for (int i = 0; i < list.getLength(); i++) {
			Node node = list.item(i);
			
			System.out.println("node type = " + node.getNodeType());
			
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				System.out.println(element.getNodeName());
				
				
				
				// Plist의 엘리먼트를 넣어줄 안드로이드 xml 자리를 찾는다.
				// i=0 일때 속성값을 넣어주자.
				if(i==1) {
					System.out.println("ddd");
					Element key_1 = document.createElement("key");
					key_1.setTextContent("UserInterfaceStyleMode");
					
					Element integer_1 = document.createElement("integer");
					integer_1.setTextContent("2");
					
					Element key_2 = document.createElement("key");
					key_2.setTextContent("MostRecentAutomaticMode");
					
					Element integer_2 = document.createElement("integer");
					integer_2.setTextContent("102");
					
					element.appendChild(key_1);
					element.appendChild(integer_1);
					element.appendChild(key_2);
					element.appendChild(integer_2);
					
				}
				
				NodeList list2 = element.getChildNodes();
				
				System.out.println(list2.getLength());
				for (int j = 0; j < list2.getLength(); j++) {
					Node node2 = list2.item(j);
					if(node2.getNodeType() == Node.ELEMENT_NODE) {
						Element element2 = (Element) node2;				
						System.out.println(element2.getNodeName() + " : " + element2.getTextContent());
						
						
						
					}
				}
				
			}
			
		}
		
		
		
		//transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4"); //�젙�젹 �뒪�럹�씠�뒪4移�
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes"); //�뱾�뿬�벐湲�
        transformer.setOutputProperty(OutputKeys.DOCTYPE_PUBLIC, "yes"); //doc.setXmlStandalone(true); �뻽�쓣�븣 遺숈뼱�꽌 異쒕젰�릺�뒗遺�遺� 媛쒗뻾
        
        
		
		
		
		DOMSource domSource = new DOMSource(root);
		FileWriter fileWriter = new FileWriter(new File(out_xmlPath));
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		StreamResult result = new StreamResult(bufferedWriter);
		
		transformer.transform(domSource, result);
		
		
	}
	
	
}
