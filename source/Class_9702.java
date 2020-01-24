/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.google.common.base.Objects$ToStringHelper
 *  com.google.common.cache.LoadingCache
 */
import com.google.common.base.Objects;
import com.google.common.cache.LoadingCache;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_9702 {
    private final int Field_9703;
    private final int Field_9704;
    private final Class_4751 Field_9705;
    private final Class_4595 Field_9706;
    private final int Field_9707;
    private final LoadingCache Field_9708;
    private final Class_4595 Field_9709;

    public String Method_9710() {
        return Objects.toStringHelper((Object)this).add("up", (Object)this.Field_9706).add("forwards", (Object)this.Field_9709).add("frontTopLeft", (Object)this.Field_9705).toString();
    }

    public int Method_9711() {
        return this.Field_9707;
    }

    public Class_9702(Class_4751 class_4751, Class_4595 class_4595, Class_4595 class_45952, LoadingCache loadingCache, int n, int n2, int n3) {
        this.Field_9705 = class_4751;
        this.Field_9709 = class_4595;
        this.Field_9706 = class_45952;
        this.Field_9708 = loadingCache;
        this.Field_9704 = n;
        this.Field_9707 = n2;
        this.Field_9703 = n3;
    }

    public Class_4595 Method_9712() {
        return this.Field_9709;
    }

    public int Method_9713() {
        return this.Field_9704;
    }

    public Class_4751 Method_9714() {
        return this.Field_9705;
    }

    public Class_4595 Method_9715() {
        return this.Field_9706;
    }

    public Class_7692 Method_9716(int n, int n2, int n3) {
        return (Class_7692)this.Field_9708.getUnchecked((Object)Class_22266.Method_22275(this.Field_9705, this.Method_9712(), this.Method_9715(), n, n2, n3));
    }

    private void Method_9717() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

