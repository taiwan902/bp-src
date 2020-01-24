/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.ArrayDeque;
import java.util.Queue;

public class Class_38138
extends Class_36729 {
    private final Queue Field_38139 = new ArrayDeque();
    private final Runnable Field_38140 = new Class_19781(this);
    private Class_24415 Field_38141;
    private final Class_19087 Field_38142 = new Class_27218(this);
    private int Field_38143;
    private boolean Field_38144;

    protected SocketAddress Method_38145() {
        return this.Field_38141;
    }

    public Class_24415 Method_38146() {
        return (Class_24415)super.localAddress();
    }

    protected void Method_38147() {
        if (this.Field_38143 <= (5409 & -32255)) {
            if (this.Field_38141 != null) {
                Class_17965.Method_17967(this.Field_38141);
                this.Field_38141 = null;
            }
            this.Field_38143 = -26502 & 17026;
        }
    }

    protected void Method_38148() {
        Object e;
        if (this.Field_38144) {
            return;
        }
        Queue queue = this.Field_38139;
        if (queue.isEmpty()) {
            this.Field_38144 = -32767 & 20739;
            return;
        }
        Class_6274 class_6274 = this.pipeline();
        while ((e = queue.poll()) != null) {
            class_6274.Method_6277(e);
        }
        class_6274.Method_6283();
    }

    public SocketAddress Method_38149() {
        return this.Method_38146();
    }

    protected void Method_38150() {
        ((Class_46518)((Object)this.eventLoop())).Method_46555(this.Field_38140);
    }

    protected void Method_38151(SocketAddress socketAddress) {
        this.Field_38141 = Class_17965.Method_17970(this, this.Field_38141, socketAddress);
        this.Field_38143 = 1 & 3651;
    }

    protected boolean Method_38152(Class_38541 class_38541) {
        return class_38541 instanceof Class_47259;
    }

    private void Method_38153() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_19087 Method_38154() {
        return this.Field_38142;
    }

    private void Method_38155(Class_41005 class_41005) {
        this.Field_38139.add(class_41005);
        if (this.Field_38144) {
            Object e;
            this.Field_38144 = -32736 & 21065;
            Class_6274 class_6274 = this.pipeline();
            while ((e = this.Field_38139.poll()) != null) {
                class_6274.Method_6277(e);
            }
            class_6274.Method_6283();
        }
    }

    protected void Method_38156() {
        ((Class_46518)((Object)this.eventLoop())).Method_46545(this.Field_38140);
    }

    static void Method_38157(Class_38138 class_38138, Class_41005 class_41005) {
        class_38138.Method_38155(class_41005);
    }

    Class_41005 Method_38158(Class_41005 class_41005) {
        Class_41005 class_410052 = new Class_41005(this, class_41005);
        if (this.eventLoop().inEventLoop()) {
            this.Method_38155(class_410052);
        } else {
            this.eventLoop().execute(new Class_12116(this, class_410052));
        }
        return class_410052;
    }

    public boolean Method_38159() {
        return (this.Field_38143 < (1202 & 16907) ? 1417 & -32217 : -32752 & 5632) != 0;
    }

    public Class_24415 Method_38160() {
        return (Class_24415)super.Method_36737();
    }

    public SocketAddress Method_38161() {
        return this.Method_38160();
    }

    public boolean Method_38162() {
        return (this.Field_38143 == (6593 & -15319) ? 9735 & -28175 : -31680 & 4655) != 0;
    }
}

