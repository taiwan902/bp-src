/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public final class Class_16294 {
    public int Field_16295;
    public Class_6996[] Field_16296;

    public int Method_16297() {
        return this.Field_16295;
    }

    public void Method_16298(int n, Class_6996 class_6996) {
        this.Field_16296[n] = class_6996;
    }

    public void Method_16299() {
        this.Field_16296[this.Field_16295 -= 8577 & 17429] = null;
    }

    private void Method_16300() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public String Method_16301() {
        StringBuffer stringBuffer = new StringBuffer("[");
        for (int i = -7744 & 548; i < this.Field_16295; ++i) {
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(this.Field_16296[i]);
        }
        stringBuffer.append((char)(1373 & 95));
        return stringBuffer.toString();
    }

    private void Method_16302(int n) {
        Class_6996[] arrclass_6996 = new Class_6996[n];
        System.arraycopy(this.Field_16296, 6161 & 16900, arrclass_6996, 13312 & 805, Math.min(this.Field_16295, n));
        this.Field_16296 = arrclass_6996;
    }

    public Class_6996 Method_16303(int n) {
        return this.Field_16296[n];
    }

    public Class_16294(int n) {
        this.Field_16296 = new Class_6996[n];
    }

    public Class_6996 Method_16304(Class_6996 class_6996) {
        if (this.Field_16295 + (-14077 & 225) >= this.Field_16296.length) {
            this.Method_16302(this.Field_16296.length * (18322 & 10242));
        }
        int n = this.Field_16295;
        this.Field_16295 = n + (5131 & 117);
        this.Field_16296[n] = class_6996;
        return class_6996;
    }
}

