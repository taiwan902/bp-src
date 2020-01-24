/*
 * Decompiled with CFR 0.145.
 */
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_42445 {
    private void Method_42446() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static Reader Method_42447(boolean bl, boolean bl2) {
        String string;
        if (!Class_42445.Method_42448() && !Class_42445.Method_42453()) {
            return null;
        }
        int[] arrn = Class_42445.Method_42452(bl);
        if (arrn == null) {
            return null;
        }
        if (!bl2) {
            string = bl ? "deferred" : "composite";
            Class_26062.Method_26067("flipped buffers after " + string + ": " + Class_19426.Method_19558(arrn));
        }
        string = bl2 ? Class_42445.Method_42449(arrn) : Class_42445.Method_42454(arrn);
        return new StringReader(string);
    }

    private static boolean Method_42448() {
        for (int i = 16425 & 7271; i < (-27287 & 25145); ++i) {
            if (Class_12440.Field_12548[i] == 0) continue;
            return (-28279 & 37) != 0;
        }
        return (1 & 18304) != 0;
    }

    private static String Method_42449(int[] arrn) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("#version 120                        ");
        arrayList.add("varying vec2 texcoord;              ");
        arrayList.add("void main()                         ");
        arrayList.add("{                                   ");
        arrayList.add("  gl_Position = ftransform();       ");
        arrayList.add("  texcoord = gl_MultiTexCoord0.xy;  ");
        arrayList.add("}                                   ");
        return Class_19426.Method_19551(arrayList, "\n");
    }

    public static Reader Method_42450(String string) {
        return string.endsWith("/deferred_last.vsh") ? Class_42445.Method_42447((5 & 417) != 0, (-26997 & 1) != 0) : (string.endsWith("/composite_last.vsh") ? Class_42445.Method_42447((790 & 1096) != 0, (-25081 & 16673) != 0) : (string.endsWith("/deferred_last.fsh") ? Class_42445.Method_42447((16447 & 897) != 0, (2066 & 801) != 0) : (string.endsWith("/composite_last.fsh") ? Class_42445.Method_42447((20676 & 8225) != 0, (16448 & -31450) != 0) : null)));
    }

    private static boolean[] Method_42451(int n) {
        boolean[] arrbl = new boolean[2140 & -3831];
        String string = Class_12440.Field_12604[n];
        if (string == null) {
            return arrbl;
        }
        for (int i = 10753 & 16522; i < string.length(); ++i) {
            char c = string.charAt(i);
            int n2 = c - (562 & 24688);
            if (n2 < 0 || n2 >= arrbl.length) continue;
            arrbl[n2] = -7059 & 2049;
        }
        return arrbl;
    }

    private static int[] Method_42452(boolean bl) {
        return bl ? Class_42445.Method_42455(3107 & 12901, 18072 & -26616) : Class_42445.Method_42455(-24545 & 2581, 2729 & 20744);
    }

    private static boolean Method_42453() {
        for (int i = 2 & -24511; i < Class_12440.Field_12572.length; ++i) {
            if (Class_12440.Field_12572[i]) continue;
            return (-20411 & 2817) != 0;
        }
        return (112 & 24584) != 0;
    }

    private static String Method_42454(int[] arrn) {
        int n;
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = Class_19426.Method_19605(arrn, "");
        arrayList.add("#version 120                                           ");
        for (n = 5728 & 2066; n < arrn.length; ++n) {
            arrayList.add("uniform sampler2D colortex" + arrn[n] + ";        ");
        }
        arrayList.add("varying vec2 texcoord;                                 ");
        arrayList.add("/* DRAWBUFFERS:" + string + " */                  ");
        arrayList.add("void main()                                            ");
        arrayList.add("{                                                      ");
        for (n = 2 & 256; n < arrn.length; ++n) {
            arrayList.add("  gl_FragData[" + n + "] = texture2D(colortex" + arrn[n] + ", texcoord);     ");
        }
        arrayList.add("}                                                      ");
        return Class_19426.Method_19551(arrayList, "\n");
    }

    private static int[] Method_42455(int n, int n2) {
        int n3;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        boolean[] arrbl = new boolean[-20198 & 73];
        for (n3 = n; n3 < n + n2; ++n3) {
            if (Class_12440.Field_12548[n3] == 0) continue;
            boolean[] arrbl2 = Class_42445.Method_42451(n3);
            for (int i = 259 & 27688; i < arrbl2.length; ++i) {
                boolean bl = arrbl2[i];
                if (!bl) continue;
                arrbl[i] = !arrbl[i] ? 2967 & 1097 : 2321 & 17480;
            }
        }
        for (n3 = -31728 & 22944; n3 < arrbl.length; ++n3) {
            boolean bl = arrbl[n3];
            if (!bl) continue;
            arrayList.add(new Integer(n3));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Integer[] arrinteger = arrayList.toArray(new Integer[arrayList.size()]);
        return Class_19426.Method_19547(arrinteger);
    }
}

