/*
 * Decompiled with CFR 0.145.
 */
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_13000 {
    private Dimension Field_13001 = null;
    private Class_2080 Field_13002 = new Class_2080("textures/blocks/wool_colored_red.png");
    private Class_2080 Field_13003 = null;
    private boolean Field_13004 = 186 & 0;
    private BufferedImage Field_13005 = null;
    private Class_47630 Field_13006 = null;
    private Class_6070[] Field_13007 = new Class_6070[2186 & 52];

    public boolean Method_13008() {
        return this.Field_13004;
    }

    public void Method_13009(BufferedImage bufferedImage) {
        this.Field_13005 = bufferedImage;
    }

    public void Method_13010(Class_35973 class_35973, Class_1456 class_1456, float f, float f2) {
        Class_34695 class_34695 = Class_19426.Method_19532();
        if (this.Field_13004) {
            class_34695.Method_34707(class_1456.Method_1471());
        } else if (this.Field_13003 != null) {
            if (this.Field_13006 == null && this.Field_13005 != null) {
                this.Field_13006 = new Class_47630(this.Field_13005);
                Class_18.Field_89.Method_253().Method_34704(this.Field_13003, this.Field_13006);
            }
            class_34695.Method_34707(this.Field_13003);
        } else {
            class_34695.Method_34707(this.Field_13002);
        }
        for (int i = 17218 & 137; i < this.Field_13007.length; ++i) {
            Class_6070 class_6070 = this.Field_13007[i];
            Class_16867.Method_16961();
            if (class_1456.\u0000%()) {
                Class_16867.Method_16943(0.0f, 0.52272725f * 0.3826087f, 0.0f);
            }
            class_6070.Method_6075(class_35973, f);
            Class_16867.Method_16945();
        }
    }

    private void Method_13011() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_13000(Dimension dimension, boolean bl, Class_6070[] arrclass_6070) {
        this.Field_13001 = dimension;
        this.Field_13004 = bl;
        this.Field_13007 = arrclass_6070;
    }

    public void Method_13012(Class_2080 class_2080) {
        this.Field_13003 = class_2080;
    }

    public static Class_31961 Method_13013(Class_35973 class_35973, int n) {
        switch (n) {
            case 0: {
                return class_35973.Field_35976;
            }
            case 1: {
                return class_35973.Field_35975;
            }
            case 2: {
                return class_35973.Field_35983;
            }
            case 3: {
                return class_35973.Field_35978;
            }
            case 4: {
                return class_35973.Field_35979;
            }
            case 5: {
                return class_35973.Field_35977;
            }
        }
        return null;
    }
}

