/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

public final class Class_47722
extends Class_44314 {
    static final boolean Field_47723 = !Class_41600.class.desiredAssertionStatus() ? 533 & 22667 : 21776 & 2124;
    final Class_41600 Field_47724;
    private final List Field_47725;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_47726() {
        if (!Field_47723 && !this.Field_47724.eventLoop().inEventLoop()) {
            throw new AssertionError();
        }
        Class_19087 class_19087 = this.Field_47724.config();
        if (!class_19087.Method_19098() && !this.Field_47724.isReadPending()) {
            this.removeReadOp();
            return;
        }
        int n = class_19087.Method_19099();
        Class_6274 class_6274 = this.Field_47724.pipeline();
        int n2 = 2565 & 4184;
        Throwable throwable = null;
        try {
            int n3;
            try {
                while ((n3 = this.Field_47724.Method_41603(this.Field_47725)) != 0) {
                    if (n3 < 0) {
                        n2 = -29783 & 12305;
                    } else if (class_19087.Method_19098() && this.Field_47725.size() < n) continue;
                    break;
                }
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
            }
            this.Field_47724.setReadPending((8709 & 18) != 0);
            n3 = this.Field_47725.size();
            for (int i = 29732 & 715; i < n3; ++i) {
                class_6274.Method_6277(this.Field_47725.get(i));
            }
            this.Field_47725.clear();
            class_6274.Method_6283();
            if (throwable != null) {
                if (throwable instanceof IOException) {
                    n2 = !(this.Field_47724 instanceof Class_28228) ? 10501 & 4129 : 8231 & 2048;
                }
                class_6274.Method_6281(throwable);
            }
            if (n2 != 0 && this.Field_47724.isOpen()) {
                this.close(this.voidPromise());
            }
        }
        finally {
            if (!class_19087.Method_19098() && !this.Field_47724.isReadPending()) {
                this.removeReadOp();
            }
        }
    }

    private void Method_47727() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private Class_47722(Class_41600 class_41600) {
        this.Field_47724 = class_41600;
        super(class_41600);
        this.Field_47725 = new ArrayList();
    }

    Class_47722(Class_41600 class_41600, Class_43138 class_43138) {
        this(class_41600);
    }
}

