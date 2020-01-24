/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.Arrays;

public final class Class_8601
implements Appendable,
CharSequence {
    private char[] Field_8602;
    private int Field_8603;

    public Class_8601(int n) {
        if (n < (-32701 & 26001)) {
            throw new IllegalArgumentException("length: " + n + " (length: >= 1)");
        }
        this.Field_8602 = new char[n];
    }

    public Appendable Method_8604(CharSequence charSequence, int n, int n2) {
        return this.Method_8612(charSequence, n, n2);
    }

    public CharSequence Method_8605(int n, int n2) {
        return this.Method_8615(n, n2);
    }

    public char Method_8606(int n) {
        if (n > this.Field_8603) {
            throw new IndexOutOfBoundsException();
        }
        return this.Field_8602[n];
    }

    public void Method_8607() {
        this.Field_8603 = 17408 & -32387;
    }

    public int Method_8608() {
        return this.Field_8603;
    }

    public Appendable Method_8609(CharSequence charSequence) {
        return this.Method_8613(charSequence);
    }

    public Class_8601 Method_8610(char c) {
        if (this.Field_8603 == this.Field_8602.length) {
            char[] arrc = this.Field_8602;
            int n = arrc.length << (20481 & 8857);
            if (n < 0) {
                throw new IllegalStateException();
            }
            this.Field_8602 = new char[n];
            System.arraycopy(arrc, 27025 & -31680, this.Field_8602, 67 & 22572, arrc.length);
        }
        int n = this.Field_8603;
        this.Field_8603 = n + (4481 & 25665);
        this.Field_8602[n] = c;
        return this;
    }

    private void Method_8611() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public Class_8601 Method_8612(CharSequence charSequence, int n, int n2) {
        if (charSequence.length() < n2) {
            throw new IndexOutOfBoundsException();
        }
        int n3 = n2 - n;
        if (n3 > this.Field_8602.length - this.Field_8603) {
            this.Field_8602 = Class_8601.Method_8618(this.Field_8602, this.Field_8603 + n3, this.Field_8603);
        }
        if (charSequence instanceof Class_8601) {
            Class_8601 class_8601 = (Class_8601)charSequence;
            char[] arrc = class_8601.Field_8602;
            System.arraycopy(arrc, n, this.Field_8602, this.Field_8603, n3);
            this.Field_8603 += n3;
            return this;
        }
        for (int i = n; i < n2; ++i) {
            int n4 = this.Field_8603;
            this.Field_8603 = n4 + (2657 & 17409);
            this.Field_8602[n4] = charSequence.charAt(i);
        }
        return this;
    }

    public Class_8601 Method_8613(CharSequence charSequence) {
        return this.Method_8612(charSequence, 24835 & -31680, charSequence.length());
    }

    public String Method_8614() {
        return new String(this.Field_8602, 8241 & 1282, this.Field_8603);
    }

    public Class_8601 Method_8615(int n, int n2) {
        return new Class_8601(Arrays.copyOfRange(this.Field_8602, n, n2));
    }

    public String Method_8616(int n, int n2) {
        int n3 = n2 - n;
        if (n > this.Field_8603 || n3 > this.Field_8603) {
            throw new IndexOutOfBoundsException();
        }
        return new String(this.Field_8602, n, n3);
    }

    public Appendable Method_8617(char c) {
        return this.Method_8610(c);
    }

    private Class_8601(char[] arrc) {
        this.Field_8602 = arrc;
        this.Field_8603 = arrc.length;
    }

    private static char[] Method_8618(char[] arrc, int n, int n2) {
        int n3 = arrc.length;
        do {
            if ((n3 <<= 8259 & 23561) >= 0) continue;
            throw new IllegalStateException();
        } while (n > n3);
        char[] arrc2 = new char[n3];
        System.arraycopy(arrc, 12608 & 17440, arrc2, -21046 & 529, n2);
        return arrc2;
    }
}

