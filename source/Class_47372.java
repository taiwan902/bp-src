/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.DatagramChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

public class Class_47372
extends Class_42759
implements Class_31877 {
    private long Field_47373 = 536874936L & 1090571197L;
    private long Field_47374 = 167782166L & 3168212659544008464L;
    private int Field_47375;
    private Class_39158 Field_47376;
    private final int Field_47377;
    private boolean Field_47378;
    private Class_27876 Field_47379;
    private final Executor Field_47380;
    private boolean Field_47381;
    private final SSLEngine Field_47382;
    private final boolean Field_47383;
    private static final SSLException Field_47384;
    private final Class_46146 Field_47385 = new Class_46146(this, null);
    private static final Pattern Field_47386;
    private final Class_46146 Field_47387 = new Class_46146(this, null);
    private static final Class_6113 Field_47388;
    static final boolean Field_47389;
    private static final Pattern Field_47390;
    private boolean Field_47391;
    private final boolean Field_47392;
    private static final ClosedChannelException Field_47393;
    private static final SSLException Field_47394;
    private boolean Field_47395;
    private final boolean Field_47396;

    static Class_39158 Method_47397(Class_47372 class_47372) {
        return class_47372.Field_47376;
    }

    private void Method_47398() {
        String string = String.valueOf(this.Field_47382.getSession().getCipherSuite());
        if (!this.Field_47383 && (string.contains("_GCM_") || string.contains("-GCM-"))) {
            this.Field_47391 = -26455 & 16901;
        }
        if (this.Field_47387.trySuccess((Object)this.Field_47376.Method_39175())) {
            if (Field_47388.Method_6131()) {
                Field_47388.Method_6130(this.Field_47376.Method_39175() + " HANDSHAKEN: " + this.Field_47382.getSession().getCipherSuite());
            }
            this.Field_47376.Method_39179(Class_29845.Field_29846);
        }
    }

    public void Method_47399(Class_39158 class_39158) {
        this.Method_47401(Field_47393);
        super.Method_42769(class_39158);
    }

    static Class_46146 Method_47400(Class_47372 class_47372) {
        return class_47372.Field_47387;
    }

    private void Method_47401(Throwable throwable) {
        block2 : {
            this.Field_47382.closeOutbound();
            try {
                this.Field_47382.closeInbound();
            }
            catch (SSLException sSLException) {
                String string = sSLException.getMessage();
                if (string != null && string.contains("possible truncation attack")) break block2;
                Field_47388.Method_6116("SSLEngine.closeInbound() raised an exception.", sSLException);
            }
        }
        this.Method_47427(throwable);
        this.Field_47379.Method_27891(throwable);
    }

    static SSLException Method_47402() {
        return Field_47384;
    }

    public Class_47372(SSLEngine sSLEngine) {
        this(sSLEngine, (1539 & 8700) != 0);
    }

    @Deprecated
    public Class_47372(SSLEngine sSLEngine, boolean bl, Executor executor) {
        if (sSLEngine == null) {
            throw new NullPointerException("engine");
        }
        if (executor == null) {
            throw new NullPointerException("delegatedTaskExecutor");
        }
        this.Field_47382 = sSLEngine;
        this.Field_47380 = executor;
        this.Field_47396 = bl;
        this.Field_47377 = sSLEngine.getSession().getPacketBufferSize();
        this.Field_47383 = -14822 & 36;
        this.Field_47392 = 2433 & 5697;
    }

    public void Method_47403(Class_39158 class_39158, Class_37748 class_37748) {
        this.Method_47404(class_39158, class_37748, (6307 & 16457) != 0);
    }

    private void Method_47404(Class_39158 class_39158, Class_37748 class_37748, boolean bl) {
        if (!class_39158.Method_39175().Method_26107()) {
            if (bl) {
                class_39158.Method_39172(class_37748);
            } else {
                class_39158.Method_39167(class_37748);
            }
            return;
        }
        this.Field_47382.closeOutbound();
        Class_37748 class_377482 = class_39158.Method_39177();
        this.Method_47422(class_39158, Class_16620.Field_16622, class_377482);
        this.Method_47434(class_39158);
        this.Method_47437(class_39158, class_377482, class_37748);
    }

    private void Method_47405(Class_39158 class_39158) {
        this.Method_47410(class_39158, Class_16620.Field_16622.Method_22644(), 2048 & 160);
    }

    private static String Method_47406(String string) {
        int n = 21816;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47372.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private static String Method_47407(String string) {
        int n = 29704;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47372.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_47408(Class_39158 class_39158) {
        if (!this.Field_47379.Method_27894()) {
            this.Field_47379.Method_27891(new Class_31422("Pending write on removal of SslHandler"));
        }
    }

    private Class_22553 Method_47409(Class_39158 class_39158, int n) {
        Class_22837 class_22837 = class_39158.Method_39170();
        if (this.Field_47383) {
            return class_22837.Method_22843(n);
        }
        return class_22837.Method_22841(n);
    }

    private void Method_47410(Class_39158 class_39158, ByteBuffer byteBuffer, int n) {
        ByteBuffer byteBuffer2;
        Class_22553 class_22553;
        int n2 = byteBuffer.position();
        if (this.Field_47391 && byteBuffer.isDirect()) {
            class_22553 = class_39158.Method_39170().Method_22847(byteBuffer.limit() - n2);
            class_22553.Method_22577(byteBuffer);
            byteBuffer2 = byteBuffer;
            byteBuffer = class_22553.Method_22644();
        } else {
            byteBuffer2 = null;
            class_22553 = null;
        }
        int n3 = -24448 & 16729;
        Class_22553 class_225532 = this.Method_47409(class_39158, n);
        try {
            block12 : do {
                SSLEngineResult sSLEngineResult = Class_47372.Method_47435(this.Field_47382, byteBuffer, class_225532);
                SSLEngineResult.Status status = sSLEngineResult.getStatus();
                SSLEngineResult.HandshakeStatus handshakeStatus = sSLEngineResult.getHandshakeStatus();
                int n4 = sSLEngineResult.bytesProduced();
                int n5 = sSLEngineResult.bytesConsumed();
                if (status == SSLEngineResult.Status.CLOSED) {
                    this.Field_47385.trySuccess((Object)class_39158.Method_39175());
                    break;
                }
                switch (Class_6812.Field_6813[handshakeStatus.ordinal()]) {
                    case 5: {
                        break;
                    }
                    case 4: {
                        this.Method_47411(class_39158, (1171 & 325) != 0);
                        break;
                    }
                    case 1: {
                        this.Method_47418();
                        break;
                    }
                    case 2: {
                        this.Method_47398();
                        n3 = 4227 & -31711;
                        continue block12;
                    }
                    case 3: {
                        if (this.Method_47420()) {
                            n3 = -28671 & 25101;
                            continue block12;
                        }
                        if (!this.Field_47378) break;
                        this.Field_47378 = 8260 & 290;
                        n3 = 12195 & 1;
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown handshake status: " + (Object)((Object)handshakeStatus));
                    }
                }
                if (status == SSLEngineResult.Status.BUFFER_UNDERFLOW || n5 == 0 && n4 == 0) break;
            } while (true);
            if (n3 != 0) {
                this.Method_47433(class_39158, (8321 & 2321) != 0);
            }
        }
        catch (SSLException sSLException) {
            this.Method_47401(sSLException);
            throw sSLException;
        }
        finally {
            if (class_22553 != null) {
                byteBuffer2.position(n2 + byteBuffer.position());
                class_22553.release();
            }
            if (class_225532.Method_22583()) {
                class_39158.Method_39183(class_225532);
            } else {
                class_225532.release();
            }
        }
    }

    private void Method_47411(Class_39158 class_39158, boolean bl) {
        Class_22553 class_22553 = null;
        try {
            SSLEngineResult sSLEngineResult;
            block12 : do {
                if (class_22553 == null) {
                    class_22553 = this.Method_47425(class_39158, -32768 & 517);
                }
                if ((sSLEngineResult = this.Method_47423(this.Field_47382, Class_16620.Field_16622, class_22553)).bytesProduced() > 0) {
                    class_39158.Method_39182(class_22553);
                    if (bl) {
                        this.Field_47395 = -16251 & 833;
                    }
                    class_22553 = null;
                }
                switch (Class_6812.Field_6813[sSLEngineResult.getHandshakeStatus().ordinal()]) {
                    case 2: {
                        this.Method_47398();
                        break;
                    }
                    case 1: {
                        this.Method_47418();
                        break;
                    }
                    case 5: {
                        if (bl) continue block12;
                        this.Method_47405(class_39158);
                        break;
                    }
                    case 4: {
                        break;
                    }
                    case 3: {
                        this.Method_47420();
                        if (bl) continue block12;
                        this.Method_47405(class_39158);
                        break;
                    }
                    default: {
                        throw new IllegalStateException("Unknown handshake status: " + (Object)((Object)sSLEngineResult.getHandshakeStatus()));
                    }
                }
            } while (sSLEngineResult.bytesProduced() != 0);
        }
        catch (SSLException sSLException) {
            this.Method_47401(sSLException);
            throw sSLException;
        }
        finally {
            if (class_22553 != null) {
                class_22553.release();
            }
        }
    }

    public Class_47372(SSLEngine sSLEngine, boolean bl) {
        this(sSLEngine, bl, Class_19830.Field_19831);
    }

    static Class_6113 Method_47412() {
        return Field_47388;
    }

    public void Method_47413(Class_39158 class_39158) {
        this.Field_47376 = class_39158;
        this.Field_47379 = new Class_27876(class_39158);
        if (class_39158.Method_39175().Method_26107() && this.Field_47382.getUseClientMode()) {
            this.Method_47417();
        }
    }

    public void Method_47414(Class_39158 class_39158, SocketAddress socketAddress, Class_37748 class_37748) {
        class_39158.Method_39173(socketAddress, class_37748);
    }

    private void Method_47415() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_47416(Class_39158 class_39158) {
        if (this.Field_47395) {
            this.Field_47395 = 5633 & -24564;
            class_39158.Method_39168();
        }
        super.Method_42768(class_39158);
    }

    private Class_21065 Method_47417() {
        Class_42730 class_42730 = this.Field_47374 > (252290822001968676L & 67174408L) ? this.Field_47376.Method_39160().schedule((Runnable)new Class_7519(this), this.Field_47374, TimeUnit.MILLISECONDS) : null;
        this.Field_47387.addListener((Class_18600)new Class_26681(this, class_42730));
        try {
            this.Field_47382.beginHandshake();
            this.Method_47411(this.Field_47376, (8458 & -31675) != 0);
            this.Field_47376.Method_39168();
        }
        catch (Exception exception) {
            this.Method_47427(exception);
        }
        return this.Field_47387;
    }

    private void Method_47418() {
        if (this.Field_47380 == Class_19830.Field_19831) {
            Runnable runnable;
            while ((runnable = this.Field_47382.getDelegatedTask()) != null) {
                runnable.run();
            }
        } else {
            Object object;
            ArrayList<Runnable> arrayList = new ArrayList<Runnable>(25794 & -28662);
            while ((object = this.Field_47382.getDelegatedTask()) != null) {
                arrayList.add((Runnable)object);
            }
            if (arrayList.isEmpty()) {
                return;
            }
            object = new CountDownLatch(-15615 & 14465);
            this.Field_47380.execute(new Class_16431(this, arrayList, (CountDownLatch)object));
            int n = 276 & 1250;
            while (((CountDownLatch)object).getCount() != (-7180043696874715072L & 108610590L)) {
                try {
                    ((CountDownLatch)object).await();
                }
                catch (InterruptedException interruptedException) {
                    n = 3073 & 4737;
                }
            }
            if (n != 0) {
                Thread.currentThread().interrupt();
            }
        }
    }

    static void Method_47419(Class_47372 class_47372, Throwable throwable) {
        class_47372.Method_47427(throwable);
    }

    static {
        Field_47389 = !Class_47372.class.desiredAssertionStatus() ? 20577 & 3 : 1281 & -11772;
        Field_47388 = Class_10201.Method_10203(Class_47372.class);
        Field_47386 = Pattern.compile(Class_47372.Method_47436("\u2204\u2254\u2250\u2252\u2244\u2240\u2200\u2214\u2218\u2218\u221e\u220e\u220e\u221e\u221a\u220e\u2212\u2214\u2200\u2212\u2216\u2206\u2200\u2210\u220e\u220a\u220e\u220e\u221e\u220e\u225a\u2218\u2232\u2232\u2234\u2234\u2236\u2236\u2274\u2270\u227e"));
        Field_47390 = Pattern.compile(Class_47372.Method_47406("\u4060\u4000\u4006\u4004\u4000\u4004\u4046\u4042\u4040\u4040\u4040\u4046\u4042\u4046\u4042\u4042\u4010\u4014\u4014\u4012\u4014\u4054\u4050\u4056\u4052\u4052\u4050\u4056\u4052\u4050\u4056\u4050\u4062\u4062\u4064\u4066\u4060\u4064\u4060\u4060\u4064\u4064\u4062\u4066\u4062\u4060\u4024\u4060\u4074\u4074\u4072\u4076\u4072\u4070\u4032\u4036\u4076\u4076\u4074\u4070\u4036\u4030\u4036\u4030"), 16898 & -30537);
        Field_47394 = new SSLException(Class_47372.Method_47407("\u8800\u8800\u880f\u8806\u8829\u8820\u882e\u882b\u8824\u8821\u8822\u882f\u8828\u8824\u8822\u8823\u8831\u8830\u883f\u8833\u8830\u8834\u8833\u883e"));
        Field_47384 = new SSLException(Class_47372.Method_47432("\u2280\u2281\u2286\u2286\u2281\u2280\u2283\u2283\u2285\u22c0\u2286\u2283\u2285\u2285\u2286\u22c2\u2295\u2295\u2296"));
        Field_47393 = new ClosedChannelException();
        Field_47394.setStackTrace(Class_23808.Field_23809);
        Field_47384.setStackTrace(Class_23808.Field_23809);
        Field_47393.setStackTrace(Class_23808.Field_23809);
    }

    private boolean Method_47420() {
        if (!this.Field_47387.isDone()) {
            this.Method_47398();
            return (8353 & 4679) != 0;
        }
        return (-12239 & 1996) != 0;
    }

    public void Method_47421(Class_39158 class_39158) {
        if (!this.Field_47396 && this.Field_47382.getUseClientMode()) {
            this.Method_47417().Method_21068(new Class_31417(this, class_39158));
        }
        class_39158.Method_39165();
    }

    public void Method_47422(Class_39158 class_39158, Object object, Class_37748 class_37748) {
        this.Field_47379.Method_27885(object, class_37748);
    }

    private SSLEngineResult Method_47423(SSLEngine sSLEngine, Class_22553 class_22553, Class_22553 class_225532) {
        ByteBuffer byteBuffer;
        SSLEngineResult sSLEngineResult;
        ByteBuffer byteBuffer2 = class_22553.Method_22644();
        if (!byteBuffer2.isDirect()) {
            byteBuffer = ByteBuffer.allocateDirect(byteBuffer2.remaining());
            byteBuffer.put(byteBuffer2).flip();
            byteBuffer2 = byteBuffer;
        }
        block3 : do {
            byteBuffer = class_225532.Method_22614(class_225532.Method_22620(), class_225532.Method_22574());
            sSLEngineResult = sSLEngine.wrap(byteBuffer2, byteBuffer);
            class_22553.Method_22593(sSLEngineResult.bytesConsumed());
            class_225532.Method_22609(class_225532.Method_22620() + sSLEngineResult.bytesProduced());
            switch (Class_6812.Field_6814[sSLEngineResult.getStatus().ordinal()]) {
                case 1: {
                    class_225532.Method_22645(this.Field_47377);
                    continue block3;
                }
            }
            break;
        } while (true);
        return sSLEngineResult;
    }

    public void Method_47424(Class_39158 class_39158, Class_37748 class_37748) {
        this.Method_47404(class_39158, class_37748, (2064 & 17792) != 0);
    }

    private Class_22553 Method_47425(Class_39158 class_39158, int n) {
        if (this.Field_47392) {
            return this.Method_47409(class_39158, this.Field_47377);
        }
        return this.Method_47409(class_39158, Math.min(n + (2459 & 3353), this.Field_47377));
    }

    static SSLEngine Method_47426(Class_47372 class_47372) {
        return class_47372.Field_47382;
    }

    private void Method_47427(Throwable throwable) {
        if (this.Field_47387.tryFailure(throwable)) {
            this.Field_47376.Method_39179(new Class_29845(throwable));
            this.Field_47376.Method_39178();
        }
    }

    public void Method_47428(Class_39158 class_39158, SocketAddress socketAddress, SocketAddress socketAddress2, Class_37748 class_37748) {
        class_39158.Method_39185(socketAddress, socketAddress2, class_37748);
    }

    public void Method_47429(Class_39158 class_39158, Throwable throwable) {
        if (this.Method_47440(throwable)) {
            if (Field_47388.Method_6131()) {
                Field_47388.Method_6116("Swallowing a harmless 'connection reset by peer / broken pipe' error that occurred while writing close_notify in response to the peer's close_notify", throwable);
            }
            if (class_39158.Method_39175().Method_26107()) {
                class_39158.Method_39178();
            }
        } else {
            class_39158.Method_39162(throwable);
        }
    }

    protected void Method_47430(Class_39158 class_39158, Class_22553 class_22553, List list) {
        int n;
        int n2 = class_22553.Method_22582();
        int n3 = class_22553.Method_22620();
        int n4 = n2;
        int n5 = 72 & 416;
        if (this.Field_47375 > 0) {
            if (n3 - n2 < this.Field_47375) {
                return;
            }
            n4 += this.Field_47375;
            n5 = this.Field_47375;
            this.Field_47375 = 4357 & 18962;
        }
        int n6 = 2092 & -15488;
        while (n5 < (22809 & -13959) && (n = n3 - n4) >= (-30059 & 8207)) {
            int n7 = Class_47372.Method_47439(class_22553, n4);
            if (n7 == (-1 & -1)) {
                n6 = 23809 & 8833;
                break;
            }
            if (!Field_47389 && n7 <= 0) {
                throw new AssertionError();
            }
            if (n7 > n) {
                this.Field_47375 = n7;
                break;
            }
            int n8 = n5 + n7;
            if (n8 > (18717 & 19321)) break;
            n4 += n7;
            n5 = n8;
        }
        if (n5 > 0) {
            class_22553.Method_22593(n5);
            ByteBuffer byteBuffer = class_22553.Method_22614(n2, n5);
            this.Method_47410(class_39158, byteBuffer, n5);
            if (!Field_47389 && byteBuffer.hasRemaining() && !this.Field_47382.isInboundDone()) {
                throw new AssertionError();
            }
        }
        if (n6 != 0) {
            Class_13728 class_13728 = new Class_13728("not an SSL/TLS record: " + Class_10346.Method_10354(class_22553));
            class_22553.Method_22593(class_22553.Method_22564());
            class_39158.Method_39162(class_13728);
            this.Method_47401(class_13728);
        }
    }

    public void Method_47431(Class_39158 class_39158) {
        class_39158.Method_39176();
    }

    private static String Method_47432(String string) {
        int n = 17026;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47372.class, 4);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    /*
     * Exception decompiling
     */
    private void Method_47433(Class_39158 var1_1, boolean var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid source, tried to remove [0] lbl48 : GotoStatement: goto lbl4;\u000a\u000afrom [] lbl3 : TryStatement: try { 0[TRYBLOCK]\u000a\u000abut was not a source.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.removeSource(Op03SimpleStatement.java:313)
        // org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer$2.call(FinalAnalyzer.java:259)
        // org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer$2.call(FinalAnalyzer.java:247)
        // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
        // org.benf.cfr.reader.bytecode.analysis.parse.utils.finalhelp.FinalAnalyzer.identifyFinally(FinalAnalyzer.java:267)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.FinallyRewriter.identifyFinally(FinallyRewriter.java:40)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:414)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:184)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:129)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:397)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:906)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:797)
        // org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:225)
        // org.benf.cfr.reader.Driver.doJar(Driver.java:109)
        // org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:65)
        // org.benf.cfr.reader.Main.main(Main.java:48)
        throw new IllegalStateException("Decompilation failed");
    }

    public void Method_47434(Class_39158 class_39158) {
        if (this.Field_47396 && !this.Field_47381) {
            this.Field_47381 = 6313 & 8961;
            this.Field_47379.Method_27889();
            class_39158.Method_39168();
            return;
        }
        if (this.Field_47379.Method_27894()) {
            this.Field_47379.Method_27885(Class_16620.Field_16622, class_39158.Method_39161());
        }
        if (!this.Field_47387.isDone()) {
            this.Field_47378 = -28621 & 16641;
        }
        this.Method_47433(class_39158, (17924 & 16) != 0);
        class_39158.Method_39168();
    }

    private static SSLEngineResult Method_47435(SSLEngine sSLEngine, ByteBuffer byteBuffer, Class_22553 class_22553) {
        SSLEngineResult sSLEngineResult;
        int n = 2 & -16300;
        block6 : do {
            ByteBuffer byteBuffer2 = class_22553.Method_22614(class_22553.Method_22620(), class_22553.Method_22574());
            sSLEngineResult = sSLEngine.unwrap(byteBuffer, byteBuffer2);
            class_22553.Method_22609(class_22553.Method_22620() + sSLEngineResult.bytesProduced());
            switch (Class_6812.Field_6814[sSLEngineResult.getStatus().ordinal()]) {
                case 1: {
                    int n2 = sSLEngine.getSession().getApplicationBufferSize();
                    switch (n++) {
                        case 0: {
                            class_22553.Method_22645(Math.min(n2, byteBuffer.remaining()));
                            continue block6;
                        }
                    }
                    class_22553.Method_22645(n2);
                    continue block6;
                }
            }
            break;
        } while (true);
        return sSLEngineResult;
    }

    private static String Method_47436(String string) {
        int n = 1864;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_47372.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    private void Method_47437(Class_39158 class_39158, Class_27581 class_27581, Class_37748 class_37748) {
        if (!class_39158.Method_39175().Method_26107()) {
            class_39158.Method_39167(class_37748);
            return;
        }
        Class_42730 class_42730 = this.Field_47373 > (-8196184082611175413L & 1628301408L) ? class_39158.Method_39160().schedule((Runnable)new Class_19305(this, class_39158, class_37748), this.Field_47373, TimeUnit.MILLISECONDS) : null;
        class_27581.Method_27583(new Class_27764(this, class_42730, class_39158, class_37748));
    }

    private void Method_47438(Class_39158 class_39158, Class_22553 class_22553, Class_37748 class_37748, boolean bl) {
        if (class_22553 == null) {
            class_22553 = Class_16620.Field_16622;
        } else if (!class_22553.Method_22583()) {
            class_22553.release();
            class_22553 = Class_16620.Field_16622;
        }
        if (class_37748 != null) {
            class_39158.Method_39163(class_22553, class_37748);
        } else {
            class_39158.Method_39182(class_22553);
        }
        if (bl) {
            this.Field_47395 = 3 & 19137;
        }
    }

    private static int Method_47439(Class_22553 class_22553, int n) {
        int n2;
        int n3;
        int n4 = 10116 & -12288;
        switch (class_22553.Method_22607(n)) {
            case 20: 
            case 21: 
            case 22: 
            case 23: {
                n2 = 8193 & 18483;
                break;
            }
            default: {
                n2 = 16467 & 10532;
            }
        }
        if (n2 != 0) {
            n3 = class_22553.Method_22607(n + (2081 & -32765));
            if (n3 == (25103 & 355)) {
                n4 = class_22553.Method_22580(n + (-14781 & 12347)) + (10277 & -31675);
                if (n4 <= (5165 & 8215)) {
                    n2 = 13320 & 2594;
                }
            } else {
                n2 = 1408 & 18460;
            }
        }
        if (n2 == 0) {
            n3 = 12801 & -32319;
            int n5 = (class_22553.Method_22607(n) & (-24164 & 739)) != 0 ? -27058 & 8594 : 2251 & -18649;
            short s = class_22553.Method_22607(n + n5 + (8353 & 257));
            if (s == (-14322 & 9090) || s == (3075 & 4103)) {
                n4 = n5 == (402 & -31706) ? (class_22553.Method_22578(n) & (32767 & 32767)) + (11650 & 16971) : (class_22553.Method_22578(n) & (16383 & -16385)) + (291 & 12483);
                if (n4 <= n5) {
                    n3 = 1136 & 20610;
                }
            } else {
                n3 = 16397 & -32176;
            }
            if (n3 == 0) {
                return -1 & -1;
            }
        }
        return n4;
    }

    private boolean Method_47440(Throwable throwable) {
        if (!(throwable instanceof SSLException) && throwable instanceof IOException && this.Field_47385.isDone()) {
            StackTraceElement[] arrstackTraceElement;
            String string = String.valueOf(throwable.getMessage()).toLowerCase();
            if (Field_47390.matcher(string).matches()) {
                return (385 & -13751) != 0;
            }
            StackTraceElement[] arrstackTraceElement2 = arrstackTraceElement = throwable.getStackTrace();
            int n = arrstackTraceElement2.length;
            for (int i = 2764 & 12576; i < n; ++i) {
                StackTraceElement stackTraceElement = arrstackTraceElement2[i];
                String string2 = stackTraceElement.getClassName();
                String string3 = stackTraceElement.getMethodName();
                if (string2.startsWith("internal.io.netty.") || !"read".equals(string3)) continue;
                if (Field_47386.matcher(string2).matches()) {
                    return (13321 & -32509) != 0;
                }
                try {
                    Class<?> class_ = Class_7799.Method_7838(this.getClass()).loadClass(string2);
                    if (SocketChannel.class.isAssignableFrom(class_) || DatagramChannel.class.isAssignableFrom(class_)) {
                        return (19073 & 13673) != 0;
                    }
                    if (Class_7799.Method_7817() >= (10407 & 16471) && "com.sun.nio.sctp.SctpChannel".equals(class_.getSuperclass().getName())) {
                        return (1 & -26345) != 0;
                    }
                    continue;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    // empty catch block
                }
            }
        }
        return (144 & -18688) != 0;
    }
}

