/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_21802
implements Callable {
    final Class_31717 Field_21803;

    public Object Method_21804() {
        return this.Method_21806();
    }

    private void Method_21805() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_21802(Class_31717 class_31717) {
        this.Field_21803 = class_31717;
    }

    public String Method_21806() {
        String string = "Unknown?";
        try {
            switch (Class_31717.Method_31758(this.Field_21803)) {
                case 19132: {
                    string = "McRegion";
                    break;
                }
                case 19133: {
                    string = "Anvil";
                }
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        Object[] arrobject = new Object[8247 & 23106];
        arrobject[4106 & 3120] = Class_31717.Method_31758(this.Field_21803);
        arrobject[-32607 & 85] = string;
        return String.format("0x%05X - %s", arrobject);
    }
}

