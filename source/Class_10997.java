/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import net.minecraft.util.Vec3;

public class Class_10997 {
    public double Field_10998;
    public double Field_10999;
    public double Field_11000;
    public double Field_11001;
    public double Field_11002;
    public double Field_11003;

    public String Method_11004() {
        return "box[" + this.Field_10999 + ", " + this.Field_11000 + ", " + this.Field_11001 + " -> " + this.Field_11002 + ", " + this.Field_10998 + ", " + this.Field_11003 + "]";
    }

    public Class_10997 Method_11005(double d, double d2, double d3) {
        double d4 = this.Field_10999;
        double d5 = this.Field_11000;
        double d6 = this.Field_11001;
        double d7 = this.Field_11002;
        double d8 = this.Field_10998;
        double d9 = this.Field_11003;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        return new Class_10997(d4, d5, d6, d7, d8, d9);
    }

    public void Method_11006(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Field_10999 = d;
        this.Field_11000 = d2;
        this.Field_11001 = d3;
        this.Field_11002 = d4;
        this.Field_10998 = d5;
        this.Field_11003 = d6;
    }

    public Class_37110 Method_11007(Vec3 vec3, Vec3 vec32) {
        Vec3 vec33 = vec3.\u0000= final(vec32, this.Field_10999);
        Vec3 vec34 = vec3.\u0000= final(vec32, this.Field_11002);
        Vec3 vec35 = vec3.\u0000strictfp(vec32, this.Field_11000);
        Vec3 vec36 = vec3.\u0000strictfp(vec32, this.Field_10998);
        Vec3 vec37 = vec3.\u0000, `(vec32, this.Field_11001);
        Vec3 vec38 = vec3.\u0000, `(vec32, this.Field_11003);
        if (!this.Method_11013(vec33)) {
            vec33 = null;
        }
        if (!this.Method_11013(vec34)) {
            vec34 = null;
        }
        if (!this.Method_11022(vec35)) {
            vec35 = null;
        }
        if (!this.Method_11022(vec36)) {
            vec36 = null;
        }
        if (!this.Method_11024(vec37)) {
            vec37 = null;
        }
        if (!this.Method_11024(vec38)) {
            vec38 = null;
        }
        Vec3 vec39 = null;
        if (vec33 != null) {
            vec39 = vec33;
        }
        if (vec34 != null && (vec39 == null || vec3.\u0000strictfp(vec34) < vec3.\u0000strictfp(vec39))) {
            vec39 = vec34;
        }
        if (vec35 != null && (vec39 == null || vec3.\u0000strictfp(vec35) < vec3.\u0000strictfp(vec39))) {
            vec39 = vec35;
        }
        if (vec36 != null && (vec39 == null || vec3.\u0000strictfp(vec36) < vec3.\u0000strictfp(vec39))) {
            vec39 = vec36;
        }
        if (vec37 != null && (vec39 == null || vec3.\u0000strictfp(vec37) < vec3.\u0000strictfp(vec39))) {
            vec39 = vec37;
        }
        if (vec38 != null && (vec39 == null || vec3.\u0000strictfp(vec38) < vec3.\u0000strictfp(vec39))) {
            vec39 = vec38;
        }
        if (vec39 == null) {
            return null;
        }
        Class_4595 class_4595 = null;
        class_4595 = vec39 == vec33 ? Class_4595.Field_4602 : (vec39 == vec34 ? Class_4595.Field_4603 : (vec39 == vec35 ? Class_4595.Field_4615 : (vec39 == vec36 ? Class_4595.Field_4601 : (vec39 == vec37 ? Class_4595.Field_4598 : Class_4595.Field_4613))));
        return new Class_37110(vec39, class_4595);
    }

    public Class_10997 Method_11008(double d, double d2, double d3, Class_10997 class_10997) {
        double d4 = this.Field_10999;
        double d5 = this.Field_11000;
        double d6 = this.Field_11001;
        double d7 = this.Field_11002;
        double d8 = this.Field_10998;
        double d9 = this.Field_11003;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        class_10997.Method_11006(d4, d5, d6, d7, d8, d9);
        return class_10997;
    }

