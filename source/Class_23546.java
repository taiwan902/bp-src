/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public class Class_23546
implements Class_1486 {
    private int Field_23547;
    private Class_23823[] Field_23548;

    public Class_23823[] Method_23549() {
        return this.Field_23548;
    }

    private void Method_23550() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23546() {
    }

    public void Method_23551(Class_10954 class_10954) {
        this.Method_23553((Class_14856)class_10954);
    }

    public Class_23546(int n, List list) {
        this.Field_23547 = n;
        this.Field_23548 = new Class_23823[list.size()];
        for (int i = -24523 & 5514; i < this.Field_23548.length; ++i) {
            Class_23823 class_23823 = (Class_23823)list.get(i);
            this.Field_23548[i] = class_23823 == null ? null : class_23823.Method_23850();
        }
    }

    public void Method_23552(Class_29900 class_29900) {
        class_29900.Method_29949(this.Field_23547);
        class_29900.Method_29922(this.Field_23548.length);
        Class_23823[] arrclass_23823 = this.Field_23548;
        int n = arrclass_23823.length;
        for (int i = 20704 & -32750; i < n; ++i) {
            Class_23823 class_23823 = arrclass_23823[i];
            class_29900.Method_29984(class_23823);
        }
    }

    public void Method_23553(Class_14856 class_14856) {
        class_14856.Method_14884(this);
    }

    public void Method_23554(Class_29900 class_29900) {
        this.Field_23547 = class_29900.Method_30016();
        short s = class_29900.Method_30008();
        this.Field_23548 = new Class_23823[s];
        for (int i = 17430 & 0; i < s; ++i) {
            this.Field_23548[i] = class_29900.Method_30002();
        }
    }

    public int Method_23555() {
        return this.Field_23547;
    }
}

