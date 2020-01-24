/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.apache.logging.log4j.Logger;

public class Class_2068
extends Thread {
    int Field_2069;
    final Class_18 Field_2070;
    int Field_2071;
    int Field_2072;
    int Field_2073;
    int Field_2074;
    int Field_2075;

    public void Method_2076() {
        this.setPriority(1591 & -16125);
        try {
            Thread.sleep(3951823082112480140L & -3951823082889669736L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.Field_2071 = this.Field_2070.Field_46;
        while (this.Field_2070.Field_47) {
            try {
                Thread.sleep(this.Field_2074);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (Class_18.Method_202(this.Field_2070) != null) {
                Class_18.Method_202(this.Field_2070).Method_29120();
            }
            if (this.Field_2070.Field_46 == this.Field_2071) {
                this.Field_2069 += 6149 & 9659;
                if (this.Field_2069 > (15260 & -27767) / this.Field_2074) {
                    this.Field_2069 = 640 & 1104;
                    Class_18.Field_19.info("Game probably stuck in a loop:");
                    StackTraceElement[] arrstackTraceElement = Class_18.Method_157(this.Field_2070).getStackTrace();
                    int n = arrstackTraceElement.length;
                    for (int i = 37 & 5904; i < n; ++i) {
                        StackTraceElement stackTraceElement = arrstackTraceElement[i];
                        Class_18.Field_19.error(stackTraceElement.toString());
                    }
                }
            } else {
                this.Field_2069 = 10292 & -32765;
            }
            this.Field_2072 += 16611 & -28655;
            if (this.Field_2072 > (-22696 & 12209) / this.Field_2074) {
                this.Field_2072 = 208 & 18720;
                if (this.Field_2073 > 0) {
                    this.Field_2073 -= 8579 & 81;
                }
                if (this.Field_2070.Field_66 > 0) {
                    this.Field_2070.Field_66 -= 13895 & 18609;
                }
            }
            if (this.Field_2075 > 0) {
                this.Field_2075 -= 4171 & 16405;
            }
            this.Field_2071 = this.Field_2070.Field_46;
        }
    }

    private void Method_2077() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    Class_2068(Class_18 class_18, String string) {
        this.Field_2070 = class_18;
        super(string);
        this.Field_2071 = -32635 & 4656;
        this.Field_2069 = 2177 & 26;
        this.Field_2074 = 6833 & 1343;
        this.Field_2073 = 2208 & 328;
        this.Field_2072 = 23432 & 64;
        this.Field_2075 = 512 & -11156;
    }
}

