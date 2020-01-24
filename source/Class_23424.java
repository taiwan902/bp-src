/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  internal.org.lwjgl.opengl.GL11
 */
import internal.org.lwjgl.opengl.GL11;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public abstract class Class_23424
implements Class_2062 {
    protected boolean Field_23425;
    public Class_38187 Field_23426;
    protected boolean Field_23427;
    protected int Field_23428 = -1 & -1;
    protected boolean Field_23429;
    protected boolean Field_23430;

    private void Method_23431() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public int Method_23432() {
        if (this.Field_23428 == (-1 & -1)) {
            this.Field_23428 = Class_18695.Method_18705();
        }
        return this.Field_23428;
    }

    public Class_38187 Method_23433() {
        return Class_8049.Method_8069(this);
    }

    public void Method_23434() {
        this.Method_23435(this.Field_23425, this.Field_23430);
    }

    public void Method_23435(boolean bl, boolean bl2) {
        this.Field_23429 = bl;
        this.Field_23427 = bl2;
        int n = -1 & -1;
        int n2 = -1 & -1;
        if (bl) {
            n = bl2 ? 9987 & 14227 : 12041 & 9937;
            n2 = 9937 & 32299;
        } else {
            n = bl2 ? 10186 & -22782 : 26384 & 9865;
            n2 = 28170 & -23020;
        }
        GL11.glTexParameteri((int)(-21013 & 8177), (int)(-22523 & 28289), (int)n);
        GL11.glTexParameteri((int)(4069 & -12831), (int)(-22272 & 10384), (int)n2);
    }

    public void Method_23436(boolean bl, boolean bl2) {
        this.Field_23425 = this.Field_23429;
        this.Field_23430 = this.Field_23427;
        this.Method_23435(bl, bl2);
    }

    public void Method_23437() {
        if (this.Field_23428 != (-1 & -1)) {
            Class_18695.Method_18720(this.Field_23428);
            this.Field_23428 = -1 & -1;
        }
    }
}

