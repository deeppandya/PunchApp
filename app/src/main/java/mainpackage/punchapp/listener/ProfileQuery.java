package mainpackage.punchapp.listener;

import android.provider.ContactsContract;

/**
 * Created by deeppandya on 2017-06-25.
 */

public interface ProfileQuery {
    String[] PROJECTION = {
            ContactsContract.CommonDataKinds.Email.ADDRESS,
            ContactsContract.CommonDataKinds.Email.IS_PRIMARY,
    };

    int ADDRESS = 0;
    int IS_PRIMARY = 1;
}
