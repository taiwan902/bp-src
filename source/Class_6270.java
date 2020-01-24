/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long
 */
import java.io.PushbackReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_6270 {
    private static Class_12372 Method_6271(char c, Class_15637 class_15637, PushbackReader pushbackReader) {
        int n;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(c);
        while ((n = pushbackReader.read()) >= 0) {
            char c2 = (char)n;
            if (!class_15637.Method_15659(c2)) {
                pushbackReader.unread(c2);
                break;
            }
            stringBuffer.append(c2);
        }
        return new Class_12372(class_15637, stringBuffer.toString());
    }

    public static Class_12372[] Method_6272(String string) {
        StringReader stringReader = new StringReader(string);
        PushbackReader pushbackReader = new PushbackReader(stringReader);
        ArrayList<Class_12372> arrayList = new ArrayList<Class_12372>();
        do {
            int n;
            if ((n = pushbackReader.read()) < 0) {
                Class_12372[] arrclass_12372 = arrayList.toArray(new Class_12372[arrayList.size()]);
                return arrclass_12372;
            }
            char c = (char)n;
            if (Character.isWhitespace(c)) continue;
            Class_15637 class_15637 = Class_15637.Method_15665(c);
            if (class_15637 == null) {
                throw new \u0000~ float { 0 default 7 { short , public int implements public 0 package catch interface volatile + goto static null for 3 0 0 do 9 public float final long short , * ' for % volatile ` if float 0 abstract double byte private throws # true synchronized 6 ~ = ` void long("Invalid character: '" + c + "', in: " + string);
            }
            Class_12372 class_12372 = Class_6270.Method_6271(c, class_15637, pushbackReader);
            arrayList.add(class_12372);
        } while (true);
    }

    private void Method_6273() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

