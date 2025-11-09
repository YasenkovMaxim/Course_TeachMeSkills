package FinalProjectJavaCore.Develop;

import FinalProjectJavaCore.WorkWithFiles.WorkWithBankDataBase;
import FinalProjectJavaCore.WorkWithFiles.WorkWithInputFile;

import java.io.IOException;

public class Method {
    public static void one() {
        WorkWithBankDataBase.parseAccount();
        WorkWithInputFile.parseFilesFromInput();
    }

    public static void two() throws IOException {
        WorkWithInputFile.moveFileFromInputToArchive();
        WorkWithBankDataBase.executionTranslation(WorkWithBankDataBase.getCollectionAccountsAndAmount(),
                WorkWithInputFile.getTransfers());
    }
}
