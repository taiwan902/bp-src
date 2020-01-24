/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;

public abstract class Class_41410
extends Class_41102 {
    private Runnable Field_41411;
    private static final String Field_41412 = Class_41410.Method_41413("\u1020\u1021\u1027\u1023\u1024\u1020\u1025\u1023\u1025\u1025\u1020\u1023") + Class_22304.Method_22309(Class_22553.class) + Class_41410.Method_41422("\u8805\u8808") + Class_22304.Method_22309(Class_23060.class) + (char)(28201 & 4283);

    private static String Method_41413(String string) {
        int n = 21884;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41410.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected abstract int Method_41414(Class_22553 var1);

    protected final void Method_41415() {
        SelectionKey selectionKey = this.selectionKey();
        if (!selectionKey.isValid()) {
            return;
        }
        int n = selectionKey.interestOps();
        if ((n & (29069 & 598)) != 0) {
            selectionKey.interestOps(n & (-5 & -5));
        }
    }

    protected abstract long Method_41416(Class_23060 var1);

    protected final void Method_41417(boolean bl) {
        if (bl) {
            this.Method_41419();
        } else {
            Runnable runnable = this.Field_41411;
            if (runnable == null) {
                runnable = this.Field_41411 = new Class_32190(this);
            }
            this.eventLoop().execute(runnable);
        }
    }

    private void Method_41418() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    protected Class_41410(Class_26095 class_26095, SelectableChannel selectableChannel) {
        super(class_26095, selectableChannel, 529 & 15);
    }

    protected final void Method_41419() {
        SelectionKey selectionKey = this.selectionKey();
        if (!selectionKey.isValid()) {
            return;
        }
        int n = selectionKey.interestOps();
        if ((n & (84 & 5)) == 0) {
            selectionKey.interestOps(n | 20757 & 2124);
        }
    }

    protected void Method_41420(Class_18249 class_18249) {
        block11 : {
            block12 : {
                int n;
                int n2 = -1 & -1;
                do {
                    Class_21482 class_21482;
                    int n3;
                    Object object;
                    if ((object = class_18249.Method_18273()) == null) {
                        this.Method_41415();
                        break block11;
                    }
                    if (object instanceof Class_22553) {
                        class_21482 = (Class_22553)object;
                        n = ((Class_22553)class_21482).Method_22564();
                        if (n == 0) {
                            class_18249.Method_18293();
                            continue;
                        }
                        n3 = 673 & -12212;
                        int n4 = 64 & 28160;
                        long l = 4610281437565567584L & -4610281438190761723L;
                        if (n2 == (-1 & -1)) {
                            n2 = this.config().Method_19097();
                        }
                        for (int i = n2 - (-27061 & 24577); i >= 0; --i) {
                            int n5 = this.Method_41425((Class_22553)class_21482);
                            if (n5 == 0) {
                                n3 = 16769 & 4145;
                                break;
                            }
                            l += (long)n5;
                            if (((Class_22553)class_21482).Method_22583()) continue;
                            n4 = -16377 & 10945;
                            break;
                        }
                        class_18249.Method_18276(l);
                        if (n4 != 0) {
                            class_18249.Method_18293();
                            continue;
                        }
                        this.Method_41417(n3 != 0);
                        break block11;
                    }
                    if (!(object instanceof Class_23060)) break block12;
                    class_21482 = (Class_23060)object;
                    n = 3206 & 4896;
                    n3 = -5998 & 4385;
                    long l = -6379730803142407680L & 6379730802150278473L;
                    if (n2 == (-1 & -1)) {
                        n2 = this.config().Method_19097();
                    }
                    for (int i = n2 - (1 & 1191); i >= 0; --i) {
                        long l2 = this.Method_41416((Class_23060)class_21482);
                        if (l2 == (-1180468137426904312L & 741998694L)) {
                            n = -30587 & 1307;
                            break;
                        }
                        l += l2;
                        if (class_21482.Method_23061() < class_21482.Method_23063()) continue;
                        n3 = -26111 & 8193;
                        break;
                    }
                    class_18249.Method_18276(l);
                    if (n3 == 0) break;
                    class_18249.Method_18293();
                } while (true);
                this.Method_41417(n != 0);
                break block11;
            }
            throw new Error();
        }
    }

    protected Class_44314 Method_41421() {
        return new Class_45080(this, null);
    }

    private static String Method_41422(String string) {
        int n = 5396;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_41410.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    protected final Object Method_41423(Object object) {
        if (object instanceof Class_22553) {
            Class_22553 class_22553 = (Class_22553)object;
            if (class_22553.Method_22611()) {
                return object;
            }
            return this.newDirectBuffer(class_22553);
        }
        if (object instanceof Class_23060) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + Class_22304.Method_22312(object) + Field_41412);
    }

    protected Class_44175 Method_41424() {
        return this.Method_41421();
    }

    protected abstract int Method_41425(Class_22553 var1);
}

