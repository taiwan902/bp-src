/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Set;

public class Class_27218
implements Class_19087 {
    private Class_25565 Field_27219 = Field_27227;
    private boolean Field_27220 = 16897 & 6233;
    private int Field_27221 = -32720 & 12817;
    protected final Class_26095 Field_27222;
    private int Field_27223 = 32052 & -2768;
    private static final Class_18899 Field_27224 = Class_28165.Field_28167;
    private boolean Field_27225 = 1 & -30711;
    private int Field_27226 = 285451297 & 1241600010;
    private static final Class_25565 Field_27227 = Class_26478.Field_26479;
    private Class_22837 Field_27228 = Class_22837.Field_22838;
    private int Field_27229;
    private int Field_27230 = -2146336640 & 1368162329;
    private Class_18899 Field_27231 = Field_27224;

    public Class_19087 Method_27232(int n) {
        if (n > this.Method_27254()) {
            throw new IllegalArgumentException("writeBufferLowWaterMark cannot be greater than writeBufferHighWaterMark (" + this.Method_27254() + "): " + n);
        }
        if (n < 0) {
            throw new IllegalArgumentException("writeBufferLowWaterMark must be >= 0");
        }
        this.Field_27230 = n;
        return this;
    }

    public Class_19087 Method_27233(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("maxMessagesPerRead: " + n + " (expected: > 0)");
        }
        this.Field_27229 = n;
        return this;
    }

    public int Method_27234() {
        return this.Field_27230;
    }

    public Class_19087 Method_27235(Class_25565 class_25565) {
        if (class_25565 == null) {
            throw new NullPointerException("estimator");
        }
        this.Field_27219 = class_25565;
        return this;
    }

    public int Method_27236() {
        return this.Field_27229;
    }

    public Class_18899 Method_27237() {
        return this.Field_27231;
    }

    public Class_25565 Method_27238() {
        return this.Field_27219;
    }

    public Class_19087 Method_27239(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("writeSpinCount must be a positive integer.");
        }
        this.Field_27221 = n;
        return this;
    }

    public Class_19087 Method_27240(boolean bl) {
        this.Field_27220 = bl;
        return this;
    }

    public boolean Method_27241(Map map) {
        if (map == null) {
            throw new NullPointerException("options");
        }
        int n = 581 & 13577;
        for (Map.Entry entry : map.entrySet()) {
            if (this.Method_27247((Class_25272)entry.getKey(), entry.getValue())) continue;
            n = 17092 & 8211;
        }
        return n != 0;
    }

    protected void Method_27242(Class_25272 class_25272, Object object) {
        if (class_25272 == null) {
            throw new NullPointerException("option");
        }
        class_25272.Method_25322(object);
    }

    public Class_19087 Method_27243(int n) {
        if (n < 0) {
            Object[] arrobject = new Object[489 & -30185];
            arrobject[16484 & -28654] = n;
            throw new IllegalArgumentException(String.format("connectTimeoutMillis: %d (expected: >= 0)", arrobject));
        }
        this.Field_27223 = n;
        return this;
    }

    public Class_19087 Method_27244(Class_18899 class_18899) {
        if (class_18899 == null) {
            throw new NullPointerException("allocator");
        }
        this.Field_27231 = class_18899;
        return this;
    }

    private void Method_27245() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_27246() {
        return this.Field_27223;
    }

    public boolean Method_27247(Class_25272 class_25272, Object object) {
        this.Method_27242(class_25272, object);
        if (class_25272 == Class_25272.Field_25281) {
            this.Method_27243((Integer)object);
        } else if (class_25272 == Class_25272.Field_25283) {
            this.Method_27233((Integer)object);
        } else if (class_25272 == Class_25272.Field_25285) {
            this.Method_27239((Integer)object);
        } else if (class_25272 == Class_25272.Field_25273) {
            this.Method_27251((Class_22837)object);
        } else if (class_25272 == Class_25272.Field_25278) {
            this.Method_27244((Class_18899)object);
        } else if (class_25272 == Class_25272.Field_25300) {
            this.Method_27250((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25291) {
            this.Method_27240((Boolean)object);
        } else if (class_25272 == Class_25272.Field_25279) {
            this.Method_27257((Integer)object);
        } else if (class_25272 == Class_25272.Field_25284) {
            this.Method_27232((Integer)object);
        } else if (class_25272 == Class_25272.Field_25294) {
            this.Method_27235((Class_25565)object);
        } else {
            return (-1915 & 1818) != 0;
        }
        return (57 & 9025) != 0;
    }

    public Class_27218(Class_26095 class_26095) {
        if (class_26095 == null) {
            throw new NullPointerException("channel");
        }
        this.Field_27222 = class_26095;
        this.Field_27229 = class_26095 instanceof Class_28228 || class_26095 instanceof Class_41410 ? 16401 & 4378 : 2153 & 8711;
    }

    public Class_22837 Method_27248() {
        return this.Field_27228;
    }

    public Object Method_27249(Class_25272 class_25272) {
        if (class_25272 == null) {
            throw new NullPointerException("option");
        }
        if (class_25272 == Class_25272.Field_25281) {
            return this.Method_27246();
        }
        if (class_25272 == Class_25272.Field_25283) {
            return this.Method_27236();
        }
        if (class_25272 == Class_25272.Field_25285) {
            return this.Method_27252();
        }
        if (class_25272 == Class_25272.Field_25273) {
            return this.Method_27248();
        }
        if (class_25272 == Class_25272.Field_25278) {
            return this.Method_27237();
        }
        if (class_25272 == Class_25272.Field_25300) {
            return this.Method_27253();
        }
        if (class_25272 == Class_25272.Field_25291) {
            return this.Method_27255();
        }
        if (class_25272 == Class_25272.Field_25279) {
            return this.Method_27254();
        }
        if (class_25272 == Class_25272.Field_25284) {
            return this.Method_27234();
        }
        if (class_25272 == Class_25272.Field_25294) {
            return this.Method_27238();
        }
        return null;
    }

    public Class_19087 Method_27250(boolean bl) {
        boolean bl2 = this.Field_27225;
        this.Field_27225 = bl;
        if (bl && !bl2) {
            this.Field_27222.Method_26109();
        } else if (!bl && bl2) {
            this.Method_27256();
        }
        return this;
    }

    public Class_19087 Method_27251(Class_22837 class_22837) {
        if (class_22837 == null) {
            throw new NullPointerException("allocator");
        }
        this.Field_27228 = class_22837;
        return this;
    }

    public int Method_27252() {
        return this.Field_27221;
    }

    public boolean Method_27253() {
        return this.Field_27225;
    }

    public int Method_27254() {
        return this.Field_27226;
    }

    public boolean Method_27255() {
        return this.Field_27220;
    }

    protected void Method_27256() {
    }

    public Class_19087 Method_27257(int n) {
        if (n < this.Method_27234()) {
            throw new IllegalArgumentException("writeBufferHighWaterMark cannot be less than writeBufferLowWaterMark (" + this.Method_27234() + "): " + n);
        }
        if (n < 0) {
            throw new IllegalArgumentException("writeBufferHighWaterMark must be >= 0");
        }
        this.Field_27226 = n;
        return this;
    }
}

