/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_42456
extends Class_36787 {
    public String Method_42457(Class_1367 class_1367) {
        return "commands.gamerule.usage";
    }

    private void Method_42458() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_42459(Class_7523 class_7523, String string) {
        if ("reducedDebugInfo".equals(string)) {
            byte by = (byte)(class_7523.Method_7529(string) ? -16354 & 2199 : 23 & 20023);
            for (\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2 : Class_2457.Method_2530().Method_2616().Method_3124()) {
                \u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2.\u0000strictfp.Method_20821(new Class_23464((Class_1061)\u00005 false catch abstract void if false byte float throws void strictfp 7 3 boolean default throws class public ~ % ? continue implements return instanceof class extends instanceof static float = boolean char switch ^ long ` do const break - return char ' private else true2, by));
            }
        }
    }

    public String Method_42460() {
        return "gamerule";
    }

    public void Method_42461(Class_1367 class_1367, String[] arrstring) {
        Class_7523 class_7523 = this.Method_42463();
        String string = arrstring.length > 0 ? arrstring[5690 & 24832] : "";
        String string2 = arrstring.length > (257 & -6077) ? Class_42456.\u0000strictfp((String[])arrstring, (int)(6305 & 1)) : "";
        switch (arrstring.length) {
            case 0: {
                class_1367.Method_1373(new Class_2840(Class_42456.\u0000strictfp((Object[])class_7523.Method_7534())));
                break;
            }
            case 1: {
                if (!class_7523.Method_7533(string)) {
                    Object[] arrobject = new Object[129 & 4629];
                    arrobject[8738 & -32624] = string;
                    throw new Class_30034("commands.gamerule.norule", arrobject);
                }
                String string3 = class_7523.Method_7525(string);
                class_1367.Method_1373(new Class_2840(string).\u0000strictfp(" = ").Method_1785(string3));
                class_1367.Method_1374(Class_26261.Field_26263, class_7523.Method_7531(string));
                break;
            }
            default: {
                if (class_7523.Method_7526(string, Class_21147.Field_21149) && !"true".equals(string2) && !"false".equals(string2)) {
                    Object[] arrobject = new Object[-32675 & 6305];
                    arrobject[-14333 & 4108] = string2;
                    throw new Class_30034("commands.generic.boolean.invalid", arrobject);
                }
                class_7523.Method_7528(string, string2);
                Class_42456.Method_42459(class_7523, string);
                Class_42456.\u0000strictfp((Class_1367)class_1367, (Class_26550)this, (String)"commands.gamerule.success", (Object[])new Object[384 & -22004]);
            }
        }
    }

    public int Method_42462() {
        return 23810 & -24558;
    }

    private Class_7523 Method_42463() {
        return Class_2457.Method_2530().Method_2550(4352 & 3730).\u0000strictfp();
    }

    public List Method_42464(Class_1367 class_1367, String[] arrstring, Class_4751 class_4751) {
        Class_7523 class_7523;
        if (arrstring.length == (-31983 & 9227)) {
            return Class_42456.\u0000strictfp((String[])arrstring, (String[])this.Method_42463().Method_7534());
        }
        if (arrstring.length == (1542 & -18030) && (class_7523 = this.Method_42463()).Method_7526(arrstring[3268 & 544], Class_21147.Field_21149)) {
            String[] arrstring2 = new String[-16378 & 643];
            arrstring2[12290 & 1033] = "true";
            arrstring2[16897 & 73] = "false";
            return Class_42456.\u0000strictfp((String[])arrstring, (String[])arrstring2);
        }
        return null;
    }
}

