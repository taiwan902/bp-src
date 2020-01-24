/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_47711
extends Class_27841 {
    private Class_1699 Field_47712 = new Class_1699();

    public Class_47711(String string) {
        super(string);
    }

    public void Method_47713(Class_1699 class_1699) {
        this.Field_47712 = class_1699.Method_1703("Features");
    }

    public void Method_47714(Class_1699 class_1699) {
        class_1699.Method_1744("Features", this.Field_47712);
    }

    public void Method_47715(Class_1699 class_1699, int n, int n2) {
        this.Field_47712.Method_1744(Class_47711.Method_47717(n, n2), class_1699);
    }

    private void Method_47716() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static String Method_47717(int n, int n2) {
        return "[" + n + "," + n2 + "]";
    }

    public Class_1699 Method_47718() {
        return this.Field_47712;
    }
}