    public double Method_11009(Class_10997 class_10997, double d) {
        if (class_10997.Field_11002 > this.Field_10999 && class_10997.Field_10999 < this.Field_11002 && class_10997.Field_11003 > this.Field_11001 && class_10997.Field_11001 < this.Field_11003) {
            double d2;
            if (d > 0.0 && class_10997.Field_10998 <= this.Field_11000) {
                double d3 = this.Field_11000 - class_10997.Field_10998;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && class_10997.Field_11000 >= this.Field_10998 && (d2 = this.Field_10998 - class_10997.Field_11000) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }

    public void Method_11010(Class_10997 class_10997) {
        this.Field_10999 = class_10997.Field_10999;
        this.Field_11000 = class_10997.Field_11000;
        this.Field_11001 = class_10997.Field_11001;
        this.Field_11002 = class_10997.Field_11002;
        this.Field_10998 = class_10997.Field_10998;
        this.Field_11003 = class_10997.Field_11003;
    }

    public Class_10997(Class_4751 class_4751, Class_4751 class_47512) {
        this.Field_10999 = class_4751.\u0000= final();
        this.Field_11000 = class_4751.\u0000, `();
        this.Field_11001 = class_4751.\u0000strictfp();
        this.Field_11002 = class_47512.\u0000= final();
        this.Field_10998 = class_47512.\u0000, `();
        this.Field_11003 = class_47512.\u0000strictfp();
    }

    public Class_10997 Method_11011(Class_10997 class_10997) {
        double d = Math.min(this.Field_10999, class_10997.Field_10999);
        double d2 = Math.min(this.Field_11000, class_10997.Field_11000);
        double d3 = Math.min(this.Field_11001, class_10997.Field_11001);
        double d4 = Math.max(this.Field_11002, class_10997.Field_11002);
        double d5 = Math.max(this.Field_10998, class_10997.Field_10998);
        double d6 = Math.max(this.Field_11003, class_10997.Field_11003);
        return new Class_10997(d, d2, d3, d4, d5, d6);
    }

    public Class_10997 Method_11012(double d, double d2, double d3) {
        double d4 = this.Field_10999 + d;
        double d5 = this.Field_11000 + d2;
        double d6 = this.Field_11001 + d3;
        double d7 = this.Field_11002 - d;
        double d8 = this.Field_10998 - d2;
        double d9 = this.Field_11003 - d3;
        return new Class_10997(d4, d5, d6, d7, d8, d9);
    }

    private boolean Method_11013(Vec3 vec3) {
        return (vec3 == null ? 1105 & -28158 : (vec3.\u0000strictfp >= this.Field_11000 && vec3.\u0000strictfp <= this.Field_10998 && vec3.\u0000, ` >= this.Field_11001 && vec3.\u0000, ` <= this.Field_11003 ? -6935 & 261 : 612 & -31472)) != 0;
    }

    public boolean Method_11014(Vec3 vec3) {
        return (vec3.\u0000= final > this.Field_10999 && vec3.\u0000= final < this.Field_11002 ? (vec3.\u0000strictfp > this.Field_11000 && vec3.\u0000strictfp < this.Field_10998 ? (vec3.\u0000, ` > this.Field_11001 && vec3.\u0000, ` < this.Field_11003 ? 31079 & -32759 : 2176 & 16904) : 11264 & 4288) : 322 & 20612) != 0;
    }

    private void Method_11015() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_11016(Class_10997 class_10997) {
        return (class_10997.Field_11002 > this.Field_10999 && class_10997.Field_10999 < this.Field_11002 ? (class_10997.Field_10998 > this.Field_11000 && class_10997.Field_11000 < this.Field_10998 ? (class_10997.Field_11003 > this.Field_11001 && class_10997.Field_11001 < this.Field_11003 ? -8159 & 579 : 19472 & -27808) : 22561 & 9232) : 16736 & 8840) != 0;
    }

    public Class_10997 Method_11017(double d, double d2, double d3) {
        double d4 = this.Field_10999 - d;
        double d5 = this.Field_11000 - d2;
        double d6 = this.Field_11001 - d3;
        double d7 = this.Field_11002 + d;
        double d8 = this.Field_10998 + d2;
        double d9 = this.Field_11003 + d3;
        return new Class_10997(d4, d5, d6, d7, d8, d9);
    }

    public double Method_11018(Class_10997 class_10997, double d) {
        if (class_10997.Field_10998 > this.Field_11000 && class_10997.Field_11000 < this.Field_10998 && class_10997.Field_11003 > this.Field_11001 && class_10997.Field_11001 < this.Field_11003) {
            double d2;
            if (d > 0.0 && class_10997.Field_11002 <= this.Field_10999) {
                double d3 = this.Field_10999 - class_10997.Field_11002;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && class_10997.Field_10999 >= this.Field_11002 && (d2 = this.Field_11002 - class_10997.Field_10999) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }

    public static Class_10997 Method_11019(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.min(d, d4);
        double d8 = Math.min(d2, d5);
        double d9 = Math.min(d3, d6);
        double d10 = Math.max(d, d4);
        double d11 = Math.max(d2, d5);
        double d12 = Math.max(d3, d6);
        return new Class_10997(d7, d8, d9, d10, d11, d12);
    }

    public Class_10997(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Field_10999 = Math.min(d, d4);
        this.Field_11000 = Math.min(d2, d5);
        this.Field_11001 = Math.min(d3, d6);
        this.Field_11002 = Math.max(d, d4);
        this.Field_10998 = Math.max(d2, d5);
        this.Field_11003 = Math.max(d3, d6);
    }

    public boolean Method_11020() {
        return (Double.isNaN(this.Field_10999) || Double.isNaN(this.Field_11000) || Double.isNaN(this.Field_11001) || Double.isNaN(this.Field_11002) || Double.isNaN(this.Field_10998) || Double.isNaN(this.Field_11003) ? 17555 & 12549 : 4642 & 2113) != 0;
    }

    public Class_10997 Method_11021(double d, double d2, double d3) {
        return new Class_10997(this.Field_10999 + d, this.Field_11000 + d2, this.Field_11001 + d3, this.Field_11002 + d, this.Field_10998 + d2, this.Field_11003 + d3);
    }

    private boolean Method_11022(Vec3 vec3) {
        return (vec3 == null ? 8724 & 424 : (vec3.\u0000= final >= this.Field_10999 && vec3.\u0000= final <= this.Field_11002 && vec3.\u0000, ` >= this.Field_11001 && vec3.\u0000, ` <= this.Field_11003 ? -28607 & 8717 : 22606 & 1040)) != 0;
    }

    public void Method_11023(double d, double d2, double d3) {
        this.Field_10999 += d;
        this.Field_11000 += d2;
        this.Field_11001 += d3;
        this.Field_11002 += d;
        this.Field_10998 += d2;
        this.Field_11003 += d3;
    }

    private boolean Method_11024(Vec3 vec3) {
        return (vec3 == null ? -27640 & 544 : (vec3.\u0000= final >= this.Field_10999 && vec3.\u0000= final <= this.Field_11002 && vec3.\u0000strictfp >= this.Field_11000 && vec3.\u0000strictfp <= this.Field_10998 ? 4137 & 9795 : 8384 & 1290)) != 0;
    }

    public double Method_11025() {
        double d = this.Field_11002 - this.Field_10999;
        double d2 = this.Field_10998 - this.Field_11000;
        double d3 = this.Field_11003 - this.Field_11001;
        return (d + d2 + d3) / (11.25 * 0.26666666666666666);
    }

    public double Method_11026(Class_10997 class_10997, double d) {
        if (class_10997.Field_11002 > this.Field_10999 && class_10997.Field_10999 < this.Field_11002 && class_10997.Field_10998 > this.Field_11000 && class_10997.Field_11000 < this.Field_10998) {
            double d2;
            if (d > 0.0 && class_10997.Field_11003 <= this.Field_11001) {
                double d3 = this.Field_11001 - class_10997.Field_11003;
                if (d3 < d) {
                    d = d3;
                }
            } else if (d < 0.0 && class_10997.Field_11001 >= this.Field_11003 && (d2 = this.Field_11003 - class_10997.Field_11001) > d) {
                d = d2;
            }
            return d;
        }
        return d;
    }
}

