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

// DocumentBuilderFactory 瑜� �씠�슜�빐�꽌 DocumentBuilder 媛앹껜瑜� 留뚮뱺�떎.
// DocumentBuilder瑜� �씠�슜�빐 xml �뙆�씪�쓣 �뙆�떛 �븳 �썑 Document 媛앹껜瑜� 留뚮뱺�떎.
// element瑜� 援ы븳�썑 �빐�떦 element�뿉 nodelist瑜� 戮묒븘 �빐�떦 node type �씠 NODE.ELEMENT_NODE ���엯�씠�씪硫� �뿕由щ㉫�듃濡� �깮�꽦�븳�떎.
// 媛� �뿕由щ㉫�듃 �끂�뱶�뿉  NodeName, TextContent, getAttribute 瑜� �씠�슜�빐 媛믪쓣 異붿텧�븷 �닔 �엳�떎.

public class XmlParserReader_master {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		String path = "/Users/ydh/git/java_api/java_api/src/xmlparser";  //Path on Mac
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
