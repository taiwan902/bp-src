/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.AbstractIterator
 */
import com.google.common.collect.AbstractIterator;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_22278
extends AbstractIterator {
    private Class_4810 Field_22279;
    final Class_36019 Field_22280;

    protected Object Method_22281() {
        return this.Method_22283();
    }

    private void Method_22282() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_4810 Method_22283() {
        if (this.Field_22279 == null) {
            this.Field_22279 = Class_4751.Field_4753.Method_4457(this.Field_22280.Field_36021.\u0000= final(), this.Field_22280.Field_36021.\u0000, `(), this.Field_22280.Field_36021.\u0000strictfp());
            return this.Field_22279;
        }
        if (this.Field_22279.equals(this.Field_22280.Field_36020)) {
            return (Class_4810)this.endOfData();
        }
        int n = this.Field_22279.\u0000= final();
        int n2 = this.Field_22279.\u0000, `();
        int n3 = this.Field_22279.\u0000strictfp();
        if (n < this.Field_22280.Field_36020.\u0000= final()) {
            ++n;
        } else if (n2 < this.Field_22280.Field_36020.\u0000, `()) {
            n = this.Field_22280.Field_36021.\u0000= final();
            ++n2;
        } else if (n3 < this.Field_22280.Field_36020.\u0000strictfp()) {
            n = this.Field_22280.Field_36021.\u0000= final();
            n2 = this.Field_22280.Field_36021.\u0000, `();
            ++n3;
        }
        this.Field_22279.\u0000, ` = n;
        this.Field_22279.\u0000strictfp = n2;
        this.Field_22279.\u0000= final = n3;
        return this.Field_22279;
    }

    Class_22278(Class_36019 class_36019) {
        this.Field_22280 = class_36019;
        this.Field_22279 = null;
    }
}

