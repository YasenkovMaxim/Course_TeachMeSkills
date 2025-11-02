package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.Work.WorkWishDataBase;
import FinalProjectJavaCore.Work.WorkWishFileForTransfer;

import java.util.HashMap;

public class Develop {
    String fromAccountNumber;
    String inAccountNumber;
    Integer sum;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public void transfer() {
        WorkWishDataBase workWishDataBase = new WorkWishDataBase("BankDataBase.txt");
        workWishDataBase.fileUpload();
        HashMap accountCollection = workWishDataBase.savingAccountNumbersAndSumsToCollection();
        WorkWishFileForTransfer workWishFileForTransfer = new WorkWishFileForTransfer("input\\one.txt");
        workWishFileForTransfer.fileUpload();
        //workWishFileForTransfer.deleteFile();
        fromAccountNumber = workWishFileForTransfer.fromAccountNumber();
        inAccountNumber = workWishFileForTransfer.inAccountNumber();
        sum = workWishFileForTransfer.accountSum();
        workWishFileForTransfer.addFileInArchive();

        Integer countMoneyFrom = (Integer) accountCollection.get(fromAccountNumber);
        Integer countMoneyIn = (Integer) accountCollection.get(inAccountNumber);
        accountCollection.replace(fromAccountNumber, countMoneyFrom, countMoneyFrom - sum);
        accountCollection.replace(inAccountNumber, countMoneyIn, countMoneyIn + sum);
        for (Object key : accountCollection.keySet()) {
            System.out.println("Счет: " + key + ", сумма: " + accountCollection.get(key));
        }
    }

}
