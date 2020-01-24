/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 */
import com.google.common.base.Function;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_8146
implements Function {
    final Class_18872 Field_8147;

    private void Method_8148() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_8149(Object object) {
        return this.Method_8150((Class_2035)object);
    }

    Class_8146(Class_18872 class_18872) {
        this.Field_8147 = class_18872;
    }

    public String Method_8150(Class_2035 class_2035) {
        return class_2035.Method_2036();
    }
}

