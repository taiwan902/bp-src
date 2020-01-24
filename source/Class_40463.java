/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_40463
extends Class_15933
implements Class_4993 {
    private boolean Field_40464;
    private Class_23823[] Field_40465;

    public int Method_40466() {
        return -32575 & 24656;
    }

    public Class_40463(Class_283 class_283, double d, double d2, double d3) {
        super(class_283, d, d2, d3);
        this.Field_40465 = new Class_23823[-32731 & 4204];
        this.Field_40464 = 513 & 1095;
    }

    public void Method_40467(Class_626 class_626) {
    }

    public boolean Method_40468(int n, Class_23823 class_23823) {
        return (14389 & -30975) != 0;
    }

    private void Method_40469() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40470(Class_626 class_626) {
    }

    protected void Method_40471(Class_1699 class_1699) {
        super.Method_15948(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 4234 & -31744; i < this.Field_40465.length; ++i) {
            if (this.Field_40465[i] == null) continue;
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Slot", (byte)i);
            this.Field_40465[i].Method_23841(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Items", class_1758);
    }

    protected void Method_40472() {
        int n = (16431 & 4191) - Class_8295.Method_8337(this);
        float f = 0.42000002f * 2.3333333f + (float)n * (0.43333334f * 0.0023076923f);
        this.\u0000= ` *= (double)f;
        this.\u0000%(this.\u0000, #() * 0.0);
        this.\u0000switch *= (double)f;
    }

    public Class_40463(Class_283 class_283) {
        super(class_283);
        this.Field_40465 = new Class_23823[2086 & 21028];
        this.Field_40464 = 8963 & 4161;
    }

    public void Method_40473(Class_11641 class_11641) {
    }

    public void Method_40474(int n, Class_23823 class_23823) {
        this.Field_40465[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_40466()) {
            class_23823.Field_23826 = this.Method_40466();
        }
    }

    public void Method_40475() {
    }

    public void Method_40476(Class_32797 class_32797) {
        super.Method_15954(class_32797);
        if (this.\u0000strictfp.Method_522().Method_7529("doEntityDrops")) {
            Class_24128.Method_24132(this.\u0000strictfp, this, this);
        }
    }

    public String Method_40477() {
        return this.\u0000strictfp() ? this.\u0000= int() : "container.minecart";
    }

    public void Method_40478() {
        if (this.Field_40464) {
            Class_24128.Method_24132(this.\u0000strictfp, this, this);
        }
        super.Method_15950();
    }

    protected void Method_40479(Class_1699 class_1699) {
        super.Method_15977(class_1699);
        Class_1758 class_1758 = class_1699.Method_1735("Items", 2846 & 8203);
        this.Field_40465 = new Class_23823[this.\u0000= `()];
        for (int i = 790 & 1216; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            int n = class_16992.Method_1716("Slot") & (-23809 & 4351);
            if (n < 0 || n >= this.Field_40465.length) continue;
            this.Field_40465[n] = Class_23823.Method_23840(class_16992);
        }
    }

    public void Method_40480() {
        for (int i = -25943 & 320; i < this.Field_40465.length; ++i) {
            this.Field_40465[i] = null;
        }
    }

    public void Method_40481(int n) {
        this.Field_40464 = 1314 & -12271;
        super.\u0000
        (n);
    }

    public int Method_40482() {
        return 18817 & 4104;
    }

    public int Method_40483(int n) {
        return 641 & -27606;
    }

    public Class_23823 Method_40484(int n) {
        if (this.Field_40465[n] != null) {
            Class_23823 class_23823 = this.Field_40465[n];
            this.Field_40465[n] = null;
            return class_23823;
        }
        return null;
    }

    public void Method_40485(int n, int n2) {
    }

    public Class_23823 Method_40486(int n) {
        return this.Field_40465[n];
    }

    public boolean Method_40487(Class_626 class_626) {
        if (!this.\u0000strictfp.Field_306) {
            class_626.Method_800(this);
        }
        return (1035 & 4117) != 0;
    }

    public boolean Method_40488() {
        return (-28122 & 10376) != 0;
    }

    public Class_23823 Method_40489(int n, int n2) {
        if (this.Field_40465[n] != null) {
            if (this.Field_40465[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_40465[n];
                this.Field_40465[n] = null;
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_40465[n].Method_23857(n2);
            if (this.Field_40465[n].Field_23826 == 0) {
                this.Field_40465[n] = null;
            }
            return class_23823;
        }
        return null;
    }

    public boolean Method_40490(Class_626 class_626) {
        return (this.\u0000= float ? -24394 & 4417 : (class_626.\u0000strictfp((Class_1061)this) <= 296.42105263157896 * 0.2159090909090909 ? -28523 & 1 : 16 & 16399)) != 0;
    }

    public Class_11641 Method_40491() {
        return Class_11641.Field_11643;
    }
}

