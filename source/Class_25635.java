/*
 * Decompiled with CFR 0.145.
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class Class_25635
implements Class_1486 {
    private String Field_25636;
    private byte[] Field_25637;
    private byte[] Field_25638;

    private static String Method_25639(String string) {
        int n = 19672;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25635.class, 1);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public void Method_25640(Class_29900 class_29900) {
        class_29900.Method_29946(this.Field_25637);
        class_29900.Method_29946(this.Field_25638);
        if (this.Field_25636 == null) {
            this.Field_25636 = "";
        }
        class_29900.Method_29960(this.Field_25636);
    }

    public void Method_25641(Class_29900 class_29900) {
        new Class_30877(new RuntimeException(Class_25635.Method_25646("\uc427\uc427\uc423\uc460\uc427\uc427\uc423\uc421\uc42e\uc46a\uc429\uc429\uc428\uc42b\uc42c\uc42c\uc422\uc462\uc421\uc424")));
    }

    public void Method_25642(Class_10954 class_10954) {
        this.Method_25645((Class_19025)class_10954);
    }

    private void Method_25643() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, Class_25635.Method_25644("\uc040\uc045\uc041\uc044\uc045\uc041\uc041\uc041\uc041\uc041\uc045\uc045\uc040\uc041"));
    }

    private static String Method_25644(String string) {
        int n = 737;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25635.class, 3);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_25635(String string) {
        this.Field_25637 = new byte[-7139 & 2082];
        this.Field_25638 = new byte[19491 & 8];
        this.Field_25636 = string;
    }

    public void Method_25645(Class_19025 class_19025) {
        new Class_30877(new RuntimeException(Class_25635.Method_25639("\u1000\u1010\u1004\u1016\u1014\u1004\u1010\u1012\u1010\u1014\u1006\u1016\u1012\u1010\u1016\u1006\u1014\u1004\u1016\u1002")));
    }

    private static String Method_25646(String string) {
        int n = 14300;
        char[] arrc = string.toCharArray();
        StackTraceElement[] arrstackTraceElement = new Throwable().getStackTrace();
        n = (char)(n ^ (char)arrstackTraceElement[0].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getMethodName().hashCode());
        n = (char)(n ^ (char)arrstackTraceElement[1].getClassName().hashCode());
        char c = (char)Class_8.Method_10(Class_25635.class, 2);
        n = (char)(n ^ c);
        char c2 = (char)(n >> 7);
        for (int n2 = 0; n2 < arrc.length; n2 = (int)((char)(n2 + 1))) {
            arrc[n2] = (char)(arrc[n2] ^ n ^ n2 & c2);
        }
        return new String(arrc);
    }

    public Class_25635() {
        this.Field_25637 = new byte[-26544 & 16393];
        this.Field_25638 = new byte[2441 & 5670];
    }

    public Class_25635(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.Field_25637 = new byte[1300 & -30078];
        this.Field_25638 = new byte[297 & 29248];
        this.Field_25637 = Class_31852.Method_31855(publicKey, secretKey.getEncoded());
        this.Field_25638 = Class_31852.Method_31855(publicKey, arrby);
    }
}

