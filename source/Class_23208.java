/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_23208
extends Class_1490 {
    private boolean Field_23209;
    private String Field_23210 = "";
    public boolean Field_23211 = 6145 & 8228;
    private String Field_23212 = "";
    private boolean Field_23213 = 2048 & 175;
    private long Field_23214 = System.currentTimeMillis();
    private boolean Field_23215 = 4108 & 16416;
    final char[] Field_23216 = "-\\|/".toCharArray();

    public void Method_23217(String string) {
        this.Field_23212 = string;
        this.Method_23218("Aktualizacja BlazingPack");
    }

    public void Method_23218(String string) {
        this.Field_23210 = string;
    }

    public void Method_23219(int n, int n2, float f) {
        if (this.Field_23209) {
            this.\u0000strictfp.Method_218(null);
        } else {
            this.\u0000, 2();
            this.\u0000strictfp(this.\u0000strictfp, this.Field_23210, this.\u0000= final / (-28538 & 8307), 199 & 29254, 16777215 & -1577058305);
            if (!this.Field_23213) {
                int n3;
                int n4 = 17056 & 5451;
                String string = this.Field_23212;
                try {
                    if (this.Field_23211) {
                        long l = System.currentTimeMillis();
                        n3 = this.Field_23216[(int)((l - this.Field_23214) / (-7732986162645491206L & 7732986162442424570L) % (long)this.Field_23216.length)];
                        int n5 = string.length();
                        int n6 = (int)((l - this.Field_23214) / (1154586674L & 269223354L) % (long)n5);
                        char[] arrc = string.replace((char)(-26548 & 8641), (char)n3).toCharArray();
                        arrc[n6] = Character.toUpperCase(arrc[n6]);
                        string = new String(arrc);
                    }
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                String[] arrstring = string.split("\n");
                int n7 = arrstring.length;
                for (n3 = 1312 & 4112; n3 < n7; ++n3) {
                    String string2 = arrstring[n3];
                    this.\u0000strictfp(this.\u0000strictfp, string2, this.\u0000= final / (930 & 12294), (90 & 23771) + (25100 & 2109) * n4++, -1828716545 & 1761607679);
                }
            }
            super.Method_1545(n, n2, f);
        }
    }

    public void Method_23220() {
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(24596 & -28384, this.\u0000= final / (-31966 & 14339) - (614 & 500), this.\u0000, ` / (2054 & 1765) + (756 & -32668), "Zrozumia\u0142em"));
        ((Class_42376)this.\u0000strictfp.get((int)(18632 & -27641))).Field_42378 = this.Field_23215;
    }

    public void Method_23221(String string) {
        this.Method_23217(string);
    }

    public void Method_23222() {
        ((Class_42376)this.\u0000strictfp.get((int)(18645 & 1546))).Field_42378 = this.Field_23215 = 18585 & 9729;
    }

    protected void Method_23223(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0) {
            Class_18.Field_89.Method_210();
        }
    }

    private void Method_23224() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

