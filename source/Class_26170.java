/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_26170
extends Class_1792 {
    private boolean Field_26171 = -16127 & 3301;
    private final String Field_26172;
    private final String Field_26173;
    private final String Field_26174;

    public Class_26170(Class_1549 class_1549, String string, int n, boolean bl) {
        super(class_1549, Class_9802.Method_9806(bl ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[20736 & 8810]), string, n);
        this.\u0000= final = Class_9802.Method_9806(bl ? "chat.link.open" : "gui.yes", new Object[1424 & 12290]);
        this.\u0000strictfp = Class_9802.Method_9806(bl ? "gui.cancel" : "gui.no", new Object[17431 & 8256]);
        this.Field_26174 = Class_9802.Method_9806("chat.copy", new Object[128 & 2581]);
        this.Field_26173 = Class_9802.Method_9806("chat.link.warning", new Object[32 & -30716]);
        this.Field_26172 = string;
    }

    protected void Method_26175(Class_42376 class_42376) {
        if (class_42376.Field_42392 == (-30646 & 29062)) {
            this.Method_26178();
        }
        this.\u0000strictfp.Method_1550((class_42376.Field_42392 == 0 ? 10305 & 1029 : 2224 & -24574) != 0, this.\u0000strictfp);
    }

    public void Method_26176() {
        super.Method_1806();
        this.\u0000strictfp.clear();
        this.\u0000strictfp.add(new Class_42376(21079 & -32728, this.\u0000= final / (-31738 & 27394) - (-24397 & 62) - (1145 & 109), this.\u0000, ` / (24838 & 4134) + (-7840 & 2154), 16484 & 9452, 26135 & 4508, this.\u0000= final));
        this.\u0000strictfp.add(new Class_42376(-32222 & 10506, this.\u0000= final / (4482 & 562) - (2227 & -14794), this.\u0000, ` / (8462 & 5126) + (1120 & 20590), -22300 & 4207, 21596 & 8727, this.Field_26174));
        this.\u0000strictfp.add(new Class_42376(2563 & 8205, this.\u0000= final / (1154 & -30146) - (2174 & 50) + (-12167 & 361), this.\u0000, ` / (278 & 4262) + (9057 & -14240), 229 & 17782, 8500 & 18004, this.\u0000strictfp));
    }

    public void Method_26177() {
        this.Field_26171 = 22656 & -23529;
    }

    public void Method_26178() {
        Class_26170.\u0000
        ((String)this.Field_26172);
    }

    public void Method_26179(int n, int n2, float f) {
        super.Method_1802(n, n2, f);
        if (this.Field_26171) {
            this.\u0000strictfp(this.\u0000strictfp, this.Field_26173, this.\u0000= final / (-14334 & 1546), 4207 & 3438, -2130719539 & 1845488878);
        }
    }

    private void Method_26180() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

