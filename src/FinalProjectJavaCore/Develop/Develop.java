package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.Service.Transfer;
import FinalProjectJavaCore.Service.WorkWishFiles;
import FinalProjectJavaCore.Service.WorkWithFileRequest;

public class Develop {

    public static void numberOne() {
        String file = WorkWishFiles.fileBankDataBaseInToString("BankDataBase.txt");
        System.out.println(file);
        Transfer.accountToArrayList(file);
        WorkWithFileRequest.filesRequestToString();
    }
}


