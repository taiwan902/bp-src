/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_23657
extends Class_1490 {
    private List Field_23658;
    private int Field_23659;
    private String Field_23660;
    private long Field_23661;
    private Class_1782 Field_23662;
    private String Field_23663;
    private final Class_1490 Field_23664;

    protected void Method_23665(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0) {
            new Class_30877(new RuntimeException("Dziekujemy za poprawne korzystanie z paczki BlazingPack."));
        }
    }

    private void Method_23666() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23657(Class_1490 class_1490, String string, Class_1782 class_1782) {
        this.Field_23664 = class_1490;
        this.Field_23663 = Class_9802.Method_9806(string, new Object[8769 & 5250]);
        this.Field_23662 = class_1782;
        this.Field_23660 = Class_9802.Method_9806("menu.quit", new Object[1236 & 6656]);
    }

    public void Method_23667(int n, int n2, float f) {
        if (!this.\u0000strictfp.isEmpty()) {
            long l = this.Method_23669();
            if (l <= (8445556524629123396L & 9765937L)) {
                ((Class_42376)this.\u0000strictfp.get((int)(1664 & 14380))).Field_42381 = this.Field_23660;
                ((Class_42376)this.\u0000strictfp.get((int)(5 & -30208))).Field_42388 = -22015 & 16681;
            } else {
                Object[] arrobject = new Object[4417 & -30575];
                arrobject[-32768 & 17632] = (double)l / (873.015873015873 * 1.1454545454545455);
                String string = String.format("%.3f", arrobject);
                ((Class_42376)this.\u0000strictfp.get((int)(22564 & -23037))).Field_42381 = this.Field_23660 + " (" + string + " s)";
                ((Class_42376)this.\u0000strictfp.get((int)(5192 & 18976))).Field_42388 = 14882 & 1424;
            }
        }
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_23663, this.\u0000= final / (-32622 & 21582), this.\u0000, ` / (162 & -27390) - this.Field_23659 / (-22325 & 17666) - (8729 & -14327) * (-26909 & 26650), -1901352022 & 1090186987);
        int n3 = this.\u0000, ` / (4290 & 1814) - this.Field_23659 / (-32726 & 1027);
        if (this.Field_23658 != null) {
            for (String string : this.Field_23658) {
                this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (6235 & 1538), n3, 16777215 & 419430399);
                n3 += -16311 & 11;
            }
        }
        super.Method_1545(n, n2, f);
    }

    protected void Method_23668(char c, int n) {
    }

    public long Method_23669() {
        return (-8145214894065484836L & 8145214892673350296L) - (System.currentTimeMillis() - this.Field_23661);
    }

    public void Method_23670() {
        if (this.Field_23661 == (21251074L & 202441024L)) {
            this.Field_23661 = System.currentTimeMillis();
        }
        this.\u0000strictfp.clear();
        this.Field_23658 = this.\u0000strictfp.Method_28733(this.Field_23662.Method_1783(), this.\u0000= final - (1331 & -28430));
        this.Field_23659 = this.Field_23658.size() * (-15843 & 14409);
        Class_42376 class_42376 = new Class_42376(2408 & -28672, this.\u0000= final / (2067 & 9382) - (-23452 & 17013), this.\u0000, ` / (24742 & 1619) + this.Field_23659 / (22594 & 1035) + (21577 & 8605), this.Field_23660);
        class_42376.Field_42388 = 4228 & 16697;
        this.\u0000strictfp.add(class_42376);
    }
}

