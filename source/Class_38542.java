/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_38542
extends Class_36787 {
    public boolean Method_38543(String[] arrstring, int n) {
        return (n == (-32731 & 17793) ? -10239 & 8761 : -32640 & 6176) != 0;
    }

    public void Method_38544(Class_1367 class_1367, String[] arrstring) {
        if (arrstring.length <= 0) {
            throw new Class_34974("commands.gamemode.usage", new Object[26123 & 292]);
        }
        Class_35650 class_35650 = this.Method_38546(class_1367, arrstring[385 & 4132]);
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 = arrstring.length >= (1555 & 10534) ? Class_38542.\u0000strictfp((Class_1367)class_1367, (String)arrstring[-12283 & 8513]) : Class_38542.\u0000strictfp((Class_1367)class_1367);
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.Method_746(class_35650);
        \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000= finally = 0.0f;
        if (class_1367.Method_1375().Method_522().Method_7529("sendCommandFeedback")) {
            \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp((Class_1782)new Class_2849("gameMode.changed", new Object[-32758 & 21221]));
        }
        Class_2849 class_2849 = new Class_2849("gameMode." + class_35650.Method_35677(), new Object[-32183 & 20528]);
        if (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 != class_1367) {
            Object[] arrobject = new Object[-13561 & 8218];
            arrobject[25096 & 5282] = \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.Method_825();
            arrobject[-14207 & 8741] = class_2849;
            Class_38542.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (int)(8321 & -28151), (String)"commands.gamemode.success.other", (Object[])arrobject);
        } else {
            Object[] arrobject = new Object[26867 & 521];
            arrobject[833 & 148] = class_2849;
            Class_38542.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (int)(257 & 5825), (String)"commands.gamemode.success.self", (Object[])arrobject);
        }
    }

    protected String[] Method_38545() {
        return Class_2457.Method_2530().Method_2554();
    }

    protected Class_35650 Method_38546(Class_1367 class_1367, String string) {
        return !string.equalsIgnoreCase(Class_35650.Field_35653.Method_35677()) && !string.equalsIgnoreCase("s") ? (!string.equalsIgnoreCase(Class_35650.Field_35657.Method_35677()) && !string.equalsIgnoreCase("c") ? (!string.equalsIgnoreCase(Class_35650.Field_35651.Method_35677()) && !string.equalsIgnoreCase("a") ? (!string.equalsIgnoreCase(Class_35650.Field_35654.Method_35677()) && !string.equalsIgnoreCase("sp") ? Class_9780.Method_9794(Class_38542.\u0000strictfp((String)string, (int)(28820 & 1024), (int)(Class_35650.Method_35673().length - (2 & -11682)))) : Class_35650.Field_35654) : Class_35650.Field_35651) : Class_35650.Field_35657) : Class_35650.Field_35653;
    }

    public int Method_38547() {
        return -32190 & 7330;
    }

    private void Method_38548() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_38549(Class_1367 class_1367) {
        return "commands.gamemode.usage";
    }

    public String Method_38550() {
        return "gamemode";
    }

    public List Method_38551(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        List list;
        if (arrstring.length == (133 & 8209)) {
            String[] arrstring2 = new String[28828 & 3653];
            arrstring2[1424 & 65] = "survival";
            arrstring2[3109 & -28669] = "creative";
            arrstring2[8714 & -10106] = "adventure";
            arrstring2[16907 & 13383] = "spectator";
            list = Class_38542.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        } else {
            list = arrstring.length == (1294 & 8322) ? Class_38542.\u0000strictfp((String[])arrstring, (String[])this.Method_38545()) : null;
        }
        return list;
    }
}

