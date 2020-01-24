/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Class_43630
extends Class_36254
implements Enumeration,
Iterator {
    public final Object Method_43631() {
        Class_26851 class_26851 = this.next;
        if (class_26851 == null) {
            throw new NoSuchElementException();
        }
        Object object = class_26851.Field_26855;
        this.lastReturned = class_26851;
        this.advance();
        return object;
    }

    Class_43630(Class_26851[] arrclass_26851, int n, int n2, int n3, Class_21500 class_21500) {
        super(arrclass_26851, n, n2, n3, class_21500);
    }

    private void Method_43632() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final Object Method_43633() {
        return this.Method_43631();
    }
}

