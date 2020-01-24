/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class_12423 {
    private static final Logger Field_12424 = LogManager.getLogger();
    public final Class_8005 Field_12425;
    public int Field_12426;
    public int Field_12427;
    public final Class_8548 Field_12428;

    public final boolean Method_12429() {
        return (this.Field_12425 == Class_8005.Field_8011 ? 2073 & -27007 : 17 & 3402) != 0;
    }

    public boolean Method_12430(Object object) {
        if (this == object) {
            return (16517 & 2353) != 0;
        }
        if (object != null && this.getClass() == object.getClass()) {
            Class_12423 class_12423 = (Class_12423)object;
            return (this.Field_12426 != class_12423.Field_12426 ? 1776 & 8 : (this.Field_12427 != class_12423.Field_12427 ? 8320 & 1616 : (this.Field_12428 != class_12423.Field_12428 ? 268 & -23840 : (this.Field_12425 == class_12423.Field_12425 ? 8199 & 4233 : 2049 & -32092)))) != 0;
        }
        return (9796 & -9933) != 0;
    }

    public final int Method_12431() {
        return this.Field_12426;
    }

    public String Method_12432() {
        return this.Field_12426 + "," + this.Field_12425.Method_8020() + "," + this.Field_12428.Method_8564();
    }

    private void Method_12433() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public final Class_8005 Method_12434() {
        return this.Field_12425;
    }

    public Class_12423(int n, Class_8548 class_8548, Class_8005 class_8005, int n2) {
        if (!this.Method_12437(n, class_8005)) {
            Field_12424.warn("Multiple vertex elements of the same type other than UVs are not supported. Forcing type to UV.");
            this.Field_12425 = Class_8005.Field_8013;
        } else {
            this.Field_12425 = class_8005;
        }
        this.Field_12428 = class_8548;
        this.Field_12427 = n;
        this.Field_12426 = n2;
    }

    public final int Method_12435() {
        return this.Field_12428.Method_8560() * this.Field_12426;
    }

    public int Method_12436() {
        int n = this.Field_12428.hashCode();
        n = (12959 & 16479) * n + this.Field_12425.hashCode();
        n = (-31457 & 16543) * n + this.Field_12427;
        n = (2783 & 1055) * n + this.Field_12426;
        return n;
    }

    private final boolean Method_12437(int n, Class_8005 class_8005) {
        return (n == 0 || class_8005 == Class_8005.Field_8013 ? 2309 & 17489 : 16403 & 11432) != 0;
    }

    public final int Method_12438() {
        return this.Field_12427;
    }

    public final Class_8548 Method_12439() {
        return this.Field_12428;
    }
}

