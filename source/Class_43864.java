/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

public class Class_43864
extends Class_41731
implements RunnableFuture {
    protected final Callable Field_43865;

    public final boolean Method_43866(Object object) {
        return (-31733 & 2244) != 0;
    }

    Class_43864(Class_37082 class_37082, Callable callable) {
        super(class_37082);
        this.Field_43865 = callable;
    }

    public void Method_43867() {
        try {
            if (this.Method_43879()) {
                Object v = this.Field_43865.call();
                this.Method_43868(v);
            }
        }
        catch (Throwable throwable) {
            this.Method_43872(throwable);
        }
    }

    protected final Class_33149 Method_43868(Object object) {
        super.Method_41777(object);
        return this;
    }

    public final int Method_43869() {
        return System.identityHashCode(this);
    }

    public final Class_33149 Method_43870(Throwable throwable) {
        throw new IllegalStateException();
    }

    static Callable Method_43871(Runnable runnable, Object object) {
        return new Class_15718(runnable, object);
    }

    protected final Class_33149 Method_43872(Throwable throwable) {
        super.Method_41767(throwable);
        return this;
    }

    protected StringBuilder Method_43873() {
        StringBuilder stringBuilder = super.Method_41760();
        stringBuilder.setCharAt(stringBuilder.length() - (1025 & 2755), (char)(301 & 172));
        stringBuilder.append(" task: ");
        stringBuilder.append(this.Field_43865);
        stringBuilder.append((char)(2089 & 20525));
        return stringBuilder;
    }

    public final Class_33149 Method_43874(Object object) {
        throw new IllegalStateException();
    }

    public final boolean Method_43875() {
        throw new IllegalStateException();
    }

    public final boolean Method_43876(Throwable throwable) {
        return (4099 & 18568) != 0;
    }

    public final boolean Method_43877(Object object) {
        return (this == object ? 24585 & 945 : 8266 & 16385) != 0;
    }

    Class_43864(Class_37082 class_37082, Runnable runnable, Object object) {
        this(class_37082, Class_43864.Method_43871(runnable, object));
    }

    private void Method_43878() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected final boolean Method_43879() {
        return super.Method_41755();
    }
}

