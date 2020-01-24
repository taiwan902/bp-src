/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  org.apache.commons.io.Charsets
 *  org.apache.commons.io.IOUtils
 */
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.IllegalFormatException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class Class_31699 {
    private static final Pattern Field_31700 = Pattern.compile(Class_31699.Method_31706("\u1044\u1040\u1006\u1006\u1044\u1000\u1042\u1046\u1044\u1000\u1006\u1006\u1000\u1040\u1002\u1046\u1000\u1004\u1006\u1006"));
    private long Field_31701;
    private final Map Field_31702 = Maps.newHashMap();
    private static Class_31699 Field_31703;
    private static final Splitter Field_31704;

    public long Method_31705() {
        return this.Field_31701;
    }

    private static String Method_31706(String string) {
        int n = 13075;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_31699.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private String Method_31707(String string) {
        String string2 = (String)this.Field_31702.get(string);
        return string2 == null ? string : string2;
    }

    static Class_31699 Method_31708() {
        return Field_31703;
    }

    public Class_31699() {
        try {
            InputStream inputStream = Class_31699.class.getResourceAsStream("/assets/minecraft/lang/en_US.lang");
            for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
                String[] arrstring;
                if (string.isEmpty() || string.charAt(24577 & 2372) == (-13905 & 1123) || (arrstring = (String[])Iterables.toArray((Iterable)Field_31704.split((CharSequence)string), String.class)) == null || arrstring.length != (-32717 & 11458)) continue;
                String string2 = arrstring[8738 & 20753];
                String string3 = Field_31700.matcher(arrstring[385 & -12795]).replaceAll("%$1s");
                this.Field_31702.put(string2, string3);
            }
            this.Field_31701 = System.currentTimeMillis();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    static {
        Field_31704 = Splitter.on((char)(12349 & 189)).limit(-16378 & 339);
        Field_31703 = new Class_31699();
    }

    public synchronized String Method_31709(String string) {
        return this.Method_31707(string);
    }

    public synchronized boolean Method_31710(String string) {
        return this.Field_31702.containsKey(string);
    }

    public synchronized String Method_31711(String string, Object ... arrobject) {
        String string2 = this.Method_31707(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private void Method_31712() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static synchronized void Method_31713(Map map) {
        Class_31699.Field_31703.Field_31702.clear();
        Class_31699.Field_31703.Field_31702.putAll(map);
        Class_31699.Field_31703.Field_31701 = System.currentTimeMillis();
    }
}

