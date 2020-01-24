/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class Class_13017 {
    public static Class_17592 Field_13018;
    public static Class_17592 Field_13019;
    private static DecimalFormat Field_13020;
    private Class Field_13021;
    public static Class_17592 Field_13022;
    private static NumberFormat Field_13023;
    public final String Field_13024;
    public static Class_17592 Field_13025;
    private final Class_1782 Field_13026;
    private final Class_17592 Field_13027;
    private final Class_27930 Field_13028;
    public boolean Field_13029;

    static NumberFormat Method_13030() {
        return Field_13023;
    }

    public String Method_13031() {
        return "Stat{id=" + this.Field_13024 + ", nameId=" + this.Field_13026 + ", awardLocallyOnly=" + this.Field_13029 + ", formatter=" + this.Field_13027 + ", objectiveCriteria=" + this.Field_13028 + (char)(12925 & 1151);
    }

    public Class Method_13032() {
        return this.Field_13021;
    }

    private void Method_13033() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_13017 Method_13034(Class class_) {
        this.Field_13021 = class_;
        return this;
    }

    public Class_13017(String string, Class_1782 class_1782) {
        this(string, class_1782, Field_13022);
    }

    static DecimalFormat Method_13035() {
        return Field_13020;
    }

    public boolean Method_13036() {
        return (-31480 & 50) != 0;
    }

    public Class_27930 Method_13037() {
        return this.Field_13028;
    }

    public boolean Method_13038(Object object) {
        if (this == object) {
            return (-15925 & 513) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_13017 class_13017 = (Class_13017)object;
            return this.Field_13024.equals(class_13017.Field_13024);
        }
        return (2304 & 1104) != 0;
    }

    static {
        Field_13023 = NumberFormat.getIntegerInstance(Locale.US);
        Field_13022 = new Class_30375();
        Field_13020 = new DecimalFormat(Class_13017.Method_13039("\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u0100\u010b\u0101\u010b\u010b"));
        Field_13025 = new Class_20114();
        Field_13018 = new Class_20069();
        Field_13019 = new Class_22094();
    }

    private static String Method_13039(String string) {
        int n = 2210;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_13017.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_1782 Method_13040() {
        Class_1782 class_1782 = this.Field_13026.Method_1790();
        class_1782.Method_1789().Method_2917(Class_5478.Field_5480);
        class_1782.Method_1789().Method_2936(new Class_44868(Class_14202.Field_14210, new Class_2840(this.Field_13024)));
        return class_1782;
    }

    public int Method_13041() {
        return this.Field_13024.hashCode();
    }

    public Class_13017(String string, Class_1782 class_1782, Class_17592 class_17592) {
        this.Field_13024 = string;
        this.Field_13026 = class_1782;
        this.Field_13027 = class_17592;
        this.Field_13028 = new Class_36603(this);
        Class_27930.Field_27937.put(this.Field_13028.Method_27940(), this.Field_13028);
    }

    public Class_13017 Method_13042() {
        this.Field_13029 = 1057 & 2561;
        return this;
    }

    public String Method_13043(int n) {
        return this.Field_13027.Method_17593(n);
    }

    public Class_1782 Method_13044() {
        Class_1782 class_1782 = this.Method_13040();
        Class_1782 class_17822 = new Class_2840("[").\u0000strictfp(class_1782).Method_1785("]");
        class_17822.Method_1786(class_1782.Method_1789());
        return class_17822;
    }

    public Class_13017 Method_13045() {
        if (Class_19863.Field_19887.containsKey(this.Field_13024)) {
            throw new RuntimeException("Duplicate stat id: \"" + ((Class_13017)Class_19863.Field_19887.get((Object)this.Field_13024)).Field_13026 + "\" and \"" + this.Field_13026 + "\" at id " + this.Field_13024);
        }
        Class_19863.Field_19886.add(this);
        Class_19863.Field_19887.put(this.Field_13024, this);
        return this;
    }
}

