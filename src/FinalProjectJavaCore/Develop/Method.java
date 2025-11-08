package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.ClassesForWork.ReportFile;
import FinalProjectJavaCore.WorkWithFiles.WorkWithBankDataBase;
import FinalProjectJavaCore.WorkWithFiles.WorkWithInputFile;

public class Method {
    public static void one() {
        WorkWithBankDataBase.parseAccount();
        System.out.println(WorkWithInputFile.parseFilesFromInput());
        WorkWithInputFile.moveFileFromInputToArchive();
        WorkWithBankDataBase.executionTranslation(WorkWithBankDataBase.getCollectionAccountsAndAmount(),
                WorkWithInputFile.getTransfers());
    }

    public static void two() {
        ReportFile.report(WorkWithBankDataBase.getDataTransfer(), WorkWithInputFile.getFileName(), WorkWithInputFile.getTransfers());
    }
}
