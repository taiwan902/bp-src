/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_46112
extends Class_42376 {
    private static int Field_46113;
    private Class_24246 Field_46114;
    private static int Field_46115;
    private Class_13769 Field_46116;
    private static int Field_46117;

    public void Method_46118() {
        this.Field_46114 = this.Field_46116.Method_13911((this.Field_46116.Method_13893(this.Field_46114) + (-6137 & 1281)) % this.Field_46116.Method_13977());
        if (!Class_38196.Field_38285.Method_38437() && (this.Field_46116 == Class_13769.Field_13834 && this.Field_46114 == Class_24246.Field_24287 || this.Field_46116 == Class_13769.Field_13776 && this.Field_46114 == Class_24246.Field_24281)) {
            this.Method_46118();
        }
    }

    public void Method_46119(Class_24246 class_24246) {
        if (this.Field_46116.Method_13893(class_24246) != (-1 & -1)) {
            this.Field_46114 = class_24246;
        }
    }

    public static int Method_46120() {
        return 6427 & -15798;
    }

    public Class_24246 Method_46121() {
        return this.Field_46114;
    }

    public Class_13769 Method_46122() {
        return this.Field_46116;
    }

    private void Method_46123() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_46112(Class_28636 class_28636, Class_13769 class_13769) {
        super(20496 & -32384, -22648 & 18437, 21509 & 2338, 160 & 5384, -32246 & 3114, "");
        this.Field_46116 = class_13769;
        this.Field_46114 = this.Field_46116.Method_13911(-32748 & 17538);
        for (int i = 16532 & -17407; i < class_13769.Method_13977(); ++i) {
            String string = class_13769.Method_13911(i).Method_24365();
            int n = class_28636.Method_28715(string) + (108 & 2182);
            Field_46117 = Math.max(Field_46117, n);
        }
        Field_46115 = Math.max(Field_46115, class_28636.Method_28715(class_13769.Method_13849() + ": "));
        Field_46113 = Field_46117 + (8 & 8972) + Field_46115;
    }

    public static int Method_46124() {
        return Field_46113;
    }

    public void Method_46125(Class_18 class_18, int n, int n2) {
        if (this.\u0000, `) {
            this.Field_46114 = Class_38196.Field_38285.Method_38398(this.Field_46116);
            Class_28636 class_28636 = class_18.Field_27;
            int n3 = n >= this.\u0000= final && n2 >= this.\u0000, for && n < this.\u0000= final + Class_46112.Method_46124() && n2 < this.\u0000, for + Class_46112.Method_46120() ? -30061 & 25921 : 10753 & 1162;
            int n4 = n3 != 0 ? -1 & -1 : -2431024 & -4079412;
            int n5 = n3 != 0 ? 1728053247 & -419430401 : this.Field_46114.Field_24265;
            this.\u0000, `(class_28636, this.Field_46116.Method_13849(), this.\u0000= final, this.\u0000, for + (27255 & -32639), n4);
            int n6 = this.\u0000= final + Field_46115 + (24382 & 8328);
            int n7 = n6 + Field_46117;
            Class_46112.\u0000, `((int)n6, (int)this.\u0000, for, (int)n7, (int)(this.\u0000, for + Class_46112.Method_46120() - (2061 & 4385)), (int)n5);
            this.\u0000strictfp(class_28636, this.Field_46114.Method_24365(), n6 + Field_46117 / (4098 & 3626), this.\u0000, for + (17821 & 2627), -1 & -1);
        }
    }

    public boolean Method_46126(Class_18 class_18, int n, int n2) {
        if (this.\u0000strictfp && n >= this.\u0000= final && n2 >= this.\u0000, for && n < this.\u0000= final + Class_46112.Method_46124() && n2 < this.\u0000, for + Class_46112.Method_46120()) {
            this.Method_46118();
            return (119 & 20617) != 0;
        }
        return (24704 & -31216) != 0;
    }
}

