/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27481 {
    private Class_17230[] Field_27482;

    private void Method_27483() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_27481(Class_17230 class_17230) {
        this.Field_27482 = new Class_17230[2113 & -32756];
        this.Method_27486(class_17230);
    }

    public String Method_27484() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 6226 & 8452; i < this.Field_27482.length; ++i) {
            Class_17230 class_17230 = this.Field_27482[i];
            if (i > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append(class_17230.Method_17233());
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public Class_27481() {
        this.Field_27482 = new Class_17230[1060 & 16539];
    }

    public boolean Method_27485(int n) {
        for (int i = 16898 & -28672; i < this.Field_27482.length; ++i) {
            Class_17230 class_17230 = this.Field_27482[i];
            if (!class_17230.Method_17234(n)) continue;
            return (-32763 & 7987) != 0;
        }
        return (3094 & 8321) != 0;
    }

    public void Method_27486(Class_17230 class_17230) {
        this.Field_27482 = (Class_17230[])Class_19426.Method_19469(this.Field_27482, class_17230);
    }
}

