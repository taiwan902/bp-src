/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 *  com.google.gson.JsonParseException
 *  org.apache.commons.lang3.exception.ExceptionUtils
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.gson.JsonParseException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_40782
extends Class_36787 {
    private static final Logger Field_40783 = LogManager.getLogger();

    public boolean Method_40784(String[] arrstring, int n) {
        return (n == 0 ? 6305 & 537 : 25368 & 1186) != 0;
    }

    public void Method_40785(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length < (-20454 & 1059)) {
            throw new Class_34974("commands.title.usage", new Object[6657 & 16608]);
        }
        if (arrstring.length < (-28537 & 1035)) {
            if ("title".equals(arrstring[-30325 & 16385]) || "subtitle".equals(arrstring[26945 & -28655])) {
                throw new Class_34974("commands.title.usage.title", new Object[897 & 1122]);
            }
            if ("times".equals(arrstring[9283 & 5])) {
                throw new Class_34974("commands.title.usage.times", new Object[-30592 & 5953]);
            }
        }
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = Class_40782.\u0000strictfp((Class_1367)class_1367, (String)arrstring[1025 & -28156]);
        Class_32274 class_32274 = Class_32274.Method_32289(arrstring[4355 & 8357]);
        if (class_32274 != Class_32274.Field_32280 && class_32274 != Class_32274.Field_32278) {
            if (class_32274 == Class_32274.Field_32277) {
                if (arrstring.length != (24655 & -31179)) {
                    throw new Class_34974("commands.title.usage", new Object[1296 & -32191]);
                }
                int n = Class_40782.\u0000strictfp((String)arrstring[-32686 & 1455]);
                int n2 = Class_40782.\u0000strictfp((String)arrstring[14387 & 579]);
                int n3 = Class_40782.\u0000strictfp((String)arrstring[22532 & 613]);
                Class_39461 class_39461 = new Class_39461(n, n2, n3);
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(class_39461);
                Class_40782.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.title.success", (Object[])new Object[7267 & 16404]);
            } else {
                Class_1782 class_1782;
                if (arrstring.length < (1035 & -7737)) {
                    throw new Class_34974("commands.title.usage", new Object[26850 & 5888]);
                }
                String string = Class_40782.\u0000strictfp((String[])arrstring, (int)(2314 & 4115));
                try {
                    class_1782 = Class_2814.Method_2819(string);
                }
                catch (JsonParseException jsonParseException) {
                    Throwable throwable = ExceptionUtils.getRootCause((Throwable)jsonParseException);
                    Object[] arrobject = new Object[-32125 & 257];
                    arrobject[132 & 8496] = throwable == null ? "" : throwable.getMessage();
                    throw new Class_32994("commands.tellraw.jsonException", arrobject);
                }
                Class_39461 class_39461 = new Class_39461(class_32274, Class_21303.Method_21304(class_1367, class_1782, (Class_1061)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2));
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(class_39461);
                Class_40782.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.title.success", (Object[])new Object[8206 & 2576]);
            }
        } else {
            if (arrstring.length != (5186 & 8450)) {
                throw new Class_34974("commands.title.usage", new Object[44 & 4161]);
            }
            Class_39461 class_39461 = new Class_39461(class_32274, null);
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(class_39461);
            Class_40782.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.title.success", (Object[])new Object[12508 & -12798]);
        }
    }

    public String Method_40786() {
        return "title";
    }

    public String Method_40787(Class_1367 class_1367) {
        return "commands.title.usage";
    }

    public int Method_40788() {
        return 515 & 6538;
    }

    private void Method_40789() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public List Method_40790(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        return arrstring.length == (8473 & 3) ? Class_40782.\u0000strictfp((String[])arrstring, (String[])Class_2457.Method_2530().Method_2554()) : (arrstring.length == (3138 & -11774) ? Class_40782.\u0000strictfp((String[])arrstring, (String[])Class_32274.Method_32283()) : null);
    }
}

