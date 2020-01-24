/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.Socket;
import java.net.SocketException;

public class Class_28329
extends Class_27218
implements Class_23921 {
    private boolean Field_28330;
    protected final Socket Field_28331;

    public Class_23921 Method_28332(int n) {
        super.Method_27257(n);
        return this;
    }

    private void Method_28333() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_23921 Method_28334(boolean bl) {
        try {
            this.Field_28331.setTcpNoDelay(bl);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public int Method_28335() {
        try {
            return this.Field_28331.getReceiveBufferSize();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_23921 Method_28336(int n) {
        try {
            this.Field_28331.setSendBufferSize(n);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_23921 Method_28337(Class_25565 class_25565) {
        super.Method_27235(class_25565);
        return this;
    }

    public Class_23921 Method_28338(int n) {
        super.Method_27243(n);
        return this;
    }

    public boolean Method_28339() {
        try {
            return this.Field_28331.getKeepAlive();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_19087 Method_28340(int n) {
        return this.Method_28363(n);
    }

    public Class_23921 Method_28341(Class_22837 class_22837) {
        super.Method_27251(class_22837);
        return this;
    }

    public Class_19087 Method_28342(int n) {
        return this.Method_28332(n);
    }

    public boolean Method_28343(Class_25272 class_25272, Object object) {
        this.validate(class_25272, object);
        if (class_25272 == Class_25272.Field_25282) {
            this.Method_28366((Integer)object);
        } else if (class_25272 == Class_25272.Field_25276) {
            this.Method_28336((Integer)object);
        } else if (class_25272 == Class_25272.Field_25292) {
            this.Method_28334((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25287) {
            this.Method_28367((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25301) {
            this.Method_28345((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25286) {
            this.Method_28359((Integer)object);
        } else if (class_25272 == Class_25272.Field_25299) {
            this.Method_28348((Integer)object);
        } else if (class_25272 == Class_25272.Field_25280) {
            this.Method_28358((Boolean)object);
        } else {
            return super.Method_27247(class_25272, object);
        }
        return (16411 & 14469) != 0;
    }

    public Class_23921 Method_28344(boolean bl) {
        super.Method_27250(bl);
        return this;
    }

    public Class_23921 Method_28345(boolean bl) {
        try {
            this.Field_28331.setReuseAddress(bl);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_19087 Method_28346(int n) {
        return this.Method_28353(n);
    }

    public Object Method_28347(Class_25272 class_25272) {
        if (class_25272 == Class_25272.Field_25282) {
            return this.Method_28335();
        }
        if (class_25272 == Class_25272.Field_25276) {
            return this.Method_28362();
        }
        if (class_25272 == Class_25272.Field_25292) {
            return this.Method_28351();
        }
        if (class_25272 == Class_25272.Field_25287) {
            return this.Method_28339();
        }
        if (class_25272 == Class_25272.Field_25301) {
            return this.Method_28368();
        }
        if (class_25272 == Class_25272.Field_25286) {
            return this.Method_28352();
        }
        if (class_25272 == Class_25272.Field_25299) {
            return this.Method_28350();
        }
        if (class_25272 == Class_25272.Field_25280) {
            return this.Method_28364();
        }
        return super.Method_27249(class_25272);
    }

    public Class_23921 Method_28348(int n) {
        try {
            this.Field_28331.setTrafficClass(n);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_19087 Method_28349(boolean bl) {
        return this.Method_28344(bl);
    }

    public int Method_28350() {
        try {
            return this.Field_28331.getTrafficClass();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public boolean Method_28351() {
        try {
            return this.Field_28331.getTcpNoDelay();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public int Method_28352() {
        try {
            return this.Field_28331.getSoLinger();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_23921 Method_28353(int n) {
        super.Method_27233(n);
        return this;
    }

    public Class_19087 Method_28354(int n) {
        return this.Method_28338(n);
    }

    public Class_19087 Method_28355(Class_25565 class_25565) {
        return this.Method_28337(class_25565);
    }

    public Class_19087 Method_28356(Class_18899 class_18899) {
        return this.Method_28370(class_18899);
    }

    public Class_23921 Method_28357(boolean bl) {
        super.Method_27240(bl);
        return this;
    }

    public Class_23921 Method_28358(boolean bl) {
        this.Field_28330 = bl;
        return this;
    }

    public Class_23921 Method_28359(int n) {
        try {
            if (n < 0) {
                this.Field_28331.setSoLinger((9248 & -26027) != 0, 16 & 358);
            } else {
                this.Field_28331.setSoLinger((26121 & 2083) != 0, n);
            }
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_19087 Method_28360(Class_22837 class_22837) {
        return this.Method_28341(class_22837);
    }

    public Class_19087 Method_28361(int n) {
        return this.Method_28365(n);
    }

    public int Method_28362() {
        try {
            return this.Field_28331.getSendBufferSize();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_23921 Method_28363(int n) {
        super.Method_27232(n);
        return this;
    }

    public boolean Method_28364() {
        return this.Field_28330;
    }

    public Class_23921 Method_28365(int n) {
        super.Method_27239(n);
        return this;
    }

    public Class_28329(Class_43291 class_43291, Socket socket) {
        super(class_43291);
        if (socket == null) {
            throw new NullPointerException("javaSocket");
        }
        this.Field_28331 = socket;
        if (Class_7799.Method_7839()) {
            try {
                this.Method_28334((10387 & 17705) != 0);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public Class_23921 Method_28366(int n) {
        try {
            this.Field_28331.setReceiveBufferSize(n);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public Class_23921 Method_28367(boolean bl) {
        try {
            this.Field_28331.setKeepAlive(bl);
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
        return this;
    }

    public boolean Method_28368() {
        try {
            return this.Field_28331.getReuseAddress();
        }
        catch (SocketException socketException) {
            throw new Class_31422(socketException);
        }
    }

    public Class_19087 Method_28369(boolean bl) {
        return this.Method_28357(bl);
    }

    public Class_23921 Method_28370(Class_18899 class_18899) {
        super.Method_27244(class_18899);
        return this;
    }
}

