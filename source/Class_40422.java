/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.LinkedHashMap;

public class Class_40422
extends Class_37430 {
    public Class_40422() {
        super("Downloader", -30618 & 18412, 16606 & -22982);
    }

    public void Method_40423(int n, int n2, float f) {
        long l;
        int n3;
        if (!((Boolean)this.\u0000strictfp.Field_84.Field_39732.Field_8847.\u0000strictfp()).booleanValue()) {
            return;
        }
        Class_24595 class_24595 = this.\u0000strictfp.Method_247(null);
        int n4 = class_24595.Field_24600.size();
        if (n4 == 0) {
            return;
        }
        long l2 = class_24595.Field_24599;
        long l3 = class_24595.Field_24607;
        if (l2 == (17111040L & 1351122963L)) {
            l2 = 839781401L & -5855427556074769529L;
        }
        if ((l = l2 - l3) < (42607232L & 1343232328L)) {
            l = -1L & -1L;
        }
        Object[] arrobject = new Object[647 & -25599];
        arrobject[16 & 1376] = (double)l3 * (1.5925925925925926 * 62.7906976744186) / (double)l2;
        String string = String.format("Pobieranie zasob\u00f3w, np. skrzyde\u0142 [%.1f%%]", arrobject);
        Object[] arrobject2 = new Object[8386 & -11746];
        arrobject2[1352 & -26494] = n4;
        arrobject2[8451 & 1153] = Class_40422.Method_40425(l);
        String string2 = String.format("%d w kolejce, %s do pobrania", arrobject2);
        int n5 = this.\u0000strictfp.Method_28715(string);
        int n6 = Math.max(n5 + (8 & -28226), Math.max((n3 = this.\u0000strictfp.Method_28715(string2)) + (9226 & -32644), this.\u0000, #));
        if (n6 > this.\u0000, #) {
            this.\u0000, `(n6, this.\u0000= switch);
        }
        Class_40422.\u0000, `((int)this.\u0000, for, (int)this.\u0000, 2, (int)this.\u0000= `, (int)this.\u0000= int, (int)(-435600804 & 1732552736));
        this.\u0000strictfp.Method_28729(string, (this.\u0000, for + this.\u0000= ` - n5) / (30818 & 1794), this.\u0000, 2 + (4292 & -32755), -1 & -1);
        this.\u0000strictfp.Method_28729(string2, (this.\u0000, for + this.\u0000= ` - n3) / (1554 & 8654), this.\u0000, 2 + (6436 & 9236) + (589 & -31463), -1 & -1);
    }

    private void Method_40424() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private static String Method_40425(long l) {
        if (l < (1078265745L & 5887312042005255790L)) {
            return l + " B";
        }
        int n = (int)(Math.log(l) / Math.log(450.7826086956522 * 3.4074074074074074));
        String string = "KMGTPE".charAt(n - (2629 & 8451)) + "i";
        Object[] arrobject = new Object[-31966 & 1030];
        arrobject[1289 & 12880] = (double)l / Math.pow(1.2465753424657535 * 821.4505494505494, n);
        arrobject[-16127 & 651] = string;
        return String.format("%.2f %sB", arrobject);
    }
}

