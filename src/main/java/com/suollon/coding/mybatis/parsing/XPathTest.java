package com.suollon.coding.mybatis.parsing;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

/**
 * @author hzwwl
 * @date 2019/7/31 17:15
 */
public class XPathTest {

    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        //开启验证
        dbFactory.setValidating(true);
        dbFactory.setNamespaceAware(false);
        dbFactory.setIgnoringComments(true);
        dbFactory.setIgnoringElementContentWhitespace(false);
        dbFactory.setCoalescing(false);
        dbFactory.setExpandEntityReferences(true);
        //创建DoumentBuilder
        DocumentBuilder builder = dbFactory.newDocumentBuilder();
        builder.setErrorHandler(new MyErrorHandler());
        //将文档加载到一个Document对象中
        Document document = builder.parse("demo/src/main/resources/inventory.xml");

        XPathFactory factory = XPathFactory.newInstance();
        XPath xpath = factory.newXPath();
        //编译XPath表达式
        XPathExpression expression = xpath.compile("//book[author='Neal Stephenson']/title/text()");
        NodeList nodeList = (NodeList) expression.evaluate(document, XPathConstants.NODESET);
        System.out.println("查询作者为 Neal Stephenson 的图书标题：");
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodeValue());
        }
        System.out.println("=================================");

        System.out.println("查询1997年之后的图书标题");
        nodeList = (NodeList) xpath.evaluate("//book[@year>1997]/title/text()", document, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodeValue());
        }
        System.out.println("=================================");

        System.out.println("查询1997年之后的图书的属性和标题");
        nodeList = (NodeList) xpath.evaluate("//book[@year>1997]/@*|//book[@year>1997]/title/text()", document, XPathConstants.NODESET);
        for (int i = 0; i < nodeList.getLength(); i++) {
            System.out.println(nodeList.item(i).getNodeValue());
        }
    }

    static class MyErrorHandler implements ErrorHandler{
        @Override
        public void warning(SAXParseException exception) throws SAXException {
            System.out.println("Warning : " + exception.getMessage());
        }

        @Override
        public void error(SAXParseException exception) throws SAXException {
            System.out.println("Error : " + exception.getMessage());
        }

        @Override
        public void fatalError(SAXParseException exception) throws SAXException {
            System.out.println("FatalError : " + exception.getMessage());
        }
    }
}
