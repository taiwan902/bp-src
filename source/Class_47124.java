/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class Class_47124
extends Class_36254
implements Iterator {
    Class_47124(Class_26851[] arrclass_26851, int n, int n2, int n3, Class_21500 class_21500) {
        super(arrclass_26851, n, n2, n3, class_21500);
    }

    public Object Method_47125() {
        return this.Method_47126();
    }

    public final Map.Entry Method_47126() {
        Class_26851 class_26851 = this.next;
        if (class_26851 == null) {
            throw new NoSuchElementException();
        }
        Object object = class_26851.Field_26855;
        Object object2 = class_26851.Field_26853;
        this.lastReturned = class_26851;
        this.advance();
        return new Class_11329(object, object2, this.map);
    }

    private void Method_47127() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

