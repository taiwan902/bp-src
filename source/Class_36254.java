/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36254
extends Class_24767 {
    Class_26851 Field_36255;
    final Class_21500 Field_36256;

    private void Method_36257() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final boolean Method_36258() {
        return (this.next != null ? 81 & 1321 : 262 & 5184) != 0;
    }

    Class_36254(Class_26851[] arrclass_26851, int n, int n2, int n3, Class_21500 class_21500) {
        super(arrclass_26851, n, n2, n3);
        this.Field_36256 = class_21500;
        this.advance();
    }

    public final void Method_36259() {
        Class_26851 class_26851 = this.Field_36255;
        if (class_26851 == null) {
            throw new IllegalStateException();
        }
        this.Field_36255 = null;
        this.Field_36256.Method_21564(class_26851.Field_26855, null, null);
    }

    public final boolean Method_36260() {
        return (this.next != null ? 81 & -24563 : 2097 & 25664) != 0;
    }
}

