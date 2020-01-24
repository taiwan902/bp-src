/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_25240 {
    private int Field_25241;
    private boolean Field_25242;
    private boolean Field_25243;
    private static final Logger Field_25244 = LogManager.getLogger();
    private boolean Field_25245;
    private int Field_25246;
    private boolean Field_25247;
    private int Field_25248;

    public void Method_25249(Class_859 class_859) {
        if (this.Field_25241 > 0) {
            Class_8338.Field_8341[this.Field_25248].Method_8432(class_859, this.Field_25246);
        }
    }

    public boolean Method_25250() {
        return this.Field_25245;
    }

    public int Method_25251() {
        return this.Field_25241;
    }

    private int Method_25252() {
        return this.Field_25241 -= 641 & 20515;
    }

    public int Method_25253() {
        return this.Field_25248;
    }

    private void Method_25254() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_25240(int n, int n2, int n3) {
        this(n, n2, n3, (-13719 & 8324) != 0, (1309 & 8195) != 0);
    }

    public boolean Method_25255(Object object) {
        if (!(object instanceof Class_25240)) {
            return (12288 & 896) != 0;
        }
        Class_25240 class_25240 = (Class_25240)object;
        return (this.Field_25248 == class_25240.Field_25248 && this.Field_25246 == class_25240.Field_25246 && this.Field_25241 == class_25240.Field_25241 && this.Field_25243 == class_25240.Field_25243 && this.Field_25247 == class_25240.Field_25247 ? 8449 & 169 : -15955 & 2642) != 0;
    }

    public Class_25240(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.Field_25248 = n;
        this.Field_25241 = n2;
        this.Field_25246 = n3;
        this.Field_25247 = bl;
        this.Field_25242 = bl2;
    }

    public boolean Method_25256() {
        return this.Field_25242;
    }

    public int Method_25257() {
        return this.Field_25246;
    }

    public void Method_25258(Class_25240 class_25240) {
        if (this.Field_25248 != class_25240.Field_25248) {
            Field_25244.warn("This method should only be called for matching effects!");
        }
        if (class_25240.Field_25246 > this.Field_25246) {
            this.Field_25246 = class_25240.Field_25246;
            this.Field_25241 = class_25240.Field_25241;
        } else if (class_25240.Field_25246 == this.Field_25246 && this.Field_25241 < class_25240.Field_25241) {
            this.Field_25241 = class_25240.Field_25241;
        } else if (!class_25240.Field_25247 && this.Field_25247) {
            this.Field_25247 = class_25240.Field_25247;
        }
        this.Field_25242 = class_25240.Field_25242;
    }

    public Class_1699 Method_25259(Class_1699 class_1699) {
        class_1699.Method_1724("Id", (byte)this.Method_25253());
        class_1699.Method_1724("Amplifier", (byte)this.Method_25257());
        class_1699.Method_1739("Duration", this.Method_25251());
        class_1699.Method_1706("Ambient", this.Method_25265());
        class_1699.Method_1706("ShowParticles", this.Method_25256());
        return class_1699;
    }

    public boolean Method_25260(Class_859 class_859) {
        if (this.Field_25241 > 0) {
            if (Class_8338.Field_8341[this.Field_25248].Method_8454(this.Field_25241, this.Field_25246)) {
                this.Method_25249(class_859);
            }
            this.Method_25252();
        }
        return (this.Field_25241 > 0 ? -30463 & 1587 : 17538 & -32704) != 0;
    }

    public int Method_25261() {
        return this.Field_25248;
    }

    public void Method_25262(boolean bl) {
        this.Field_25245 = bl;
    }

    public Class_25240(int n, int n2) {
        this(n, n2, 12290 & 16897);
    }

    public String Method_25263() {
        String string = "";
        string = this.Method_25257() > 0 ? this.Method_25264() + " x " + (this.Method_25257() + (9 & 8199)) + ", Duration: " + this.Method_25251() : this.Method_25264() + ", Duration: " + this.Method_25251();
        if (this.Field_25243) {
            string = string + ", Splash: true";
        }
        if (!this.Field_25242) {
            string = string + ", Particles: false";
        }
        return Class_8338.Field_8341[this.Field_25248].Method_8410() ? "(" + string + ")" : string;
    }

    public String Method_25264() {
        return Class_8338.Field_8341[this.Field_25248].Method_8411();
    }

    public boolean Method_25265() {
        return this.Field_25247;
    }

    public static Class_25240 Method_25266(Class_1699 class_1699) {
        byte by = class_1699.Method_1716("Id");
        if (by >= 0 && by < Class_8338.Field_8341.length && Class_8338.Field_8341[by] != null) {
            byte by2 = class_1699.Method_1716("Amplifier");
            int n = class_1699.Method_1738("Duration");
            boolean bl = class_1699.Method_1733("Ambient");
            boolean bl2 = 1541 & 20833;
            if (class_1699.Method_1715("ShowParticles", -28919 & 225)) {
                bl2 = (class_1699.Method_1733("ShowParticles") ? 1 : 0) != 0;
            }
            return new Class_25240(by, n, by2, bl, bl2);
        }
        return null;
    }

    public void Method_25267(boolean bl) {
        this.Field_25243 = bl;
    }

    public Class_25240(Class_25240 class_25240) {
        this.Field_25248 = class_25240.Field_25248;
        this.Field_25241 = class_25240.Field_25241;
        this.Field_25246 = class_25240.Field_25246;
        this.Field_25247 = class_25240.Field_25247;
        this.Field_25242 = class_25240.Field_25242;
    }
}

