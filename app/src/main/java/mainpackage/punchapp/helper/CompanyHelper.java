package mainpackage.punchapp.helper;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import mainpackage.punchapp.schema.Company;

/**
 * Created by deeppandya on 2017-06-25.
 */

public class CompanyHelper {

    private static CompanyHelper instance;
    private DatabaseReference mDatabase;

    public static CompanyHelper getInstance() {
        if(instance!=null){
            return instance;
        }

        return new CompanyHelper();
    }

    public CompanyHelper() {
        mDatabase=FirebaseDatabase.getInstance().getReference();
    }

    public void addNewCompany(String userId, Company company) {
        mDatabase.child("company").child(userId).setValue(company);
    }

    public void updateEmailVerification(String userId,boolean isVerified){
        mDatabase.child("company").child(userId).child("isVerified").setValue(isVerified);
    }
}
