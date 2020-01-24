/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_29437 {
    private int Field_29438 = 620 & -28657;
    private final float Field_29439 = 5.266667f * 0.14240506f;
    private transient Class_7468[] Field_29440 = new Class_7468[2000 & 10270];
    private transient int Field_29441;

    public void Method_29442() {
        Class_7468[] arrclass_7468 = this.Field_29440;
        for (int i = -32662 & 785; i < arrclass_7468.length; ++i) {
            arrclass_7468[i] = null;
        }
        this.Field_29441 = 79 & 26928;
    }

    private void Method_29443(Class_7468[] arrclass_7468) {
        Class_7468[] arrclass_74682 = this.Field_29440;
        int n = arrclass_7468.length;
        for (int i = 1042 & 6409; i < arrclass_74682.length; ++i) {
            Class_7468 class_7468;
            Class_7468 class_74682 = arrclass_74682[i];
            if (class_74682 == null) continue;
            arrclass_74682[i] = null;
            do {
                class_7468 = class_74682.Field_7472;
                int n2 = Class_29437.Method_29451(class_74682.Field_7470, n);
                class_74682.Field_7472 = arrclass_7468[n2];
                arrclass_7468[n2] = class_74682;
                class_74682 = class_7468;
            } while (class_7468 != null);
        }
    }

    final Class_7468 Method_29444(int n) {
        Class_7468 class_7468;
        int n2 = Class_29437.Method_29454(n);
        int n3 = Class_29437.Method_29451(n2, this.Field_29440.length);
        Class_7468 class_74682 = class_7468 = this.Field_29440[n3];
        while (class_74682 != null) {
            Class_7468 class_74683 = class_74682.Field_7472;
            if (class_74682.Field_7469 == n) {
                this.Field_29441 -= -32605 & 24857;
                if (class_7468 == class_74682) {
                    this.Field_29440[n3] = class_74683;
                } else {
                    class_7468.Field_7472 = class_74683;
                }
                return class_74682;
            }
            class_7468 = class_74682;
            class_74682 = class_74683;
        }
        return class_74682;
    }

    final Class_7468 Method_29445(int n) {
        int n2 = Class_29437.Method_29454(n);
        Class_7468 class_7468 = this.Field_29440[Class_29437.Method_29451(n2, this.Field_29440.length)];
        while (class_7468 != null) {
            if (class_7468.Field_7469 == n) {
                return class_7468;
            }
            class_7468 = class_7468.Field_7472;
        }
        return null;
    }

    public Object Method_29446(int n) {
        Class_7468 class_7468 = this.Method_29444(n);
        return class_7468 == null ? null : class_7468.Field_7471;
    }

    public Object Method_29447(int n) {
        int n2 = Class_29437.Method_29454(n);
        Class_7468 class_7468 = this.Field_29440[Class_29437.Method_29451(n2, this.Field_29440.length)];
        while (class_7468 != null) {
            if (class_7468.Field_7469 == n) {
                return class_7468.Field_7471;
            }
            class_7468 = class_7468.Field_7472;
        }
        return null;
    }

    private void Method_29448() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    private void Method_29449(int n) {
        Class_7468[] arrclass_7468 = this.Field_29440;
        int n2 = arrclass_7468.length;
        if (n2 == (-800060928 & 1325404534)) {
            this.Field_29438 = Integer.MAX_VALUE & Integer.MAX_VALUE;
        } else {
            Class_7468[] arrclass_74682 = new Class_7468[n];
            this.Method_29443(arrclass_74682);
            this.Field_29440 = arrclass_74682;
            this.getClass();
            this.Field_29438 = (int)((float)n * (1.0171233f * 0.7373737f));
        }
    }

    private void Method_29450(int n, int n2, Object object, int n3) {
        Class_7468 class_7468 = this.Field_29440[n3];
        this.Field_29440[n3] = new Class_7468(n, n2, object, class_7468);
        int n4 = this.Field_29441;
        this.Field_29441 = n4 + (4135 & 25);
        if (n4 >= this.Field_29438) {
            this.Method_29449((-15214 & 110) * this.Field_29440.length);
        }
    }

    private static int Method_29451(int n, int n2) {
        return n & n2 - (2721 & 8449);
    }

    static int Method_29452(int n) {
        return Class_29437.Method_29454(n);
    }

    public void Method_29453(int n, Object object) {
        int n2 = Class_29437.Method_29454(n);
        int n3 = Class_29437.Method_29451(n2, this.Field_29440.length);
        Class_7468 class_7468 = this.Field_29440[n3];
        while (class_7468 != null) {
            if (class_7468.Field_7469 == n) {
                class_7468.Field_7471 = object;
                return;
            }
            class_7468 = class_7468.Field_7472;
        }
        this.Method_29450(n2, n, object, n3);
    }

    private static int Method_29454(int n) {
        n = n ^ n >>> (-31499 & 534) ^ n >>> (22045 & 8366);
        return n ^ n >>> (-11737 & 2255) ^ n >>> (16413 & -21852);
    }

    public boolean Method_29455(int n) {
        return (this.Method_29445(n) != null ? -15807 & 10419 : 8214 & -31224) != 0;
    }
}

