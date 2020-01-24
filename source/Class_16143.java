/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_16143
implements Class_6153 {
    Class_16143(Class_28633 class_28633) {
        this();
    }

    public boolean Method_16144(Class_31185 class_31185) {
        if (class_31185.Field_31187[Class_4595.Field_4598.Method_4648()] && !class_31185.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31189 && class_31185.Field_31187[Class_4595.Field_4601.Method_4648()] && !class_31185.Field_31186[Class_4595.Field_4601.Method_4648()].Field_31189) {
            Class_31185 class_311852 = class_31185.Field_31186[Class_4595.Field_4598.Method_4648()];
            return (class_311852.Field_31187[Class_4595.Field_4601.Method_4648()] && !class_311852.Field_31186[Class_4595.Field_4601.Method_4648()].Field_31189 ? 8329 & 18501 : 8802 & 393) != 0;
        }
        return (14848 & 1409) != 0;
    }

    public Class_21309 Method_16145(Class_4595 class_4595, Class_31185 class_31185, Random random) {
        class_31185.Field_31189 = -26619 & 16713;
        class_31185.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31189 = 2065 & 8581;
        class_31185.Field_31186[Class_4595.Field_4601.Method_4648()].Field_31189 = 2121 & -32745;
        class_31185.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31186[Class_4595.Field_4601.Method_4648()].Field_31189 = -21499 & 4217;
        return new Class_39287(class_4595, class_31185, random);
    }

    private void Method_16146() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_16143() {
    }
}

