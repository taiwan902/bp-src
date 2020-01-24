/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_36704
implements Class_2045 {
    private final Class_39702 Field_36705;
    private Class_36433 Field_36706;
    private final Class_13292 Field_36707 = new Class_13292();
    private final Class_36539 Field_36708 = new Class_36539();
    private final Class_39344 Field_36709 = new Class_39344();
    public static Class_4810[] Field_36710 = Class_14121.Method_14160();

    public void Method_36711(Class_279 class_279) {
        this.Field_36707.Method_13299();
    }

    public Class_31211 Method_36712(Class_3436 class_3436, Class_561 class_561, Class_4751 class_4751) {
        Class_3238 class_3238 = class_3436.Method_3442();
        if (class_561.Method_563() != Class_43755.Field_43756) {
            try {
                class_3436 = class_3238.Method_3333(class_3436, class_561, class_4751);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        Class_31211 class_31211 = this.Field_36706.Method_36444(class_3436);
        if (class_4751 != null && this.Field_36705.Field_39733 && class_31211 instanceof Class_31198) {
            class_31211 = ((Class_31198)class_31211).Method_31210(Class_13337.Method_13384(class_4751));
        }
        return class_31211;
    }

    public Class_36539 Method_36713() {
        return this.Field_36708;
    }

    public void Method_36714(Class_3436 class_3436, Class_4751 class_4751, Class_11372 class_11372, Class_561 class_561) {
        Class_3677 class_3677 = (Class_3677)class_3436;
        Class_3238 class_3238 = class_3677.Method_3688();
        int n = class_3238.Method_3316();
        if (n == (-12245 & 595)) {
            class_3677 = (Class_3677)class_3238.Method_3333(class_3677, class_561, class_4751);
            Class_31211 class_31211 = this.Field_36706.Method_36444(class_3677);
            Class_31211 class_312112 = new Class_12350(class_31211, class_11372).Method_12361();
            this.Field_36708.Method_36542(class_561, class_312112, class_3677, class_4751, Class_7644.Method_7649().Method_7648(), Field_36710);
        }
    }

    public void Method_36715(Class_3436 class_3436, float f) {
        int n = class_3436.Method_3442().Method_3316();
        if (n != (-1 & -1)) {
            switch (n) {
                default: {
                    break;
                }
                case 2: {
                    this.Field_36709.Method_39345(class_3436.Method_3442(), f);
                    break;
                }
                case 3: {
                    Class_31211 class_31211 = this.Method_36718(class_3436, null);
                    this.Field_36708.Method_36555(class_31211, class_3436, f, (11489 & 3) != 0);
                }
            }
        }
    }

    public Class_36433 Method_36716() {
        return this.Field_36706;
    }

    public Class_36704(Class_36433 class_36433, Class_39702 class_39702) {
        this.Field_36706 = class_36433;
        this.Field_36705 = class_39702;
    }

    public boolean Method_36717(Class_3238 class_3238, int n) {
        if (class_3238 == null) {
            return (24 & 0) != 0;
        }
        int n2 = class_3238.Method_3316();
        return (n2 == (631 & 4355) ? -28615 & 18438 : (n2 == (6151 & 24578) ? 2053 & 8289 : 8984 & -9209)) != 0;
    }

    private Class_31211 Method_36718(Class_3436 class_3436, Class_4751 class_4751) {
        Class_31211 class_31211 = this.Field_36706.Method_36444(class_3436);
        if (class_4751 != null && this.Field_36705.Field_39733 && class_31211 instanceof Class_31198) {
            class_31211 = ((Class_31198)class_31211).Method_31210(Class_13337.Method_13384(class_4751));
        }
        return class_31211;
    }

    private void Method_36719() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_36720(Class_3436 class_3436, Class_4751 class_4751, Class_561 class_561, Class_22385 class_22385, Class_4810[] arrclass_4810) {
        Class_3677 class_3677 = (Class_3677)class_3436;
        try {
            int n = class_3677.Method_3688().Method_3316();
            if (n == (-1 & -1)) {
                return (16896 & -30672) != 0;
            }
            switch (n) {
                case 1: {
                    if (Class_19426.Method_19570()) {
                        Class_34286.Method_34306(class_3677, class_4751, class_561, class_22385);
                    }
                    boolean bl = this.Field_36707.Method_13300(class_561, class_3677, class_4751, class_22385);
                    if (Class_19426.Method_19570()) {
                        Class_34286.Method_34296(class_22385);
                    }
                    return bl;
                }
                case 2: {
                    return (-29420 & 28768) != 0;
                }
                case 3: {
                    Class_31211 class_31211 = this.Method_36712(class_3677, class_561, class_4751);
                    if (Class_19426.Method_19570()) {
                        Class_34286.Method_34306(class_3677, class_4751, class_561, class_22385);
                    }
                    boolean bl = this.Field_36708.Method_36542(class_561, class_31211, class_3677, class_4751, class_22385, arrclass_4810);
                    if (Class_19426.Method_19570()) {
                        Class_34286.Method_34296(class_22385);
                    }
                    return bl;
                }
            }
            return (-32764 & 4129) != 0;
        }
        catch (Throwable throwable) {
            Class_13268 class_13268 = Class_13268.Method_13285(throwable, "Tesselating block in world");
            Class_13220 class_13220 = class_13268.Method_13280("Block being tesselated");
            Class_13220.Method_13235(class_13220, class_4751, class_3677.Method_3688(), class_3677.Method_3688().Method_3434(class_3677));
            throw new Class_1809(class_13268);
        }
    }
}

