/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_18649
implements Class_12166 {
    private Class_17665 Field_18650;
    private Class_12166 Field_18651;
    private Set Field_18652 = Collections.newSetFromMap(new ConcurrentHashMap());
    public Class_15769 Field_18653;
    private Class_2651 Field_18654;
    private static final Logger Field_18655 = LogManager.getLogger();
    public boolean Field_18656 = 22661 & -32767;
    private Class_14376 Field_18657 = new Class_14376();
    private List Field_18658 = Lists.newArrayList();

    public void Method_18659() {
        if (this.Field_18653 != null) {
            this.Field_18653.Method_15771();
        }
    }

    public void Method_18660(Class_12166 class_12166, int n, int n2) {
        Class_17665 class_17665 = this.Method_18671(n, n2);
        if (!class_17665.Method_17770()) {
            class_17665.Method_17733();
            if (this.Field_18651 != null) {
                this.Field_18651.Method_12176(class_12166, n, n2);
                class_17665.Method_17776();
            }
        }
    }

    public boolean Method_18661(int n, int n2) {
        return this.Field_18657.Method_14394(Class_29480.Method_29490(n, n2));
    }

    public Class_18649(Class_2651 class_2651, Class_15769 class_15769, Class_12166 class_12166) {
        this.Field_18650 = new Class_44969(class_2651, 25920 & -32252, -16252 & 6147);
        this.Field_18654 = class_2651;
        this.Field_18653 = class_15769;
        this.Field_18651 = class_12166;
    }

    public Class_17665 Method_18662(Class_4751 class_4751) {
        return this.Method_18671(class_4751.\u0000= final() >> (2117 & 9132), class_4751.\u0000strictfp() >> (-11244 & 36));
    }

    public boolean Method_18663(Class_12166 class_12166, Class_17665 class_17665, int n, int n2) {
        if (this.Field_18651 != null && this.Field_18651.Method_12167(class_12166, class_17665, n, n2)) {
            Class_17665 class_176652 = this.Method_18671(n, n2);
            class_176652.Method_17776();
            return (517 & -4071) != 0;
        }
        return (3074 & 4352) != 0;
    }

    public void Method_18664(Class_17665 class_17665, int n, int n2) {
    }

    public List Method_18665(Class_13693 class_13693, Class_4751 class_4751) {
        return this.Field_18651.Method_12178(class_13693, class_4751);
    }

    public Class_17665 Method_18666(int n, int n2) {
        long l = Class_29480.Method_29490(n, n2);
        this.Field_18652.remove(l);
        Class_17665 class_17665 = (Class_17665)this.Field_18657.Method_14384(l);
        if (class_17665 == null) {
            class_17665 = this.Method_18668(n, n2);
            if (class_17665 == null) {
                if (this.Field_18651 == null) {
                    class_17665 = this.Field_18650;
                } else {
                    try {
                        class_17665 = this.Field_18651.Method_12174(n, n2);
                    }
                    catch (Throwable throwable) {
                        Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Exception generating new chunk");
                        Class_13220 class_13220 = class_13268.Method_13280("Chunk to be generated");
                        Object[] arrobject = new Object[-12158 & 8259];
                        arrobject[14353 & 42] = n;
                        arrobject[4149 & 16449] = n2;
                        class_13220.Method_13231("Location", String.format("%d,%d", arrobject));
                        class_13220.Method_13231("Position hash", l);
                        class_13220.Method_13231("Generator", this.Field_18651.Method_12177());
                        throw new Class_1809(class_13268);
                    }
                }
            }
            this.Field_18657.Method_14393(l, class_17665);
            this.Field_18658.add(class_17665);
            class_17665.Method_17735();
            class_17665.Method_17701(this, this, n, n2);
        }
        return class_17665;
    }

    public boolean Method_18667() {
        if (!this.Field_18654.Field_2669) {
            for (int i = -27886 & 2185; i < (16997 & 100); ++i) {
                if (this.Field_18652.isEmpty()) continue;
                Long l = (Long)this.Field_18652.iterator().next();
                Class_17665 class_17665 = (Class_17665)this.Field_18657.Method_14384(l);
                if (class_17665 != null) {
                    class_17665.Method_17716();
                    this.Method_18675(class_17665);
                    this.Method_18670(class_17665);
                    this.Field_18657.Method_14387(l);
                    this.Field_18658.remove(class_17665);
                }
                this.Field_18652.remove(l);
            }
            if (this.Field_18653 != null) {
                this.Field_18653.Method_15774();
            }
        }
        return this.Field_18651.Method_12170();
    }

    private Class_17665 Method_18668(int n, int n2) {
        if (this.Field_18653 == null) {
            return null;
        }
        try {
            Class_17665 class_17665 = this.Field_18653.Method_15773(this.Field_18654, n, n2);
            if (class_17665 != null) {
                class_17665.Method_17777(this.Field_18654.\u0000, `());
                if (this.Field_18651 != null) {
                    this.Field_18651.Method_12180(class_17665, n, n2);
                }
            }
            return class_17665;
        }
        catch (Exception exception) {
            Field_18655.error("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    public String Method_18669() {
        return "ServerChunkCache: " + this.Field_18657.Method_14395() + " Drop: " + this.Field_18652.size();
    }

    private void Method_18670(Class_17665 class_17665) {
        if (this.Field_18653 != null) {
            try {
                this.Field_18653.Method_15772(this.Field_18654, class_17665);
            }
            catch (Exception exception) {
                Field_18655.error("Couldn't save entities", (Throwable)exception);
            }
        }
    }

    public Class_17665 Method_18671(int n, int n2) {
        Class_17665 class_17665 = (Class_17665)this.Field_18657.Method_14384(Class_29480.Method_29490(n, n2));
        return class_17665 == null ? (!this.Field_18654.\u0000= final() && !this.Field_18656 ? this.Field_18650 : this.Method_18666(n, n2)) : class_17665;
    }

    public List Method_18672() {
        return this.Field_18658;
    }

    public void Method_18673() {
        for (Class_17665 class_17665 : this.Field_18658) {
            this.Method_18676(class_17665.Field_17666, class_17665.Field_17668);
        }
    }

    public Class_4751 Method_18674(Class_283 class_283, String string, Class_4751 class_4751) {
        return this.Field_18651.Method_12179(class_283, string, class_4751);
    }

    private void Method_18675(Class_17665 class_17665) {
        if (this.Field_18653 != null) {
            try {
                class_17665.Method_17777(this.Field_18654.\u0000, `());
                this.Field_18653.Method_15770(this.Field_18654, class_17665);
            }
            catch (IOException iOException) {
                Field_18655.error("Couldn't save chunk", (Throwable)iOException);
            }
            catch (Class_2746 class_2746) {
                Field_18655.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)class_2746);
            }
        }
    }

    public void Method_18676(int n, int n2) {
        if (this.Field_18654.\u0000strictfp.Method_18362()) {
            if (!this.Field_18654.\u0000strictfp(n, n2)) {
                this.Field_18652.add(Class_29480.Method_29490(n, n2));
            }
        } else {
            this.Field_18652.add(Class_29480.Method_29490(n, n2));
        }
    }

    public boolean Method_18677() {
        return (!this.Field_18654.Field_2669 ? 6419 & -7639 : -22518 & 4) != 0;
    }

    private void Method_18678() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_18679() {
        return this.Field_18657.Method_14395();
    }

    public boolean Method_18680(boolean bl, Class_2748 class_2748) {
        int n = 4224 & 2059;
        ArrayList arrayList = Lists.newArrayList((Iterable)this.Field_18658);
        for (int i = 18480 & 4096; i < arrayList.size(); ++i) {
            Class_17665 class_17665 = (Class_17665)arrayList.get(i);
            if (bl) {
                this.Method_18670(class_17665);
            }
            if (!class_17665.Method_17750(bl)) continue;
            this.Method_18675(class_17665);
            class_17665.Method_17759((3332 & 225) != 0);
            if (++n != (10296 & -14819) || bl) continue;
            return (2376 & 1040) != 0;
        }
        return (4099 & -32743) != 0;
    }
}

