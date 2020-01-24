/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Array;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Class_12121 {
    private final Class Field_12122;
    private int Field_12123;
    private final Object[] Field_12124;
    private final ReadWriteLock Field_12125 = new ReentrantReadWriteLock();
    private int Field_12126;

    public Class_12121(Class class_, int n) {
        this.Field_12122 = class_;
        this.Field_12124 = (Object[])Array.newInstance(class_, n);
    }

    public int Method_12127() {
        this.Field_12125.readLock().lock();
        int n = this.Field_12124.length;
        this.Field_12125.readLock().unlock();
        return n;
    }

    private void Method_12128() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_12129(Object object) {
        this.Field_12125.writeLock().lock();
        this.Field_12124[this.Field_12126] = object;
        this.Field_12126 = (this.Field_12126 + (-11959 & 8705)) % this.Method_12127();
        if (this.Field_12123 < this.Method_12127()) {
            this.Field_12123 += -32175 & 9505;
        }
        this.Field_12125.writeLock().unlock();
        return object;
    }

    public Object[] Method_12130() {
        Object[] arrobject = (Object[])Array.newInstance(this.Field_12122, this.Field_12123);
        this.Field_12125.readLock().lock();
        for (int i = -13072 & 515; i < this.Field_12123; ++i) {
            int n = (this.Field_12126 - this.Field_12123 + i) % this.Method_12127();
            if (n < 0) {
                n += this.Method_12127();
            }
            arrobject[i] = this.Field_12124[n];
        }
        this.Field_12125.readLock().unlock();
        return arrobject;
    }
}

