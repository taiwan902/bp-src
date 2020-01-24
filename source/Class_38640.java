/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_38640
extends Class_36303 {
    private final Class_18956 Field_38641 = Class_18956.Method_18960(this, Class_38640.class, "I");
    private final boolean Field_38642;

    public boolean Method_38643(Object object) {
        return this.Field_38641.Method_18962(object);
    }

    protected abstract void Method_38644(Class_39158 var1, Object var2, Class_22553 var3);

    protected Class_22553 Method_38645(Class_39158 class_39158, Object object, boolean bl) {
        if (bl) {
            return class_39158.Method_39170().Method_22845();
        }
        return class_39158.Method_39170().Method_22842();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_38646(Class_39158 class_39158, Object object, Class_37748 class_37748) {
        block14 : {
            Class_22553 class_22553 = null;
            try {
                if (this.Method_38643(object)) {
                    Object object2 = object;
                    class_22553 = this.Method_38645(class_39158, object2, this.Field_38642);
                    try {
                        this.Method_38644(class_39158, object2, class_22553);
                    }
                    finally {
                        Class_24761.Method_24765(object2);
                    }
                    if (class_22553.Method_22583()) {
                        class_39158.Method_39163(class_22553, class_37748);
                    } else {
                        class_22553.release();
                        class_39158.Method_39163(Class_16620.Field_16622, class_37748);
                    }
                    class_22553 = null;
                    break block14;
                }
                class_39158.Method_39163(object, class_37748);
            }
            catch (Class_47970 class_47970) {
                throw class_47970;
            }
            catch (Throwable throwable) {
                throw new Class_47970(throwable);
            }
            finally {
                if (class_22553 != null) {
                    class_22553.release();
                }
            }
        }
    }

    protected Class_38640() {
        this((8225 & 1809) != 0);
    }

    private void Method_38647() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_38640(boolean bl) {
        this.Field_38642 = bl;
    }
}

