/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Random;

public class Class_36512
extends Class_25768 {
    private float Field_36513 = 1.0f;

    public Class_23823 Method_36514() {
        return this.\u0000strictfp().Method_32718(11848 & 4106);
    }

    public Class_36512(Class_283 class_283, Class_4751 class_4751, Class_4595 class_4595) {
        super(class_283, class_4751);
        this.\u0000strictfp(class_4595);
    }

    public void Method_36515(Class_1061 class_1061, boolean bl) {
        if (this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
            Class_23823 class_23823 = this.Method_36514();
            if (class_1061 instanceof Class_626) {
                Class_626 class_626 = (Class_626)class_1061;
                if (class_626.Field_694.Method_18094()) {
                    this.Method_36528(class_23823);
                    return;
                }
            }
            if (bl) {
                this.\u0000strictfp(new Class_23823(Class_10527.Field_10588), 0.0f);
            }
            if (class_23823 != null && this.\u0000strictfp.nextFloat() < this.Field_36513) {
                class_23823 = class_23823.Method_23850();
                this.Method_36528(class_23823);
                this.\u0000strictfp(class_23823, 0.0f);
            }
        }
    }

    public int Method_36516() {
        return this.\u0000strictfp().Method_32708(6477 & -32759);
    }

    public void Method_36517(Class_1699 class_1699) {
        Class_1699 class_16992 = class_1699.Method_1703("Item");
        if (class_16992 != null && !class_16992.Method_1736()) {
            this.Method_36522(Class_23823.Method_23840(class_16992), (-28398 & 640) != 0);
            this.Method_36532(class_1699.Method_1716("ItemRotation"), (20515 & 11400) != 0);
            if (class_1699.Method_1715("ItemDropChance", 3191 & 16483)) {
                this.Field_36513 = class_1699.Method_1745("ItemDropChance");
            }
            if (class_1699.Method_1707("Direction")) {
                this.Method_36532(this.Method_36516() * (306 & 2), (4228 & -13056) != 0);
            }
        }
        super.Method_25774(class_1699);
    }

    public int Method_36518() {
        return 12300 & -30692;
    }

    protected void Method_36519() {
        this.\u0000strictfp().Method_32727(-22262 & 5832, 4173 & 18695);
        this.\u0000strictfp().Method_32719(2825 & 1099, (byte)(-12152 & 96));
    }

    public void Method_36520(Class_23823 class_23823) {
        this.Method_36522(class_23823, (12189 & 16385) != 0);
    }

    public void Method_36521(int n) {
        this.Method_36532(n, (2121 & 1153) != 0);
    }

    private void Method_36522(Class_23823 class_23823, boolean bl) {
        if (class_23823 != null) {
            class_23823 = class_23823.Method_23850();
            class_23823.Field_23826 = 9359 & -32511;
            class_23823.Method_23901(this);
        }
        this.\u0000strictfp().Method_32704(16651 & 540, class_23823);
        this.\u0000strictfp().Method_32714(3081 & 16552);
        if (bl && this.\u0000, ` != null) {
            this.\u0000strictfp.Method_520(this.\u0000, `, Class_9265.Field_9351);
        }
    }

    public float Method_36523() {
        return 0.0f;
    }

    public void Method_36524(Class_1699 class_1699) {
        if (this.Method_36514() != null) {
            class_1699.Method_1744("Item", this.Method_36514().Method_23841(new Class_1699()));
            class_1699.Method_1724("ItemRotation", (byte)this.Method_36516());
            class_1699.Method_1704("ItemDropChance", this.Field_36513);
        }
        super.Method_25775(class_1699);
    }

    public void Method_36525(Class_1061 class_1061) {
        this.Method_36515(class_1061, (193 & 1283) != 0);
    }

    public int Method_36526() {
        return this.Method_36514() == null ? 16970 & 3072 : this.Method_36516() % (1065 & 18952) + (12869 & 1411);
    }

    private void Method_36527() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_36528(Class_23823 class_23823) {
        if (class_23823 != null) {
            if (class_23823.Method_23844() == Class_10527.Field_10701) {
                Class_33760 class_33760 = ((Class_40864)class_23823.Method_23844()).Method_40868(class_23823, this.\u0000strictfp);
                class_33760.Field_33768.remove("frame-" + this.\u0000, `());
            }
            class_23823.Method_23901(null);
        }
    }

    public boolean Method_36529(Class_32797 class_32797, float f) {
        if (this.\u0000strictfp(class_32797)) {
            return (-32494 & 16928) != 0;
        }
        if (!class_32797.Method_32854() && this.Method_36514() != null) {
            if (!this.\u0000strictfp.Field_306) {
                this.Method_36515(class_32797.Method_32856(), (-32755 & 6690) != 0);
                this.Method_36520(null);
            }
            return (24583 & -26079) != 0;
        }
        return super.Method_25786(class_32797, f);
    }

    public boolean Method_36530(Class_626 class_626) {
        if (this.Method_36514() == null) {
            Class_23823 class_23823 = class_626.Method_844();
            if (class_23823 != null && !this.\u0000strictfp.Field_306) {
                this.Method_36520(class_23823);
                if (!class_626.Field_694.Method_18094() && (class_23823.Field_23826 -= 6937 & 24577) <= 0) {
                    class_626.Field_628.Method_37796(class_626.Field_628.Field_37782, null);
                }
            }
        } else if (!this.\u0000strictfp.Field_306) {
            this.Method_36521(this.Method_36516() + (-17351 & 67));
        }
        return (-14303 & 1297) != 0;
    }

    public int Method_36531() {
        return 20815 & -22484;
    }

    public Class_36512(Class_283 class_283) {
        super(class_283);
    }

    private void Method_36532(int n, boolean bl) {
        this.\u0000strictfp().Method_32704(8811 & 6169, (byte)(n % (1224 & 6156)));
        if (bl && this.\u0000, ` != null) {
            this.\u0000strictfp.Method_520(this.\u0000, `, Class_9265.Field_9351);
        }
    }

    public boolean Method_36533(double d) {
        double d2 = 12.727272727272728 * 1.2571428571428571;
        return (d < (d2 = d2 * (81.77777777777777 * 0.782608695652174) * this.\u0000= int) * d2 ? -23095 & 529 : 2052 & 16451) != 0;
    }
}

