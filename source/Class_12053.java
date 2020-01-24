/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_12053 {
    public static final char[] Field_12054;

    public static String Method_12055(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] arrc = string.toCharArray();
        int n = arrc.length;
        for (int i = 4352 & 2592; i < n; ++i) {
            char c = arrc[i];
            if (!Class_12053.Method_12057(c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    private void Method_12056() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static boolean Method_12057(char c) {
        return (c != (17839 & 231) && c >= (-15311 & 8230) && c != (25343 & 1151) ? 18475 & 17 : 512 & -16098) != 0;
    }

    static {
        char[] arrc = new char[10287 & 4319];
        arrc[4098 & 9600] = -32657 & 22575;
        arrc[-14015 & 4649] = 17515 & 650;
        arrc[29382 & 1050] = 175 & 8461;
        arrc[163 & -28905] = 4169 & 2075;
        arrc[164 & 16716] = -24543 & 16850;
        arrc[69 & -22249] = -12145 & 44;
        arrc[-25178 & 16455] = -9606 & 1381;
        arrc[8455 & -31721] = 1087 & -32641;
        arrc[586 & -7159] = 1006 & 6186;
        arrc[2059 & -24535] = 10332 & 5212;
        arrc[8350 & -31478] = -31620 & 20542;
        arrc[8203 & -28693] = 1086 & -32577;
        arrc[-24020 & 1294] = 2174 & 16637;
        arrc[19151 & 13] = 18482 & 4898;
        arrc[16910 & -32626] = 1850 & 16506;
        Field_12054 = arrc;
    }
}

