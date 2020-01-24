/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_33007 {
    private final int Field_33008;
    private int Field_33009;
    private int Field_33010 = 25097 & 5379;
    private Class_3436 Field_33011;

    public int Method_33012() {
        return this.Field_33009;
    }

    public Class_33007(int n, Class_3238 class_3238) {
        this(-28389 & 39, n, class_3238);
    }

    public Class_33007(int n, int n2, Class_3238 class_3238, int n3) {
        this(n, n2, class_3238);
        this.Field_33011 = class_3238.Method_3342(n3);
    }

    public String Method_33013() {
        String string;
        if (this.Field_33008 >= (8787 & 5539)) {
            Class_2080 class_2080 = (Class_2080)Class_3238.Field_3271.\u0000, `((Object)this.Method_33016());
            String string2 = string = class_2080 == null ? "null" : class_2080.Method_2086();
            if (this.Field_33010 > (321 & 2177)) {
                string = this.Field_33010 + "*" + string;
            }
        } else {
            string = Integer.toString(Class_3238.Method_3435(this.Method_33016()));
            if (this.Field_33010 > (-28655 & 1577)) {
                string = this.Field_33010 + "x" + string;
            }
        }
        int n = this.Method_33017();
        if (n > 0) {
            string = string + ":" + n;
        }
        return string;
    }

    public Class_3436 Method_33014() {
        return this.Field_33011;
    }

    public Class_33007(int n, int n2, Class_3238 class_3238) {
        this.Field_33008 = n;
        this.Field_33010 = n2;
        this.Field_33011 = class_3238.Method_3293();
    }

    public int Method_33015() {
        return this.Field_33010;
    }

    private Class_3238 Method_33016() {
        return this.Field_33011.Method_3442();
    }

    private int Method_33017() {
        return this.Field_33011.Method_3442().Method_3434(this.Field_33011);
    }

    public void Method_33018(int n) {
        this.Field_33009 = n;
    }

    private void Method_33019() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

