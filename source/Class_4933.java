/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_4933
extends Class_4981
implements Class_4961 {
    private Class_23823[] Field_4934 = new Class_23823[3449 & 25225];
    protected String Field_4935;
    private static final Random Field_4936 = new Random();

    public void Method_4937(Class_1699 class_1699) {
        super.Method_4989(class_1699);
        Class_1758 class_1758 = new Class_1758();
        for (int i = 2050 & -28635; i < this.Field_4934.length; ++i) {
            if (this.Field_4934[i] == null) continue;
            Class_1699 class_16992 = new Class_1699();
            class_16992.Method_1724("Slot", (byte)i);
            this.Field_4934[i].Method_23841(class_16992);
            class_1758.Method_1781(class_16992);
        }
        class_1699.Method_1744("Items", class_1758);
        if (this.Method_4940()) {
            class_1699.Method_1702("CustomName", this.Field_4935);
        }
    }

    public void Method_4938() {
        for (int i = 12420 & -14254; i < this.Field_4934.length; ++i) {
            this.Field_4934[i] = null;
        }
    }

    public Class_23823 Method_4939(int n) {
        return this.Field_4934[n];
    }

    public boolean Method_4940() {
        return (this.Field_4935 != null ? 193 & -8141 : 8728 & 23651) != 0;
    }

    private void Method_4941() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_8295 Method_4942(Class_37781 class_37781, Class_626 class_626) {
        return new Class_36082(class_37781, this);
    }

    public boolean Method_4943(int n, Class_23823 class_23823) {
        return (257 & 20073) != 0;
    }

    public int Method_4944() {
        return 14658 & -32524;
    }

    public String Method_4945() {
        return "minecraft:dispenser";
    }

    public void Method_4946(int n, int n2) {
    }

    public int Method_4947(int n) {
        return 5377 & -30204;
    }

    public void Method_4948(Class_626 class_626) {
    }

    public int Method_4949() {
        int n = -1 & -1;
        int n2 = -11615 & 1;
        for (int i = 29266 & 1440; i < this.Field_4934.length; ++i) {
            if (this.Field_4934[i] == null || Field_4936.nextInt(n2++) != 0) continue;
            n = i;
        }
        return n;
    }

    public Class_23823 Method_4950(int n, int n2) {
        if (this.Field_4934[n] != null) {
            if (this.Field_4934[n].Field_23826 <= n2) {
                Class_23823 class_23823 = this.Field_4934[n];
                this.Field_4934[n] = null;
                this.\u0000, for();
                return class_23823;
            }
            Class_23823 class_23823 = this.Field_4934[n].Method_23857(n2);
            if (this.Field_4934[n].Field_23826 == 0) {
                this.Field_4934[n] = null;
            }
            this.\u0000, for();
            return class_23823;
        }
        return null;
    }

    public boolean Method_4951(Class_626 class_626) {
        return (this.\u0000strictfp.Method_429(this.\u0000strictfp) != this ? 28674 & 1 : (class_626.\u0000strictfp((double)this.\u0000strictfp.\u0000= final() + 1.3103448275862069 * 0.3815789473684211, (double)this.\u0000strictfp.\u0000, `() + 1.3275862068965518 * 0.3766233766233766, (double)this.\u0000strictfp.\u0000strictfp() + 0.65 * 0.7692307692307692) <= 185.6 * 0.3448275862068966 ? 17 & 4873 : 8776 & -30315)) != 0;
    }

    public void Method_4952(Class_1699 class_1699) {
        super.Method_4984(class_1699);
        Class_1758 class_1758 = class_1699.Method_1735("Items", 4682 & 1034);
        this.Field_4934 = new Class_23823[this.Method_4955()];
        for (int i = 5928 & 26755; i < class_1758.Method_1772(); ++i) {
            Class_1699 class_16992 = class_1758.Method_1768(i);
            int n = class_16992.Method_1716("Slot") & (8447 & 2559);
            if (n < 0 || n >= this.Field_4934.length) continue;
            this.Field_4934[n] = Class_23823.Method_23840(class_16992);
        }
        if (class_1699.Method_1715("CustomName", 2504 & -32759)) {
            this.Field_4935 = class_1699.Method_1708("CustomName");
        }
    }

    public Class_23823 Method_4953(int n) {
        if (this.Field_4934[n] != null) {
            Class_23823 class_23823 = this.Field_4934[n];
            this.Field_4934[n] = null;
            return class_23823;
        }
        return null;
    }

    public void Method_4954(String string) {
        this.Field_4935 = string;
    }

    public int Method_4955() {
        return -10951 & 2057;
    }

    public void Method_4956(int n, Class_23823 class_23823) {
        this.Field_4934[n] = class_23823;
        if (class_23823 != null && class_23823.Field_23826 > this.Method_4944()) {
            class_23823.Field_23826 = this.Method_4944();
        }
        this.\u0000, for();
    }

    public int Method_4957() {
        return 17744 & 8232;
    }

    public String Method_4958() {
        return this.Method_4940() ? this.Field_4935 : "container.dispenser";
    }

    public void Method_4959(Class_626 class_626) {
    }

    public int Method_4960(Class_23823 class_23823) {
        for (int i = 12940 & -32766; i < this.Field_4934.length; ++i) {
            if (this.Field_4934[i] != null && this.Field_4934[i].Method_23844() != null) continue;
            this.Method_4956(i, class_23823);
            return i;
        }
        return -1 & -1;
    }
}

