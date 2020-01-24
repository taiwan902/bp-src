/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public final class Class_18249 {
    private int Field_18250 = 2051 & 737;
    private final Class_26095 Field_18251;
    static final boolean Field_18252 = !Class_18249.class.desiredAssertionStatus() ? 5121 & 26729 : 8 & 15904;
    private static final AtomicLongFieldUpdater Field_18253;
    private boolean Field_18254;
    private long Field_18255;
    private static final AtomicIntegerFieldUpdater Field_18256;
    private long Field_18257;
    private Class_8619 Field_18258;
    private Class_8619 Field_18259;
    private Class_8619 Field_18260;
    private int Field_18261;
    private int Field_18262;
    private static final Class_6113 Field_18263;
    private static final Class_34677 Field_18264;

    Class_18249(Class_31282 class_31282) {
        this.Field_18251 = class_31282;
    }

    static {
        Field_18263 = Class_10201.Method_10203(Class_18249.class);
        Field_18264 = new Class_40010();
        AtomicIntegerFieldUpdater<Class_18249> atomicIntegerFieldUpdater = Class_7799.Method_7844(Class_18249.class, Class_18249.Method_18270("\u4829\u4829\u4821\u4829\u482b\u4829\u4820\u4828"));
        if (atomicIntegerFieldUpdater == null) {
            atomicIntegerFieldUpdater = AtomicIntegerFieldUpdater.newUpdater(Class_18249.class, Class_18249.Method_18272("\u6100\u6104\u6106\u6102\u6100\u6100\u6106\u6106"));
        }
        Field_18256 = atomicIntegerFieldUpdater;
        AtomicLongFieldUpdater<Class_18249> atomicLongFieldUpdater = Class_7799.Method_7823(Class_18249.class, Class_18249.Method_18267("\u4981\u4998\u4983\u4996\u4999\u49a5\u4992\u499b\u4999\u4994\u4993\u499a\u49ac\u4994\u4987\u499a"));
        if (atomicLongFieldUpdater == null) {
            atomicLongFieldUpdater = AtomicLongFieldUpdater.newUpdater(Class_18249.class, Class_18249.Method_18279("\u0014\r\u0014\u0001\b\u0015\u0000\t\u0004\t\f\u0005\u0014\r\u001c\u0001"));
        }
        Field_18253 = atomicLongFieldUpdater;
    }

    public long Method_18265() {
        return this.Field_18255;
    }

    private void Method_18266(Class_8619 class_8619) {
        if ((this.Field_18261 -= 20481 & 579) == 0) {
            this.Field_18258 = null;
            if (class_8619 == this.Field_18260) {
                this.Field_18260 = null;
                this.Field_18259 = null;
            }
        } else {
            this.Field_18258 = class_8619.Field_8628;
        }
    }

    private static String Method_18267(String string) {
        int n = 12679;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18249.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_18268() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_18269() {
        return this.Field_18261;
    }

    private static String Method_18270(String string) {
        int n = 31704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18249.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public int Method_18271() {
        return this.Field_18262;
    }

    private static String Method_18272(String string) {
        int n = 17521;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18249.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Object Method_18273() {
        Class_8619 class_8619 = this.Field_18258;
        if (class_8619 == null) {
            return null;
        }
        return class_8619.Field_8623;
    }

    public ByteBuffer[] Method_18274() {
        long l = -3994897719766810092L & 1211205888L;
        int n = 4113 & 16896;
        Class_32728 class_32728 = Class_32728.Method_32743();
        ByteBuffer[] arrbyteBuffer = (ByteBuffer[])Field_18264.Method_34681(class_32728);
        Class_8619 class_8619 = this.Field_18258;
        while (this.Method_18289(class_8619) && class_8619.Field_8623 instanceof Class_22553) {
            if (!class_8619.Field_8624) {
                Class_22553 class_22553 = (Class_22553)class_8619.Field_8623;
                int n2 = class_22553.Method_22582();
                int n3 = class_22553.Method_22620() - n2;
                if (n3 > 0) {
                    Object object;
                    int n4;
                    l += (long)n3;
                    int n5 = class_8619.Field_8625;
                    if (n5 == (-1 & -1)) {
                        class_8619.Field_8625 = n5 = class_22553.Method_22634();
                    }
                    if ((n4 = n + n5) > arrbyteBuffer.length) {
                        arrbyteBuffer = Class_18249.Method_18287(arrbyteBuffer, n4, n);
                        Field_18264.Method_34683(class_32728, arrbyteBuffer);
                    }
                    if (n5 == (169 & 21)) {
                        object = class_8619.Field_8621;
                        if (object == null) {
                            object = class_22553.Method_22588(n2, n3);
                            class_8619.Field_8621 = object;
                        }
                        arrbyteBuffer[n++] = object;
                    } else {
                        object = class_8619.Field_8622;
                        if (object == null) {
                            object = class_22553.Method_22629();
                            class_8619.Field_8622 = object;
                        }
                        n = Class_18249.Method_18275(object, arrbyteBuffer, n);
                    }
                }
            }
            class_8619 = class_8619.Field_8628;
        }
        this.Field_18262 = n;
        this.Field_18255 = l;
        return arrbyteBuffer;
    }

    private static int Method_18275(ByteBuffer[] arrbyteBuffer, ByteBuffer[] arrbyteBuffer2, int n) {
        ByteBuffer byteBuffer;
        ByteBuffer[] arrbyteBuffer3 = arrbyteBuffer;
        int n2 = arrbyteBuffer3.length;
        for (int i = -31679 & 18472; i < n2 && (byteBuffer = arrbyteBuffer3[i]) != null; ++i) {
            arrbyteBuffer2[n++] = byteBuffer;
        }
        return n;
    }

    public void Method_18276(long l) {
        Class_8619 class_8619 = this.Field_18258;
        if (!Field_18252 && class_8619 == null) {
            throw new AssertionError();
        }
        Class_37748 class_37748 = class_8619.Field_8631;
        if (class_37748 instanceof Class_45330) {
            long l2;
            class_8619.Field_8626 = l2 = class_8619.Field_8626 + l;
            ((Class_45330)class_37748).tryProgress(l2, class_8619.Field_8627);
        }
    }

    void Method_18277(Throwable throwable) {
        if (this.Field_18254) {
            return;
        }
        try {
            this.Field_18254 = -30199 & 1073;
            while (this.Method_18278(throwable)) {
            }
        }
        catch (Throwable throwable2) {
            this.Field_18254 = 17619 & 14368;
            throw throwable2;
        }
        this.Field_18254 = 54 & 128;
    }

    public boolean Method_18278(Throwable throwable) {
        Class_8619 class_8619 = this.Field_18258;
        if (class_8619 == null) {
            return (-8171 & 5184) != 0;
        }
        Object object = class_8619.Field_8623;
        Class_37748 class_37748 = class_8619.Field_8631;
        int n = class_8619.Field_8630;
        this.Method_18266(class_8619);
        if (!class_8619.Field_8624) {
            Class_24761.Method_24766(object);
            Class_18249.Method_18292(class_37748, throwable);
            this.Method_18283(n);
        }
        class_8619.Method_8633();
        return (3157 & 16907) != 0;
    }

    private static String Method_18279(String string) {
        int n = 30399;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_18249.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Method_18280(ClosedChannelException closedChannelException) {
        if (this.Field_18254) {
            this.Field_18251.Method_26113().execute(new Class_31866(this, closedChannelException));
            return;
        }
        this.Field_18254 = -32607 & 5901;
        if (this.Field_18251.Method_26114()) {
            throw new IllegalStateException("close() must be invoked after the channel is closed.");
        }
        if (!this.Method_18281()) {
            throw new IllegalStateException("close() must be invoked after all flushed writes are handled.");
        }
        try {
            for (Class_8619 class_8619 = this.Field_18259; class_8619 != null; class_8619 = class_8619.Method_8632()) {
                int n = class_8619.Field_8630;
                Field_18253.addAndGet(this, -n);
                if (class_8619.Field_8624) continue;
                Class_24761.Method_24766(class_8619.Field_8623);
                Class_18249.Method_18292(class_8619.Field_8631, closedChannelException);
            }
        }
        catch (Throwable throwable) {
            this.Field_18254 = 97 & -22524;
            throw throwable;
        }
        this.Field_18254 = 21568 & 521;
    }

    public boolean Method_18281() {
        return (this.Field_18261 == 0 ? 4169 & 2183 : -27566 & 26916) != 0;
    }

    private static void Method_18282(Class_37748 class_37748) {
        if (!(class_37748 instanceof Class_40957) && !class_37748.Method_37757()) {
            Field_18263.Method_6125("Failed to mark a promise as success because it is done already: {}", class_37748);
        }
    }

    void Method_18283(long l) {
        if (l == (-1412616966013574656L & 1412616964890694920L)) {
            return;
        }
        long l2 = Field_18253.addAndGet(this, -l);
        if ((l2 == (-1246243159603461120L & 1384120548L) || l2 < (long)this.Field_18251.Method_26110().Method_19100()) && Field_18256.compareAndSet(this, 24904 & 2563, 65 & 7849)) {
            this.Field_18251.Method_26106().Method_6285();
        }
    }

    public void Method_18284(long l) {
        block4 : {
            int n;
            Class_22553 class_22553;
            do {
                Object object;
                if (!((object = this.Method_18273()) instanceof Class_22553)) {
                    if (!Field_18252 && l != (-6684480545524546552L & 1168837010L)) {
                        throw new AssertionError();
                    }
                    break block4;
                }
                class_22553 = (Class_22553)object;
                n = class_22553.Method_22582();
                int n2 = class_22553.Method_22620() - n;
                if ((long)n2 > l) break;
                if (l != (1286193310689921224L & 302023461L)) {
                    this.Method_18276(n2);
                    l -= (long)n2;
                }
                this.Method_18293();
            } while (true);
            if (l == (43876448L & -2620850709861482230L)) break block4;
            class_22553.Method_22590(n + (int)l);
            this.Method_18276(l);
        }
    }

    void Method_18285(long l) {
        if (l == (851329387057406996L & -851329388290768607L)) {
            return;
        }
        long l2 = Field_18253.addAndGet(this, l);
        if (l2 > (long)this.Field_18251.Method_26110().Method_19094() && Field_18256.compareAndSet(this, 22921 & -32767, 2564 & 8371)) {
            this.Field_18251.Method_26106().Method_6285();
        }
    }

    boolean Method_18286() {
        return (this.Field_18250 != 0 ? -30651 & 12475 : 9560 & -30719) != 0;
    }

    private static ByteBuffer[] Method_18287(ByteBuffer[] arrbyteBuffer, int n, int n2) {
        int n3 = arrbyteBuffer.length;
        do {
            if ((n3 <<= -13823 & 4437) >= 0) continue;
            throw new IllegalStateException();
        } while (n > n3);
        ByteBuffer[] arrbyteBuffer2 = new ByteBuffer[n3];
        System.arraycopy(arrbyteBuffer, -30563 & 20512, arrbyteBuffer2, 17188 & 8201, n2);
        return arrbyteBuffer2;
    }

    public void Method_18288(Object object, int n, Class_37748 class_37748) {
        Class_8619 class_8619 = Class_8619.Method_8634(object, n, Class_18249.Method_18290(object), class_37748);
        if (this.Field_18260 == null) {
            this.Field_18258 = null;
            this.Field_18260 = class_8619;
        } else {
            Class_8619 class_86192 = this.Field_18260;
            class_86192.Field_8628 = class_8619;
            this.Field_18260 = class_8619;
        }
        if (this.Field_18259 == null) {
            this.Field_18259 = class_8619;
        }
        this.Method_18285(n);
    }

    private boolean Method_18289(Class_8619 class_8619) {
        return (class_8619 != null && class_8619 != this.Field_18259 ? 21 & 4387 : 26626 & -32752) != 0;
    }

    private static long Method_18290(Object object) {
        if (object instanceof Class_22553) {
            return ((Class_22553)object).Method_22564();
        }
        if (object instanceof Class_23060) {
            return ((Class_23060)object).Method_23063();
        }
        if (object instanceof Class_23010) {
            return ((Class_23010)object).Method_23012().Method_22564();
        }
        return -1L & -1L;
    }

    public void Method_18291() {
        Class_8619 class_8619 = this.Field_18259;
        if (class_8619 != null) {
            if (this.Field_18258 == null) {
                this.Field_18258 = class_8619;
            }
            do {
                this.Field_18261 += 16409 & 14371;
                if (class_8619.Field_8631.setUncancellable()) continue;
                int n = class_8619.Method_8636();
                this.Method_18283(n);
            } while ((class_8619 = class_8619.Field_8628) != null);
            this.Field_18259 = null;
        }
    }

    private static void Method_18292(Class_37748 class_37748, Throwable throwable) {
        if (!(class_37748 instanceof Class_40957) && !class_37748.tryFailure(throwable)) {
            Field_18263.Method_6123("Failed to mark a promise as failure because it's done already: {}", class_37748, throwable);
        }
    }

    public boolean Method_18293() {
        Class_8619 class_8619 = this.Field_18258;
        if (class_8619 == null) {
            return (4101 & 8552) != 0;
        }
        Object object = class_8619.Field_8623;
        Class_37748 class_37748 = class_8619.Field_8631;
        int n = class_8619.Field_8630;
        this.Method_18266(class_8619);
        if (!class_8619.Field_8624) {
            Class_24761.Method_24766(object);
            Class_18249.Method_18282(class_37748);
            this.Method_18283(n);
        }
        class_8619.Method_8633();
        return (8977 & -32567) != 0;
    }
}

