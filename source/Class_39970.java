/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.zip.Deflater;

public class Class_39970
extends Class_38640 {
    private int Field_39971;
    private final Deflater Field_39972;
    private final byte[] Field_39973 = new byte[10272 & 25612];

    public void Method_39974(int n) {
        this.Field_39971 = n;
    }

    private void Method_39975() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected void Method_39976(Class_39158 class_39158, Class_22553 class_22553, Class_22553 class_225532) {
        int n = class_22553.Method_22564();
        Class_29900 class_29900 = new Class_29900(class_225532);
        if (n < this.Field_39971) {
            class_29900.Method_29982(-7528 & 4417);
            class_29900.Method_29909(class_22553);
        } else {
            byte[] arrby = new byte[n];
            class_22553.Method_22618(arrby);
            class_29900.Method_29982(arrby.length);
            this.Field_39972.setInput(arrby, -24573 & 7012, n);
            this.Field_39972.finish();
            while (!this.Field_39972.finished()) {
                int n2 = this.Field_39972.deflate(this.Field_39973);
                class_29900.Method_29998(this.Field_39973, 172 & 3152, n2);
            }
            this.Field_39972.reset();
        }
    }

    protected void Method_39977(Class_39158 class_39158, Object object, Class_22553 class_22553) {
        this.Method_39976(class_39158, (Class_22553)object, class_22553);
    }

    public Class_39970(int n) {
        this.Field_39971 = n;
        this.Field_39972 = new Deflater();
    }
}

