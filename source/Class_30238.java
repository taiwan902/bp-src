/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_30238 {
    private Class_14599 Field_30239;
    private int Field_30240;
    private int Field_30241;
    private char[] Field_30242;
    private int Field_30243;
    private Class_14599 Field_30244;

    public int Method_30245(int n, int n2, int n3) {
        return this.Field_30239.Method_14602(n, n2, n3);
    }

    private void Method_30246() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_30247(Class_14599 class_14599) {
        this.Field_30244 = class_14599;
    }

    public void Method_30248(char[] arrc) {
        this.Field_30242 = arrc;
    }

    public void Method_30249(int n, int n2, int n3, int n4) {
        this.Field_30244.Method_14606(n, n2, n3, n4);
    }

    public Class_14599 Method_30250() {
        return this.Field_30244;
    }

    public void Method_30251(int n, int n2, int n3, int n4) {
        this.Field_30239.Method_14606(n, n2, n3, n4);
    }

    public char[] Method_30252() {
        return this.Field_30242;
    }

    public int Method_30253() {
        return this.Field_30240;
    }

    public Class_14599 Method_30254() {
        return this.Field_30239;
    }

    public void Method_30255(int n, int n2, int n3, Class_3677 class_3677) {
        Class_3677 class_36772 = this.Method_30262(n, n2, n3);
        Class_3238 class_3238 = class_36772.Method_3688();
        Class_3238 class_32382 = class_3677.Method_3688();
        if (class_3238 != Class_9265.Field_9351) {
            this.Field_30243 -= 9 & 21253;
            if (class_3238.Method_3417()) {
                this.Field_30241 -= -16303 & 8365;
            }
        }
        if (class_32382 != Class_9265.Field_9351) {
            this.Field_30243 += 16395 & 145;
            if (class_32382.Method_3417()) {
                this.Field_30241 += 4629 & 16395;
            }
        }
        this.Field_30242[n2 << (12330 & -14327) | n3 << (-24180 & 2103) | n] = (char)Class_3238.Field_3280.Method_3672(class_3677);
    }

    public Class_3238 Method_30256(int n, int n2, int n3) {
        return this.Method_30262(n, n2, n3).Method_3688();
    }

    public int Method_30257(int n, int n2, int n3) {
        return this.Field_30244.Method_14602(n, n2, n3);
    }

    public boolean Method_30258() {
        return (this.Field_30243 == 0 ? 20769 & -32119 : 13504 & -30463) != 0;
    }

    public boolean Method_30259() {
        return (this.Field_30241 > 0 ? -32255 & 5249 : 23340 & -32703) != 0;
    }

    public Class_30238(int n, boolean bl) {
        this.Field_30240 = n;
        this.Field_30242 = new char[4744 & -19440];
        this.Field_30239 = new Class_14599();
        if (bl) {
            this.Field_30244 = new Class_14599();
        }
    }

    public int Method_30260(int n, int n2, int n3) {
        Class_3677 class_3677 = this.Method_30262(n, n2, n3);
        return class_3677.Method_3442().Method_3434(class_3677);
    }

    public void Method_30261(Class_14599 class_14599) {
        this.Field_30239 = class_14599;
    }

    public Class_3677 Method_30262(int n, int n2, int n3) {
        Class_3677 class_3677 = Class_3238.Field_3280.Method_3675(this.Field_30242[n2 << (1357 & 27144) | n3 << (23604 & 8196) | n]);
        return class_3677 != null ? class_3677 : Class_9265.Field_9351.Method_3293();
    }

    public void Method_30263() {
        int n = Class_3238.Field_3280.Method_3669();
        int n2 = 17984 & -26488;
        int n3 = -30201 & 16448;
        char[] arrc = this.Field_30242;
        for (int i = 23556 & 8450; i < (2417 & -7150); ++i) {
            int n4 = i << (2796 & 5386);
            for (int j = -31742 & 745; j < (146 & -22480); ++j) {
                int n5 = n4 | j << (20676 & 9260);
                for (int k = -32656 & 0; k < (-14316 & 216); ++k) {
                    Class_3238 class_3238;
                    Class_3677 class_3677;
                    char c = arrc[n5 | k];
                    if (c <= '\u0000') continue;
                    ++n2;
                    if (c >= n || (class_3677 = Class_3238.Field_3280.Method_3675(c)) == null || !(class_3238 = class_3677.Method_3688()).Method_3417()) continue;
                    ++n3;
                }
            }
        }
        this.Field_30243 = n2;
        this.Field_30241 = n3;
    }
}

