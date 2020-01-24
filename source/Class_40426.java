/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayDeque;
import java.util.Queue;

public class Class_40426
extends Class_40196 {
    private Class_39158 Field_40427;
    private final Queue Field_40428 = new ArrayDeque();
    private static final Class_6113 Field_40429 = Class_10201.Method_10203(Class_40426.class);
    private Class_12364 Field_40430;

    public void Method_40431(Class_39158 class_39158) {
        this.Method_40436(class_39158);
        super.channelInactive(class_39158);
    }

    public void Method_40432(Class_39158 class_39158) {
        this.Field_40427 = class_39158;
    }

    private void Method_40433(Throwable throwable) {
        do {
            Class_12364 class_12364 = this.Field_40430;
            if (this.Field_40430 == null) {
                class_12364 = (Class_12364)this.Field_40428.poll();
            } else {
                this.Field_40430 = null;
            }
            if (class_12364 == null) break;
            Object object = class_12364.Field_12367;
            if (object instanceof Class_27921) {
                Class_27921 class_27921 = (Class_27921)object;
                try {
                    if (!class_27921.Method_27924()) {
                        if (throwable == null) {
                            throwable = new ClosedChannelException();
                        }
                        class_12364.Method_12368(throwable);
                    } else {
                        class_12364.Method_12370();
                    }
                    Class_40426.Method_40440(class_27921);
                }
                catch (Exception exception) {
                    class_12364.Method_12368(exception);
                    Field_40429.Method_6127(Class_27921.class.getSimpleName() + ".isEndOfInput() failed", exception);
                    Class_40426.Method_40440(class_27921);
                }
                continue;
            }
            if (throwable == null) {
                throwable = new ClosedChannelException();
            }
            class_12364.Method_12368(throwable);
        } while (true);
    }

    private void Method_40434() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_40435(Class_39158 class_39158) {
        Class_26095 class_26095 = class_39158.Method_39175();
        if (class_26095.Method_26104() || !class_26095.Method_26107()) {
            this.Method_40436(class_39158);
        }
    }

    private void Method_40436(Class_39158 class_39158) {
        Class_26095 class_26095 = class_39158.Method_39175();
        if (!class_26095.Method_26107()) {
            this.Method_40433(null);
            return;
        }
        while (class_26095.Method_26104()) {
            if (this.Field_40430 == null) {
                this.Field_40430 = (Class_12364)this.Field_40428.poll();
            }
            if (this.Field_40430 == null) break;
            Class_12364 class_12364 = this.Field_40430;
            Object object = class_12364.Field_12367;
            if (object instanceof Class_27921) {
                boolean bl;
                int n;
                Class_27921 class_27921 = (Class_27921)object;
                Object object2 = null;
                try {
                    object2 = class_27921.Method_27923(class_39158);
                    bl = class_27921.Method_27924();
                    n = object2 == null ? (!bl ? -7805 & 5217 : 10049 & 4096) : -32607 & 272;
                }
                catch (Throwable throwable) {
                    this.Field_40430 = null;
                    if (object2 != null) {
                        Class_24761.Method_24765(object2);
                    }
                    class_12364.Method_12368(throwable);
                    Class_40426.Method_40440(class_27921);
                    break;
                }
                if (n != 0) break;
                if (object2 == null) {
                    object2 = Class_16620.Field_16622;
                }
                int n2 = Class_40426.Method_40443(object2);
                Class_27581 class_27581 = class_39158.Method_39182(object2);
                if (bl) {
                    this.Field_40430 = null;
                    class_27581.Method_27583(new Class_44108(this, class_12364, n2, class_27921));
                } else if (class_26095.Method_26104()) {
                    class_27581.Method_27583(new Class_26638(this, object, class_12364, n2));
                } else {
                    class_27581.Method_27583(new Class_43228(this, object, class_12364, n2, class_26095));
                }
            } else {
                class_39158.Method_39163(object, class_12364.Field_12366);
                this.Field_40430 = null;
            }
            class_39158.Method_39168();
            if (class_26095.Method_26107()) continue;
            this.Method_40433(new ClosedChannelException());
            return;
        }
    }

    public void Method_40437(Class_39158 class_39158) {
        if (class_39158.Method_39175().Method_26104()) {
            this.Method_40436(class_39158);
        }
        class_39158.Method_39159();
    }

    static void Method_40438(Class_40426 class_40426, Class_39158 class_39158) {
        class_40426.Method_40436(class_39158);
    }

    public void Method_40439(Class_39158 class_39158, Object object, Class_37748 class_37748) {
        this.Field_40428.add(new Class_12364(object, class_37748));
    }

    static void Method_40440(Class_27921 class_27921) {
        block2 : {
            try {
                class_27921.Method_27922();
            }
            catch (Throwable throwable) {
                if (!Field_40429.Method_6119()) break block2;
                Field_40429.Method_6127("Failed to close a chunked input.", throwable);
            }
        }
    }

    public void Method_40441() {
        Class_39158 class_39158 = this.Field_40427;
        if (class_39158 == null) {
            return;
        }
        if (class_39158.Method_39160().Method_37084()) {
            try {
                this.Method_40436(class_39158);
            }
            catch (Exception exception) {
                if (Field_40429.Method_6119()) {
                    Field_40429.Method_6127("Unexpected exception while sending chunks.", exception);
                }
            }
        } else {
            class_39158.Method_39160().execute(new Class_19767(this, class_39158));
        }
    }

    static Class_6113 Method_40442() {
        return Field_40429;
    }

    private static int Method_40443(Object object) {
        if (object instanceof Class_22553) {
            return ((Class_22553)object).Method_22564();
        }
        if (object instanceof Class_23010) {
            return ((Class_23010)object).Method_23012().Method_22564();
        }
        return 25251 & 329;
    }
}

