package mainpackage.punchapp.schema;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by deeppandya on 2017-06-25.
 */

@IgnoreExtraProperties
public class Company {

    public String email;
    public String name;
    public String address;
    public String contact;
    public boolean isVerified;


    public Company(String email, String name, String address, String contact, boolean isVerified) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.isVerified = isVerified;
    }
}
