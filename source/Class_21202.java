/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Random;

public class Class_21202
implements Class_6153 {
    public boolean Method_21203(Class_31185 class_31185) {
        return (class_31185.Field_31187[Class_4595.Field_4598.Method_4648()] && !class_31185.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31189 ? -28659 & 9331 : -15348 & 10784) != 0;
    }

    public Class_21309 Method_21204(Class_4595 class_4595, Class_31185 class_31185, Random random) {
        Class_31185 class_311852 = class_31185;
        if (!class_31185.Field_31187[Class_4595.Field_4598.Method_4648()] || class_31185.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31189) {
            class_311852 = class_31185.Field_31186[Class_4595.Field_4613.Method_4648()];
        }
        class_311852.Field_31189 = 707 & -30715;
        class_311852.Field_31186[Class_4595.Field_4598.Method_4648()].Field_31189 = 5025 & -16383;
        return new Class_22469(class_4595, class_311852, random);
    }

    private void Method_21205() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_21202() {
    }

    Class_21202(Class_28633 class_28633) {
        this();
    }
}

