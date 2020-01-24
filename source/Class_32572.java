/*
 * Decompiled with CFR 0.145.
 */
import java.util.ListIterator;

public interface Class_32572
extends Class_25341,
ListIterator {
    @Deprecated
    default public void Method_32573(Object object) {
        this.Method_32580((Integer)object);
    }

    @Deprecated
    default public Object Method_32574() {
        return this.Method_32581();
    }

    @Deprecated
    default public Integer Method_32575() {
        return Class_25341.super.Method_25343();
    }

    default public void Method_32576(int n) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default public Object Method_32577() {
        return this.Method_32575();
    }

    @Deprecated
    default public void Method_32578(Integer n) {
        this.Method_32579(n);
    }

    default public void Method_32579(int n) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default public void Method_32580(Integer n) {
        this.Method_32576(n);
    }

    @Deprecated
    default public Integer Method_32581() {
        return Class_25341.super.next();
    }

    default public void Method_32582() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    default public void Method_32583(Object object) {
        this.Method_32578((Integer)object);
    }
}

