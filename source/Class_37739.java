/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 */
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37739
implements Class_1549 {
    final Class_33216 Field_37740;

    Class_37739(Class_33216 class_33216) {
        this.Field_37740 = class_33216;
    }

    public void Method_37741(boolean bl, int n) {
        Class_20165.Method_20241(this.Field_37740.Field_33217, Class_18.Field_89);
        if (bl) {
            if (Class_20165.Method_20198(this.Field_37740.Field_33217).Method_184() != null) {
                Class_20165.Method_20198(this.Field_37740.Field_33217).Method_184().Method_15497(Class_17874.Field_17878);
            }
            this.Field_37740.Field_33217.Field_20181.Method_44629(new Class_34764(this.Field_37740.Field_33218, Class_11247.Field_11250));
            Futures.addCallback((ListenableFuture)Class_20165.Method_20198(this.Field_37740.Field_33217).Method_200().Method_10522(this.Field_37740.Field_33219, this.Field_37740.Field_33218), (FutureCallback)new Class_21423(this));
        } else {
            if (Class_20165.Method_20198(this.Field_37740.Field_33217).Method_184() != null) {
                Class_20165.Method_20198(this.Field_37740.Field_33217).Method_184().Method_15497(Class_17874.Field_17877);
            }
            this.Field_37740.Field_33217.Field_20181.Method_44629(new Class_34764(this.Field_37740.Field_33218, Class_11247.Field_11252));
        }
        Class_22674.Method_22682(Class_20165.Method_20198(this.Field_37740.Field_33217).Method_184());
        Class_20165.Method_20198(this.Field_37740.Field_33217).Method_218(null);
    }

    private void Method_37742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

