/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_19761 {
    private ArrayList Field_19762 = new ArrayList();

    public void Method_19763(Class_45002 class_45002) {
        this.Field_19762.add(class_45002);
    }

    public Class_45002 Method_19764(int n) {
        return (Class_45002)this.Field_19762.get(n);
    }

    private void Method_19765() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_19766() {
        return this.Field_19762.size();
    }
}

