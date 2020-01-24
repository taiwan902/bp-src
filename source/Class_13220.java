/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.concurrent.Callable;

public class Class_13220 {
    private final List Field_13221 = Lists.newArrayList();
    private final String Field_13222;
    private StackTraceElement[] Field_13223 = new StackTraceElement[68 & 145];
    private final Class_13268 Field_13224;

    public void Method_13225(StringBuilder stringBuilder) {
        stringBuilder.append("-- ").append(this.Field_13222).append(" --\n");
        stringBuilder.append("Details:");
        for (Class_12102 class_12102 : this.Field_13221) {
            stringBuilder.append("\n\t");
            stringBuilder.append(class_12102.Method_12105());
            stringBuilder.append(": ");
            stringBuilder.append(class_12102.Method_12106());
        }
        if (this.Field_13223 != null && this.Field_13223.length > 0) {
            stringBuilder.append("\nStacktrace:");
            StackTraceElement[] arrstackTraceElement = this.Field_13223;
            int n = arrstackTraceElement.length;
            for (int i = 8228 & -32678; i < n; ++i) {
                StackTraceElement stackTraceElement = arrstackTraceElement[i];
                stringBuilder.append("\n\tat ");
                stringBuilder.append(stackTraceElement.toString());
            }
        }
    }

    public void Method_13226(int n) {
        StackTraceElement[] arrstackTraceElement = new StackTraceElement[this.Field_13223.length - n];
        System.arraycopy(this.Field_13223, 418 & 20036, arrstackTraceElement, 8 & 10516, arrstackTraceElement.length);
        this.Field_13223 = arrstackTraceElement;
    }

    public int Method_13227(int n) {
        StackTraceElement[] arrstackTraceElement = Thread.currentThread().getStackTrace();
        if (arrstackTraceElement.length <= 0) {
            return 59 & 18816;
        }
        this.Field_13223 = new StackTraceElement[arrstackTraceElement.length - (563 & 18443) - n];
        System.arraycopy(arrstackTraceElement, (-31741 & 8671) + n, this.Field_13223, -6352 & 2054, this.Field_13223.length);
        return this.Field_13223.length;
    }

    public void Method_13228(String string, Throwable throwable) {
        this.Method_13231(string, throwable);
    }

    private void Method_13229() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_13230(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        if (this.Field_13223 != null && this.Field_13223.length != 0 && stackTraceElement != null) {
            StackTraceElement stackTraceElement3 = this.Field_13223[257 & -24064];
            if (stackTraceElement3 != null) {
                int n = -16111 & 2758;
                if (stackTraceElement3.getFileName() != null) {
                    n = stackTraceElement3.getFileName().equals(stackTraceElement.getFileName()) ? 1 : 0;
                }
                if (n != 0 && stackTraceElement3.isNativeMethod() == stackTraceElement.isNativeMethod() && stackTraceElement3.getClassName().equals(stackTraceElement.getClassName()) && stackTraceElement3.getMethodName().equals(stackTraceElement.getMethodName())) {
                    if ((stackTraceElement2 != null ? 73 & 17159 : 321 & 9902) != (this.Field_13223.length > (11271 & 16929) ? 17553 & 2565 : 24896 & 561)) {
                        return (10756 & 1346) != 0;
                    }
                    if (stackTraceElement2 != null && !this.Field_13223[-32733 & 16065].equals(stackTraceElement2)) {
                        return (16641 & -31744) != 0;
                    }
                    this.Field_13223[12294 & 768] = stackTraceElement;
                    return (3587 & 261) != 0;
                }
                return (2176 & 1100) != 0;
            }
            return (2080 & 12416) != 0;
        }
        return (1641 & 262) != 0;
    }

    public void Method_13231(String string, Object object) {
        this.Field_13221.add(new Class_12102(string, object));
    }

    public void Method_13232(String string, Callable callable) {
        try {
            this.Method_13231(string, callable.call());
        }
        catch (Throwable throwable) {
            this.Method_13228(string, throwable);
        }
    }

    public StackTraceElement[] Method_13233() {
        return this.Field_13223;
    }

    public static void Method_13234(Class_13220 class_13220, Class_4751 class_4751, Class_3436 class_3436) {
        class_13220.Method_13232("Block", new Class_23940(class_3436));
        class_13220.Method_13232("Block location", new Class_30418(class_4751));
    }

