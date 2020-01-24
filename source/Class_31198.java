/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public class Class_31198
implements Class_31211 {
    private final ArrayList Field_31199;
    private final int Field_31200;
    private final Class_31211 Field_31201;

    public List Method_31202() {
        return this.Field_31201.Method_31214();
    }

    public boolean Method_31203() {
        return this.Field_31201.Method_31213();
    }

    public Class_15852 Method_31204() {
        return this.Field_31201.Method_31215();
    }

    private void Method_31205() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_31206() {
        return this.Field_31201.Method_31217();
    }

    public List Method_31207(Class_4595 class_4595) {
        return this.Field_31201.Method_31218(class_4595);
    }

    public Class_11372 Method_31208() {
        return this.Field_31201.Method_31216();
    }

    public boolean Method_31209() {
        return this.Field_31201.Method_31212();
    }

    public Class_31198(ArrayList arrayList) {
        this.Field_31199 = arrayList;
        this.Field_31200 = Class_27139.Method_27145(arrayList);
        this.Field_31201 = ((Class_40456)arrayList.get((int)(1092 & -32752))).Field_40457;
    }

    public Class_31211 Method_31210(long l) {
        Class_40456 class_40456 = (Class_40456)Class_27139.Method_27141(this.Field_31199, Math.abs((int)l >> (1584 & -32489)) % this.Field_31200);
        return class_40456.Field_40457;
    }
}

