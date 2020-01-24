/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.concurrent.Callable;

public class Class_11340
implements Callable {
    final Class_13268 Field_11341;

    private void Method_11342() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_11340(Class_13268 class_13268) {
        this.Field_11341 = class_13268;
    }

    public String Method_11343() {
        Runtime runtime = Runtime.getRuntime();
        long l = runtime.maxMemory();
        long l2 = runtime.totalMemory();
        long l3 = runtime.freeMemory();
        long l4 = l / (1146230092L & 2132913289706079378L) / (-1799889875229137632L & 131089414L);
        long l5 = l2 / (1884193245546946513L & -1884193246872075224L) / (-3800735165456249493L & 3800735164812887552L);
        long l6 = l3 / (-5581939900837212980L & 37230083L) / (-5955843490947398640L & 5955843489100297217L);
        return l3 + " bytes (" + l6 + " MB) / " + l2 + " bytes (" + l5 + " MB) up to " + l + " bytes (" + l4 + " MB)";
    }

    public Object Method_11344() {
        return this.Method_11343();
    }
}

