/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.List;

public abstract class Class_42759
extends Class_39999 {
    private boolean Field_42760;
    Class_22553 Field_42761;
    private boolean Field_42762;
    private boolean Field_42763;

    protected int Method_42764() {
        return this.Method_42774().Method_22564();
    }

    protected Class_42759() {
        if (this.isSharable()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    private void Method_42765(Class_39158 class_39158, int n) {
        Class_22553 class_22553 = this.Field_42761;
        this.Field_42761 = class_39158.Method_39170().Method_22841(class_22553.Method_22564() + n);
        this.Field_42761.Method_22631(class_22553);
        class_22553.release();
    }

    private void Method_42766() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_42767() {
        return this.Field_42762;
    }

    public void Method_42768(Class_39158 class_39158) {
        if (this.Field_42761 != null && !this.Field_42763 && this.Field_42761.refCnt() == (-27579 & 16561)) {
            this.Field_42761.Method_22600();
        }
        if (this.Field_42760) {
            this.Field_42760 = 1056 & -16365;
            if (!class_39158.Method_39175().Method_26110().Method_19098()) {
                class_39158.Method_39176();
            }
        }
        class_39158.Method_39174();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_42769(Class_39158 class_39158) {
        Class_18236 class_18236;
        block18 : {
            class_18236 = Class_18236.Method_18239();
            if (this.Field_42761 != null) {
                this.Method_42776(class_39158, this.Field_42761, class_18236);
                this.Method_42775(class_39158, this.Field_42761, class_18236);
                break block18;
            }
            this.Method_42775(class_39158, Class_16620.Field_16622, class_18236);
        }
        try {
            if (this.Field_42761 != null) {
                this.Field_42761.release();
                this.Field_42761 = null;
            }
            int n = class_18236.size();
            for (int i = 17410 & -24416; i < n; ++i) {
                class_39158.Method_39183(class_18236.get(i));
            }
            if (n > 0) {
                class_39158.Method_39174();
            }
            class_39158.Method_39169();
            return;
        }
        finally {
            class_18236.Method_18247();
        }
        catch (Class_32043 class_32043) {
            try {
                throw class_32043;
                catch (Exception exception) {
                    throw new Class_32043(exception);
                }
            }
            catch (Throwable throwable) {
                try {
                    if (this.Field_42761 != null) {
                        this.Field_42761.release();
                        this.Field_42761 = null;
                    }
                    int n = class_18236.size();
                    for (int i = 2065 & -24254; i < n; ++i) {
                        class_39158.Method_39183(class_18236.get(i));
                    }
                    if (n > 0) {
                        class_39158.Method_39174();
                    }
                    class_39158.Method_39169();
                    throw throwable;
                }
                finally {
                    class_18236.Method_18247();
                }
            }
        }
    }

    protected void Method_42770(Class_39158 class_39158) {
    }

    public final void Method_42771(Class_39158 class_39158) {
        Class_22553 class_22553 = this.Method_42774();
        int n = class_22553.Method_22564();
        if (class_22553.Method_22583()) {
            Class_22553 class_225532 = class_22553.Method_22601(n);
            class_22553.release();
            class_39158.Method_39183(class_225532);
        } else {
            class_22553.release();
        }
        this.Field_42761 = null;
        class_39158.Method_39174();
        this.Method_42770(class_39158);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void Method_42772(Class_39158 class_39158, Object object) {
        int n;
        if (!(object instanceof Class_22553)) {
            class_39158.Method_39183(object);
            return;
        }
        Class_18236 class_18236 = Class_18236.Method_18239();
        try {
            Class_22553 class_22553 = (Class_22553)object;
            this.Field_42763 = this.Field_42761 == null ? -32511 & 8363 : -27248 & 65;
            int n2 = this.Field_42763 ? 1 : 0;
            if (this.Field_42763) {
                this.Field_42761 = class_22553;
            } else {
                if (this.Field_42761.Method_22620() > this.Field_42761.Method_22612() - class_22553.Method_22564() || this.Field_42761.refCnt() > (3421 & -32255)) {
                    this.Method_42765(class_39158, class_22553.Method_22564());
                }
                this.Field_42761.Method_22631(class_22553);
                class_22553.release();
            }
            this.Method_42776(class_39158, this.Field_42761, class_18236);
        }
        catch (Class_32043 class_32043) {
            try {
                throw class_32043;
                catch (Throwable throwable) {
                    throw new Class_32043(throwable);
                }
            }
            catch (Throwable throwable) {
                int n3;
                if (this.Field_42761 != null && !this.Field_42761.Method_22583()) {
                    this.Field_42761.release();
                    this.Field_42761 = null;
                }
                this.Field_42760 = (n3 = class_18236.size()) == 0 ? 2373 & 30225 : -6928 & 6;
                int n4 = 5176 & -13626;
                do {
                    if (n4 >= n3) {
                        class_18236.Method_18247();
                        throw throwable;
                    }
                    class_39158.Method_39183(class_18236.get(n4));
                    ++n4;
                } while (true);
            }
        }
        if (this.Field_42761 != null && !this.Field_42761.Method_22583()) {
            this.Field_42761.release();
            this.Field_42761 = null;
        }
        this.Field_42760 = (n = class_18236.size()) == 0 ? -15695 & 9219 : 24832 & 2215;
        int n5 = -15872 & 1194;
        do {
            if (n5 >= n) {
                class_18236.Method_18247();
                return;
            }
            class_39158.Method_39183(class_18236.get(n5));
            ++n5;
        } while (true);
    }

    public abstract void Method_42773(Class_39158 var1, Class_22553 var2, List var3);

    protected Class_22553 Method_42774() {
        if (this.Field_42761 != null) {
            return this.Field_42761;
        }
        return Class_16620.Field_16622;
    }

    protected void Method_42775(Class_39158 class_39158, Class_22553 class_22553, List list) {
        this.Method_42773(class_39158, class_22553, list);
    }

    protected void Method_42776(Class_39158 class_39158, Class_22553 class_22553, List list) {
        try {
            while (class_22553.Method_22583()) {
                int n = list.size();
                int n2 = class_22553.Method_22564();
                this.Method_42773(class_39158, class_22553, list);
                if (!class_39158.Method_39164()) {
                    if (n == list.size()) {
                        if (n2 != class_22553.Method_22564()) continue;
                    } else {
                        if (n2 == class_22553.Method_22564()) {
                            throw new Class_32043(Class_22304.Method_22309(this.getClass()) + ".decode() did not read anything but decoded a message.");
                        }
                        if (!this.Method_42767()) continue;
                    }
                }
                break;
            }
        }
        catch (Class_32043 class_32043) {
            throw class_32043;
        }
        catch (Throwable throwable) {
            throw new Class_32043(throwable);
        }
    }
}

