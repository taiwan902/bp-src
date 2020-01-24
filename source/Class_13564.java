/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class Class_13564 {
    private Class[] Field_13565 = null;
    private Class_21269 Field_13566 = null;
    private boolean Field_13567 = 2048 & 1195;
    private Method Field_13568 = null;
    private String Field_13569 = null;

    public boolean Method_13570() {
        return (this.Field_13567 ? (this.Field_13568 != null ? -29951 & 17523 : 9536 & 16388) : (this.Method_13571() != null ? 49 & 8451 : 8308 & 8)) != 0;
    }

    public Method Method_13571() {
        Method method;
        if (this.Field_13567) {
            return this.Field_13568;
        }
        this.Field_13567 = 1033 & 215;
        Class class_ = this.Field_13566.Method_21274();
        if (class_ == null) {
            return null;
        }
        Method[] arrmethod = class_.getDeclaredMethods();
        int n = 1040 & 20520;
        do {
            Class[] arrclass;
            if (n >= arrmethod.length) {
                return null;
            }
            method = arrmethod[n];
            if (method.getName().equals(this.Field_13569) && (this.Field_13565 == null || Class_14610.Method_14661(this.Field_13565, arrclass = method.getParameterTypes()))) break;
            ++n;
        } while (true);
        this.Field_13568 = method;
        if (!this.Field_13568.isAccessible()) {
            this.Field_13568.setAccessible((521 & -16367) != 0);
        }
        return this.Field_13568;
    }

    public void Method_13572() {
        this.Field_13567 = -30331 & 4177;
        this.Field_13568 = null;
    }

    private void Method_13573() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_13564(Class_21269 class_21269, String string) {
        this(class_21269, string, null);
    }

    public Class_13564(Class_21269 class_21269, String string, Class[] arrclass) {
        this.Field_13566 = class_21269;
        this.Field_13569 = string;
        this.Field_13565 = arrclass;
        Method method = this.Method_13571();
    }
}

