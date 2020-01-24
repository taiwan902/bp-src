/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.atomic.AtomicReference;

public final class Class_35774
extends AtomicReference
implements Class_34810 {
    private final Class_35774 Field_35775;
    private final Class_28213 Field_35776;
    private Class_35774 Field_35777;
    private boolean Field_35778;
    private Class_35774 Field_35779;

    private void Method_35780() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_35774 Method_35781(Class_35774 class_35774, Class_35774 class_357742) {
        class_35774.Field_35777 = class_357742;
        return class_35774.Field_35777;
    }

    Class_35774(Class_28213 class_28213) {
        this.Field_35775 = this;
        this.Field_35776 = class_28213;
    }

    static Class_28213 Method_35782(Class_35774 class_35774) {
        return class_35774.Field_35776;
    }

    Class_35774(Class_35774 class_35774, Class_28213 class_28213) {
        this.Field_35775 = class_35774;
        this.Field_35776 = class_28213;
    }

    static boolean Method_35783(Class_35774 class_35774) {
        return class_35774.Field_35778;
    }

    static Class_35774 Method_35784(Class_35774 class_35774, Class_35774 class_357742) {
        class_35774.Field_35779 = class_357742;
        return class_35774.Field_35779;
    }

    static Class_35774 Method_35785(Class_35774 class_35774) {
        return class_35774.Field_35779;
    }
}

