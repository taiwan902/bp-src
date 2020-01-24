/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_45264
implements Class_2057 {
    final Class_18 Field_45265;

    Class_45264(Class_18 class_18) {
        this.Field_45265 = class_18;
    }

    private void Method_45266() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_45267(String string) {
        try {
            Object[] arrobject = new Object[-23923 & 20547];
            arrobject[128 & 8452] = Class_39702.Method_39914(this.Field_45265.Field_84.Field_39818.Method_8274());
            return String.format(string, arrobject);
        }
        catch (Exception exception) {
            return "Error: " + exception.getLocalizedMessage();
        }
    }
}

