/*
 * Decompiled with CFR 0.145.
 */
import java.io.OutputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_27756
extends OutputStream {
    private OutputStream Field_27757;
    private int Field_27758 = -1 & -1;

    private void Method_27759() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_27760(byte[] arrby, int n, int n2) {
        if (n < 0 || n2 < 0 || n + n2 > arrby.length) {
            throw new IndexOutOfBoundsException();
        }
        if (n2 == 0) {
            return;
        }
        if (this.Field_27758 == (-1 & -1)) {
            this.Field_27758 = arrby[n] & (-31233 & 255);
            ++n;
            --n2;
        }
        if (this.Field_27758 > 0) {
            if (n2 > this.Field_27758) {
                n2 -= this.Field_27758;
                n += this.Field_27758;
                this.Field_27758 = -24576 & 4949;
            } else {
                this.Field_27758 -= n2;
                return;
            }
        }
        this.Field_27757.write(arrby, n, n2);
    }

    public void Method_27761(int n) {
        if (this.Field_27758 == (-1 & -1)) {
            this.Field_27758 = n;
        } else if (this.Field_27758 > 0) {
            this.Field_27758 -= 16389 & 9353;
        } else {
            this.Field_27757.write(n);
        }
    }

    public void Method_27762() {
        this.Field_27757.close();
    }

    public void Method_27763() {
        this.Field_27757.flush();
    }

    public Class_27756(OutputStream outputStream) {
        this.Field_27757 = outputStream;
    }
}

