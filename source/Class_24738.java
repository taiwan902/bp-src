/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 */
import com.google.common.base.Charsets;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.charset.Charset;
import java.util.concurrent.Callable;

public class Class_24738
implements Callable {
    private Class_20165 Field_24739;
    private byte[] Field_24740;

    public Class_24738(Class_20165 class_20165, byte[] arrby) {
        this.Field_24739 = class_20165;
        this.Field_24740 = arrby;
    }

    public Object Method_24741() {
        Class_29733 class_29733;
        Class_29733 class_297332 = class_29733 = this.Field_24739.Method_20230().Field_44590 == null ? null : (Class_29733)this.Field_24739.Method_20230().Field_44590.attr(Class_10188.Field_10189).Method_34812();
        if (class_29733 != null && class_29733.Field_29739) {
            Class_18.Field_89.Field_26.Method_2389(this.Field_24739, this.Field_24740);
            String string = Class_13502.Method_13506(this.Field_24739, class_29733.Field_29737);
            if (string == null) {
                this.Field_24739.Method_20230().Method_44629(new Class_28799("BPAuth", new byte[4128 & 10313]));
            } else {
                this.Field_24739.Method_20230().Method_44629(new Class_28799("BPAuth", string.getBytes(Charsets.UTF_8)));
            }
        }
        return null;
    }

    private void Method_24742() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

