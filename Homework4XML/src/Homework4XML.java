import tasks.XMLProc;


public class Homework4XML {

    /**
     * http://www.caucho.com/resin-3.1/doc/jaxb-annotations.xtp
     * @param args [0]dependences.xsl [1]pom.xml
     */
    public static void main(String[] args) {
        String output = XMLProc.transformWithXSL(args);
        System.out.print(output);
    }

}
