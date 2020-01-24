/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
import com.google.common.collect.Lists;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class_47972
extends Class_1490 {
    private Class_28932 Field_47973;

    private void Method_47974() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public void Method_47975(int n, int n2, int n3, int n4, int n5, int n6) {
        this.Field_47973.Method_28947(n, n2, n3, n4, n5, n6);
        super.\u0000strictfp(n, n2, n3, n4, n5, n6);
    }

    public final void Method_47976(Class_42376 class_42376) {
        this.Field_47973.Method_28954(((Class_42711)class_42376).Method_42714());
    }

    public Class_47972(Class_28932 class_28932) {
        this.Field_47973 = class_28932;
        this.Field_1506 = Collections.synchronizedList(Lists.newArrayList());
    }

    public void Method_47977(Class_23823 class_23823, int n, int n2) {
        super.Method_1546(class_23823, n, n2);
    }

    public void Method_47978() {
        this.Field_47973.Method_28934();
        super.Method_1516();
    }

    public void Method_47979() {
        this.Field_47973.Method_28955();
        super.Method_1544();
    }

    public void Method_47980(String string, int n, int n2, int n3) {
        super.\u0000strictfp(this.\u0000strictfp, string, n, n2, n3);
    }

    public void Method_47981() {
        super.Method_1527();
    }

    public void Method_47982(List list, int n, int n2) {
        super.Method_1511(list, n, n2);
    }

    public void Method_47983(int n, int n2, int n3, int n4, int n5, int n6) {
        super.\u0000, `(n, n2, n3, n4, n5, n6);
    }

    public void Method_47984() {
        this.Field_47973.Method_28953();
        super.Method_1517();
    }

    public void Method_47985(int n) {
        super.Method_1508(n);
    }

    public void Method_47986(char c, int n) {
        this.Field_47973.Method_28935(c, n);
    }

    public List Method_47987() {
        ArrayList arrayList = Lists.newArrayListWithExpectedSize((int)this.Field_1506.size());
        for (Class_42376 class_42376 : this.Field_1506) {
            arrayList.add(((Class_42711)class_42376).Method_42714());
        }
        return arrayList;
    }

    public void Method_47988(int n, int n2, int n3) {
        this.Field_47973.Method_28936(n, n2, n3);
        super.Method_1537(n, n2, n3);
    }

    public void Method_47989() {
        this.Field_1506.clear();
    }

    public void Method_47990(int n, int n2, int n3) {
        this.Field_47973.Method_28939(n, n2, n3);
    }

    public void Method_47991(int n, int n2, int n3, long l) {
        this.Field_47973.Method_28951(n, n2, n3, l);
    }

    public void Method_47992(int n, int n2, float f) {
        this.Field_47973.Method_28940(n, n2, f);
    }

    public int Method_47993() {
        return 18637 & 297;
    }

    public void Method_47994(String string, int n, int n2) {
        super.Method_1519(string, n, n2);
    }

    public void Method_47995() {
        this.Field_47973.Method_28956();
        super.Method_1513();
    }

    public Class_28932 Method_47996() {
        return this.Field_47973;
    }

    public List Method_47997(String string, int n) {
        return this.\u0000strictfp.Method_28733(string, n);
    }

    public void Method_47998(Class_13256 class_13256) {
        this.Field_1506.add(class_13256.Method_13267());
    }

    public void Method_47999() {
        this.Field_47973.Method_28950();
        super.Method_1533();
    }

    public void Method_48000(boolean bl, int n) {
        this.Field_47973.Method_28938(bl, n);
    }

    public boolean Method_48001() {
        return super.Method_1521();
    }
}

