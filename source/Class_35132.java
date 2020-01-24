/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.ServerSocket;
import java.net.SocketException;

public class Class_35132
extends Class_27218
implements Class_20080 {
    private int Field_35133 = Class_12403.Field_12409;
    protected final ServerSocket Field_35134;

    public Class_20080 Method_35135(int n) {
        super.Method_27239(n);
        return this;
    }

    public Class_20080 Method_35136(Class_18899 class_18899) {
        super.Method_27244(class_18899);
        return this;
    }

    public Class_19087 Method_35137(int n) {
        return this.Method_35149(n);
    }

    public Class_35132(Class_30368 class_30368, ServerSocket serverSocket) {
        super(class_30368);
        if (serverSocket == null) {
            throw new NullPointerException("javaSocket");
        }
        this.Field_35134 = serverSocket;
    }

    public Class_19087 Method_35138(Class_18899 class_18899) {
        return this.Method_35136(class_18899);
    }

    public Class_19087 Method_35139(Class_25565 class_25565) {
        return this.Method_35155(class_25565);
    }

    public Class_19087 Method_35140(int n) {
        return this.Method_35157(n);
    }

    public boolean Method_35141() {
        try {
            return this.Field_35134.getReuseAddress();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_20080 Method_35142(boolean bl) {
        try {
            this.Field_35134.setReuseAddress(bl);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_19087 Method_35143(Class_22837 class_22837) {
        return this.Method_35151(class_22837);
    }

    public Class_20080 Method_35144(boolean bl) {
        super.Method_27250(bl);
        return this;
    }

    public Class_20080 Method_35145(int n) {
        super.Method_27243(n);
        return this;
    }

    public int Method_35146() {
        try {
            return this.Field_35134.getReceiveBufferSize();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Object Method_35147(Class_25272 class_25272) {
        if (class_25272 == Class_25272.Field_25282) {
            return this.Method_35146();
        }
        if (class_25272 == Class_25272.Field_25301) {
            return this.Method_35141();
        }
        if (class_25272 == Class_25272.Field_25293) {
            return this.Method_35161();
        }
        return super.Method_27249(class_25272);
    }

    public Class_20080 Method_35148(int n) {
        super.Method_27257(n);
        return this;
    }

    public Class_20080 Method_35149(int n) {
        super.Method_27233(n);
        return this;
    }

    public Class_19087 Method_35150(int n) {
        return this.Method_35135(n);
    }

    public Class_20080 Method_35151(Class_22837 class_22837) {
        super.Method_27251(class_22837);
        return this;
    }

    public boolean Method_35152(Class_25272 class_25272, Object object) {
        this.validate(class_25272, object);
        if (class_25272 == Class_25272.Field_25282) {
            this.Method_35158((Integer)object);
        } else if (class_25272 == Class_25272.Field_25301) {
            this.Method_35142((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25293) {
            this.Method_35159((Integer)object);
        } else {
            return super.Method_27247(class_25272, object);
        }
        return (16901 & 6425) != 0;
    }

    public Class_19087 Method_35153(int n) {
        return this.Method_35148(n);
    }

    public Class_19087 Method_35154(int n) {
        return this.Method_35145(n);
    }

    public Class_20080 Method_35155(Class_25565 class_25565) {
        super.Method_27235(class_25565);
        return this;
    }

    private void Method_35156() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_20080 Method_35157(int n) {
        super.Method_27232(n);
        return this;
    }

    public Class_20080 Method_35158(int n) {
        try {
            this.Field_35134.setReceiveBufferSize(n);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_20080 Method_35159(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("backlog: " + n);
        }
        this.Field_35133 = n;
        return this;
    }

    public Class_19087 Method_35160(boolean bl) {
        return this.Method_35144(bl);
    }

    public int Method_35161() {
        return this.Field_35133;
    }
}

