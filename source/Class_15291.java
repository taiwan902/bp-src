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
import java.util.Collection;
import java.util.IllegalFormatException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class Class_15291 {
    Map Field_15292 = Maps.newHashMap();
    private static final Splitter Field_15293 = Splitter.on((char)(3197 & -20163)).limit(2186 & -32190);
    private static final Pattern Field_15294 = Pattern.compile(Class_15291.Method_15297("\u0098\u0091\u0081\u0099\u0094\u0085\u009d\u0094\u0081\u0099\u0085\u0095\u0084\u0095\u0090\u0089\u0089\u0090"));
    private boolean Field_15295;

    private String Method_15296(String string) {
        String string2 = (String)this.Field_15292.get(string);
        return string2 == null ? string : string2;
    }

    private static String Method_15297(String string) {
        int n = 8103;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_15291.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public synchronized void Method_15298(Class_279 class_279, List list) {
        this.Field_15292.clear();
        for (String string : list) {
            Object[] arrobject = new Object[16515 & -29939];
            arrobject[2179 & -31672] = string;
            String string2 = String.format("lang/%s.lang", arrobject);
            for (String string3 : class_279.Method_281()) {
                try {
                    this.Method_15304(class_279.Method_280(new Class_2080(string3, string2)));
                }
                catch (IOException iOException) {}
            }
        }
        this.Method_15299();
    }

    private void Method_15299() {
        this.Field_15295 = 2186 & 512;
        int n = 8296 & -27900;
        int n2 = 10304 & -15308;
        for (String string : this.Field_15292.values()) {
            int n3 = string.length();
            n2 += n3;
            for (int i = -32493 & 12364; i < n3; ++i) {
                if (string.charAt(i) < (22914 & -31928)) continue;
                ++n;
            }
        }
        float f = (float)n / (float)n2;
        this.Field_15295 = (double)f > 1.878787878787879 * 0.0532258064516129 ? -21407 & 16397 : 6145 & -24560;
    }

    public boolean Method_15300() {
        return this.Field_15295;
    }

    private void Method_15301(InputStream inputStream) {
        for (String string : IOUtils.readLines((InputStream)inputStream, (Charset)Charsets.UTF_8)) {
            String[] arrstring;
            if (string.isEmpty() || string.charAt(-32686 & 17025) == (18547 & -18517) || (arrstring = (String[])Iterables.toArray((Iterable)Field_15293.split((CharSequence)string), String.class)) == null || arrstring.length != (9234 & 2059)) continue;
            String string2 = arrstring[25360 & -32534];
            String string3 = Field_15294.matcher(arrstring[2433 & 4195]).replaceAll("%$1s");
            this.Field_15292.put(string2, string3);
        }
    }

    public String Method_15302(String string, Object[] arrobject) {
        String string2 = this.Method_15296(string);
        try {
            return String.format(string2, arrobject);
        }
        catch (IllegalFormatException illegalFormatException) {
            return "Format error: " + string2;
        }
    }

    private void Method_15303() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Method_15304(List list) {
        for (Class_9953 class_9953 : list) {
            InputStream inputStream = class_9953.Method_9958();
            try {
                this.Method_15301(inputStream);
            }
            finally {
                IOUtils.closeQuietly((InputStream)inputStream);
            }
        }
    }
}

