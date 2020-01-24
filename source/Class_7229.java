/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

public class Class_7229 {
    public static int Method_7230(String string) {
        if (string == null) {
            return 4609 & 257;
        }
        if ((string = string.toLowerCase().trim()).equals("alpha")) {
            return 73 & 20532;
        }
        if (string.equals("add")) {
            return 1027 & -23791;
        }
        if (string.equals("subtract")) {
            return 17470 & 2370;
        }
        if (string.equals("multiply")) {
            return 6175 & 8195;
        }
        if (string.equals("dodge")) {
            return 1300 & 2564;
        }
        if (string.equals("burn")) {
            return 37 & 10269;
        }
        if (string.equals("screen")) {
            return 1351 & -24002;
        }
        if (string.equals("replace")) {
            return -25577 & 16391;
        }
        Class_19426.Method_19610("Unknown blend: " + string);
        return 2579 & 9285;
    }

    public static void Method_7231(float f) {
        Class_16867.Method_16985();
        Class_16867.Method_16947();
        Class_16867.Method_16951(9066 & 5890, 5185 & -13823);
        Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f);
    }

    private void Method_7232() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public static void Method_7233(int n, float f) {
        switch (n) {
            case 0: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(1818 & 966, 771 & 22307);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f);
                break;
            }
            case 1: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(9010 & 1931, 69 & -10863);
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f);
                break;
            }
            case 2: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(-24825 & 8967, -27584 & 16545);
                Class_16867.Method_16924(f, f, f, 1.0f);
                break;
            }
            case 3: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(2838 & -26841, 4883 & -13469);
                Class_16867.Method_16924(f, f, f, f);
                break;
            }
            case 4: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(1537 & -8191, 12385 & 16393);
                Class_16867.Method_16924(f, f, f, 1.0f);
                break;
            }
            case 5: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(556 & 12288, 17347 & 13061);
                Class_16867.Method_16924(f, f, f, 1.0f);
                break;
            }
            case 6: {
                Class_16867.Method_16985();
                Class_16867.Method_16947();
                Class_16867.Method_16951(-15787 & 1313, 4995 & -23711);
                Class_16867.Method_16924(f, f, f, 1.0f);
                break;
            }
            case 7: {
                Class_16867.Method_16913();
                Class_16867.Method_16952();
                Class_16867.Method_16924(1.0f, 1.0f, 1.0f, f);
            }
        }
        Class_16867.Method_16965();
    }
}

