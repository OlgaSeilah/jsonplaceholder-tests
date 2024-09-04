package jsonplaceholder.tests.topFrequentWords;

import jsonplaceholder.tests.topFrequentWords.helpers.TopWordsModel;

import java.util.List;
import java.util.Map;

import static jsonplaceholder.tests.topFrequentWords.helpers.TopFrequentWordsHelper.*;

public class LogTopFrequentWords {

    public static void main(String[] args) {
        List<String> getBodiesList = getBodiesList();
        Map<String, Long> allWords = countAllWords(getBodiesList);
        List<TopWordsModel> topWords = getTopWords(allWords, 10);

        topWords.forEach(System.out::println);
    }
}
