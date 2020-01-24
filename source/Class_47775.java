/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47775
extends Class_42376 {
    private Class_11452 Field_47776 = null;

    public Class_47775(Class_11452 class_11452, int n, int n2, int n3, int n4) {
        super(class_11452.ordinal(), n, n2, n3, n4, Class_47775.Method_47778(class_11452));
        this.Field_47776 = class_11452;
    }

    public Class_11452 Method_47777() {
        return this.Field_47776;
    }

    private static String Method_47778(Class_11452 class_11452) {
        String string = Class_9802.Method_9806(class_11452.Method_11504(), new Object[21504 & -32742]) + ": ";
        switch (Class_22542.Field_22543[class_11452.ordinal()]) {
            case 1: {
                return string + Class_30498.Method_30527(Class_12440.Field_12617);
            }
            case 2: {
                return string + Class_30498.Method_30515(Class_12440.Field_12461);
            }
            case 3: {
                return string + Class_30498.Method_30515(Class_12440.Field_12493);
            }
            case 4: {
                return string + Class_30498.Method_30524(Class_12440.Field_12554);
            }
            case 5: {
                return string + Class_30498.Method_30524(Class_12440.Field_12449);
            }
            case 6: {
                return string + Class_30498.Method_30510(Class_12440.Field_12454);
            }
            case 7: {
                return string + Class_30498.Method_30515(Class_12440.Field_12501);
            }
            case 8: {
                return string + Class_12440.Field_12622.Method_11098();
            }
            case 9: {
                return string + Class_12440.Field_12527.Method_11098();
            }
            case 10: {
                return string + Class_30498.Method_30515(Class_12440.Field_12638);
            }
            case 11: {
                return string + Class_30498.Method_30515(Class_12440.Field_12621);
            }
        }
        return string + Class_12440.Method_12936(class_11452);
    }

    public void Method_47779() {
        this.\u0000strictfp = Class_47775.Method_47778(this.Field_47776);
    }

    private void Method_47780() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

