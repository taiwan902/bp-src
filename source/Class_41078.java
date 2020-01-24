/*
 * Decompiled with CFR 0.145.
 */
public interface Class_41078
extends Class_35813,
Class_33149 {
    public Class_41078 Method_41079(Object var1);

    public Class_41078 Method_41080();

    default public Class_33149 Method_41081(Object object) {
        return this.Method_41079(object);
    }

    public Class_41078 Method_41082(Throwable var1);

    default public Class_33149 Method_41083(Class_18600 class_18600) {
        return this.Method_41088(class_18600);
    }

    public boolean Method_41084(long var1, long var3);

    default public Class_35813 Method_41085() {
        return this.Method_41080();
    }

    default public Class_35813 Method_41086(Class_18600 class_18600) {
        return this.Method_41088(class_18600);
    }

    default public Class_21065 Method_41087() {
        return this.Method_41080();
    }

    public Class_41078 Method_41088(Class_18600 var1);

    default public Class_33149 Method_41089() {
        return this.Method_41080();
    }

    default public Class_21065 Method_41090(Class_18600 class_18600) {
        return this.Method_41088(class_18600);
    }

    default public Class_33149 Method_41091(Throwable throwable) {
        return this.Method_41082(throwable);
    }
}

