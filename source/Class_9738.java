/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 *  com.mojang.authlib.GameProfile
 */
import com.google.common.base.Objects;
import com.mojang.authlib.GameProfile;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.UUID;

public class Class_9738 {
    private int Field_9739 = -30520 & 24583;
    private int Field_9740;
    private final GameProfile Field_9741;
    private Class_35650 Field_9742;
    private boolean Field_9743 = 708 & 6418;
    private Class_2080 Field_9744;
    private long Field_9745 = -8597686758651378042L & 2109520L;
    private String Field_9746;
    private long Field_9747 = -8153350653901469408L & 579613254L;
    private Class_1782 Field_9748;
    private Class_2080 Field_9749;
    private int Field_9750 = 9312 & 18440;
    private long Field_9751 = -5088391626238066670L & 5088391625588085312L;

    public String Method_9752() {
        return this.Field_9746 == null ? Class_13490.Method_13495(this.Field_9741.getId()) : this.Field_9746;
    }

    static Class_2080 Method_9753(Class_9738 class_9738, Class_2080 class_2080) {
        class_9738.Field_9744 = class_2080;
        return class_9738.Field_9744;
    }

    public Class_35650 Method_9754() {
        return this.Field_9742;
    }

    public Class_22057 Method_9755() {
        return Class_18.Field_89.Field_72.\u0000strictfp().Method_20987(this.Method_9758().getName());
    }

    public int Method_9756() {
        return this.Field_9740;
    }

    static String Method_9757(Class_9738 class_9738) {
        return class_9738.Field_9746;
    }

    public GameProfile Method_9758() {
        return this.Field_9741;
    }

    public void Method_9759(int n) {
        this.Field_9739 = n;
    }

    public int Method_9760() {
        return this.Field_9739;
    }

    public void Method_9761(long l) {
        this.Field_9745 = l;
    }

    public boolean Method_9762() {
        return (this.Field_9744 != null ? 2449 & 5163 : 10272 & -16310) != 0;
    }

    static Class_2080 Method_9763(Class_9738 class_9738, Class_2080 class_2080) {
        class_9738.Field_9749 = class_2080;
        return class_9738.Field_9749;
    }

    protected void Method_9764(int n) {
        this.Field_9740 = n;
    }

    static String Method_9765(Class_9738 class_9738, String string) {
        class_9738.Field_9746 = string;
        return class_9738.Field_9746;
    }

    public Class_1782 Method_9766() {
        return this.Field_9748;
    }

    protected void Method_9767(Class_35650 class_35650) {
        this.Field_9742 = class_35650;
    }

    public void Method_9768(int n) {
        this.Field_9750 = n;
    }

    public long Method_9769() {
        return this.Field_9747;
    }

    private void Method_9770() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public long Method_9771() {
        return this.Field_9751;
    }

    public void Method_9772(long l) {
        this.Field_9747 = l;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void Method_9773() {
        Class_9738 class_9738 = this;
        synchronized (class_9738) {
            if (!this.Field_9743) {
                this.Field_9743 = 8261 & 4625;
                Class_18.Field_89.Method_239().Method_16245(this.Field_9741, new Class_27058(this), (12309 & 16683) != 0);
            }
        }
    }

    public int Method_9774() {
        return this.Field_9750;
    }

    public void Method_9775(Class_1782 class_1782) {
        this.Field_9748 = class_1782;
    }

    public Class_2080 Method_9776() {
        if (this.Field_9744 == null) {
            this.Method_9773();
        }
        return (Class_2080)Objects.firstNonNull((Object)this.Field_9744, (Object)Class_13490.Method_13499(this.Field_9741.getId()));
    }

    public long Method_9777() {
        return this.Field_9745;
    }

    public void Method_9778(long l) {
        this.Field_9751 = l;
    }

    public Class_9738(Class_14932 class_14932) {
        this.Field_9741 = class_14932.Method_14943();
        this.Field_9742 = class_14932.Method_14940();
        this.Field_9740 = class_14932.Method_14939();
        this.Field_9748 = class_14932.Method_14941();
    }

    public Class_2080 Method_9779() {
        if (this.Field_9749 == null) {
            this.Method_9773();
        }
        return this.Field_9749;
    }
}

