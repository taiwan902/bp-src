/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_14376 {
    private transient int Field_14377;
    private int Field_14378 = this.Field_14379.length - (-28667 & 8417);
    private transient Class_9254[] Field_14379 = new Class_9254[4129 & 4240];
    private final float Field_14380 = 0.203125f * 3.6923077f;
    private int Field_14381 = -29663 & 19864;
    private transient int Field_14382;

    final Class_9254 Method_14383(long l) {
        int n = Class_14376.Method_14392(l);
        Class_9254 class_9254 = this.Field_14379[Class_14376.Method_14390(n, this.Field_14378)];
        while (class_9254 != null) {
            if (class_9254.Field_9255 == l) {
                return class_9254;
            }
            class_9254 = class_9254.Field_9257;
        }
        return null;
    }

    public Object Method_14384(long l) {
        int n = Class_14376.Method_14392(l);
        Class_9254 class_9254 = this.Field_14379[Class_14376.Method_14390(n, this.Field_14378)];
        while (class_9254 != null) {
            if (class_9254.Field_9255 == l) {
                return class_9254.Field_9258;
            }
            class_9254 = class_9254.Field_9257;
        }
        return null;
    }

    private void Method_14385(Class_9254[] arrclass_9254) {
        Class_9254[] arrclass_92542 = this.Field_14379;
        int n = arrclass_9254.length;
        for (int i = 5156 & 24834; i < arrclass_92542.length; ++i) {
            Class_9254 class_9254;
            Class_9254 class_92542 = arrclass_92542[i];
            if (class_92542 == null) continue;
            arrclass_92542[i] = null;
            do {
                class_9254 = class_92542.Field_9257;
                int n2 = Class_14376.Method_14390(class_92542.Field_9256, n - (2849 & 28677));
                class_92542.Field_9257 = arrclass_9254[n2];
                arrclass_9254[n2] = class_92542;
                class_92542 = class_9254;
            } while (class_9254 != null);
        }
    }

    private void Method_14386() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Object Method_14387(long l) {
        Class_9254 class_9254 = this.Method_14389(l);
        return class_9254 == null ? null : class_9254.Field_9258;
    }

    private void Method_14388(int n, long l, Object object, int n2) {
        Class_9254 class_9254 = this.Field_14379[n2];
        this.Field_14379[n2] = new Class_9254(n, l, object, class_9254);
        int n3 = this.Field_14382;
        this.Field_14382 = n3 + (25673 & 4643);
        if (n3 >= this.Field_14381) {
            this.Method_14391((-16366 & 2599) * this.Field_14379.length);
        }
    }

    final Class_9254 Method_14389(long l) {
        Class_9254 class_9254;
        int n = Class_14376.Method_14392(l);
        int n2 = Class_14376.Method_14390(n, this.Field_14378);
        Class_9254 class_92542 = class_9254 = this.Field_14379[n2];
        while (class_92542 != null) {
            Class_9254 class_92543 = class_92542.Field_9257;
            if (class_92542.Field_9255 == l) {
                this.Field_14377 += -3867 & 9;
                this.Field_14382 -= 20561 & -23899;
                if (class_9254 == class_92542) {
                    this.Field_14379[n2] = class_92543;
                } else {
                    class_9254.Field_9257 = class_92543;
                }
                return class_92542;
            }
            class_9254 = class_92542;
            class_92542 = class_92543;
        }
        return class_92542;
    }

    private static int Method_14390(int n, int n2) {
        return n & n2;
    }

    private void Method_14391(int n) {
        Class_9254[] arrclass_9254 = this.Field_14379;
        int n2 = arrclass_9254.length;
        if (n2 == (-968751039 & 1101012992)) {
            this.Field_14381 = Integer.MAX_VALUE & Integer.MAX_VALUE;
        } else {
            Class_9254[] arrclass_92542 = new Class_9254[n];
            this.Method_14385(arrclass_92542);
            this.Field_14379 = arrclass_92542;
            this.Field_14378 = this.Field_14379.length - (35 & 32133);
            float f = n;
            this.getClass();
            this.Field_14381 = (int)(f * (0.7947761f * 0.943662f));
        }
    }

    private static int Method_14392(long l) {
        return (int)(l ^ l >>> (27 & 20763));
    }

    public void Method_14393(long l, Object object) {
        int n = Class_14376.Method_14392(l);
        int n2 = Class_14376.Method_14390(n, this.Field_14378);
        Class_9254 class_9254 = this.Field_14379[n2];
        while (class_9254 != null) {
            if (class_9254.Field_9255 == l) {
                class_9254.Field_9258 = object;
                return;
            }
            class_9254 = class_9254.Field_9257;
        }
        this.Field_14377 += 16553 & 9217;
        this.Method_14388(n, l, object, n2);
    }

    public boolean Method_14394(long l) {
        return (this.Method_14383(l) != null ? 16713 & -20299 : 24641 & 16) != 0;
    }

    public int Method_14395() {
        return this.Field_14382;
    }

    static int Method_14396(long l) {
        return Class_14376.Method_14392(l);
    }
}

