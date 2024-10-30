package com.campusdual.xml;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class XMLFileCreator {
    private static void CreateDocument() throws ParserConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.newDocument();

        Element root = document.createElement(("computer"));
        document.appendChild(root);
        Element components = document.createElement(("components"));
        root.appendChild((components));

        components.appendChild(createItem(document, "component", "quantity", "1", "CPU"));
        components.appendChild(createItem(document, "component", "quantity", "2", "RAM"));
        components.appendChild(createItem(document, "component", "quantity", "3", "Fan"));
        components.appendChild(createItem(document, "component", "quantity", "1", "Graphic Card"));
        components.appendChild(createItem(document, "component", "quantity", "1", "Motherboard"));
        components.appendChild(createItem(document, "component", "quantity", "2", "SSD"));
        components.appendChild(createItem(document, "component", "quantity", "1", "Power Supply"));
        writeToFile(document, "src/main/resources/computerlist.xml");
    }

    private static void writeToFile(Document document, String pathFile) throws TransformerException {
        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
        File file = new File(pathFile);
        DOMSource source = new DOMSource(document);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }

    private static Element createItem(Document document, String tagName, String attribute, String value, String textContent){
        Element component = document.createElement(tagName);
        component.setAttribute(attribute, value);
        component.setTextContent(textContent);
        return component;
    }

    public static void main(String[] args) {
        try {
            XMLFileCreator.CreateDocument();
        } catch (ParserConfigurationException | TransformerException e){
            throw new RuntimeException(e);
        }
    }
}
