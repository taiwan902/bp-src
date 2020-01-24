/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
import com.google.common.base.Predicate;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_20351
implements Predicate {
    final String Field_20352;
    final boolean Field_20353;

    Class_20351(String string, boolean bl) {
        this.Field_20352 = string;
        this.Field_20353 = bl;
    }

    public boolean Method_20354(Class_1061 class_1061) {
        if (!(class_1061 instanceof Class_859)) {
            return (577 & -10990) != 0;
        }
        Class_859 class_859 = (Class_859)class_1061;
        Class_9665 class_9665 = class_859.Method_949();
        String string = class_9665 == null ? "" : class_9665.Method_9674();
        return (string.equals(this.Field_20352) != this.Field_20353 ? 5825 & 16393 : -9728 & 80) != 0;
    }

    public boolean Method_20355(Object object) {
        return this.Method_20354((Class_1061)object);
    }

    private void Method_20356() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

