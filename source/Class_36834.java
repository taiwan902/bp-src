/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public abstract class Class_36834
extends Class_13400 {
    protected int Field_36835;
    protected int Field_36836 = -1 & -1;
    protected int Field_36837;
    protected int Field_36838;

    protected boolean Method_36839(Class_283 class_283, Class_42666 class_42666, int n) {
        if (this.Field_36836 >= 0) {
            return (7 & 26385) != 0;
        }
        int n2 = -32412 & 13955;
        int n3 = 4152 & -32256;
        Class_4810 class_4810 = new Class_4810();
        for (int i = this.\u0000strictfp.Field_42669; i <= this.\u0000strictfp.Field_42667; ++i) {
            for (int j = this.\u0000strictfp.Field_42668; j <= this.\u0000strictfp.Field_42670; ++j) {
                class_4810.Method_4814(j, 4689 & 96, i);
                if (!class_42666.Method_42683(class_4810)) continue;
                n2 += Math.max(class_283.Method_406(class_4810).\u0000, `(), class_283.Field_284.Method_18363());
                ++n3;
            }
        }
        if (n3 == 0) {
            return (33 & -15872) != 0;
        }
        this.Field_36836 = n2 / n3;
        this.\u0000strictfp.Method_42677(3 & 20640, this.Field_36836 - this.\u0000strictfp.Field_42672 + n, -32504 & 20498);
        return (165 & -28605) != 0;
    }

    protected void Method_36840(Class_1699 class_1699) {
        this.Field_36838 = class_1699.Method_1738("Width");
        this.Field_36837 = class_1699.Method_1738("Height");
        this.Field_36835 = class_1699.Method_1738("Depth");
        this.Field_36836 = class_1699.Method_1738("HPos");
    }

    private void Method_36841() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_36834() {
    }

    protected Class_36834(Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(18436 & -19439);
        this.Field_36838 = n4;
        this.Field_36837 = n5;
        this.Field_36835 = n6;
        this.\u0000strictfp = Class_4662.Field_4663.Method_4668(random);
        switch (Class_6048.Field_6049[this.\u0000strictfp.ordinal()]) {
            case 1: 
            case 2: {
                this.\u0000strictfp = new Class_42666(n, n2, n3, n + n4 - (17707 & 513), n2 + n5 - (14145 & -16383), n3 + n6 - (99 & 24585));
                break;
            }
            default: {
                this.\u0000strictfp = new Class_42666(n, n2, n3, n + n6 - (-12527 & 133), n2 + n5 - (9 & -26571), n3 + n4 - (291 & -24063));
            }
        }
    }

    protected void Method_36842(Class_1699 class_1699) {
        class_1699.Method_1739("Width", this.Field_36838);
        class_1699.Method_1739("Height", this.Field_36837);
        class_1699.Method_1739("Depth", this.Field_36835);
        class_1699.Method_1739("HPos", this.Field_36836);
    }
}

