/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_37430
extends Class_1551 {
    public int Field_37431;
    public Class_18 Field_37432;
    public int Field_37433;
    public int Field_37434;
    private int Field_37435;
    public int Field_37436;
    public int Field_37437;
    public final String Field_37438;
    public Class_28636 Field_37439;
    private int Field_37440;
    public int Field_37441;
    public boolean Field_37442 = -13823 & 8315;
    public double Field_37443;
    public double Field_37444;

    private void Method_37445() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_37446() {
    }

    public void Method_37447(double d, double d2) {
        this.Field_37443 = d;
        this.Field_37444 = d2;
        this.Method_37448(this.Field_37440, this.Field_37435);
    }

    public void Method_37448(int n, int n2) {
        this.Field_37431 = (int)(this.Field_37443 * (double)(n - this.Field_37437));
        this.Field_37436 = (int)(this.Field_37444 * (double)(n2 - this.Field_37434));
        this.Field_37441 = this.Field_37431 + this.Field_37437;
        this.Field_37433 = this.Field_37436 + this.Field_37434;
    }

    public final void Method_37449(int n, int n2, float f) {
        if (this.Field_37440 != n || this.Field_37435 != n2) {
            this.Method_37448(n, n2);
            this.Field_37440 = n;
            this.Field_37435 = n2;
        }
        this.Method_37451(n, n2, f);
        this.Field_37432.Method_253().Method_34707(\u0000= final);
    }

    public void Method_37450(int n, int n2) {
        if (this.Field_37434 == n2 && this.Field_37437 == n) {
            return;
        }
        this.Field_37437 = n;
        this.Field_37434 = n2;
        this.Method_37448(this.Field_37440, this.Field_37435);
    }

    public Class_37430(String string, int n, int n2) {
        this.Field_37438 = string;
        this.Field_37437 = n;
        this.Field_37434 = n2;
    }

    public void Method_37451(int n, int n2, float f) {
    }
}

