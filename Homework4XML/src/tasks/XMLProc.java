package tasks;

import java.io.File;
import java.io.StringWriter;

import javax.xml.transform.TransformerException;

public class XMLProc {

    public static String transformWithXSL(String[] args) {
        File xsltFile = new File(args[0]);
        File xmlFile = new File(args[1]);

        javax.xml.transform.Source xmlSource = new javax.xml.transform.stream.StreamSource(xmlFile);
        javax.xml.transform.Source xsltSource = new javax.xml.transform.stream.StreamSource(xsltFile);
        StringWriter xsltResult = new StringWriter();
        javax.xml.transform.Result result = new javax.xml.transform.stream.StreamResult(xsltResult);

        javax.xml.transform.TransformerFactory transFact = javax.xml.transform.TransformerFactory.newInstance();
        javax.xml.transform.Transformer trans;
        try {
            trans = transFact.newTransformer(xsltSource);
            trans.transform(xmlSource, result);
        } catch (TransformerException e) {
            e.printStackTrace();
        }

        return xsltResult.toString();
    }

}
