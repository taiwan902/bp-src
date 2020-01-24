/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_21269 {
    private String Field_21270 = null;
    private boolean Field_21271 = 1280 & 4737;
    private Class Field_21272 = null;

    private void Method_21273() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_21269(Class class_) {
        this.Field_21272 = class_;
        this.Field_21270 = class_.getName();
        this.Field_21271 = 385 & 6729;
    }

    public Class Method_21274() {
        if (this.Field_21271) {
            return this.Field_21272;
        }
        this.Field_21271 = -10197 & 1;
        try {
            this.Field_21272 = Class.forName(this.Field_21270);
        }
        catch (ClassNotFoundException classNotFoundException) {
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return this.Field_21272;
    }
}

