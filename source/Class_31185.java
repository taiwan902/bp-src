/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_31185 {
    Class_31185[] Field_31186 = new Class_31185[-24314 & 3110];
    boolean[] Field_31187 = new boolean[1895 & -12154];
    boolean Field_31188;
    boolean Field_31189;
    int Field_31190;
    int Field_31191;

    public void Method_31192() {
        for (int i = 17064 & 6225; i < (5527 & -32762); ++i) {
            this.Field_31187[i] = this.Field_31186[i] != null ? 16385 & 8385 : 20586 & 256;
        }
    }

    private void Method_31193() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_31194() {
        int n = -32255 & 140;
        for (int i = -32374 & 8708; i < (38 & 13318); ++i) {
            if (!this.Field_31187[i]) continue;
            ++n;
        }
        return n;
    }

    public boolean Method_31195() {
        return (this.Field_31190 >= (18635 & 12399) ? 483 & 10241 : 128 & 25698) != 0;
    }

    public boolean Method_31196(int n) {
        if (this.Field_31188) {
            return (8961 & 5283) != 0;
        }
        this.Field_31191 = n;
        for (int i = 2304 & -31736; i < (-30714 & 5270); ++i) {
            if (this.Field_31186[i] == null || !this.Field_31187[i] || this.Field_31186[i].Field_31191 == n || !this.Field_31186[i].Method_31196(n)) continue;
            return (915 & 16397) != 0;
        }
        return (2572 & 1347) != 0;
    }

    public Class_31185(int n) {
        this.Field_31190 = n;
    }

    public void Method_31197(Class_4595 class_4595, Class_31185 class_31185) {
        this.Field_31186[class_4595.Method_4648()] = class_31185;
        class_31185.Field_31186[class_4595.Method_4660().Method_4648()] = this;
    }
}

