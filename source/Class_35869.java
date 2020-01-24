/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Callable;

public abstract class Class_35869
implements Class_1367 {
    private int Field_35870;
    private String Field_35871 = "";
    private Class_1782 Field_35872 = null;
    private final Class_8719 Field_35873 = new Class_8719();
    private static final SimpleDateFormat Field_35874 = new SimpleDateFormat(Class_35869.Method_35892("\u5841\u5841\u5801\u5840\u5840\u5801\u5840\u5840"));
    private String Field_35875 = "@";
    private boolean Field_35876 = 145 & -30173;

    public boolean Method_35877(Class_626 class_626) {
        if (!class_626.Field_694.Method_18094()) {
            return (-17632 & 136) != 0;
        }
        if (class_626.\u0000strictfp().Field_306) {
            class_626.Method_768(this);
        }
        return (18083 & 8201) != 0;
    }

    public void Method_35878(Class_1699 class_1699) {
        class_1699.Method_1702("Command", this.Field_35871);
        class_1699.Method_1739("SuccessCount", this.Field_35870);
        class_1699.Method_1702("CustomName", this.Field_35875);
        class_1699.Method_1706("TrackOutput", this.Field_35876);
        if (this.Field_35872 != null && this.Field_35876) {
            class_1699.Method_1702("LastOutput", Class_2814.Method_2821(this.Field_35872));
        }
        this.Field_35873.Method_8725(class_1699);
    }

    public abstract void Method_35879(Class_22553 var1);

    public abstract void Method_35880();

    public void Method_35881(Class_26261 class_26261, int n) {
        this.Field_35873.Method_8729(this, class_26261, n);
    }

    public void Method_35882(String string) {
        this.Field_35875 = string;
    }

    public Class_1782 Method_35883() {
        return new Class_2840(this.Method_35899());
    }

    public boolean Method_35884() {
        return this.Field_35876;
    }

    private void Method_35885() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_35886() {
        return this.Field_35870;
    }

    public void Method_35887(Class_1782 class_1782) {
        this.Field_35872 = class_1782;
    }

    public String Method_35888() {
        return this.Field_35871;
    }

    public boolean Method_35889(int n, String string) {
        return (n <= (13351 & 10) ? -23803 & 2227 : 10788 & -16128) != 0;
    }

    public void Method_35890(boolean bl) {
        this.Field_35876 = bl;
    }

    public void Method_35891(Class_283 class_283) {
        Class_2457 class_2457;
        if (class_283.Field_306) {
            this.Field_35870 = 8205 & 6274;
        }
        if ((class_2457 = Class_2457.Method_2530()) != null && class_2457.Method_2596() && class_2457.Method_2605()) {
            Class_2754 class_2754 = class_2457.Method_2553();
            try {
                this.Field_35872 = null;
                this.Field_35870 = class_2754.Method_2756(this, this.Field_35871);
            }
            catch (Throwable throwable) {
                Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Executing command block");
                Class_13220 class_13220 = class_13268.Method_13280("Command to be executed");
                class_13220.Method_13232("Command", new Class_14832(this));
                class_13220.Method_13232("Name", new Class_30391(this));
                throw new Class_1809(class_13268);
            }
        } else {
            this.Field_35870 = 1376 & -4071;
        }
    }

    private static String Method_35892(String string) {
        int n = 19490;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_35869.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_35893(String string) {
        this.Field_35871 = string;
        this.Field_35870 = 4615 & 19512;
    }

    public boolean Method_35894() {
        Class_2457 class_2457 = Class_2457.Method_2530();
        return (class_2457 == null || !class_2457.Method_2596() || class_2457.Field_2463[455 & 20512].\u0000strictfp().Method_7529("commandBlockOutput") ? 25 & 4995 : 17973 & 10304) != 0;
    }

    public void Method_35895(Class_1699 class_1699) {
        this.Field_35871 = class_1699.Method_1708("Command");
        this.Field_35870 = class_1699.Method_1738("SuccessCount");
        if (class_1699.Method_1715("CustomName", -16370 & 3976)) {
            this.Field_35875 = class_1699.Method_1708("CustomName");
        }
        if (class_1699.Method_1715("TrackOutput", 265 & 1061)) {
            this.Field_35876 = class_1699.Method_1733("TrackOutput");
        }
        if (class_1699.Method_1715("LastOutput", 2120 & -16359) && this.Field_35876) {
            this.Field_35872 = Class_2814.Method_2819(class_1699.Method_1708("LastOutput"));
        }
        this.Field_35873.Method_8724(class_1699);
    }

    public void Method_35896(Class_1782 class_1782) {
        if (this.Field_35876 && this.\u0000strictfp() != null && !this.\u0000strictfp().Field_306) {
            this.Field_35872 = new Class_2840("[" + Field_35874.format(new Date()) + "] ").\u0000strictfp(class_1782);
            this.Method_35880();
        }
    }

    public Class_8719 Method_35897() {
        return this.Field_35873;
    }

    public Class_1782 Method_35898() {
        return this.Field_35872;
    }

    public String Method_35899() {
        return this.Field_35875;
    }

    public abstract int Method_35900();
}

