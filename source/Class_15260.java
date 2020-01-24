/*
 * Decompiled with CFR 0.145.
 */
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class Class_15260 {
    private void Method_15261() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] Method_15262(String string) {
        byte[] arrby;
        HttpURLConnection httpURLConnection = null;
        try {
            int n;
            URL uRL = new URL(string);
            httpURLConnection = (HttpURLConnection)uRL.openConnection(Class_18.Field_89.Method_236());
            httpURLConnection.setDoInput((291 & 16961) != 0);
            httpURLConnection.setDoOutput((-20960 & 16385) != 0);
            httpURLConnection.setConnectTimeout(8000 & -24716);
            httpURLConnection.setReadTimeout(24410 & 8164);
            httpURLConnection.connect();
            if (httpURLConnection.getResponseCode() / (3188 & 16869) != (-18301 & 22)) {
                throw new IOException("HTTP response: " + httpURLConnection.getResponseCode());
            }
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] arrby2 = new byte[httpURLConnection.getContentLength()];
            int n2 = -15604 & 64;
            do {
                if ((n = inputStream.read(arrby2, n2, arrby2.length - n2)) >= 0) continue;
                throw new IOException("Input stream closed: " + string);
            } while ((n2 += n) < arrby2.length);
            arrby = arrby2;
        }
        finally {
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        }
        return arrby;
    }
}

