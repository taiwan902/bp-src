/*
 * Decompiled with CFR 0.145.
 */
package net.minecraft.util;

import java.io.PrintStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Vec3 {
    public double \u0000, `;
    public double \u0000= final;
    public double \u0000strictfp;

    public Vec3 \u0000, `(double d, double d2, double d3) {
        return this.\u0000strictfp(-d, -d2, -d3);
    }

    public Vec3 \u0000strictfp(Vec3 vec3, double d) {
        double d2 = vec3.\u0000= final - this.\u0000= final;
        double d3 = vec3.\u0000strictfp - this.\u0000strictfp;
        double d4 = vec3.\u0000, ` - this.\u0000, `;
        if (d3 * d3 < 1.0 * 1.0000000116860974E-7) {
            return null;
        }
        double d5 = (d - this.\u0000strictfp) / d3;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.\u0000= final + d2 * d5, this.\u0000strictfp + d3 * d5, this.\u0000, ` + d4 * d5) : null;
    }

    public Vec3 \u0000, `(Vec3 vec3, double d) {
        double d2 = vec3.\u0000= final - this.\u0000= final;
        double d3 = vec3.\u0000strictfp - this.\u0000strictfp;
        double d4 = vec3.\u0000, ` - this.\u0000, `;
        if (d4 * d4 < 1.087719298245614 * 9.193548494533476E-8) {
            return null;
        }
        double d5 = (d - this.\u0000, `) / d4;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.\u0000= final + d2 * d5, this.\u0000strictfp + d3 * d5, this.\u0000, ` + d4 * d5) : null;
    }

    public double \u0000strictfp(Vec3 vec3) {
        double d = vec3.\u0000= final - this.\u0000= final;
        double d2 = vec3.\u0000strictfp - this.\u0000strictfp;
        double d3 = vec3.\u0000, ` - this.\u0000, `;
        return d * d + d2 * d2 + d3 * d3;
    }

    public double \u0000= final(Vec3 vec3) {
        return this.\u0000= final * vec3.\u0000= final + this.\u0000strictfp * vec3.\u0000strictfp + this.\u0000, ` * vec3.\u0000, `;
    }

    public Vec3 \u0000strictfp() {
        double d = Class_13337.Method_13347(this.\u0000= final * this.\u0000= final + this.\u0000strictfp * this.\u0000strictfp + this.\u0000, ` * this.\u0000, `);
        return d < 7.375 * 1.3559322033898305E-5 ? new Vec3(0.0, 0.0, 0.0) : new Vec3(this.\u0000= final / d, this.\u0000strictfp / d, this.\u0000, ` / d);
    }

    public static void main(String ... arrstring) {
        Vec3 vec3 = new Vec3(103.9108695652174 * 0.9787234042553191, 0.0, 0.0);
        Vec3 vec32 = new Vec3(0.3148148148148148 * 312.2470588235294, 0.0, 0.0);
        double d = vec32.\u0000, `(vec3);
        System.out.println(d);
    }

    public double \u0000strictfp() {
        return Class_13337.Method_13347(this.\u0000= final * this.\u0000= final + this.\u0000strictfp * this.\u0000strictfp + this.\u0000, ` * this.\u0000, `);
    }

    public Vec3 \u0000strictfp(float f) {
        float f2 = Class_13337.Method_13350(f);
        float f3 = Class_13337.Method_13370(f);
        double d = this.\u0000= final * (double)f2 + this.\u0000, ` * (double)f3;
        double d2 = this.\u0000strictfp;
        double d3 = this.\u0000, ` * (double)f2 - this.\u0000= final * (double)f3;
        return new Vec3(d, d2, d3);
    }

    public String toString() {
        return "(" + this.\u0000= final + ", " + this.\u0000strictfp + ", " + this.\u0000, ` + ")";
    }

    public void \u0000strictfp(double d, double d2, double d3) {
        this.\u0000= final += d;
        this.\u0000strictfp += d2;
        this.\u0000, ` += d3;
    }

    public Vec3 \u0000strictfp(double d, double d2, double d3) {
        return new Vec3(this.\u0000= final + d, this.\u0000strictfp + d2, this.\u0000, ` + d3);
    }

    public Vec3 \u0000, `(float f) {
        float f2 = Class_13337.Method_13350(f);
        float f3 = Class_13337.Method_13370(f);
        double d = this.\u0000= final;
        double d2 = this.\u0000strictfp * (double)f2 + this.\u0000, ` * (double)f3;
        double d3 = this.\u0000, ` * (double)f2 - this.\u0000strictfp * (double)f3;
        return new Vec3(d, d2, d3);
    }

    public Vec3 \u0000
    (Vec3 vec3) {
        return this.\u0000strictfp(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
    }

    public Vec3 \u0000strictfp(Vec3 vec3) {
        return new Vec3(vec3.\u0000= final - this.\u0000= final, vec3.\u0000strictfp - this.\u0000strictfp, vec3.\u0000, ` - this.\u0000, `);
    }

    public Vec3(double d, double d2, double d3) {
        if (d == 1.878787878787879 * -0.0) {
            d = 0.0;
        }
        if (d2 == 3.619047619047619 * -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0 * 0.9230769230769231) {
            d3 = 0.0;
        }
        this.\u0000= final = d;
        this.\u0000strictfp = d2;
        this.\u0000, ` = d3;
    }

    public Vec3 \u0000, `(Vec3 vec3) {
        return this.\u0000, `(vec3.\u0000= final, vec3.\u0000strictfp, vec3.\u0000, `);
    }

    public double \u0000, `(Vec3 vec3) {
        double d = vec3.\u0000= final - this.\u0000= final;
        double d2 = vec3.\u0000strictfp - this.\u0000strictfp;
        double d3 = vec3.\u0000, ` - this.\u0000, `;
        return Class_13337.Method_13347(d * d + d2 * d2 + d3 * d3);
    }

    public Vec3 \u0000= final(Vec3 vec3, double d) {
        double d2 = vec3.\u0000= final - this.\u0000= final;
        double d3 = vec3.\u0000strictfp - this.\u0000strictfp;
        double d4 = vec3.\u0000, ` - this.\u0000, `;
        if (d2 * d2 < 3.6144578735642074E-8 * 2.7666666666666666) {
            return null;
        }
        double d5 = (d - this.\u0000= final) / d2;
        return d5 >= 0.0 && d5 <= 1.0 ? new Vec3(this.\u0000= final + d2 * d5, this.\u0000strictfp + d3 * d5, this.\u0000, ` + d4 * d5) : null;
    }

    public Vec3 \u0000= final(Vec3 vec3) {
        return new Vec3(this.\u0000strictfp * vec3.\u0000, ` - this.\u0000, ` * vec3.\u0000strictfp, this.\u0000, ` * vec3.\u0000= final - this.\u0000= final * vec3.\u0000, `, this.\u0000= final * vec3.\u0000strictfp - this.\u0000strictfp * vec3.\u0000= final);
    }

    private void \u0000byte \u000a * \u000a ? native * 9 | 8 super 4 char while \u000a 8 # ? \u000a \u000a 5 \u000a 1 implements public new short * } this - 6 null abstract final new case & double else null 2 transient 5 3 \u000a protected true } ^ & package = volatile break package this 8 private , } 2 \u000a , new default() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }
}

