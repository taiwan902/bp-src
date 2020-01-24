/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadFactory;

public abstract class Class_47259
extends Class_46518
implements Class_38541 {
    private void Method_47260() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_37082 Method_47261() {
        return this.Method_47265();
    }

    public Class_27581 Method_47262(Class_26095 class_26095) {
        return this.Method_47263(class_26095, new Class_44076(class_26095, this));
    }

    public Class_27581 Method_47263(Class_26095 class_26095, Class_37748 class_37748) {
        if (class_26095 == null) {
            throw new NullPointerException("channel");
        }
        if (class_37748 == null) {
            throw new NullPointerException("promise");
        }
        class_26095.Method_26101().Method_7316(this, class_37748);
        return class_37748;
    }

    protected boolean Method_47264(Runnable runnable) {
        return (!(runnable instanceof Class_11116) ? 9287 & 289 : 4271 & -30976) != 0;
    }

    public Class_38541 Method_47265() {
        return (Class_38541)super.next();
    }

    protected Class_47259(Class_18163 class_18163, ThreadFactory threadFactory, boolean bl) {
        super(class_18163, threadFactory, bl);
    }
}

