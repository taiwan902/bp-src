/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Class_38522
extends Class_36254
implements Enumeration,
Iterator {
    private void Method_38523() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final Object Method_38524() {
        return this.Method_38525();
    }

    public final Object Method_38525() {
        Class_26851 class_26851 = this.next;
        if (class_26851 == null) {
            throw new NoSuchElementException();
        }
        Object object = class_26851.Field_26853;
        this.lastReturned = class_26851;
        this.advance();
        return object;
    }

    Class_38522(Class_26851[] arrclass_26851, int n, int n2, int n3, Class_21500 class_21500) {
        super(arrclass_26851, n, n2, n3, class_21500);
    }
}

