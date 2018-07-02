package Test;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

class xmlTesty{
    public static void main(String[] args) throws Exception{
        SAXReader reader = new SAXReader();
        ClassLoader classLoader=xmlTesty.class.getClassLoader();
        Document doc = reader.read(classLoader.getResourceAsStream("qqq.xml"));
        Element root = doc.getRootElement();
        Element e1 = root.addElement("student");
        e1.addElement("id").addText("007");
        e1.addElement("name").addText("xiao");
        FileOutputStream fos = new FileOutputStream("student.xml",true);
        OutputStreamWriter osw = new OutputStreamWriter(fos,"Utf-8");
        OutputFormat of = new OutputFormat();
        of.setEncoding("Utf-8");
        of.setIndent(true);
        //of.setIndent("    ");
        of.setNewlines(true);
        XMLWriter writer = new XMLWriter(osw, of);
        writer.write(doc);
        writer.close();
    }
}