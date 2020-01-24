/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_20136
extends Class_1490 {
    private Class_1782 Field_20137;
    private String Field_20138;
    private final Class_1490 Field_20139;
    private List Field_20140;
    private long Field_20141;
    private String Field_20142;
    private int Field_20143;

    public void Method_20144(int n, int n2, float f) {
        if (!this.\u0000strictfp.isEmpty()) {
            long l = this.Method_20149();
            if (l <= (67789844L & -1474961687211409408L)) {
                ((Class_42376)this.\u0000strictfp.get((int)(-32735 & 12428))).Field_42381 = this.Field_20142;
                ((Class_42376)this.\u0000strictfp.get((int)(-20990 & 20908))).Field_42388 = 8705 & 5;
            } else {
                Object[] arrobject = new Object[25765 & 833];
                arrobject[6344 & -15100] = (double)l / (58000.0 * 0.017241379310344827);
                String string = String.format("%.3f", arrobject);
                ((Class_42376)this.\u0000strictfp.get((int)(-28660 & 1217))).Field_42381 = this.Field_20142 + " (" + string + " s)";
                ((Class_42376)this.\u0000strictfp.get((int)(4614 & -32503))).Field_42388 = -13012 & 8704;
            }
        }
        this.\u0000, 2();
        this.\u0000strictfp(this.\u0000strictfp, this.Field_20138, this.\u0000= final / (2 & 21763), this.\u0000, ` / (1154 & -30685) - this.Field_20143 / (-14558 & 2058) - (1737 & 18459) * (16678 & -20477), 468626094 & 548122539);
        int n3 = this.\u0000, ` / (12811 & -31454) - this.Field_20143 / (2054 & -24021);
        if (this.Field_20140 != null) {
            for (String string : this.Field_20140) {
                this.\u0000strictfp(this.\u0000strictfp, string, this.\u0000= final / (34 & 14851), n3, 1157627903 & 301989887);
                n3 += 473 & 4109;
            }
        }
        super.Method_1545(n, n2, f);
    }

    public Class_20136(Class_1490 class_1490, String string, Class_1782 class_1782) {
        this.Field_20139 = class_1490;
        this.Field_20138 = Class_9802.Method_9806(string, new Object[620 & 10240]);
        this.Field_20137 = class_1782;
        this.Field_20142 = Class_9802.Method_9806("gui.toMenu", new Object[80 & -26496]);
    }

    protected void Method_20145(char c, int n) {
    }

    public void Method_20146() {
        if (this.Field_20141 == (-4791394649262520223L & 177475600L)) {
            this.Field_20141 = System.currentTimeMillis();
        }
        this.\u0000strictfp.clear();
        this.Field_20140 = this.\u0000strictfp.Method_28733(this.Field_20137.Method_1783(), this.\u0000= final - (6323 & 566));
        this.Field_20143 = this.Field_20140.size() * (17053 & 73);
        Class_42376 class_42376 = new Class_42376(4870 & -15312, this.\u0000= final / (13858 & -32506) - (2406 & -28563), this.\u0000, ` / (7206 & 16659) + this.Field_20143 / (-28389 & 19650) + (6223 & 8713), this.Field_20142);
        this.\u0000strictfp.add(class_42376);
        class_42376.Field_42388 = 1360 & 28682;
    }

    protected void Method_20147(Class_42376 class_42376) {
        if (class_42376.Field_42392 == 0) {
            this.\u0000strictfp.Method_218(this.Field_20139);
        }
    }

    private void Method_20148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public long Method_20149() {
        return (557851624L & 1073880046L) - (System.currentTimeMillis() - this.Field_20141);
    }
}

