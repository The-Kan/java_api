package xmlparser;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

// DocumentBuilderFactory 를 이용해서 DocumentBuilder 객체를 만든다.
// DocumentBuilder를 이용해 xml 파일을 파싱 한 후 Document 객체를 만든다.
// element를 구한후 해당 element에 nodelist를 뽑아 해당 node type 이 NODE.ELEMENT_NODE 타입이라면 엘리먼트로 생성한다.
// 각 엘리먼트 노드에  NodeName, TextContent, getAttribute 를 이용해 값을 추출할 수 있다.

public class XmlParserReader_master {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path = "/Users/ydh/git/java_api/java_api/src/xmlparser";
		String xmlName = "darkmode.xml";
		String xmlPath = path + File.separator + xmlName;
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = builderFactory.newDocumentBuilder();
		Document document = builder.parse(xmlPath);
		
		Element element = document.getDocumentElement();
		
		System.out.println(element.getNodeName());
		
		NodeList list = element.getChildNodes();
		for(int i=0; i<list.getLength(); i++) {
			Node node = list.item(i);
			
			if(node.getNodeType() == Node.ELEMENT_NODE) {
				Element element2 = (Element) node;
				System.out.println(element2.getNodeName());
				
				NodeList list2 = element2.getChildNodes();
				
				for(int j=0; j<list2.getLength(); j++) {
					Node node2 = list2.item(j);
					
					if(node2.getNodeType() == Node.ELEMENT_NODE) {
						Element element3 = (Element) node2;
						System.out.println(element3.getNodeName() + " : " + element3.getTextContent());
					}
					
				}
				
				
			}
			
		}
		

	}
}
