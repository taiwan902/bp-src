/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class_2849
extends Class_2824 {
    private final Object[] Field_2850;
    public static final Pattern Field_2851 = Pattern.compile(Class_2849.Method_2868("\u8800\u8801\u8800\u8801\u8800\u8801\u8800\u8801\u8800\u8801\u8800\u8801\u8800\u8801\u8800\u8801\u8810\u8811\u8810\u8811\u8810\u8811\u8810\u8811\u8810\u8811"));
    List Field_2852 = Lists.newArrayList();
    private final Object Field_2853 = new Object();
    private final String Field_2854;
    private long Field_2855 = -1L & -1L;

    public Class_1782 Method_2856(Class_2893 class_2893) {
        super.Method_2832(class_2893);
        Object[] arrobject = this.Field_2850;
        int n = arrobject.length;
        for (int i = 3744 & 4170; i < n; ++i) {
            Object object = arrobject[i];
            if (!(object instanceof Class_1782)) continue;
            ((Class_1782)object).Method_1789().Method_2941(this.\u0000strictfp());
        }
        if (this.Field_2855 > (-1L & -1L)) {
            for (Class_1782 class_1782 : this.Field_2852) {
                class_1782.Method_1789().Method_2941(class_2893);
            }
        }
        return this;
    }

    private Class_1782 Method_2857(int n) {
        Class_1782 class_1782;
        if (n >= this.Field_2850.length) {
            throw new Class_15734(this, n);
        }
        Object object = this.Field_2850[n];
        if (object instanceof Class_1782) {
            class_1782 = (Class_1782)object;
        } else {
            class_1782 = new Class_2840(object == null ? "null" : object.toString());
            class_1782.Method_1789().Method_2941(this.\u0000strictfp());
        }
        return class_1782;
    }

    public Class_1782 Method_2858() {
        return this.Method_2865();
    }

    public boolean Method_2859(Object object) {
        if (this == object) {
            return (-32541 & 18441) != 0;
        }
        if (!(object instanceof Class_2849)) {
            return (-14780 & 8224) != 0;
        }
        Class_2849 class_2849 = (Class_2849)object;
        return (Arrays.equals(this.Field_2850, class_2849.Field_2850) && this.Field_2854.equals(class_2849.Field_2854) && super.Method_2837(object) ? -24509 & 289 : -16122 & 10240) != 0;
    }

    public Iterator Method_2860() {
        this.Method_2867();
        return Iterators.concat((Iterator)Class_2849.\u0000strictfp((Iterable)this.Field_2852), (Iterator)Class_2849.\u0000strictfp((Iterable)this.\u0000strictfp));
    }

    protected void Method_2861(String string) {
        int n = 208 & -22482;
        Matcher matcher = Field_2851.matcher(string);
        int n2 = 25700 & 2;
        int n3 = 8704 & -26563;
        try {
            while (matcher.find(n3)) {
                Object object;
                Object object2;
                int n4 = matcher.start();
                int n5 = matcher.end();
                if (n4 > n3) {
                    object = new Class_2840(String.format(string.substring(n3, n4), new Object[19504 & 4099]));
                    object.\u0000strictfp().Method_2941(this.\u0000strictfp());
                    this.Field_2852.add(object);
                }
                object = matcher.group(-32185 & 434);
                String string2 = string.substring(n4, n5);
                if ("%".equals(object) && "%%".equals(string2)) {
                    object2 = new Class_2840("%");
                    object2.\u0000strictfp().Method_2941(this.\u0000strictfp());
                    this.Field_2852.add(object2);
                } else {
                    int n6;
                    if (!"s".equals(object)) {
                        throw new Class_15734(this, "Unsupported format: '" + string2 + "'");
                    }
                    object2 = matcher.group(-31867 & 12323);
                    int n7 = n6 = object2 != null ? Integer.parseInt((String)object2) - (-32767 & 4129) : n2++;
                    if (n6 < this.Field_2850.length) {
                        this.Field_2852.add(this.Method_2857(n6));
                    }
                }
                n3 = n5;
            }
            if (n3 < string.length()) {
                Class_2840 class_2840 = new Class_2840(String.format(string.substring(n3), new Object[1040 & -12032]));
                class_2840.\u0000strictfp().Method_2941(this.\u0000strictfp());
                this.Field_2852.add(class_2840);
            }
        }
        catch (IllegalFormatException illegalFormatException) {
            throw new Class_15734(this, illegalFormatException);
        }
    }

    public String Method_2862() {
        return "TranslatableComponent{key='" + this.Field_2854 + (char)(111 & 39) + ", args=" + Arrays.toString(this.Field_2850) + ", siblings=" + this.\u0000strictfp + ", style=" + this.\u0000strictfp() + (char)(-27907 & 2175);
    }

    public int Method_2863() {
        int n = super.Method_2836();
        n = (8223 & -31617) * n + this.Field_2854.hashCode();
        n = (2079 & -32737) * n + Arrays.hashCode(this.Field_2850);
        return n;
    }

    public Object[] Method_2864() {
        return this.Field_2850;
    }

    public Class_2849 Method_2865() {
        Object[] arrobject = new Object[this.Field_2850.length];
        for (int i = 8200 & 881; i < this.Field_2850.length; ++i) {
            arrobject[i] = this.Field_2850[i] instanceof Class_1782 ? ((Class_1782)this.Field_2850[i]).Method_1790() : this.Field_2850[i];
        }
        Class_2849 class_2849 = new Class_2849(this.Field_2854, arrobject);
        class_2849.Method_2856(this.\u0000strictfp().Method_2947());
        for (Class_1782 class_1782 : this.\u0000strictfp()) {
            class_2849.\u0000strictfp(class_1782.Method_1790());
        }
        return class_2849;
    }

    public String Method_2866() {
        return this.Field_2854;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    synchronized void Method_2867() {
        Object object = this.Field_2853;
        synchronized (object) {
            long l = Class_7594.Method_7600();
            if (l == this.Field_2855) {
                return;
            }
            this.Field_2855 = l;
            this.Field_2852.clear();
        }
        try {
            this.Method_2861(Class_7594.Method_7602(this.Field_2854));
        }
        catch (Class_15734 class_15734) {
            this.Field_2852.clear();
            try {
                this.Method_2861(Class_7594.Method_7601(this.Field_2854));
            }
            catch (Class_15734 class_157342) {
                throw class_15734;
            }
        }
    }

    public Class_2849(String string, Object ... arrobject) {
        this.Field_2854 = string;
        this.Field_2850 = arrobject;
        Object[] arrobject2 = arrobject;
        int n = arrobject2.length;
        for (int i = 2058 & 4132; i < n; ++i) {
            Object object = arrobject2[i];
            if (!(object instanceof Class_1782)) continue;
            ((Class_1782)object).Method_1789().Method_2941(this.\u0000strictfp());
        }
    }

    private static String Method_2868(String string) {
        int n = 11049;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_2849.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public String Method_2869() {
        this.Method_2867();
        StringBuilder stringBuilder = new StringBuilder();
        for (Class_1782 class_1782 : this.Field_2852) {
            stringBuilder.append(class_1782.Method_1784());
        }
        return stringBuilder.toString();
    }

    private void Method_2870() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

