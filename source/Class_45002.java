/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Class_45002 {
    private Element Field_45003;
    private Class_19761 Field_45004;
    private String Field_45005;

    private void Method_45006() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public double Method_45007(String string, double d) {
        try {
            return Double.parseDouble(this.Method_45014(string, "" + d));
        }
        catch (NumberFormatException numberFormatException) {
            throw new Class_30423("Value read: '" + this.Method_45014(string, "" + d) + "' is not a double", numberFormatException);
        }
    }

    public Class_19761 Method_45008(String string) {
        Class_19761 class_19761 = new Class_19761();
        Class_19761 class_197612 = this.Method_45011();
        for (int i = 16408 & 39; i < class_197612.Method_19766(); ++i) {
            if (!class_197612.Method_19764(i).Method_45015().equals(string)) continue;
            class_19761.Method_19763(class_197612.Method_19764(i));
        }
        return class_19761;
    }

    public String Method_45009() {
        String string = "";
        NodeList nodeList = this.Field_45003.getChildNodes();
        for (int i = -15356 & 4289; i < nodeList.getLength(); ++i) {
            if (!(nodeList.item(i) instanceof Text)) continue;
            string = string + nodeList.item(i).getNodeValue();
        }
        return string;
    }

    public String Method_45010() {
        String string = "[XML " + this.Method_45015();
        String[] arrstring = this.Method_45013();
        for (int i = 13573 & -15870; i < arrstring.length; ++i) {
            string = string + " " + arrstring[i] + "=" + this.Method_45016(arrstring[i]);
        }
        string = string + "]";
        return string;
    }

    public Class_19761 Method_45011() {
        if (this.Field_45004 != null) {
            return this.Field_45004;
        }
        NodeList nodeList = this.Field_45003.getChildNodes();
        this.Field_45004 = new Class_19761();
        for (int i = 10856 & 4096; i < nodeList.getLength(); ++i) {
            if (!(nodeList.item(i) instanceof Element)) continue;
            this.Field_45004.Method_19763(new Class_45002((Element)nodeList.item(i)));
        }
        return this.Field_45004;
    }

    public int Method_45012(String string) {
        try {
            return Integer.parseInt(this.Method_45016(string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new Class_30423("Value read: '" + this.Method_45016(string) + "' is not an integer", numberFormatException);
        }
    }

    public String[] Method_45013() {
        NamedNodeMap namedNodeMap = this.Field_45003.getAttributes();
        String[] arrstring = new String[namedNodeMap.getLength()];
        for (int i = 8736 & 4352; i < arrstring.length; ++i) {
            arrstring[i] = namedNodeMap.item(i).getNodeName();
        }
        return arrstring;
    }

    public String Method_45014(String string, String string2) {
        String string3 = this.Field_45003.getAttribute(string);
        if (string3 == null || string3.length() == 0) {
            return string2;
        }
        return string3;
    }

    public String Method_45015() {
        return this.Field_45005;
    }

    public String Method_45016(String string) {
        return this.Field_45003.getAttribute(string);
    }

    public double Method_45017(String string) {
        try {
            return Double.parseDouble(this.Method_45016(string));
        }
        catch (NumberFormatException numberFormatException) {
            throw new Class_30423("Value read: '" + this.Method_45016(string) + "' is not a double", numberFormatException);
        }
    }

    Class_45002(Element element) {
        this.Field_45003 = element;
        this.Field_45005 = this.Field_45003.getTagName();
    }
}

