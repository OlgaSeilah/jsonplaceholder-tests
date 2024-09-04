package jsonplaceholder.tests.topFrequentWords.helpers;


import jsonplaceholder.tests.api.apiService.PostsApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopFrequentWordsHelper {

    public static List<String> getBodiesList() {
        PostsApi postsApi = new PostsApi();
        return postsApi.getPostInfoAsList();
    }

    public static Map<String, Long> countAllWords(List<String> bodiesList) {
        return bodiesList.stream()
                .flatMap(body -> Arrays.stream(body.split("\\s+")))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static List<TopWordsModel> getTopWords(Map<String, Long> countAllWords, int count) {
        return countAllWords.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(count)
                .map(entry -> new TopWordsModel(entry.getKey(), entry.getValue()))
                .collect(Collectors.toList());
    }
}
