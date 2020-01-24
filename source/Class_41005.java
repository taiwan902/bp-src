/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetConnectedException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Class_41005
extends Class_31282 {
    private int Field_41006;
    private Class_37748 Field_41007;
    private final Runnable Field_41008 = new Class_10905(this);
    private Class_24415 Field_41009;
    private Class_24415 Field_41010;
    private Class_41005 Field_41011;
    private final Class_19087 Field_41012 = new Class_27218(this);
    private boolean Field_41013;
    private final Runnable Field_41014 = new Class_7745(this);
    private static final Class_10290 Field_41015 = new Class_10290((98 & 14353) != 0);
    private final Queue Field_41016 = new ArrayDeque();
    private boolean Field_41017;

    private static void Method_41018(Class_41005 class_41005, Class_6274 class_6274) {
        if (class_41005.Field_41013) {
            Object e;
            class_41005.Field_41013 = 4144 & 8653;
            while ((e = class_41005.Field_41016.poll()) != null) {
                class_6274.Method_6277(e);
            }
            class_6274.Method_6283();
        }
    }

    static boolean Method_41019(Class_41005 class_41005, boolean bl) {
        class_41005.Field_41017 = bl;
        return class_41005.Field_41017;
    }

    static Class_37748 Method_41020(Class_41005 class_41005, Class_37748 class_37748) {
        class_41005.Field_41007 = class_37748;
        return class_41005.Field_41007;
    }

    protected void Method_41021() {
        if (this.Field_41011 != null && this.Method_41044() != null) {
            Class_41005 class_41005 = this.Field_41011;
            this.Field_41017 = 12369 & -14301;
            this.Field_41006 = 642 & 20759;
            class_41005.Field_41009 = this.Method_41044().Method_38146();
            class_41005.Field_41006 = 16514 & 8706;
            class_41005.eventLoop().execute(new Class_26292(this, class_41005));
        }
        ((Class_46518)((Object)this.eventLoop())).Method_46545(this.Field_41014);
    }

    public Class_24415 Method_41022() {
        return (Class_24415)super.Method_31327();
    }

    protected void Method_41023() {
        Class_41005 class_41005;
        if (this.Field_41006 <= (16842 & 8707)) {
            if (this.Field_41010 != null) {
                if (this.Method_41044() == null) {
                    Class_17965.Method_17967(this.Field_41010);
                }
                this.Field_41010 = null;
            }
            this.Field_41006 = 91 & 25635;
        }
        if ((class_41005 = this.Field_41011) != null && class_41005.Method_41046()) {
            Class_38541 class_38541 = class_41005.eventLoop();
            if (class_38541.inEventLoop() && !this.Field_41017) {
                class_41005.unsafe().Method_7320(this.unsafe().Method_7319());
            } else {
                class_41005.eventLoop().execute(new Class_21739(this, class_41005));
            }
            this.Field_41011 = null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_41024() {
        if (this.Field_41013) {
            return;
        }
        Class_6274 class_6274 = this.pipeline();
        Queue queue = this.Field_41016;
        if (queue.isEmpty()) {
            this.Field_41013 = -10747 & 8449;
            return;
        }
        Class_32728 class_32728 = Class_32728.Method_32743();
        Integer n = class_32728.Method_32741();
        if (n < (18121 & 14600)) {
            class_32728.Method_32735(n + (8193 & -28543));
            try {
                Object e;
                while ((e = queue.poll()) != null) {
                    class_6274.Method_6277(e);
                }
                class_6274.Method_6283();
            }
            finally {
                class_32728.Method_32735(n);
            }
        } else {
            this.eventLoop().execute(this.Field_41008);
        }
    }

    static Class_37748 Method_41025(Class_41005 class_41005) {
        return class_41005.Field_41007;
    }

    static int Method_41026(Class_41005 class_41005) {
        return class_41005.Field_41006;
    }

    public Class_41005() {
        super(null);
    }

    public Class_24415 Method_41027() {
        return (Class_24415)super.Method_31338();
    }

    protected void Method_41028(Class_18249 class_18249) {
        if (this.Field_41006 < (2306 & 171)) {
            throw new NotYetConnectedException();
        }
        if (this.Field_41006 > (17042 & 302)) {
            throw new ClosedChannelException();
        }
        Class_41005 class_41005 = this.Field_41011;
        Class_6274 class_6274 = class_41005.pipeline();
        Class_38541 class_38541 = class_41005.eventLoop();
        if (class_38541 == this.eventLoop()) {
            Object object;
            while ((object = class_18249.Method_18273()) != null) {
                class_41005.Field_41016.add(object);
                Class_24761.Method_24764(object);
                class_18249.Method_18293();
            }
            Class_41005.Method_41018(class_41005, class_6274);
        } else {
            Object[] arrobject = new Object[class_18249.Method_18269()];
            for (int i = 272 & 1; i < arrobject.length; ++i) {
                arrobject[i] = Class_24761.Method_24764(class_18249.Method_18273());
                class_18249.Method_18293();
            }
            class_38541.execute(new Class_17478(this, class_41005, arrobject, class_6274));
        }
    }

    public Class_10290 Method_41029() {
        return Field_41015;
    }

    public Class_19087 Method_41030() {
        return this.Field_41012;
    }

    public SocketAddress Method_41031() {
        return this.Method_41022();
    }

    protected boolean Method_41032(Class_38541 class_38541) {
        return class_38541 instanceof Class_47259;
    }

    protected SocketAddress Method_41033() {
        return this.Field_41009;
    }

    public boolean Method_41034() {
        return (this.Field_41006 < (17687 & 2243) ? 25961 & -32763 : -4084 & 1936) != 0;
    }

    protected SocketAddress Method_41035() {
        return this.Field_41010;
    }

    static void Method_41036(Class_41005 class_41005, Class_6274 class_6274) {
        Class_41005.Method_41018(class_41005, class_6274);
    }

    protected void Method_41037() {
        ((Class_46518)((Object)this.eventLoop())).Method_46555(this.Field_41014);
    }

    protected void Method_41038() {
        this.Method_41023();
    }

    protected void Method_41039(SocketAddress socketAddress) {
        this.Field_41010 = Class_17965.Method_17970(this, this.Field_41010, socketAddress);
        this.Field_41006 = -30719 & 20915;
    }

    public SocketAddress Method_41040() {
        return this.Method_41027();
    }

    public Class_26095 Method_41041() {
        return this.Method_41044();
    }

    private void Method_41042() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    static Class_41005 Method_41043(Class_41005 class_41005, Class_41005 class_410052) {
        class_41005.Field_41011 = class_410052;
        return class_41005.Field_41011;
    }

    public Class_38138 Method_41044() {
        return (Class_38138)super.Method_31329();
    }

    protected Class_44175 Method_41045() {
        return new Class_46417(this, null);
    }

    Class_41005(Class_38138 class_38138, Class_41005 class_41005) {
        super(class_38138);
        this.Field_41011 = class_41005;
        this.Field_41010 = class_38138.Method_38146();
        this.Field_41009 = class_41005.Method_41022();
    }

    public boolean Method_41046() {
        return (this.Field_41006 == (8206 & 642) ? 7681 & -16309 : -32752 & 8393) != 0;
    }

    static Queue Method_41047(Class_41005 class_41005) {
        return class_41005.Field_41016;
    }
}

