package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.Work.WorkWishDataBase;
import FinalProjectJavaCore.Work.WorkWishFileForTransfer;

public class Develop {
    public void quals() {
        WorkWishDataBase workWishDataBase = new WorkWishDataBase("BankDataBase.txt");
        workWishDataBase.fileUpload();
        workWishDataBase.savingAccountNumbersAndSumsToCollection();
        WorkWishFileForTransfer workWishFileForTransfer = new WorkWishFileForTransfer("input\\one.txt");
        workWishFileForTransfer.fileUpload();
        String fromAccountNumber = workWishFileForTransfer.fromAccountNumber();
        String inAccountNumber = workWishFileForTransfer.inAccountNumber();
        Integer sum = workWishFileForTransfer.accountSum();
        System.out.println(fromAccountNumber + inAccountNumber +sum);
    }

}
