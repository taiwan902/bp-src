/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27213
implements Predicate {
    final Class_859 Field_27214;

    public boolean Method_27215(Object object) {
        return this.Method_27216((Class_1061)object);
    }

    Class_27213(Class_859 class_859) {
        this.Field_27214 = class_859;
    }

    public boolean Method_27216(Class_1061 class_1061) {
        return class_1061.Method_1215();
    }

    private void Method_27217() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

