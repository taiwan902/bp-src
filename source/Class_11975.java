/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.SelectionKey;
import java.util.AbstractSet;
import java.util.Iterator;

public final class Class_11975
extends AbstractSet {
    private int Field_11976;
    private SelectionKey[] Field_11977 = (SelectionKey[])this.Field_11978.clone();
    private SelectionKey[] Field_11978 = new SelectionKey[1152 & 17969];
    private int Field_11979;
    private boolean Field_11980 = -14199 & 81;

    private void Method_11981() {
        SelectionKey[] arrselectionKey = new SelectionKey[this.Field_11977.length << (833 & 1073)];
        System.arraycopy(this.Field_11977, 312 & -27519, arrselectionKey, -28496 & 9224, this.Field_11976);
        this.Field_11977 = arrselectionKey;
    }

    Class_11975() {
    }

    public boolean Method_11982(Object object) {
        return (16384 & 2081) != 0;
    }

    private void Method_11983() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    SelectionKey[] Method_11984() {
        if (this.Field_11980) {
            this.Field_11980 = 17536 & -26342;
            this.Field_11978[this.Field_11979] = null;
            this.Field_11976 = 4228 & -23726;
            return this.Field_11978;
        }
        this.Field_11980 = 453 & 513;
        this.Field_11977[this.Field_11976] = null;
        this.Field_11979 = 8450 & 3093;
        return this.Field_11977;
    }

    public Iterator Method_11985() {
        throw new UnsupportedOperationException();
    }

    public boolean Method_11986(SelectionKey selectionKey) {
        if (selectionKey == null) {
            return (16392 & -30204) != 0;
        }
        if (this.Field_11980) {
            int n = this.Field_11979;
            this.Field_11978[n++] = selectionKey;
            this.Field_11979 = n;
            if (n == this.Field_11978.length) {
                this.Method_11990();
            }
        } else {
            int n = this.Field_11976;
            this.Field_11977[n++] = selectionKey;
            this.Field_11976 = n;
            if (n == this.Field_11977.length) {
                this.Method_11981();
            }
        }
        return (-26045 & 17585) != 0;
    }

    public boolean Method_11987(Object object) {
        return (4307 & 0) != 0;
    }

    public int Method_11988() {
        if (this.Field_11980) {
            return this.Field_11979;
        }
        return this.Field_11976;
    }

    public boolean Method_11989(Object object) {
        return this.Method_11986((SelectionKey)object);
    }

    private void Method_11990() {
        SelectionKey[] arrselectionKey = new SelectionKey[this.Field_11978.length << (16385 & -28665)];
        System.arraycopy(this.Field_11978, 24656 & 4610, arrselectionKey, 6224 & 512, this.Field_11979);
        this.Field_11978 = arrselectionKey;
    }
}

