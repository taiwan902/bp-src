/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Class_20751
implements Runnable {
    final Class_4751 Field_20752;
    final Class_17665 Field_20753;
    final Class_6778 Field_20754;
    final ArrayList Field_20755;
    final Class_570 Field_20756;

    Class_20751(Class_570 class_570, Class_6778 class_6778, Class_4751 class_4751, Class_17665 class_17665, ArrayList arrayList) {
        this.Field_20756 = class_570;
        this.Field_20754 = class_6778;
        this.Field_20752 = class_4751;
        this.Field_20753 = class_17665;
        this.Field_20755 = arrayList;
    }

    private void Method_20757() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_20758() {
        this.Field_20756.Method_622(this.Field_20754, this.Field_20752, this.Field_20753, this.Field_20755);
    }
}

