package com.suollon.coding.mybatis.parsing;

import org.apache.ibatis.parsing.XPathParser;

/**
 * @author hzwwl
 * @date 2019/7/31 20:36
 */
public class XPathParserTest {

    public static void main(String[] args) {
        XPathParser xPathParser = new XPathParser("demo/src/main/resources/test.xml");
        String s = xPathParser.evalString("//book[author='Neal Stephenson']/title/text()");
        System.out.println(s);
    }

}
