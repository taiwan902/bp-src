/*
 * Decompiled with CFR 0.145.
 * 
 * Could not load the following classes:
 *  org.cef.callback.CefCallback
 *  org.cef.handler.CefResourceHandlerAdapter
 *  org.cef.misc.IntRef
 *  org.cef.misc.StringRef
 *  org.cef.network.CefCookie
 *  org.cef.network.CefRequest
 *  org.cef.network.CefResponse
 */
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import org.cef.callback.CefCallback;
import org.cef.handler.CefResourceHandlerAdapter;
import org.cef.misc.IntRef;
import org.cef.misc.StringRef;
import org.cef.network.CefCookie;
import org.cef.network.CefRequest;
import org.cef.network.CefResponse;

public class Class_38454
extends CefResourceHandlerAdapter {
    public byte[] Field_38455;
    public int Field_38456;
    public String Field_38457;
    private int Field_38458 = 1024 & -9818;

    public boolean Method_38459(CefCookie cefCookie) {
        return (4112 & 8360) != 0;
    }

    public void Method_38460() {
        this.Field_38458 = 4353 & 18584;
    }

    public void Method_38461(CefResponse cefResponse, IntRef intRef, StringRef stringRef) {
        if (this.Field_38455 != null) {
            cefResponse.setMimeType(this.Field_38457);
            cefResponse.setStatus(18633 & 472);
        } else {
            this.Field_38455 = ("@Blad #" + this.Field_38456).getBytes();
            cefResponse.setMimeType("text/plain");
            cefResponse.setStatus(this.Field_38456);
        }
        intRef.set(this.Field_38455.length);
    }

    private void Method_38462() {
        MethodHandle methodHandle = MethodHandles.constant(String.class, "MC|BlazingPack");
    }

    public boolean Method_38463(CefRequest cefRequest, CefCallback cefCallback) {
        this.Field_38458 = -24318 & 4304;
        String string = cefRequest.getURL();
        if (!string.startsWith("bp://")) {
            return (2176 & -7925) != 0;
        }
        String[] arrstring = (string = string.substring("bp://".length())).split(":");
        if (arrstring.length != (26662 & -32686)) {
            return (134 & 80) != 0;
        }
        long l = -1L & -1L;
        try {
            l = Long.parseUnsignedLong(arrstring[1939 & 65], 8756 & 1061);
        }
        catch (Throwable throwable) {
            return (9 & -13456) != 0;
        }
        if (arrstring[26626 & -28416].length() != (8424 & 1337)) {
            return (-14335 & 4368) != 0;
        }
        Object[] arrobject = arrstring[2112 & -12264].toCharArray();
        int n = arrobject.length;
        for (int i = 8870 & 17424; i < n; ++i) {
            char c = arrobject[i];
            if (c >= (574 & -24528) && c <= (-11715 & 313) || c >= (13409 & 17007) && c <= (8430 & -11418)) continue;
            return (-28656 & 17672) != 0;
        }
        Object[] arrobject2 = arrobject = Class_30724.Field_30731 == null || Class_30724.Field_30731.Field_20168 == null ? new byte[-32762 & 19088] : Class_30724.Field_30731.Field_20168.Field_29748;
        if (arrobject.length != (-32728 & 16480)) {
            return (77 & -31568) != 0;
        }
        Class_18.Field_89.Method_247(null).Method_24620(arrstring[16464 & 13856], l, (byte[])arrobject, new Class_45218(this, cefCallback));
        return (24595 & -28287) != 0;
    }

    public boolean Method_38464(byte[] arrby, int n, IntRef intRef, CefCallback cefCallback) {
        int n2 = this.Field_38455.length;
        if (this.Field_38458 >= n2) {
            this.Field_38455 = null;
            return (25088 & 4136) != 0;
        }
        int n3 = n2 - this.Field_38458;
        if (arrby.length < n3) {
            n3 = arrby.length;
        }
        if (n3 < 0) {
            n3 = 3686 & 16;
        }
        System.arraycopy(this.Field_38455, this.Field_38458, arrby, 2048 & 25, n3);
        intRef.set(n3);
        this.Field_38458 += n3;
        if (this.Field_38458 >= n2) {
            this.Field_38455 = null;
        }
        return (16397 & 8641) != 0;
    }

    public boolean Method_38465(CefCookie cefCookie) {
        return (-32752 & 25857) != 0;
    }
}