    public Class_13220(Class_13268 class_13268, String string) {
        this.Field_13224 = class_13268;
        this.Field_13222 = string;
    }

    public static void Method_13235(Class_13220 class_13220, Class_4751 class_4751, Class_3238 class_3238, int n) {
        int n2 = Class_3238.Method_3435(class_3238);
        class_13220.Method_13232("Block type", new Class_26742(n2, class_3238));
        class_13220.Method_13232("Block data value", new Class_24791(n));
        class_13220.Method_13232("Block location", new Class_28160(class_4751));
    }

    public static String Method_13236(double d, double d2, double d3) {
        Object[] arrobject = new Object[-16379 & 7708];
        arrobject[-30712 & 5632] = d;
        arrobject[-26511 & 8457] = d2;
        arrobject[-32634 & 19458] = d3;
        arrobject[1459 & 519] = Class_13220.Method_13237(new Class_4751(d, d2, d3));
        return String.format("%.2f,%.2f,%.2f - %s", arrobject);
    }

    public static String Method_13237(Class_4751 class_4751) {
        int n;
        Object object;
        int n2;
        Object object2;
        Object object3;
        int n3;
        int n4;
        Object object4;
        int n5 = class_4751.\u0000= final();
        int n6 = class_4751.\u0000, `();
        int n7 = class_4751.\u0000strictfp();
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Object[] arrobject = new Object[-16061 & 3715];
            arrobject[-15750 & 3201] = n5;
            arrobject[12349 & 18049] = n6;
            arrobject[4418 & 523] = n7;
            stringBuilder.append(String.format("World: (%d,%d,%d)", arrobject));
        }
        catch (Throwable object5) {
            stringBuilder.append("(Error finding world loc)");
        }
        stringBuilder.append(", ");
        try {
            int n8 = n5 >> (4 & 3332);
            n = n7 >> (14412 & 1445);
            object = n5 & (271 & 14367);
            n3 = n6 >> (4484 & 20060);
            object3 = n7 & (319 & -20337);
            n2 = n8 << (7558 & 36);
            object2 = n << (37 & 13636);
            n4 = (n8 + (17665 & 6267) << (-30627 & 25126)) - (-13795 & 9217);
            object4 = (n + (3 & -3195) << (25108 & -32690)) - (697 & 24579);
            Object[] arrobject = new Object[20749 & -32759];
            arrobject[-8192 & 55] = object;
            arrobject[1809 & 14337] = n3;
            arrobject[6163 & 16394] = object3;
            arrobject[287 & -31229] = n8;
            arrobject[7492 & -32067] = n;
            arrobject[20485 & 8439] = n2;
            arrobject[25366 & -28537] = object2;
            arrobject[11655 & 551] = n4;
            arrobject[536 & 395] = object4;
            stringBuilder.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", arrobject));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding chunk loc)");
        }
        stringBuilder.append(", ");
        try {
            object5 = n5 >> (2061 & -12197);
            n = n7 >> (16411 & 8265);
            object = object5 << (-30555 & 16661);
            n3 = n << (10757 & 1095);
            object3 = (object5 + (515 & 1049) << (13349 & -32747)) - (4101 & 8849);
            n2 = (n + (-15355 & 8961) << (5 & 79)) - (28801 & 2049);
            object2 = object5 << (4109 & 265);
            n4 = n << (4409 & -30515);
            object4 = (object5 + (333 & 20481) << (2059 & 4617)) - (29193 & 197);
            int n9 = (n + (2193 & 14147) << (-23925 & 2349)) - (25 & -15099);
            Object[] arrobject = new Object[16986 & 12687];
            arrobject[11264 & -32671] = (int)object5;
            arrobject[10881 & 17665] = n;
            arrobject[8474 & 3234] = object;
            arrobject[2915 & 131] = n3;
            arrobject[8212 & 1030] = object3;
            arrobject[12293 & 391] = n2;
            arrobject[2182 & -28650] = object2;
            arrobject[4303 & 807] = n4;
            arrobject[2058 & 1608] = object4;
            arrobject[2825 & -8147] = n9;
            stringBuilder.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", arrobject));
        }
        catch (Throwable throwable) {
            stringBuilder.append("(Error finding world loc)");
        }
        return stringBuilder.toString();
    }
}

