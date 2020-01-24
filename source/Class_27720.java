/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_27720
extends Class_1490 {
    private Class_42376 Field_27721;
    private String Field_27722;
    private final Class_38966 Field_27723;
    private Class_34729 Field_27724 = Class_34729.Method_34738();
    private Class_42376 Field_27725;
    private String Field_27726;
    private Class_36446 Field_27727;
    private String Field_27728;
    private Class_42376 Field_27729;

    protected void Method_27730(Class_42376 class_42376) {
        int n = this.Field_27724.Method_34737().size() - this.Field_27727.Field_36448 - (1157 & 25091);
        if (class_42376.Field_42392 == (553 & 16721)) {
            this.\u0000strictfp.Method_218(this.Field_27723);
        } else if (class_42376.Field_42392 == 0) {
            this.Field_27723.Field_38968 = this.Method_27736();
            this.\u0000strictfp.Method_218(this.Field_27723);
        } else if (class_42376.Field_42392 == (1797 & -16313)) {
            this.\u0000strictfp.Method_218(new Class_18965(this));
        } else if (class_42376.Field_42392 == (-29156 & 16742) && this.Method_27731()) {
            this.Field_27724.Method_34737().remove(n);
            this.Field_27727.Field_36448 = Math.min(this.Field_27727.Field_36448, this.Field_27724.Method_34737().size() - (13569 & 16395));
        }
        this.Field_27724.Method_34741();
        this.Method_27738();
    }

    private boolean Method_27731() {
        return (this.Field_27727.Field_36448 > (-1 & -1) && this.Field_27727.Field_36448 < this.Field_27724.Method_34737().size() ? 2565 & -32701 : 2085 & 522) != 0;
    }

    static Class_34729 Method_27732(Class_27720 class_27720) {
        return class_27720.Field_27724;
    }

    private void Method_27733() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27734() {
        this.\u0000strictfp.clear();
        this.Field_27726 = Class_9802.Method_9806("createWorld.customize.flat.title", new Object[1024 & -22526]);
        this.Field_27728 = Class_9802.Method_9806("createWorld.customize.flat.tile", new Object[24709 & -28142]);
        this.Field_27722 = Class_9802.Method_9806("createWorld.customize.flat.height", new Object[20736 & -32739]);
        this.Field_27727 = new Class_36446(this);
        this.Field_27721 = new Class_42376(-26110 & 24715, this.\u0000= final / (130 & -12234) - (4250 & 25786), this.\u0000, ` - (52 & 6716), 364 & 1764, -32483 & 3604, Class_9802.Method_9806("createWorld.customize.flat.addLayer", new Object[5442 & -30688]) + " (NYI)");
        this.\u0000strictfp.add(this.Field_27721);
        this.Field_27725 = new Class_42376(11271 & -15677, this.\u0000= final / (-24478 & 16514) - (183 & -19398), this.\u0000, ` - (-24396 & 628), 8316 & 4708, 86 & 18196, Class_9802.Method_9806("createWorld.customize.flat.editLayer", new Object[-754 & 129]) + " (NYI)");
        this.\u0000strictfp.add(this.Field_27725);
        this.Field_27729 = new Class_42376(-32090 & 27660, this.\u0000= final / (2147 & -31210) - (155 & -32289), this.\u0000, ` - (8759 & 16436), 918 & -30474, 28692 & 1310, Class_9802.Method_9806("createWorld.customize.flat.removeLayer", new Object[-32702 & 8453]));
        this.\u0000strictfp.add(this.Field_27729);
        this.\u0000strictfp.add(new Class_42376(3209 & -12240, this.\u0000= final / (-31930 & 16418) - (8379 & 2715), this.\u0000, ` - (4189 & 28574), 18102 & 12439, 52 & 19356, Class_9802.Method_9806("gui.done", new Object[4864 & 2264])));
        this.\u0000strictfp.add(new Class_42376(16951 & 6541, this.\u0000= final / (-16382 & 3818) + (133 & 16669), this.\u0000, ` - (2108 & 4724), -32329 & 1174, 24604 & -32524, Class_9802.Method_9806("createWorld.customize.presets", new Object[1552 & -30364])));
        this.\u0000strictfp.add(new Class_42376(5121 & 8333, this.\u0000= final / (7234 & -24053) + (10365 & 261), this.\u0000, ` - (12348 & 860), 2239 & -32298, 22 & 21140, Class_9802.Method_9806("gui.cancel", new Object[12360 & -29178])));
        this.Field_27721.Field_42378 = this.Field_27725.Field_42378 = 4 & 128;
        this.Field_27724.Method_34741();
        this.Method_27738();
    }

    public void Method_27735(String string) {
        this.Field_27724 = Class_34729.Method_34742(string);
    }

    public String Method_27736() {
        return this.Field_27724.Method_34739();
    }

    public Class_27720(Class_38966 class_38966, String string) {
        this.Field_27723 = class_38966;
        this.Method_27735(string);
    }

    public void Method_27737(int n, int n2, float f) {
        this.\u0000, 2();
        this.Field_27727.\u0000strictfp(n, n2, f);
        this.\u0000strictfp(this.\u0000strictfp, this.Field_27726, this.\u0000= final / (1186 & -28650), 6170 & -32659, 603979775 & -1862270977);
        int n3 = this.\u0000= final / (-16313 & 4354) - (-8100 & 2782) - (12304 & -30704);
        this.\u0000, `(this.\u0000strictfp, this.Field_27728, n3, 14372 & -16352, 184549375 & 1107296255);
        this.\u0000, `(this.\u0000strictfp, this.Field_27722, n3 + (-31734 & 21251) + (213 & 20703) - this.\u0000strictfp.Method_28715(this.Field_27722), 4193 & -32728, -1996488705 & 1476395007);
        super.Method_1545(n, n2, f);
    }

    public void Method_27738() {
        boolean bl;
        this.Field_27729.Field_42388 = bl = this.Method_27731();
        this.Field_27725.Field_42388 = bl;
        this.Field_27725.Field_42388 = 581 & 3456;
        this.Field_27721.Field_42388 = 0 & 3734;
    }

    public void Method_27739() {
        super.Method_1544();
        this.Field_27727.\u0000, for();
    }
}

