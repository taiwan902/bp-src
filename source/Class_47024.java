/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47024
extends Class_43634 {
    private Class_39196 Field_47025;

    private void Method_47026() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_47024() {
        super("container.enderchest", (3458 & 8736) != 0, 21659 & 283);
    }

    public Class_1758 Method_47027() {
        Class_1758 class_1758 = new Class_1758();
        for (int i = -30718 & 8192; i < this.\u0000= `(); ++i) {
            Class_23823 class_23823 = this.\u0000strictfp(i);
            if (class_23823 == null) continue;
            Class_1699 class_1699 = new Class_1699();
            class_1699.Method_1724("Slot", (byte)i);
            class_23823.Method_23841(class_1699);
            class_1758.Method_1781(class_1699);
        }
        return class_1758;
    }

    public void Method_47028(Class_626 class_626) {
        if (this.Field_47025 != null) {
            this.Field_47025.Method_39203();
        }
        super.Method_43654(class_626);
        this.Field_47025 = null;
    }

    public void Method_47029(Class_626 class_626) {
        if (this.Field_47025 != null) {
            this.Field_47025.Method_39204();
        }
        super.Method_43656(class_626);
    }

    public boolean Method_47030(Class_626 class_626) {
        return (this.Field_47025 != null && !this.Field_47025.Method_39207(class_626) ? -22480 & 4238 : super.Method_43645(class_626)) != 0;
    }

    public void Method_47031(Class_39196 class_39196) {
        this.Field_47025 = class_39196;
    }

    public void Method_47032(Class_1758 class_1758) {
        int n;
        for (n = 2 & 8209; n < this.\u0000= `(); ++n) {
            this.\u0000, `(n, (Class_23823)null);
        }
        for (n = -32656 & 4360; n < class_1758.Method_1772(); ++n) {
            Class_1699 class_1699 = class_1758.Method_1768(n);
            int n2 = class_1699.Method_1716("Slot") & (511 & 11519);
            if (n2 < 0 || n2 >= this.\u0000= `()) continue;
            this.\u0000, `(n2, Class_23823.Method_23840(class_1699));
        }
    }
}

