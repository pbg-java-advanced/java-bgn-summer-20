package StudentshipDocument_Ready;

import java.util.Comparator;

public class CompareByIncome implements Comparator<Document> {

    @Override
    public int compare(Document o1, Document o2) {

        double firstIncome = o1.getIncome();
        double secondIncome = o2.getIncome();

        return (int)(firstIncome - secondIncome);
    }

}

class CompareBySuccess implements Comparator<Document>{

    @Override
    public int compare(Document o1, Document o2) {

        double firstSuccess = o1.getAverageSuccess();
        double secondSuccess = o2.getAverageSuccess();

        return (int)(firstSuccess - secondSuccess);
    }

}

