/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
import com.google.common.collect.AbstractIterator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7704
extends AbstractIterator {
    final Class_42734 Field_7705;
    private Class_4751 Field_7706;

    protected Object Method_7707() {
        return this.Method_7708();
    }

    protected Class_4751 Method_7708() {
        if (this.Field_7706 == null) {
            this.Field_7706 = this.Field_7705.Field_42735;
            return this.Field_7706;
        }
        if (this.Field_7706.equals(this.Field_7705.Field_42736)) {
            return (Class_4751)this.endOfData();
        }
        int n = this.Field_7706.\u0000= final();
        int n2 = this.Field_7706.\u0000, `();
        int n3 = this.Field_7706.\u0000strictfp();
        if (n < this.Field_7705.Field_42736.\u0000= final()) {
            ++n;
        } else if (n2 < this.Field_7705.Field_42736.\u0000, `()) {
            n = this.Field_7705.Field_42735.\u0000= final();
            ++n2;
        } else if (n3 < this.Field_7705.Field_42736.\u0000strictfp()) {
            n = this.Field_7705.Field_42735.\u0000= final();
            n2 = this.Field_7705.Field_42735.\u0000, `();
            ++n3;
        }
        this.Field_7706 = new Class_4751(n, n2, n3);
        return this.Field_7706;
    }

    private void Method_7709() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_7704(Class_42734 class_42734) {
        this.Field_7705 = class_42734;
        this.Field_7706 = null;
    }
}

