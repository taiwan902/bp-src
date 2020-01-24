/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.SelectionKey;

public final class Class_45080
extends Class_44314 {
    private Class_16073 Field_45081;
    final Class_41410 Field_45082;

    private void Method_45083(Class_6274 class_6274, Class_22553 class_22553, Throwable throwable, boolean bl) {
        if (class_22553 != null) {
            if (class_22553.Method_22583()) {
                this.Field_45082.setReadPending((8852 & 1) != 0);
                class_6274.Method_6277(class_22553);
            } else {
                class_22553.release();
            }
        }
        class_6274.Method_6283();
        class_6274.Method_6281(throwable);
        if (bl || throwable instanceof IOException) {
            this.Method_45084(class_6274);
        }
    }

    private void Method_45084(Class_6274 class_6274) {
        SelectionKey selectionKey = this.Field_45082.selectionKey();
        this.Field_45082.setInputShutdown();
        if (this.Field_45082.isOpen()) {
            if (Boolean.TRUE.equals(this.Field_45082.config().Method_19090(Class_25272.Field_25280))) {
                selectionKey.interestOps(selectionKey.interestOps() & (this.Field_45082.readInterestOp ^ -1 & -1));
                class_6274.Method_6284(Class_7252.Field_7253);
            } else {
                this.close(this.voidPromise());
            }
        }
    }

    private void Method_45085() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_45080(Class_41410 class_41410, Class_32190 class_32190) {
        this(class_41410);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void Method_45086() {
        Class_19087 class_19087 = this.Field_45082.config();
        if (!class_19087.Method_19098() && !this.Field_45082.isReadPending()) {
            this.removeReadOp();
            return;
        }
        Class_6274 class_6274 = this.Field_45082.pipeline();
        Class_22837 class_22837 = class_19087.Method_19095();
        int n = class_19087.Method_19099();
        Class_16073 class_16073 = this.Field_45081;
        if (class_16073 == null) {
            this.Field_45081 = class_16073 = class_19087.Method_19091().Method_18900();
        }
        Class_22553 class_22553 = null;
        int n2 = 1544 & 2144;
        int n3 = 12800 & -32541;
        try {
            int n4;
            int n5;
            int n6 = -31739 & 16776;
            int n7 = 2048 & -12022;
            do {
                class_22553 = class_16073.Method_16074(class_22837);
                n4 = class_22553.Method_22574();
                n5 = this.Field_45082.Method_41414(class_22553);
                if (n5 <= 0) {
                    class_22553.release();
                    n3 = n5 < 0 ? 675 & 12289 : -6079 & 546;
                    break;
                }
                if (n7 == 0) {
                    n7 = 1 & 8305;
                    this.Field_45082.setReadPending((-24576 & 648) != 0);
                }
                class_6274.Method_6277(class_22553);
                class_22553 = null;
                if (n6 >= (-1 & Integer.MAX_VALUE) - n5) {
                    n6 = Integer.MAX_VALUE & Integer.MAX_VALUE;
                    break;
                }
                n6 += n5;
            } while (class_19087.Method_19098() && n5 >= n4 && ++n2 < n);
            class_6274.Method_6283();
            class_16073.Method_16075(n6);
            if (n3 != 0) {
                this.Method_45084(class_6274);
                n3 = 31746 & -32140;
            }
        }
        catch (Throwable throwable) {
            this.Method_45083(class_6274, class_22553, throwable, n3 != 0);
        }
        finally {
            if (!class_19087.Method_19098() && !this.Field_45082.isReadPending()) {
                this.removeReadOp();
            }
        }
    }

    private Class_45080(Class_41410 class_41410) {
        this.Field_45082 = class_41410;
        super(class_41410);
    }
}

