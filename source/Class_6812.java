/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import javax.net.ssl.SSLEngineResult;

public class Class_6812 {
    static final int[] Field_6813;
    static final int[] Field_6814;

    private void Method_6815() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static {
        Field_6814 = new int[SSLEngineResult.Status.values().length];
        try {
            Class_6812.Field_6814[SSLEngineResult.Status.BUFFER_OVERFLOW.ordinal()] = 267 & 19681;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        Field_6813 = new int[SSLEngineResult.HandshakeStatus.values().length];
        try {
            Class_6812.Field_6813[SSLEngineResult.HandshakeStatus.NEED_TASK.ordinal()] = 25345 & -31671;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class_6812.Field_6813[SSLEngineResult.HandshakeStatus.FINISHED.ordinal()] = 2051 & 8466;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class_6812.Field_6813[SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING.ordinal()] = 9251 & 2587;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class_6812.Field_6813[SSLEngineResult.HandshakeStatus.NEED_WRAP.ordinal()] = -24572 & 2412;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Class_6812.Field_6813[SSLEngineResult.HandshakeStatus.NEED_UNWRAP.ordinal()] = 16485 & 13447;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

