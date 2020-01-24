/*
 * Decompiled with CFR 0.145.
 */
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Class_22380 {
    private static DocumentBuilderFactory Field_22381;

    private void Method_22382() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_45002 Method_22383(String string) {
        return this.Method_22384(string, Class_8033.Method_8035(string));
    }

    public Class_45002 Method_22384(String string, InputStream inputStream) {
        try {
            if (Field_22381 == null) {
                Field_22381 = DocumentBuilderFactory.newInstance();
            }
            DocumentBuilder documentBuilder = Field_22381.newDocumentBuilder();
            Document document = documentBuilder.parse(inputStream);
            return new Class_45002(document.getDocumentElement());
        }
        catch (Exception exception) {
            throw new Class_30423("Failed to parse document: " + string, exception);
        }
    }
}

